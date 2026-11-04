package androidx.mediarouter.app;

import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.ImageButton;
import androidx.recyclerview.widget.RecyclerView;
import b8.c1;
import b8.d1;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class c0 extends g.u {
    public r4.w E;
    public final long F;
    public long G;
    public final android.support.v4.media.session.q H;
    public final r4.y f;
    public final c h;
    public final Context n;
    public r4.r r;
    public ArrayList s;
    public b0 w;
    public RecyclerView x;
    public boolean y;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public c0(Context context) {
        super(r3, r0 == 0 ? d1.e(r3) : r0);
        ContextThemeWrapper a10 = d1.a(context, false);
        int g7 = d1.g(a10, R.attr.mediaRouteTheme);
        this.r = r4.r.c;
        int i3 = 2;
        this.H = new android.support.v4.media.session.q(this, i3);
        Context context2 = getContext();
        this.f = r4.y.d(context2);
        this.h = new c(this, i3);
        this.n = context2;
        this.F = context2.getResources().getInteger(R.integer.mr_update_routes_delay_ms);
    }

    public final void e() {
        if (this.E == null && this.y) {
            this.f.getClass();
            r4.y.b();
            ArrayList arrayList = new ArrayList(r4.y.c().j);
            int size = arrayList.size();
            while (true) {
                int i3 = size - 1;
                if (size <= 0) {
                    break;
                }
                r4.w wVar = (r4.w) arrayList.get(i3);
                if (wVar.d() || !wVar.g || !wVar.h(this.r)) {
                    arrayList.remove(i3);
                }
                size = i3;
            }
            Collections.sort(arrayList, e.c);
            long uptimeMillis = SystemClock.uptimeMillis() - this.G;
            long j10 = this.F;
            if (uptimeMillis < j10) {
                android.support.v4.media.session.q qVar = this.H;
                qVar.removeMessages(1);
                qVar.sendMessageAtTime(qVar.obtainMessage(1, arrayList), this.G + j10);
            } else {
                this.G = SystemClock.uptimeMillis();
                this.s.clear();
                this.s.addAll(arrayList);
                this.w.D();
            }
        }
    }

    public final void f(r4.r rVar) {
        if (rVar == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        if (this.r.equals(rVar)) {
            return;
        }
        this.r = rVar;
        if (this.y) {
            r4.y yVar = this.f;
            c cVar = this.h;
            yVar.h(cVar);
            yVar.a(rVar, cVar, 1);
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
        decorView.setBackgroundColor(context.getColor(d1.h(context) ? R.color.mr_dynamic_dialog_background_light : R.color.mr_dynamic_dialog_background_dark));
        this.s = new ArrayList();
        ((ImageButton) findViewById(R.id.mr_picker_close_button)).setOnClickListener(new w(this, 0));
        this.w = new b0(this);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.mr_picker_list);
        this.x = recyclerView;
        recyclerView.setAdapter(this.w);
        this.x.setLayoutManager(new u4.b0());
        getWindow().setLayout(!context.getResources().getBoolean(R.bool.is_tablet) ? -1 : c1.a(context), context.getResources().getBoolean(R.bool.is_tablet) ? -2 : -1);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.y = false;
        this.f.h(this.h);
        this.H.removeMessages(1);
    }
}
