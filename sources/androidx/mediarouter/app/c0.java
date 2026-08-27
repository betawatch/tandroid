package androidx.mediarouter.app;

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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class c0 extends g.t {
    public final long A;
    public long B;
    public final c C;
    public final c2.b0 f;
    public final h0 h;
    public final Context n;
    public c2.u r;
    public ArrayList s;
    public b0 v;
    public RecyclerView w;
    public boolean x;
    public c2.z y;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public c0(Context context) {
        super(r3, r0 == 0 ? g7.b0.e(r3) : r0);
        ContextThemeWrapper a2 = g7.b0.a(context, false);
        int g10 = g7.b0.g(a2, R.attr.mediaRouteTheme);
        this.r = c2.u.c;
        this.C = new c(this, 1);
        Context context2 = getContext();
        this.f = c2.b0.d(context2);
        this.h = new h0(this, 3);
        this.n = context2;
        this.A = context2.getResources().getInteger(R.integer.mr_update_routes_delay_ms);
    }

    public final void e() {
        if (this.y == null && this.x) {
            this.f.getClass();
            c2.b0.b();
            ArrayList arrayList = new ArrayList(c2.b0.c().j);
            int size = arrayList.size();
            while (true) {
                int i10 = size - 1;
                if (size <= 0) {
                    break;
                }
                c2.z zVar = (c2.z) arrayList.get(i10);
                if (zVar.d() || !zVar.g || !zVar.h(this.r)) {
                    arrayList.remove(i10);
                }
                size = i10;
            }
            Collections.sort(arrayList, e.c);
            long uptimeMillis = SystemClock.uptimeMillis() - this.B;
            long j10 = this.A;
            if (uptimeMillis < j10) {
                c cVar = this.C;
                cVar.removeMessages(1);
                cVar.sendMessageAtTime(cVar.obtainMessage(1, arrayList), this.B + j10);
            } else {
                this.B = SystemClock.uptimeMillis();
                this.s.clear();
                this.s.addAll(arrayList);
                this.v.D();
            }
        }
    }

    public final void f(c2.u uVar) {
        if (uVar == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        if (this.r.equals(uVar)) {
            return;
        }
        this.r = uVar;
        if (this.x) {
            c2.b0 b0Var = this.f;
            h0 h0Var = this.h;
            b0Var.h(h0Var);
            b0Var.a(uVar, h0Var, 1);
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

    @Override // g.t, androidx.activity.m, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.mr_picker_dialog);
        View decorView = getWindow().getDecorView();
        Context context = this.n;
        decorView.setBackgroundColor(f0.e.c(context, g7.b0.h(context) ? R.color.mr_dynamic_dialog_background_light : R.color.mr_dynamic_dialog_background_dark));
        this.s = new ArrayList();
        ((ImageButton) findViewById(R.id.mr_picker_close_button)).setOnClickListener(new f0(this, 2));
        this.v = new b0(this);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.mr_picker_list);
        this.w = recyclerView;
        recyclerView.setAdapter(this.v);
        this.w.setLayoutManager(new f2.k0());
        getWindow().setLayout(!context.getResources().getBoolean(R.bool.is_tablet) ? -1 : g7.a0.a(context), context.getResources().getBoolean(R.bool.is_tablet) ? -2 : -1);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.x = false;
        this.f.h(this.h);
        this.C.removeMessages(1);
    }
}
