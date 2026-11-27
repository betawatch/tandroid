// default package

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

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class lv6 extends ep {
    public jw6 E;
    public final long F;
    public long G;
    public final d1 H;
    public final lw6 f;
    public final lu6 h;
    public final Context n;
    public dw6 r;
    public ArrayList s;
    public kv6 w;
    public RecyclerView x;
    public boolean y;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public lv6(Context context) {
        super(r3, r0 == 0 ? nte.e(r3) : r0);
        ContextThemeWrapper a = nte.a(context, false);
        int g = nte.g(a, R.attr.mediaRouteTheme);
        this.r = dw6.c;
        this.H = new d1(this, (byte) 8);
        Context context2 = getContext();
        this.f = lw6.d(context2);
        this.h = new lu6(this, (byte) 2);
        this.n = context2;
        this.F = context2.getResources().getInteger(R.integer.mr_update_routes_delay_ms);
    }

    public final void e() {
        if (this.E == null && this.y) {
            this.f.getClass();
            lw6.b();
            ArrayList arrayList = new ArrayList(lw6.c().j);
            int size = arrayList.size();
            while (true) {
                int i = size - 1;
                if (size <= 0) {
                    break;
                }
                jw6 jw6Var = (jw6) arrayList.get(i);
                if (jw6Var.d() || !jw6Var.g || !jw6Var.h(this.r)) {
                    arrayList.remove(i);
                }
                size = i;
            }
            Collections.sort(arrayList, nu6.c);
            long uptimeMillis = SystemClock.uptimeMillis() - this.G;
            long j = this.F;
            if (uptimeMillis < j) {
                d1 d1Var = this.H;
                d1Var.removeMessages(1);
                d1Var.sendMessageAtTime(d1Var.obtainMessage(1, arrayList), this.G + j);
            } else {
                this.G = SystemClock.uptimeMillis();
                this.s.clear();
                this.s.addAll(arrayList);
                this.w.D();
            }
        }
    }

    public final void f(dw6 dw6Var) {
        if (dw6Var == null) {
            lq5.j("selector must not be null");
            return;
        }
        if (this.r.equals(dw6Var)) {
            return;
        }
        this.r = dw6Var;
        if (this.y) {
            lw6 lw6Var = this.f;
            lu6 lu6Var = this.h;
            lw6Var.h(lu6Var);
            lw6Var.a(dw6Var, lu6Var, 1);
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

    @Override // ep, rq2, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.mr_picker_dialog);
        View decorView = getWindow().getDecorView();
        Context context = this.n;
        decorView.setBackgroundColor(context.getColor(nte.h(context) ? R.color.mr_dynamic_dialog_background_light : R.color.mr_dynamic_dialog_background_dark));
        this.s = new ArrayList();
        ((ImageButton) findViewById(R.id.mr_picker_close_button)).setOnClickListener(new h6(this, (byte) 9));
        this.w = new kv6(this);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.mr_picker_list);
        this.x = recyclerView;
        recyclerView.setAdapter(this.w);
        this.x.setLayoutManager(new x46());
        getWindow().setLayout(!context.getResources().getBoolean(R.bool.is_tablet) ? -1 : mte.a(context), context.getResources().getBoolean(R.bool.is_tablet) ? -2 : -1);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.y = false;
        this.f.h(this.h);
        this.H.removeMessages(1);
    }
}
