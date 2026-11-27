// default package

import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.StaticLayout;
import android.text.TextPaint;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class lj1 {
    public final wb2 a;
    public final rb0[] b;
    public final ImageReceiver[] c;
    public final TextPaint d;
    public final CharSequence e;
    public StaticLayout f;
    public final boolean g;
    public final Drawable h;
    public final Paint i;
    public final Paint j;
    public final pkb k;
    public boolean l;
    public boolean m;
    public final v41 n;
    public final TLObject o;

    public lj1(wb2 wb2Var, TLObject[] tLObjectArr, int i) {
        TLObject tLObject;
        this.d = new TextPaint(1);
        this.i = new Paint(1);
        this.j = new Paint(1);
        new Paint(1);
        this.a = wb2Var;
        this.o = tLObjectArr[0];
        this.n = new kj1(wb2Var, wb2Var, (byte) 0);
        this.c = new ImageReceiver[3];
        this.b = new rb0[3];
        for (int i2 = 0; i2 < 3; i2++) {
            this.c[i2] = new ImageReceiver(wb2Var);
            this.c[i2].p0(wb2Var);
            this.c[i2].q0(hl.L(54.0f));
            this.b[i2] = new rb0((vnb) null);
            if (i2 >= tLObjectArr.length || (tLObject = tLObjectArr[i2]) == null) {
                Paint paint = new Paint(1);
                int[] iArr = {aob.v(aob.v0(aob.ra, wb2Var.cc), aob.p1(0.5f, aob.v0(aob.y6, wb2Var.cc)))};
                paint.setColor(iArr[0]);
                this.c[i2].g0(new hc(wb2Var, iArr, paint));
            } else {
                this.b[i2].o(tLObject);
                this.c[i2].U(tLObjectArr[i2], this.b[i2], null);
            }
        }
        if (wb2Var.O0) {
            a();
        }
        this.d.setTextSize(hl.L(11.0f));
        boolean p = yac.h(wb2Var.a6).p();
        this.e = ob6.M0(p ? 2131748084 : 2131743509, null);
        this.i.setStyle(Paint.Style.STROKE);
        this.g = true;
        this.h = p ? null : wb2Var.getContext().getResources().getDrawable(R.drawable.mini_switch_lock).mutate();
        if (b(this.o) == null) {
            this.k = null;
        } else {
            this.k = new pkb(uh9.k(i, "+"), 9.33f, hl.o());
        }
    }

    public static String b(TLObject tLObject) {
        int i;
        if (tLObject instanceof TLRPC.Chat) {
            int i2 = ((TLRPC.Chat) tLObject).participants_count;
            if (i2 > 1) {
                return ob6.S(null, i2);
            }
        } else if ((tLObject instanceof TLRPC.User) && (i = ((TLRPC.User) tLObject).bot_active_users) > 1) {
            return ob6.S(null, i);
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

    public lj1(wb2 wb2Var, TLObject tLObject) {
        CharSequence charSequence;
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        this.i = new Paint(1);
        this.j = new Paint(1);
        new Paint(1);
        this.a = wb2Var;
        this.o = tLObject;
        this.n = new kj1(wb2Var, wb2Var, (byte) 1);
        ImageReceiver[] imageReceiverArr = {r3};
        this.c = imageReceiverArr;
        ImageReceiver imageReceiver = new ImageReceiver(wb2Var);
        imageReceiver.p0(wb2Var);
        imageReceiverArr[0].q0(hl.L(54.0f));
        if (wb2Var.O0) {
            a();
        }
        rb0[] rb0VarArr = {r3};
        this.b = rb0VarArr;
        rb0 rb0Var = new rb0((vnb) null);
        rb0Var.o(tLObject);
        imageReceiverArr[0].U(tLObject, rb0VarArr[0], null);
        textPaint.setTextSize(hl.L(11.0f));
        if (tLObject instanceof TLRPC.Chat) {
            charSequence = ((TLRPC.Chat) tLObject).title;
        } else if (tLObject instanceof TLRPC.User) {
            charSequence = lbc.r((TLRPC.User) tLObject);
        } else {
            charSequence = "";
        }
        try {
            charSequence = pv3.m(charSequence, textPaint.getFontMetricsInt(), false, null, 0);
        } catch (Exception unused) {
        }
        this.e = charSequence;
        this.i.setStyle(Paint.Style.STROKE);
        this.g = false;
        this.h = wb2Var.getContext().getResources().getDrawable(R.drawable.mini_reply_user).mutate();
        if (b(tLObject) == null) {
            this.k = null;
        } else {
            this.k = new pkb(b(tLObject), 9.33f, hl.o());
        }
    }
}
