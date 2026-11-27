// default package

import android.content.Context;
import android.os.Trace;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.List;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public abstract class j79 {
    public final k79 a = new k79();
    public boolean b = false;

    public void B(l79 l79Var) {
        this.a.registerObserver(l79Var);
    }

    public final void C(boolean z) {
        if (this.a.a()) {
            grb.i("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        } else {
            this.b = z;
        }
    }

    public final f89 a(ViewGroup viewGroup, int i) {
        try {
            int i2 = n1c.a;
            Trace.beginSection("RV CreateView");
            f89 x = x(viewGroup, i);
            if (x.a.getParent() != null) {
                throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
            }
            x.f = i;
            Trace.endSection();
            return x;
        } catch (Throwable th) {
            int i3 = n1c.a;
            Trace.endSection();
            throw th;
        }
    }

    public int b() {
        return 14;
    }

    public long c(int i) {
        return -1L;
    }

    public int d(int i) {
        return 0;
    }

    public int e() {
        return b();
    }

    public void f() {
        this.a.b();
    }

    public void g(int i) {
        this.a.d(i, 1, null);
    }

    public final void h(int i, Object obj) {
        this.a.d(i, 1, obj);
    }

    public void i(int i) {
        this.a.e(i, 1);
    }

    public void j(int i, int i2) {
        this.a.c(i, i2);
    }

    public void l(int i, int i2) {
        this.a.d(i, i2, null);
    }

    public void n(int i, int i2, Object obj) {
        this.a.d(i, i2, obj);
    }

    public void p(int i, int i2) {
        this.a.e(i, i2);
    }

    public void q(int i, int i2) {
        this.a.f(i, i2);
    }

    public void s(int i) {
        this.a.f(i, 1);
    }

    public void u(f89 f89Var, int i, List list) {
        t(f89Var, i);
    }

    public f89 x(ViewGroup viewGroup, int i) {
        Context context = viewGroup.getContext();
        cp0 cp0Var = new cp0(context);
        cp0Var.setOrientation(0);
        cp0Var.setPadding(hl.L(16.0f), hl.L(8.0f), hl.L(16.0f), hl.L(8.0f));
        xb xbVar = new xb(context, (byte) 13);
        cp0Var.b = xbVar;
        jn7.i(xbVar);
        xbVar.setTextSize(1, 16.0f);
        int i2 = aob.G6;
        yob.X(xbVar, i2, null);
        xbVar.setTag(Integer.valueOf(i2));
        xbVar.setMaxLines(2);
        xbVar.setEllipsize(TextUtils.TruncateAt.END);
        cp0Var.addView(xbVar, tre.q(-1, -2, 1.0f, 16, 0, 0, hl.L(8.0f), 0));
        TextView textView = new TextView(context);
        cp0Var.a = textView;
        textView.setTextSize(1, 14.0f);
        int i3 = aob.y6;
        yob.X(textView, i3, null);
        textView.setTag(Integer.valueOf(i3));
        cp0Var.addView(textView, tre.p(-2, -2, 0.0f, 16));
        cp0Var.setLayoutParams(new r79(-1, -2));
        return new n69(cp0Var);
    }

    public void A(f89 f89Var) {
    }

    public void y(f89 f89Var) {
    }

    public void z(f89 f89Var) {
    }

    public void t(f89 f89Var, int i) {
    }
}
