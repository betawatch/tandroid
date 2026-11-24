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

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class jb extends FrameLayout implements tjb {
    public final be0 a;
    public final jia b;
    public final jia c;
    public final pb0 d;
    public final ImageView e;
    public TLRPC.Chat f;
    public boolean h;
    public final int n;
    public final wf2 r;
    public int s;

    public jb(Context context, View.OnClickListener onClickListener, boolean z, int i) {
        super(context);
        this.n = y6c.t0;
        this.d = new pb0((wjb) null);
        be0 be0Var = new be0(context);
        this.a = be0Var;
        be0Var.setRoundRadius(gl.L(24.0f));
        boolean z2 = k96.a0;
        addView(be0Var, nme.d(48, 48.0f, (z2 ? 5 : 3) | 48, z2 ? 0.0f : i + 12, 6.0f, z2 ? i + 12 : 0.0f, 6.0f));
        if (z) {
            wf2 wf2Var = new wf2(21, null, context);
            this.r = wf2Var;
            wf2Var.b(-1, bkb.c6, bkb.j7);
            wf2Var.setDrawUnchecked(false);
            wf2Var.setDrawBackgroundAsArc(3);
            boolean z3 = k96.a0;
            addView(wf2Var, nme.d(24, 24.0f, (z3 ? 5 : 3) | 48, z3 ? 0.0f : i + 42, 32.0f, z3 ? i + 42 : 0.0f, 0.0f));
        }
        jia jiaVar = new jia(context);
        this.b = jiaVar;
        zkb.W(jiaVar, bkb.F6, null);
        jiaVar.setTextSize(17);
        jiaVar.setGravity((k96.a0 ? 5 : 3) | 48);
        boolean z4 = k96.a0;
        addView(jiaVar, nme.d(-1, 20.0f, (z4 ? 5 : 3) | 48, z4 ? 62 : i + 73, 9.5f, z4 ? i + 73 : 62, 0.0f));
        jia jiaVar2 = new jia(context);
        this.c = jiaVar2;
        jiaVar2.setTextSize(14);
        int i2 = bkb.x6;
        zkb.W(jiaVar2, i2, null);
        jiaVar2.setLinkTextColor(bkb.w0(null, bkb.I6, false));
        jiaVar2.setGravity((k96.a0 ? 5 : 3) | 48);
        boolean z5 = k96.a0;
        addView(jiaVar2, nme.d(-1, 20.0f, (z5 ? 5 : 3) | 48, z5 ? 62 : i + 73, 32.5f, z5 ? i + 73 : 62, 6.0f));
        ImageView imageView = new ImageView(context);
        this.e = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.msg_panel_clear);
        imageView.setOnClickListener(onClickListener);
        int i3 = bkb.h6;
        ff0 f0 = bkb.f0(bkb.w0(null, i3, false), 1, -1);
        vkb M = zkb.M(i3);
        imageView.setBackground(f0);
        zkb.j(imageView, f0, null, M, null);
        zkb.s(imageView, i2, null, PorterDuff.Mode.MULTIPLY);
        boolean z6 = k96.a0;
        addView(imageView, nme.d(48, 48.0f, (z6 ? 3 : 5) | 48, z6 ? 7.0f : 0.0f, 6.0f, z6 ? 0.0f : 7.0f, 0.0f));
    }

    public final void a(TLRPC.Chat chat, boolean z) {
        String j = b00.j(new StringBuilder(), na7.q1(this.n).N2, "/");
        this.f = chat;
        pb0 pb0Var = this.d;
        pb0Var.p(chat);
        this.b.l(chat.title, false);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(j + hc2.K(chat, false));
        spannableStringBuilder.setSpan(new g4c("", (vib) null), j.length(), spannableStringBuilder.length(), 33);
        this.c.l(spannableStringBuilder, false);
        this.a.f(chat, pb0Var);
        this.h = z;
    }

    public TLRPC.Chat getCurrentChannel() {
        return this.f;
    }

    public ImageView getDeleteButton() {
        return this.e;
    }

    public jia getNameTextView() {
        return this.b;
    }

    public jia getStatusTextView() {
        return this.c;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gl.L((this.h ? 12 : 0) + 60), TLObject.FLAG_30));
    }

    @Override // tjb
    public final void updateColors() {
        int i = 0;
        int i2 = 0;
        while (true) {
            try {
                int[] iArr = bkb.o8;
                if (i >= iArr.length) {
                    break;
                }
                i2 = (i2 * 31) + bkb.w0(null, iArr[i], false);
                i++;
            } catch (Exception e) {
                fa4.g(e, true);
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
        jia jiaVar = this.c;
        if (jiaVar != null) {
            jiaVar.setLinkTextColor(bkb.w0(null, bkb.I6, false));
        }
    }

    @Override // tjb
    public final void addColorKeys(HashSet hashSet) {
    }
}
