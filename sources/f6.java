// default package

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.widget.FrameLayout;
import java.util.Iterator;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public abstract class f6 extends FrameLayout implements wa9 {
    public final vnb a;
    public final vh4 b;
    public final xa9 c;

    public f6(Context context, vnb vnbVar, vh4 vh4Var) {
        super(context);
        this.c = new xa9(this, k43.h, 350L);
        this.a = vnbVar;
        this.b = vh4Var;
    }

    public final void a(CharSequence charSequence, boolean z) {
        boolean z2;
        CharSequence charSequence2;
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        xa9 xa9Var = this.c;
        if (isEmpty) {
            xa9Var.a.m(null, true);
            return;
        }
        int indexOf = TextUtils.indexOf(charSequence, "...");
        vh4 vh4Var = this.b;
        if (indexOf >= 0) {
            SpannableString valueOf = SpannableString.valueOf(charSequence);
            vh4Var.M(valueOf, indexOf);
            z2 = true;
            charSequence2 = valueOf;
        } else {
            z2 = false;
            charSequence2 = charSequence;
        }
        e6 e6Var = new e6(this, getContext());
        int i = aob.Xl;
        vnb vnbVar = this.a;
        yob.X(e6Var, i, vnbVar);
        yob.G(e6Var, i, vnbVar);
        e6Var.setTextSize(1, 14.0f);
        e6Var.setAlpha(0.0f);
        e6Var.setText(charSequence2);
        if (z2) {
            vh4Var.c(e6Var);
        }
        addView(e6Var, tre.c(-2.0f, -2));
        xa9Var.h(e6Var, true);
    }

    public final void b() {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            y66 y66Var = (y66) it.next();
            e6 e6Var = (e6) y66Var.a;
            int i = aob.Xl;
            vnb vnbVar = this.a;
            e6Var.setTextColor(aob.v0(i, vnbVar));
            ((e6) y66Var.a).setLinkTextColor(aob.v0(i, vnbVar));
        }
    }

    public void f(xa9 xa9Var) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            y66 y66Var = (y66) it.next();
            float c = y66Var.c();
            Object obj = y66Var.a;
            float R1 = hl.R1(0.85f, 1.0f, c);
            e6 e6Var = (e6) obj;
            e6Var.setAlpha(c);
            e6Var.setScaleX(R1);
            e6Var.setScaleY(R1);
            e6Var.setTranslationY(hl.U1(c, hl.L(!y66Var.h ? 9.0f : -9.0f), 0));
        }
    }

    public float getTotalVisibility() {
        return this.c.a.d.c.a;
    }

    @Override // wa9
    public final void c() {
    }
}
