// default package

import android.content.Context;
import android.graphics.PorterDuff;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class kb extends FrameLayout implements snb {
    public final de0 a;
    public final ema b;
    public final ema c;
    public final rb0 d;
    public final ImageView e;
    public TLRPC.Chat f;
    public boolean h;
    public final int n;
    public final og2 r;
    public int s;

    public kb(Context context, View.OnClickListener onClickListener, boolean z, int i) {
        super(context);
        this.n = yac.t0;
        this.d = new rb0((vnb) null);
        de0 de0Var = new de0(context);
        this.a = de0Var;
        de0Var.setRoundRadius(hl.L(24.0f));
        boolean z2 = ob6.a0;
        addView(de0Var, tre.d(48, 48.0f, (z2 ? 5 : 3) | 48, z2 ? 0.0f : i + 12, 6.0f, z2 ? i + 12 : 0.0f, 6.0f));
        if (z) {
            og2 og2Var = new og2(21, null, context);
            this.r = og2Var;
            og2Var.b(-1, aob.d6, aob.k7);
            og2Var.setDrawUnchecked(false);
            og2Var.setDrawBackgroundAsArc(3);
            boolean z3 = ob6.a0;
            addView(og2Var, tre.d(24, 24.0f, (z3 ? 5 : 3) | 48, z3 ? 0.0f : i + 42, 32.0f, z3 ? i + 42 : 0.0f, 0.0f));
        }
        ema emaVar = new ema(context);
        this.b = emaVar;
        yob.W(emaVar, aob.G6, null);
        emaVar.setTextSize(17);
        emaVar.setGravity((ob6.a0 ? 5 : 3) | 48);
        boolean z4 = ob6.a0;
        addView(emaVar, tre.d(-1, 20.0f, (z4 ? 5 : 3) | 48, z4 ? 62 : i + 73, 9.5f, z4 ? i + 73 : 62, 0.0f));
        ema emaVar2 = new ema(context);
        this.c = emaVar2;
        emaVar2.setTextSize(14);
        int i2 = aob.y6;
        yob.W(emaVar2, i2, null);
        emaVar2.setLinkTextColor(aob.w0(null, aob.J6, false));
        emaVar2.setGravity((ob6.a0 ? 5 : 3) | 48);
        boolean z5 = ob6.a0;
        addView(emaVar2, tre.d(-1, 20.0f, (z5 ? 5 : 3) | 48, z5 ? 62 : i + 73, 32.5f, z5 ? i + 73 : 62, 6.0f));
        ImageView imageView = new ImageView(context);
        this.e = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.msg_panel_clear);
        imageView.setOnClickListener(onClickListener);
        int i3 = aob.i6;
        hf0 f0 = aob.f0(aob.w0(null, i3, false), 1, -1);
        uob M = yob.M(i3);
        imageView.setBackground(f0);
        yob.j(imageView, f0, null, M, null);
        yob.s(imageView, i2, null, PorterDuff.Mode.MULTIPLY);
        boolean z6 = ob6.a0;
        addView(imageView, tre.d(48, 48.0f, (z6 ? 3 : 5) | 48, z6 ? 7.0f : 0.0f, 6.0f, z6 ? 0.0f : 7.0f, 0.0f));
    }

    public final void a(TLRPC.Chat chat, boolean z) {
        String k = c00.k(new StringBuilder(), uc7.s1(this.n).N2, "/");
        this.f = chat;
        rb0 rb0Var = this.d;
        rb0Var.p(chat);
        this.b.l(chat.title, false);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(k + xc2.K(chat, false));
        spannableStringBuilder.setSpan(new f8c("", (rmb) null), k.length(), spannableStringBuilder.length(), 33);
        this.c.l(spannableStringBuilder, false);
        this.a.f(chat, rb0Var);
        this.h = z;
    }

    public TLRPC.Chat getCurrentChannel() {
        return this.f;
    }

    public ImageView getDeleteButton() {
        return this.e;
    }

    public ema getNameTextView() {
        return this.b;
    }

    public ema getStatusTextView() {
        return this.c;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(hl.L((this.h ? 12 : 0) + 60), TLObject.FLAG_30));
    }

    @Override // snb
    public final void updateColors() {
        int i = 0;
        int i2 = 0;
        while (true) {
            try {
                int[] iArr = aob.p8;
                if (i >= iArr.length) {
                    break;
                }
                i2 = (i2 * 31) + aob.w0(null, iArr[i], false);
                i++;
            } catch (Exception e) {
                cc4.g(e, true);
                return;
            }
        }
        if (i2 != this.s) {
            this.s = i2;
            TLRPC.Chat chat = this.f;
            if (chat != null) {
                this.d.p(chat);
                this.a.invalidate();
            }
        }
        ema emaVar = this.c;
        if (emaVar != null) {
            emaVar.setLinkTextColor(aob.w0(null, aob.J6, false));
        }
    }

    @Override // snb
    public final void addColorKeys(HashSet hashSet) {
    }
}
