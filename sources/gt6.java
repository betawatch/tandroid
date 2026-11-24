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

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class gt6 extends dp {
    public eu6 E;
    public final long F;
    public long G;
    public final c1 H;
    public final gu6 f;
    public final gs6 h;
    public final Context n;
    public yt6 r;
    public ArrayList s;
    public ft6 w;
    public RecyclerView x;
    public boolean y;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public gt6(Context context) {
        super(r3, r0 == 0 ? voe.e(r3) : r0);
        ContextThemeWrapper a = voe.a(context, false);
        int g = voe.g(a, R.attr.mediaRouteTheme);
        this.r = yt6.c;
        this.H = new c1((Object) this, (byte) 8);
        Context context2 = getContext();
        this.f = gu6.d(context2);
        this.h = new gs6(this, (byte) 2);
        this.n = context2;
        this.F = context2.getResources().getInteger(R.integer.mr_update_routes_delay_ms);
    }

    public final void e() {
        if (this.E == null && this.y) {
            this.f.getClass();
            gu6.b();
            ArrayList arrayList = new ArrayList(gu6.c().j);
            int size = arrayList.size();
            while (true) {
                int i = size - 1;
                if (size <= 0) {
                    break;
                }
                eu6 eu6Var = (eu6) arrayList.get(i);
                if (eu6Var.d() || !eu6Var.g || !eu6Var.h(this.r)) {
                    arrayList.remove(i);
                }
                size = i;
            }
            Collections.sort(arrayList, is6.c);
            long uptimeMillis = SystemClock.uptimeMillis() - this.G;
            long j = this.F;
            if (uptimeMillis < j) {
                c1 c1Var = this.H;
                c1Var.removeMessages(1);
                c1Var.sendMessageAtTime(c1Var.obtainMessage(1, arrayList), this.G + j);
            } else {
                this.G = SystemClock.uptimeMillis();
                this.s.clear();
                this.s.addAll(arrayList);
                this.w.D();
            }
        }
    }

    public final void f(yt6 yt6Var) {
        if (yt6Var == null) {
            w26.j("selector must not be null");
            return;
        }
        if (this.r.equals(yt6Var)) {
            return;
        }
        this.r = yt6Var;
        if (this.y) {
            gu6 gu6Var = this.f;
            gs6 gs6Var = this.h;
            gu6Var.h(gs6Var);
            gu6Var.a(yt6Var, gs6Var, 1);
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

    @Override // dp, yp2, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.mr_picker_dialog);
        View decorView = getWindow().getDecorView();
        Context context = this.n;
        decorView.setBackgroundColor(context.getColor(voe.h(context) ? R.color.mr_dynamic_dialog_background_light : R.color.mr_dynamic_dialog_background_dark));
        this.s = new ArrayList();
        ((ImageButton) findViewById(R.id.mr_picker_close_button)).setOnClickListener(new g6(this, (byte) 9));
        this.w = new ft6(this);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.mr_picker_list);
        this.x = recyclerView;
        recyclerView.setAdapter(this.w);
        this.x.setLayoutManager(new t26());
        getWindow().setLayout(!context.getResources().getBoolean(R.bool.is_tablet) ? -1 : roe.a(context), context.getResources().getBoolean(R.bool.is_tablet) ? -2 : -1);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.y = false;
        this.f.h(this.h);
        this.H.removeMessages(1);
    }
}
