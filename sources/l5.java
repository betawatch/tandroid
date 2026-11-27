// default package

import android.app.Activity;
import android.graphics.PorterDuff;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class l5 extends FrameLayout {
    public final ema a;
    public final TextView b;
    public final de0 c;
    public final ImageView d;
    public final rb0 e;
    public int f;

    public l5(Activity activity, boolean z) {
        super(activity);
        setMinimumWidth(hl.L(196.0f));
        rb0 rb0Var = new rb0((vnb) null);
        this.e = rb0Var;
        rb0Var.s(hl.L(12.0f));
        de0 de0Var = new de0(activity);
        this.c = de0Var;
        de0Var.setRoundRadius(hl.L(18.0f));
        addView(de0Var, tre.d(36, 36.0f, 51, 10.0f, 10.0f, 0.0f, 0.0f));
        ema emaVar = new ema(activity);
        this.a = emaVar;
        emaVar.setTextSize(15);
        emaVar.setTypeface(hl.o());
        emaVar.setEllipsizeByGradient(true);
        emaVar.setMaxLines(1);
        emaVar.setGravity(19);
        if (!z) {
            addView(emaVar, tre.d(-1, -1.0f, 51, 61.0f, 0.0f, 52.0f, 0.0f));
            yob.W(emaVar, aob.E8, null);
            ImageView imageView = new ImageView(activity);
            this.d = imageView;
            imageView.setImageResource(R.drawable.account_check);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            yob.s(imageView, aob.H9, null, PorterDuff.Mode.MULTIPLY);
            addView(imageView, tre.d(40, -1.0f, 53, 0.0f, 0.0f, 6.0f, 0.0f));
            return;
        }
        addView(emaVar, tre.d(-2, -2.0f, 51, 61.0f, 7.0f, 8.0f, 0.0f));
        yob.W(emaVar, aob.eh, null);
        emaVar.l(ob6.M0(2131743038, null), false);
        TextView textView = new TextView(activity);
        this.b = textView;
        yob.X(textView, aob.fh, null);
        ik8.w(textView, 1, 15.0f, 1, 1);
        textView.setSingleLine(true);
        textView.setMaxWidth(hl.L(320.0f));
        textView.setGravity(51);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        addView(textView, tre.d(-2, -2.0f, 51, 61.0f, 27.0f, 8.0f, 0.0f));
    }

    public int getAccountNumber() {
        return this.f;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.b == null) {
            yob.W(this.a, aob.G9, null);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        TextView textView;
        ImageView imageView = this.d;
        if (imageView != null || ((textView = this.b) != null && getLayoutParams().width != -2)) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(hl.L(56.0f), TLObject.FLAG_30));
            return;
        }
        if (View.MeasureSpec.getMode(i) != Integer.MIN_VALUE) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(hl.L(56.0f), TLObject.FLAG_30));
            return;
        }
        float L = hl.L(196.0f);
        float L2 = hl.L((imageView != null ? 50 : 0) + 69);
        ema emaVar = this.a;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) Math.max(L, Math.max(emaVar.getTextPaint().measureText(emaVar.getText().toString()), textView != null ? textView.getPaint().measureText(textView.getText().toString()) : 0.0f) + L2), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(hl.L(56.0f), TLObject.FLAG_30));
    }

    public void setObject(TLObject tLObject) {
        boolean z = tLObject instanceof TLRPC.User;
        de0 de0Var = this.c;
        TextView textView = this.b;
        rb0 rb0Var = this.e;
        if (z) {
            TLRPC.User user = (TLRPC.User) tLObject;
            rb0Var.q(user);
            textView.setText(lv2.m(0, user.first_name, user.last_name));
            de0Var.f(user, rb0Var);
            return;
        }
        TLRPC.Chat chat = (TLRPC.Chat) tLObject;
        rb0Var.p(chat);
        textView.setText(chat == null ? "" : chat.title);
        de0Var.f(chat, rb0Var);
    }
}
