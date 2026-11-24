// default package

import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.StaticLayout;
import android.text.TextPaint;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class kk1 {
    public final rc2 a;
    public final pc0[] b;
    public final ImageReceiver[] c;
    public final TextPaint d;
    public final CharSequence e;
    public StaticLayout f;
    public final boolean g;
    public final Drawable h;
    public final Paint i;
    public final Paint j;
    public final uib k;
    public boolean l;
    public boolean m;
    public final u51 n;
    public final TLObject o;

    public kk1(rc2 rc2Var, TLObject[] tLObjectArr, int i) {
        TLObject tLObject;
        this.d = new TextPaint(1);
        this.i = new Paint(1);
        this.j = new Paint(1);
        new Paint(1);
        this.a = rc2Var;
        this.o = tLObjectArr[0];
        this.n = new jk1(rc2Var, rc2Var, (byte) 0);
        this.c = new ImageReceiver[3];
        this.b = new pc0[3];
        for (int i2 = 0; i2 < 3; i2++) {
            this.c[i2] = new ImageReceiver(rc2Var);
            this.c[i2].p0(rc2Var);
            this.c[i2].q0(gm.L(54.0f));
            this.b[i2] = new pc0((ylb) null);
            if (i2 >= tLObjectArr.length || (tLObject = tLObjectArr[i2]) == null) {
                Paint paint = new Paint(1);
                int[] iArr = {cmb.v(cmb.v0(cmb.qa, rc2Var.cc), cmb.p1(0.5f, cmb.v0(cmb.x6, rc2Var.cc)))};
                paint.setColor(iArr[0]);
                this.c[i2].g0(new hd(rc2Var, iArr, paint));
            } else {
                this.b[i2].o(tLObject);
                this.c[i2].U(tLObjectArr[i2], this.b[i2], null);
            }
        }
        if (rc2Var.O0) {
            a();
        }
        this.d.setTextSize(gm.L(11.0f));
        boolean p = z8c.h(rc2Var.a6).p();
        this.e = jb6.M0(p ? 2131748087 : 2131743541, null);
        this.i.setStyle(Paint.Style.STROKE);
        this.g = true;
        this.h = p ? null : rc2Var.getContext().getResources().getDrawable(R.drawable.mini_switch_lock).mutate();
        if (b(this.o) == null) {
            this.k = null;
        } else {
            this.k = new uib(hg9.j(i, "+"), 9.33f, gm.o());
        }
    }

    public static String b(TLObject tLObject) {
        int i;
        if (tLObject instanceof TLRPC.Chat) {
            int i2 = ((TLRPC.Chat) tLObject).participants_count;
            if (i2 > 1) {
                return jb6.S(null, i2);
            }
        } else if ((tLObject instanceof TLRPC.User) && (i = ((TLRPC.User) tLObject).bot_active_users) > 1) {
            return jb6.S(null, i);
        }
        return null;
    }

    public final void a() {
        int i = 0;
        while (true) {
            ImageReceiver[] imageReceiverArr = this.c;
            if (i >= imageReceiverArr.length) {
                return;
            }
            imageReceiverArr[i].I();
            i++;
        }
    }

    public kk1(rc2 rc2Var, TLObject tLObject) {
        CharSequence charSequence;
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        this.i = new Paint(1);
        this.j = new Paint(1);
        new Paint(1);
        this.a = rc2Var;
        this.o = tLObject;
        this.n = new jk1(rc2Var, rc2Var, (byte) 1);
        ImageReceiver[] imageReceiverArr = {r3};
        this.c = imageReceiverArr;
        ImageReceiver imageReceiver = new ImageReceiver(rc2Var);
        imageReceiver.p0(rc2Var);
        imageReceiverArr[0].q0(gm.L(54.0f));
        if (rc2Var.O0) {
            a();
        }
        pc0[] pc0VarArr = {r3};
        this.b = pc0VarArr;
        pc0 pc0Var = new pc0((ylb) null);
        pc0Var.o(tLObject);
        imageReceiverArr[0].U(tLObject, pc0VarArr[0], null);
        textPaint.setTextSize(gm.L(11.0f));
        if (tLObject instanceof TLRPC.Chat) {
            charSequence = ((TLRPC.Chat) tLObject).title;
        } else if (tLObject instanceof TLRPC.User) {
            charSequence = m9c.r((TLRPC.User) tLObject);
        } else {
            charSequence = "";
        }
        try {
            charSequence = gw3.m(charSequence, textPaint.getFontMetricsInt(), false, null, 0);
        } catch (Exception unused) {
        }
        this.e = charSequence;
        this.i.setStyle(Paint.Style.STROKE);
        this.g = false;
        this.h = rc2Var.getContext().getResources().getDrawable(R.drawable.mini_reply_user).mutate();
        if (b(tLObject) == null) {
            this.k = null;
        } else {
            this.k = new uib(b(tLObject), 9.33f, gm.o());
        }
    }
}
