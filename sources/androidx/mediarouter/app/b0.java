package androidx.mediarouter.app;

import a8.b7;
import a8.c7;
import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.ImageButton;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class b0 extends g.u {
    public s4.v E;
    public final long F;
    public long G;
    public final android.support.v4.media.session.q H;
    public final s4.x f;
    public final c h;
    public final Context n;
    public s4.r r;
    public ArrayList s;
    public a0 w;
    public RecyclerView x;
    public boolean y;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public b0(Context context) {
        super(r3, r0 == 0 ? c7.e(r3) : r0);
        ContextThemeWrapper a10 = c7.a(context, false);
        int g10 = c7.g(a10, R.attr.mediaRouteTheme);
        this.r = s4.r.c;
        int i7 = 2;
        this.H = new android.support.v4.media.session.q(this, i7);
        Context context2 = getContext();
        this.f = s4.x.d(context2);
        this.h = new c(this, i7);
        this.n = context2;
        this.F = context2.getResources().getInteger(R.integer.mr_update_routes_delay_ms);
    }

    public final void e() {
        if (this.E == null && this.y) {
            this.f.getClass();
            s4.x.b();
            ArrayList arrayList = new ArrayList(s4.x.c().j);
            int size = arrayList.size();
            while (true) {
                int i7 = size - 1;
                if (size <= 0) {
                    break;
                }
                s4.v vVar = (s4.v) arrayList.get(i7);
                if (vVar.d() || !vVar.g || !vVar.h(this.r)) {
                    arrayList.remove(i7);
                }
                size = i7;
            }
            Collections.sort(arrayList, e.c);
            long uptimeMillis = SystemClock.uptimeMillis() - this.G;
            long j3 = this.F;
            if (uptimeMillis < j3) {
                android.support.v4.media.session.q qVar = this.H;
                qVar.removeMessages(1);
                qVar.sendMessageAtTime(qVar.obtainMessage(1, arrayList), this.G + j3);
            } else {
                this.G = SystemClock.uptimeMillis();
                this.s.clear();
                this.s.addAll(arrayList);
                this.w.D();
            }
        }
    }

    public final void f(s4.r rVar) {
        if (rVar == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        if (this.r.equals(rVar)) {
            return;
        }
        this.r = rVar;
        if (this.y) {
            s4.x xVar = this.f;
            c cVar = this.h;
            xVar.h(cVar);
            xVar.a(rVar, cVar, 1);
        }
        e();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.y = true;
        this.f.a(this.r, this.h, 1);
        e();
    }

    @Override // g.u, androidx.activity.m, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.mr_picker_dialog);
        View decorView = getWindow().getDecorView();
        Context context = this.n;
        decorView.setBackgroundColor(context.getColor(c7.h(context) ? R.color.mr_dynamic_dialog_background_light : R.color.mr_dynamic_dialog_background_dark));
        this.s = new ArrayList();
        ((ImageButton) findViewById(R.id.mr_picker_close_button)).setOnClickListener(new w(this, 0));
        this.w = new a0(this);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.mr_picker_list);
        this.x = recyclerView;
        recyclerView.setAdapter(this.w);
        this.x.setLayoutManager(new v4.b0());
        getWindow().setLayout(!context.getResources().getBoolean(R.bool.is_tablet) ? -1 : b7.a(context), context.getResources().getBoolean(R.bool.is_tablet) ? -2 : -1);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.y = false;
        this.f.h(this.h);
        this.H.removeMessages(1);
    }
}
