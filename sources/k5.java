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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class k5 extends FrameLayout {
    public final lka a;
    public final TextView b;
    public final bf0 c;
    public final ImageView d;
    public final pc0 e;
    public int f;

    public k5(Activity activity, boolean z) {
        super(activity);
        setMinimumWidth(gm.L(196.0f));
        pc0 pc0Var = new pc0((ylb) null);
        this.e = pc0Var;
        pc0Var.s(gm.L(12.0f));
        bf0 bf0Var = new bf0(activity);
        this.c = bf0Var;
        bf0Var.setRoundRadius(gm.L(18.0f));
        addView(bf0Var, qoe.d(36, 36.0f, 51, 10.0f, 10.0f, 0.0f, 0.0f));
        lka lkaVar = new lka(activity);
        this.a = lkaVar;
        lkaVar.setTextSize(15);
        lkaVar.setTypeface(gm.o());
        lkaVar.setEllipsizeByGradient(true);
        lkaVar.setMaxLines(1);
        lkaVar.setGravity(19);
        if (!z) {
            addView(lkaVar, qoe.d(-1, -1.0f, 51, 61.0f, 0.0f, 52.0f, 0.0f));
            anb.W(lkaVar, cmb.D8, null);
            ImageView imageView = new ImageView(activity);
            this.d = imageView;
            imageView.setImageResource(R.drawable.account_check);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            anb.s(imageView, cmb.G9, null, PorterDuff.Mode.MULTIPLY);
            addView(imageView, qoe.d(40, -1.0f, 53, 0.0f, 0.0f, 6.0f, 0.0f));
            return;
        }
        addView(lkaVar, qoe.d(-2, -2.0f, 51, 61.0f, 7.0f, 8.0f, 0.0f));
        anb.W(lkaVar, cmb.dh, null);
        lkaVar.l(jb6.M0(2131743070, null), false);
        TextView textView = new TextView(activity);
        this.b = textView;
        anb.X(textView, cmb.eh, null);
        wi8.w(textView, 1, 15.0f, 1, 1);
        textView.setSingleLine(true);
        textView.setMaxWidth(gm.L(320.0f));
        textView.setGravity(51);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        addView(textView, qoe.d(-2, -2.0f, 51, 61.0f, 27.0f, 8.0f, 0.0f));
    }

    public int getAccountNumber() {
        return this.f;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.b == null) {
            anb.W(this.a, cmb.F9, null);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        TextView textView;
        ImageView imageView = this.d;
        if (imageView != null || ((textView = this.b) != null && getLayoutParams().width != -2)) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gm.L(56.0f), TLObject.FLAG_30));
            return;
        }
        if (View.MeasureSpec.getMode(i) != Integer.MIN_VALUE) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(gm.L(56.0f), TLObject.FLAG_30));
            return;
        }
        float L = gm.L(196.0f);
        float L2 = gm.L((imageView != null ? 50 : 0) + 69);
        lka lkaVar = this.a;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) Math.max(L, Math.max(lkaVar.getTextPaint().measureText(lkaVar.getText().toString()), textView != null ? textView.getPaint().measureText(textView.getText().toString()) : 0.0f) + L2), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(gm.L(56.0f), TLObject.FLAG_30));
    }

    public void setObject(TLObject tLObject) {
        boolean z = tLObject instanceof TLRPC.User;
        bf0 bf0Var = this.c;
        TextView textView = this.b;
        pc0 pc0Var = this.e;
        if (z) {
            TLRPC.User user = (TLRPC.User) tLObject;
            pc0Var.q(user);
            textView.setText(bw2.m(0, user.first_name, user.last_name));
            bf0Var.f(user, pc0Var);
            return;
        }
        TLRPC.Chat chat = (TLRPC.Chat) tLObject;
        pc0Var.p(chat);
        textView.setText(chat == null ? "" : chat.title);
        bf0Var.f(chat, pc0Var);
    }
}
