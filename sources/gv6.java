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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class gv6 extends dq {
    public ew6 E;
    public final long F;
    public long G;
    public final c1 H;
    public final gw6 f;
    public final hu6 h;
    public final Context n;
    public yv6 r;
    public ArrayList s;
    public fv6 w;
    public RecyclerView x;
    public boolean y;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public gv6(Context context) {
        super(r3, r0 == 0 ? yqe.e(r3) : r0);
        ContextThemeWrapper a = yqe.a(context, false);
        int g = yqe.g(a, R.attr.mediaRouteTheme);
        this.r = yv6.c;
        this.H = new c1((Object) this, (byte) 8);
        Context context2 = getContext();
        this.f = gw6.d(context2);
        this.h = new hu6(this, (byte) 2);
        this.n = context2;
        this.F = context2.getResources().getInteger(R.integer.mr_update_routes_delay_ms);
    }

    public final void e() {
        if (this.E == null && this.y) {
            this.f.getClass();
            gw6.b();
            ArrayList arrayList = new ArrayList(gw6.c().j);
            int size = arrayList.size();
            while (true) {
                int i = size - 1;
                if (size <= 0) {
                    break;
                }
                ew6 ew6Var = (ew6) arrayList.get(i);
                if (ew6Var.d() || !ew6Var.g || !ew6Var.h(this.r)) {
                    arrayList.remove(i);
                }
                size = i;
            }
            Collections.sort(arrayList, ju6.c);
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

    public final void f(yv6 yv6Var) {
        if (yv6Var == null) {
            u36.j("selector must not be null");
            return;
        }
        if (this.r.equals(yv6Var)) {
            return;
        }
        this.r = yv6Var;
        if (this.y) {
            gw6 gw6Var = this.f;
            hu6 hu6Var = this.h;
            gw6Var.h(hu6Var);
            gw6Var.a(yv6Var, hu6Var, 1);
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

    @Override // dq, jr2, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.mr_picker_dialog);
        View decorView = getWindow().getDecorView();
        Context context = this.n;
        decorView.setBackgroundColor(context.getColor(yqe.h(context) ? R.color.mr_dynamic_dialog_background_light : R.color.mr_dynamic_dialog_background_dark));
        this.s = new ArrayList();
        ((ImageButton) findViewById(R.id.mr_picker_close_button)).setOnClickListener(new g6(this, (byte) 9));
        this.w = new fv6(this);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.mr_picker_list);
        this.x = recyclerView;
        recyclerView.setAdapter(this.w);
        this.x.setLayoutManager(new u46());
        getWindow().setLayout(!context.getResources().getBoolean(R.bool.is_tablet) ? -1 : uqe.a(context), context.getResources().getBoolean(R.bool.is_tablet) ? -2 : -1);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.y = false;
        this.f.h(this.h);
        this.H.removeMessages(1);
    }
}
