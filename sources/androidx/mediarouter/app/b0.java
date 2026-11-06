package androidx.mediarouter.app;

import a8.a7;
import a8.b7;
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

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class b0 extends g.u {
    public s4.v D;
    public final long E;
    public long F;
    public final android.support.v4.media.session.q G;
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
        super(r3, r0 == 0 ? b7.e(r3) : r0);
        ContextThemeWrapper a10 = b7.a(context, false);
        int g10 = b7.g(a10, R.attr.mediaRouteTheme);
        this.r = s4.r.c;
        int i7 = 2;
        this.G = new android.support.v4.media.session.q(this, i7);
        Context context2 = getContext();
        this.f = s4.x.d(context2);
        this.h = new c(this, i7);
        this.n = context2;
        this.E = context2.getResources().getInteger(R.integer.mr_update_routes_delay_ms);
    }

    public final void e() {
        if (this.D == null && this.y) {
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
            long uptimeMillis = SystemClock.uptimeMillis() - this.F;
            long j3 = this.E;
            if (uptimeMillis < j3) {
                android.support.v4.media.session.q qVar = this.G;
                qVar.removeMessages(1);
                qVar.sendMessageAtTime(qVar.obtainMessage(1, arrayList), this.F + j3);
            } else {
                this.F = SystemClock.uptimeMillis();
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
        decorView.setBackgroundColor(context.getColor(b7.h(context) ? R.color.mr_dynamic_dialog_background_light : R.color.mr_dynamic_dialog_background_dark));
        this.s = new ArrayList();
        ((ImageButton) findViewById(R.id.mr_picker_close_button)).setOnClickListener(new w(this, 0));
        this.w = new a0(this);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.mr_picker_list);
        this.x = recyclerView;
        recyclerView.setAdapter(this.w);
        this.x.setLayoutManager(new v4.b0());
        getWindow().setLayout(!context.getResources().getBoolean(R.bool.is_tablet) ? -1 : a7.a(context), context.getResources().getBoolean(R.bool.is_tablet) ? -2 : -1);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.y = false;
        this.f.h(this.h);
        this.G.removeMessages(1);
    }
}
