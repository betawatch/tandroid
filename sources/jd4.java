// default package

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_chatlists;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public abstract class jd4 extends FrameLayout implements tjb {
    public TL_chatlists.TL_exportedChatlistInvite E;
    public final d a;
    public final int b;
    public final int c;
    public final Drawable d;
    public final Drawable e;
    public final hn f;
    public final hn h;
    public final Paint n;
    public final Paint r;
    public float s;
    public boolean w;
    public ValueAnimator x;
    public String y;

    public jd4(Context context, d dVar, int i, int i2) {
        super(context);
        this.a = dVar;
        this.b = i;
        this.c = i2;
        setImportantForAccessibility(1);
        hn hnVar = new hn(context, true, true, false);
        this.f = hnVar;
        hnVar.setTextSize(gl.L(15.66f));
        zkb.U(hnVar, bkb.F6, null);
        hnVar.setGravity(k96.a0 ? 5 : 3);
        hnVar.setEllipsizeByGradient(true);
        boolean z = k96.a0;
        addView(hnVar, nme.d(-1, 20.0f, 55, z ? 56.0f : 64.0f, 10.33f, z ? 64.0f : 56.0f, 0.0f));
        hn hnVar2 = new hn(context, false, false, false);
        this.h = hnVar2;
        hnVar2.setTextSize(gl.L(13.0f));
        zkb.U(hnVar2, bkb.y6, null);
        hnVar2.setGravity(k96.a0 ? 5 : 3);
        boolean z2 = k96.a0;
        addView(hnVar2, nme.d(-1, 16.0f, 55, z2 ? 56.0f : 64.0f, 33.33f, z2 ? 64.0f : 56.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        imageView.setImageDrawable(getContext().getResources().getDrawable(R.drawable.ic_ab_other));
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        int i3 = bkb.h6;
        ff0 f0 = bkb.f0(bkb.w0(null, i3, false), 1, -1);
        vkb M = zkb.M(i3);
        imageView.setBackground(f0);
        zkb.j(imageView, f0, null, M, null);
        int i4 = bkb.Ki;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        zkb.s(imageView, i4, null, mode);
        imageView.setOnClickListener(new yj3(this, (byte) 12));
        imageView.setContentDescription(k96.M0(2131754838, null));
        boolean z3 = k96.a0;
        addView(imageView, nme.d(40, 40.0f, (z3 ? 3 : 5) | 16, z3 ? 8.0f : 4.0f, 4.0f, z3 ? 4.0f : 8.0f, 4.0f));
        Paint paint = new Paint();
        this.n = paint;
        paint.setColor(bkb.w0(null, bkb.Ei, false));
        Paint paint2 = new Paint();
        this.r = paint2;
        paint2.setColor(bkb.w0(null, bkb.mk, false));
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.msg_link_1).mutate();
        this.d = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(-1, mode));
        Drawable mutate2 = getContext().getResources().getDrawable(R.drawable.msg_link_2).mutate();
        this.e = mutate2;
        mutate2.setColorFilter(new PorterDuffColorFilter(-1, mode));
        setWillNotDraw(false);
    }

    public final void a() {
        String str = this.y;
        String substring = str == null ? null : str.substring(str.lastIndexOf(47) + 1);
        if (substring == null) {
            return;
        }
        TL_chatlists.TL_chatlists_deleteExportedInvite tL_chatlists_deleteExportedInvite = new TL_chatlists.TL_chatlists_deleteExportedInvite();
        TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
        tL_chatlists_deleteExportedInvite.chatlist = tL_inputChatlistDialogFilter;
        tL_inputChatlistDialogFilter.filter_id = this.c;
        tL_chatlists_deleteExportedInvite.slug = substring;
        hd4 hd4Var = new hd4(this, (byte) 2);
        ConnectionsManager.getInstance(this.b).sendRequest(tL_chatlists_deleteExportedInvite, new rv3(this, hd4Var, (byte) 3));
        gl.e3(hd4Var, 150L);
    }

    public abstract void b(TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite);

    public void c() {
        d dVar = this.a;
        if (dVar instanceof pd4) {
            fu fuVar = ((pd4) dVar).a;
            cs5 I = cs5.I(dVar, this);
            I.X(fuVar.V0(this, false));
            I.b(R.drawable.msg_qrcode, k96.M0(2131750456, null), new hd4(this, (byte) 0), false);
            I.b(R.drawable.msg_delete, k96.M0(2131751522, null), new hd4(this, (byte) 1), true);
            if (k96.a0) {
                I.i = (byte) 3;
            }
            I.a0();
        }
    }

    public final void d() {
        if (this.y == null) {
            return;
        }
        zu8 zu8Var = new zu8(getContext(), k96.M0(2131748978, null), this.y, k96.M0(2131746313, null), false);
        zu8Var.D0();
        zu8Var.show();
    }

    public final void e(TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite, boolean z) {
        byte b = 0;
        boolean z2 = this.E == tL_exportedChatlistInvite;
        this.E = tL_exportedChatlistInvite;
        String str = tL_exportedChatlistInvite.url;
        this.y = str;
        if (str.startsWith("http://")) {
            str = str.substring(7);
        }
        if (str.startsWith("https://")) {
            str = str.substring(8);
        }
        boolean isEmpty = TextUtils.isEmpty(tL_exportedChatlistInvite.title);
        hn hnVar = this.f;
        if (isEmpty) {
            hnVar.c(str, z2, true);
        } else {
            hnVar.c(tL_exportedChatlistInvite.title, z2, true);
        }
        this.h.c(k96.G(tL_exportedChatlistInvite.peers.size(), "FilterInviteChats", new Object[0]), z2, true);
        if (this.w != z) {
            this.w = z;
            invalidate();
        }
        boolean z3 = tL_exportedChatlistInvite.revoked;
        if ((z3 ? 1.0f : 0.0f) != this.s) {
            ValueAnimator valueAnimator = this.x;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.x = null;
            }
            if (!z2) {
                this.s = z3 ? 1.0f : 0.0f;
                invalidate();
                return;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.s, z3 ? 1.0f : 0.0f);
            this.x = ofFloat;
            ofFloat.addUpdateListener(new uz1(this, (byte) 25));
            this.x.addListener(new id4(b, this, z3));
            this.x.setInterpolator(s33.h);
            this.x.setDuration(350L);
            this.x.start();
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int measuredWidth = k96.a0 ? getMeasuredWidth() - gl.L(32.0f) : gl.L(32.0f);
        float f = measuredWidth;
        canvas.drawCircle(f, getMeasuredHeight() / 2.0f, gl.L(16.0f), this.n);
        if (this.s > 0.0f) {
            canvas.drawCircle(f, getMeasuredHeight() / 2.0f, gl.L(16.0f) * this.s, this.r);
        }
        float f2 = this.s;
        if (f2 < 1.0f) {
            Drawable drawable = this.d;
            drawable.setAlpha((int) ((1.0f - f2) * 255.0f));
            drawable.setBounds(measuredWidth - gl.L(14.0f), (getMeasuredHeight() / 2) - gl.L(14.0f), gl.L(14.0f) + measuredWidth, gl.L(14.0f) + (getMeasuredHeight() / 2));
            drawable.draw(canvas);
        }
        float f3 = this.s;
        if (f3 > 0.0f) {
            Drawable drawable2 = this.e;
            drawable2.setAlpha((int) (f3 * 255.0f));
            drawable2.setBounds(measuredWidth - gl.L(14.0f), (getMeasuredHeight() / 2) - gl.L(14.0f), gl.L(14.0f) + measuredWidth, gl.L(14.0f) + (getMeasuredHeight() / 2));
            drawable2.draw(canvas);
        }
        if (this.w) {
            canvas.drawRect(k96.a0 ? 0.0f : gl.L(64.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (k96.a0 ? gl.L(64.0f) : 0), getMeasuredHeight(), bkb.j0);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = this.E;
        String str = "";
        StringBuilder sb = new StringBuilder((tL_exportedChatlistInvite == null || TextUtils.isEmpty(tL_exportedChatlistInvite.title)) ? "" : b00.j(new StringBuilder(), this.E.title, "\n "));
        sb.append(k96.M0(2131748957, null));
        sb.append(", ");
        sb.append((Object) this.h.getText());
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite2 = this.E;
        if (tL_exportedChatlistInvite2 != null && TextUtils.isEmpty(tL_exportedChatlistInvite2.title)) {
            str = "\n\n" + this.E.url;
        }
        sb.append(str);
        accessibilityNodeInfo.setContentDescription(sb.toString());
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gl.L(60.0f), TLObject.FLAG_30));
    }

    @Override // tjb
    public final void updateColors() {
        try {
            this.n.setColor(bkb.w0(null, bkb.Ei, false));
            this.r.setColor(bkb.w0(null, bkb.mk, false));
            invalidate();
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override // tjb
    public final void addColorKeys(HashSet hashSet) {
    }
}
