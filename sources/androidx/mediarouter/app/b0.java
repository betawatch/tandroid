package androidx.mediarouter.app;

import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.ImageButton;
import androidx.recyclerview.widget.RecyclerView;
import h7.e5;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class b0 extends g.s {
    public final long A;
    public long B;
    public final a4.d C;
    public final c2.d0 f;
    public final c h;
    public final Context n;
    public c2.w r;
    public ArrayList s;
    public a0 v;
    public RecyclerView w;
    public boolean x;
    public c2.b0 y;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public b0(Context context) {
        super(r3, r0 == 0 ? e5.e(r3) : r0);
        ContextThemeWrapper a2 = e5.a(context, false);
        int g10 = e5.g(a2, R.attr.mediaRouteTheme);
        this.r = c2.w.c;
        int i10 = 2;
        this.C = new a4.d(this, i10);
        Context context2 = getContext();
        this.f = c2.d0.d(context2);
        this.h = new c(this, i10);
        this.n = context2;
        this.A = context2.getResources().getInteger(R.integer.mr_update_routes_delay_ms);
    }

    public final void e() {
        if (this.y == null && this.x) {
            this.f.getClass();
            c2.d0.b();
            ArrayList arrayList = new ArrayList(c2.d0.c().j);
            int size = arrayList.size();
            while (true) {
                int i10 = size - 1;
                if (size <= 0) {
                    break;
                }
                c2.b0 b0Var = (c2.b0) arrayList.get(i10);
                if (b0Var.d() || !b0Var.g || !b0Var.h(this.r)) {
                    arrayList.remove(i10);
                }
                size = i10;
            }
            Collections.sort(arrayList, e.c);
            long uptimeMillis = SystemClock.uptimeMillis() - this.B;
            long j10 = this.A;
            if (uptimeMillis < j10) {
                a4.d dVar = this.C;
                dVar.removeMessages(1);
                dVar.sendMessageAtTime(dVar.obtainMessage(1, arrayList), this.B + j10);
            } else {
                this.B = SystemClock.uptimeMillis();
                this.s.clear();
                this.s.addAll(arrayList);
                this.v.D();
            }
        }
    }

    public final void f(c2.w wVar) {
        if (wVar == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        if (this.r.equals(wVar)) {
            return;
        }
        this.r = wVar;
        if (this.x) {
            c2.d0 d0Var = this.f;
            c cVar = this.h;
            d0Var.h(cVar);
            d0Var.a(wVar, cVar, 1);
        }
        e();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.x = true;
        this.f.a(this.r, this.h, 1);
        e();
    }

    @Override // g.s, androidx.activity.m, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.mr_picker_dialog);
        View decorView = getWindow().getDecorView();
        Context context = this.n;
        decorView.setBackgroundColor(f0.e.c(context, e5.h(context) ? R.color.mr_dynamic_dialog_background_light : R.color.mr_dynamic_dialog_background_dark));
        this.s = new ArrayList();
        ((ImageButton) findViewById(R.id.mr_picker_close_button)).setOnClickListener(new v(this, 0));
        this.v = new a0(this);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.mr_picker_list);
        this.w = recyclerView;
        recyclerView.setAdapter(this.v);
        this.w.setLayoutManager(new f2.j0());
        getWindow().setLayout(!context.getResources().getBoolean(R.bool.is_tablet) ? -1 : h7.k0.a(context), context.getResources().getBoolean(R.bool.is_tablet) ? -2 : -1);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.x = false;
        this.f.h(this.h);
        this.C.removeMessages(1);
    }
}
