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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class jb extends FrameLayout implements vlb {
    public final bf0 a;
    public final lka b;
    public final lka c;
    public final pc0 d;
    public final ImageView e;
    public TLRPC.Chat f;
    public boolean h;
    public final int n;
    public final jh2 r;
    public int s;

    public jb(Context context, View.OnClickListener onClickListener, boolean z, int i) {
        super(context);
        this.n = z8c.t0;
        this.d = new pc0((ylb) null);
        bf0 bf0Var = new bf0(context);
        this.a = bf0Var;
        bf0Var.setRoundRadius(gm.L(24.0f));
        boolean z2 = jb6.a0;
        addView(bf0Var, qoe.d(48, 48.0f, (z2 ? 5 : 3) | 48, z2 ? 0.0f : i + 12, 6.0f, z2 ? i + 12 : 0.0f, 6.0f));
        if (z) {
            jh2 jh2Var = new jh2(21, null, context);
            this.r = jh2Var;
            jh2Var.b(-1, cmb.c6, cmb.j7);
            jh2Var.setDrawUnchecked(false);
            jh2Var.setDrawBackgroundAsArc(3);
            boolean z3 = jb6.a0;
            addView(jh2Var, qoe.d(24, 24.0f, (z3 ? 5 : 3) | 48, z3 ? 0.0f : i + 42, 32.0f, z3 ? i + 42 : 0.0f, 0.0f));
        }
        lka lkaVar = new lka(context);
        this.b = lkaVar;
        anb.W(lkaVar, cmb.F6, null);
        lkaVar.setTextSize(17);
        lkaVar.setGravity((jb6.a0 ? 5 : 3) | 48);
        boolean z4 = jb6.a0;
        addView(lkaVar, qoe.d(-1, 20.0f, (z4 ? 5 : 3) | 48, z4 ? 62 : i + 73, 9.5f, z4 ? i + 73 : 62, 0.0f));
        lka lkaVar2 = new lka(context);
        this.c = lkaVar2;
        lkaVar2.setTextSize(14);
        int i2 = cmb.x6;
        anb.W(lkaVar2, i2, null);
        lkaVar2.setLinkTextColor(cmb.w0(null, cmb.I6, false));
        lkaVar2.setGravity((jb6.a0 ? 5 : 3) | 48);
        boolean z5 = jb6.a0;
        addView(lkaVar2, qoe.d(-1, 20.0f, (z5 ? 5 : 3) | 48, z5 ? 62 : i + 73, 32.5f, z5 ? i + 73 : 62, 6.0f));
        ImageView imageView = new ImageView(context);
        this.e = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.msg_panel_clear);
        imageView.setOnClickListener(onClickListener);
        int i3 = cmb.h6;
        fg0 f0 = cmb.f0(cmb.w0(null, i3, false), 1, -1);
        wmb M = anb.M(i3);
        imageView.setBackground(f0);
        anb.j(imageView, f0, null, M, null);
        anb.s(imageView, i2, null, PorterDuff.Mode.MULTIPLY);
        boolean z6 = jb6.a0;
        addView(imageView, qoe.d(48, 48.0f, (z6 ? 3 : 5) | 48, z6 ? 7.0f : 0.0f, 6.0f, z6 ? 0.0f : 7.0f, 0.0f));
    }

    public final void a(TLRPC.Chat chat, boolean z) {
        String j = b10.j(new StringBuilder(), oc7.r1(this.n).N2, "/");
        this.f = chat;
        pc0 pc0Var = this.d;
        pc0Var.p(chat);
        this.b.l(chat.title, false);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(j + sd2.K(chat, false));
        spannableStringBuilder.setSpan(new g6c("", (wkb) null), j.length(), spannableStringBuilder.length(), 33);
        this.c.l(spannableStringBuilder, false);
        this.a.f(chat, pc0Var);
        this.h = z;
    }

    public TLRPC.Chat getCurrentChannel() {
        return this.f;
    }

    public ImageView getDeleteButton() {
        return this.e;
    }

    public lka getNameTextView() {
        return this.b;
    }

    public lka getStatusTextView() {
        return this.c;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gm.L((this.h ? 12 : 0) + 60), TLObject.FLAG_30));
    }

    @Override // vlb
    public final void updateColors() {
        int i = 0;
        int i2 = 0;
        while (true) {
            try {
                int[] iArr = cmb.o8;
                if (i >= iArr.length) {
                    break;
                }
                i2 = (i2 * 31) + cmb.w0(null, iArr[i], false);
                i++;
            } catch (Exception e) {
                fc4.g(e, true);
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
        lka lkaVar = this.c;
        if (lkaVar != null) {
            lkaVar.setLinkTextColor(cmb.w0(null, cmb.I6, false));
        }
    }

    @Override // vlb
    public final void addColorKeys(HashSet hashSet) {
    }
}
