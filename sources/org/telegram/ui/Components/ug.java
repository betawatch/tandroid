package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class ug extends FrameLayout {
    public final Drawable E;
    public final Drawable F;
    public final tg G;
    public int H;
    public final RectF I;
    public final RectF J;
    public long K;
    public final Path L;
    public final float[] M;
    public final float[] N;
    public final g6 O;
    public dh.b P;
    public boolean Q;
    public ch.d R;
    public ch.d S;
    public boolean T;
    public boolean U;
    public final /* synthetic */ ChatActivityEnterView V;
    public ci.d4 a;
    public ci.d4 b;
    public ShapeDrawable c;
    public final Drawable d;
    public final String e;
    public StaticLayout f;
    public float h;
    public final TextPaint n;
    public final Paint r;
    public final Paint s;
    public final Paint v;
    public final Path w;
    public final Paint x;
    public final ci.l y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ug(ChatActivityEnterView chatActivityEnterView, Context context) {
        super(context);
        this.V = chatActivityEnterView;
        TextPaint textPaint = new TextPaint(1);
        this.n = textPaint;
        this.r = new Paint(1);
        this.s = new Paint(1);
        Paint paint = new Paint(1);
        this.v = paint;
        this.w = new Path();
        this.x = new Paint(1);
        this.I = new RectF();
        this.J = new RectF();
        this.L = new Path();
        this.M = new float[]{r14, r14, 0.0f, 0.0f, 0.0f, 0.0f, r14, r14};
        this.N = new float[]{0.0f, 0.0f, r13, r13, r13, r13, 0.0f, 0.0f};
        this.O = new g6(this, 0L, 350L, hs.h);
        tg tgVar = new tg(this, this);
        this.G = tgVar;
        r0.i0.j(this, tgVar);
        ci.l lVar = new ci.l(5);
        this.y = lVar;
        lVar.setCallback(this);
        lVar.d(1, chatActivityEnterView.O, false);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(AndroidUtilities.dpf2(1.7f));
        Drawable drawable = getResources().getDrawable(R.drawable.lock_round_shadow);
        chatActivityEnterView.V3 = drawable;
        drawable.setColorFilter(new PorterDuffColorFilter(chatActivityEnterView.g0(org.telegram.ui.ActionBar.i6.be), PorterDuff.Mode.MULTIPLY));
        this.c = org.telegram.ui.ActionBar.i6.c0(AndroidUtilities.dp(5.0f), chatActivityEnterView.g0(org.telegram.ui.ActionBar.i6.qf));
        textPaint.setTextSize(AndroidUtilities.dp(14.0f));
        this.d = context.getDrawable(R.drawable.tooltip_arrow);
        this.e = LocaleController.getString("SlideUpToLock", R.string.SlideUpToLock);
        float dp = AndroidUtilities.dp(3.0f);
        float dp2 = AndroidUtilities.dp(3.0f);
        this.E = getResources().getDrawable(R.drawable.input_mic).mutate();
        this.F = getResources().getDrawable(R.drawable.input_video).mutate();
        setWillNotDraw(false);
        c();
    }

    public final void a() {
        ci.d4 d4Var = this.a;
        if (d4Var != null) {
            d4Var.l0 = new sg(this, d4Var, 1);
            d4Var.e(true);
            this.a = null;
        }
        ci.d4 d4Var2 = this.b;
        if (d4Var2 != null) {
            d4Var2.l0 = new sg(this, d4Var2, 2);
            d4Var2.e(true);
            this.b = null;
        }
    }

    public final void b() {
        a();
        ci.d4 d4Var = new ci.d4(getContext(), 2);
        this.b = d4Var;
        d4Var.l(1.0f, 0.0f);
        this.b.p(true);
        ChatActivityEnterView chatActivityEnterView = this.V;
        this.b.s(AndroidUtilities.replaceTags(LocaleController.getString(chatActivityEnterView.c1 ? chatActivityEnterView.O ? R.string.VideoSetOnceHintEnabled : R.string.VideoSetOnceHint : chatActivityEnterView.O ? R.string.VoiceSetOnceHintEnabled : R.string.VoiceSetOnceHint)));
        ci.d4 d4Var2 = this.b;
        d4Var2.h = ci.d4.a(d4Var2.getText(), this.b.getTextPaint());
        if (chatActivityEnterView.O) {
            ci.d4 d4Var3 = this.b;
            int i10 = R.raw.fire_on;
            d4Var3.getClass();
            ck0 ck0Var = new ck0(i10, AndroidUtilities.dp(34.0f), AndroidUtilities.dp(34.0f));
            ck0Var.start();
            d4Var3.j(ck0Var);
        } else {
            MessagesController.getGlobalMainSettings().edit().putInt("voiceoncehint", MessagesController.getGlobalMainSettings().getInt("voiceoncehint", 0) + 1).apply();
        }
        addView(this.b, w7.x5.a(-1.0f, 0.0f, 0.0f, 54.0f, 58.0f, -1, 119));
        ci.d4 d4Var4 = this.b;
        d4Var4.l0 = new sg(this, d4Var4, 0);
        d4Var4.u();
    }

    public final void c() {
        dh.b bVar = this.P;
        if (bVar != null) {
            bVar.b();
        }
        ch.d dVar = this.R;
        if (dVar != null) {
            dVar.v();
        }
        ch.d dVar2 = this.S;
        if (dVar2 != null) {
            dVar2.v();
        }
        int i10 = this.Q ? org.telegram.ui.ActionBar.i6.Wk : org.telegram.ui.ActionBar.i6.Zd;
        ChatActivityEnterView chatActivityEnterView = this.V;
        this.y.e(chatActivityEnterView.g0(i10), chatActivityEnterView.g0(org.telegram.ui.ActionBar.i6.cf), -1);
        this.n.setColor(chatActivityEnterView.g0(org.telegram.ui.ActionBar.i6.pf));
        int dp = AndroidUtilities.dp(5.0f);
        int i11 = org.telegram.ui.ActionBar.i6.qf;
        this.c = org.telegram.ui.ActionBar.i6.c0(dp, chatActivityEnterView.g0(i11));
        int g02 = chatActivityEnterView.g0(i11);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.d.setColorFilter(new PorterDuffColorFilter(g02, mode));
        this.r.setColor(chatActivityEnterView.g0(org.telegram.ui.ActionBar.i6.ae));
        this.s.setColor(chatActivityEnterView.g0(this.Q ? org.telegram.ui.ActionBar.i6.Wk : org.telegram.ui.ActionBar.i6.Zd));
        this.v.setColor(chatActivityEnterView.g0(this.Q ? org.telegram.ui.ActionBar.i6.Wk : org.telegram.ui.ActionBar.i6.Zd));
        this.E.setColorFilter(new PorterDuffColorFilter(chatActivityEnterView.g0(this.Q ? org.telegram.ui.ActionBar.i6.Wk : org.telegram.ui.ActionBar.i6.Zd), mode));
        this.F.setColorFilter(new PorterDuffColorFilter(chatActivityEnterView.g0(this.Q ? org.telegram.ui.ActionBar.i6.Wk : org.telegram.ui.ActionBar.i6.Zd), mode));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        return super.dispatchHoverEvent(motionEvent) || this.G.f(motionEvent);
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0767, code lost:
    
        r1.drawCircle(r3, r40, org.telegram.messenger.AndroidUtilities.dpf2(2.0f) * r36, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0772, code lost:
    
        r1.restore();
        r1.restore();
        r3 = (org.telegram.messenger.AndroidUtilities.dp(38.0f) * r10) + (org.telegram.messenger.AndroidUtilities.lerp(r13, getMeasuredHeight() - org.telegram.messenger.AndroidUtilities.dp(118.0f), java.lang.Math.max(r8.m4, java.lang.Math.min(r38, r8.q4))) + r26);
        r12.set(r35 - org.telegram.messenger.AndroidUtilities.dpf2(18.0f), r3, org.telegram.messenger.AndroidUtilities.dpf2(18.0f) + r35, r3 + r21);
        r2 = r8.Z2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x07b7, code lost:
    
        if (r2 == null) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x07bd, code lost:
    
        if (r2.u1() == false) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x07bf, code lost:
    
        r11 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x07c4, code lost:
    
        r8.P = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x07c6, code lost:
    
        if (r11 == false) goto L163;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x07c8, code lost:
    
        r2 = org.telegram.messenger.AndroidUtilities.dpf2(12.0f);
        r12.set(r12.left, (r12.top - org.telegram.messenger.AndroidUtilities.dpf2(36.0f)) - r2, r12.right, r12.top - r2);
        r2 = r45.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x07e0, code lost:
    
        if (r2 == null) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x07e2, code lost:
    
        r2.m(0.0f, r12.centerY());
        r45.b.invalidate();
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x07ef, code lost:
    
        r45.J.set(r12);
        r1.save();
        r9 = (((1.0f - r8.m4) * r8.i4) * r8.q4) * r8.n4;
        r1.scale(r9, r9, r12.centerX(), r12.centerY());
        r2 = r45.S;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0813, code lost:
    
        if (r2 == null) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0815, code lost:
    
        r2.setBounds((int) (r12.left - org.telegram.messenger.AndroidUtilities.dpf2(3.0f)), (int) (r12.top - org.telegram.messenger.AndroidUtilities.dpf2(3.0f)), (int) (org.telegram.messenger.AndroidUtilities.dpf2(3.0f) + r12.right), (int) (org.telegram.messenger.AndroidUtilities.dpf2(3.0f) + r12.bottom));
        r45.S.draw(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0873, code lost:
    
        r45.y.setBounds((int) r12.left, (int) r12.top, (int) r12.right, (int) r12.bottom);
        r45.y.draw(r1);
        r1.restore();
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x088c, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x083e, code lost:
    
        r8.V3.setBounds((int) (r12.left - org.telegram.messenger.AndroidUtilities.dpf2(3.0f)), (int) (r12.top - org.telegram.messenger.AndroidUtilities.dpf2(3.0f)), (int) (org.telegram.messenger.AndroidUtilities.dpf2(3.0f) + r12.right), (int) (org.telegram.messenger.AndroidUtilities.dpf2(3.0f) + r12.bottom));
        r8.V3.draw(r1);
        r1.drawRoundRect(r12, org.telegram.messenger.AndroidUtilities.dpf2(18.0f), org.telegram.messenger.AndroidUtilities.dpf2(18.0f), r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x07c2, code lost:
    
        r11 = r27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x06fe, code lost:
    
        r27 = false;
        r1.drawRoundRect(r12, org.telegram.messenger.AndroidUtilities.dpf2(3.0f), org.telegram.messenger.AndroidUtilities.dpf2(3.0f), r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x064d, code lost:
    
        r2 = r45.E;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0650, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x063e, code lost:
    
        r40 = r5;
        r18 = 0.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x043b, code lost:
    
        r34 = r7;
        r35 = r9;
        r8.V3.setBounds((int) (r12.left - org.telegram.messenger.AndroidUtilities.dpf2(3.0f)), (int) (r12.top - org.telegram.messenger.AndroidUtilities.dpf2(3.0f)), (int) (org.telegram.messenger.AndroidUtilities.dpf2(3.0f) + r12.right), (int) (org.telegram.messenger.AndroidUtilities.dpf2(3.0f) + r12.bottom));
        r8.V3.draw(r46);
        r46.drawRoundRect(r12, org.telegram.messenger.AndroidUtilities.dpf2(18.0f), org.telegram.messenger.AndroidUtilities.dpf2(18.0f), r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x03de, code lost:
    
        r26 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x03a5, code lost:
    
        r8.e4 = false;
        r4 = r8.q4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x03ac, code lost:
    
        if (r4 == 0.0f) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x03ae, code lost:
    
        r4 = r4 - 0.12f;
        r8.q4 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x03b3, code lost:
    
        if (r4 >= 0.0f) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x03b5, code lost:
    
        r8.q4 = 0.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0314, code lost:
    
        r3 = 0.0f;
        r2 = java.lang.Math.max(0.0f, (r2 - 0.38f) / r25);
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0307, code lost:
    
        r4 = r2 / 0.38f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0329, code lost:
    
        r2 = r8.m4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x032e, code lost:
    
        if (r2 == 0.0f) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0335, code lost:
    
        if (r2 <= 0.6f) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x0337, code lost:
    
        r4 = 1.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x033e, code lost:
    
        if (r8.g0 == false) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0341, code lost:
    
        r2 = java.lang.Math.max(0.0f, (r2 - 0.6f) / 0.4f);
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0349, code lost:
    
        r3 = org.telegram.ui.Components.hs.j;
        r4 = r3.getInterpolation(r4);
        r2 = r3.getInterpolation(r2);
        r14 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x033a, code lost:
    
        r4 = r2 / 0.6f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0355, code lost:
    
        r2 = 0.0f;
        r14 = 0.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x02ea, code lost:
    
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x02d7, code lost:
    
        r21 = r2;
        r30 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x019f, code lost:
    
        r4 = r8.g4 - (r3 / 150.0f);
        r8.g4 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x01a8, code lost:
    
        if (r4 >= 0.0f) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x01aa, code lost:
    
        r8.g4 = 0.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x017f, code lost:
    
        r8.e4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0166, code lost:
    
        if (r8.g4 != 0.0f) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x015b, code lost:
    
        if ((java.lang.System.currentTimeMillis() - r8.f4) <= 200) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x016d, code lost:
    
        if (r33 < 0.8f) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0171, code lost:
    
        if (r8.s4 != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0177, code lost:
    
        if (r8.m4 != 0.0f) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x017d, code lost:
    
        if (r8.p4 == 0.0f) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0186, code lost:
    
        if (r8.e4 == false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0188, code lost:
    
        r5 = r8.g4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x018c, code lost:
    
        if (r5 == r32) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x018e, code lost:
    
        r3 = (r3 / 150.0f) + r5;
        r8.g4 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0195, code lost:
    
        if (r3 < r32) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0197, code lost:
    
        r8.g4 = r32;
        org.telegram.messenger.SharedConfig.increaseLockRecordAudioVideoHintShowed();
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x01ae, code lost:
    
        r3 = (int) (r8.g4 * 255.0f);
        r45.c.setAlpha(r3);
        r4 = r45.d;
        r4.setAlpha(r3);
        r45.n.setAlpha(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x01c4, code lost:
    
        if (r45.f == null) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x01c6, code lost:
    
        r46.save();
        r12.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        r46.translate((getMeasuredWidth() - r45.h) - org.telegram.messenger.AndroidUtilities.dp(44.0f), org.telegram.messenger.AndroidUtilities.dpf2(16.0f) + r14);
        r21 = r2;
        r30 = r6;
        r45.c.setBounds(-org.telegram.messenger.AndroidUtilities.dp(8.0f), -org.telegram.messenger.AndroidUtilities.dp(2.0f), (int) (r45.h + org.telegram.messenger.AndroidUtilities.dp(36.0f)), (int) (org.telegram.messenger.AndroidUtilities.dpf2(4.0f) + r45.f.getHeight()));
        r45.c.draw(r46);
        r45.f.draw(r46);
        r46.restore();
        r46.save();
        r46.translate(getMeasuredWidth() - org.telegram.messenger.AndroidUtilities.dp(r26), ((r45.f.getHeight() / 2.0f) + (org.telegram.messenger.AndroidUtilities.dpf2(17.0f) + r14)) - (org.telegram.messenger.AndroidUtilities.dpf2(3.0f) * r8.o4));
        r2 = r45.w;
        r2.reset();
        r2.setLastPoint(-org.telegram.messenger.AndroidUtilities.dpf2(5.0f), org.telegram.messenger.AndroidUtilities.dpf2(4.0f));
        r2.lineTo(0.0f, 0.0f);
        r2.lineTo(org.telegram.messenger.AndroidUtilities.dpf2(5.0f), org.telegram.messenger.AndroidUtilities.dpf2(4.0f));
        r6 = r45.x;
        r6.setColor(-1);
        r6.setAlpha(r3);
        r6.setStyle(android.graphics.Paint.Style.STROKE);
        r6.setStrokeCap(android.graphics.Paint.Cap.ROUND);
        r6.setStrokeJoin(android.graphics.Paint.Join.ROUND);
        r6.setStrokeWidth(org.telegram.messenger.AndroidUtilities.dpf2(1.5f));
        r46.drawPath(r2, r6);
        r46.restore();
        r46.save();
        r4.setBounds(r7 - (r4.getIntrinsicWidth() / 2), (int) (org.telegram.messenger.AndroidUtilities.dpf2(20.0f) + (r45.f.getHeight() + r14)), org.telegram.ui.Cells.c1.w(2, r7, r4), r4.getIntrinsicHeight() + ((int) (org.telegram.messenger.AndroidUtilities.dpf2(20.0f) + (r45.f.getHeight() + r14))));
        r4.draw(r46);
        r46.restore();
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x02dd, code lost:
    
        if (r8.c1 == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x02e6, code lost:
    
        if (r8.i1 < 59000) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x02e8, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x02eb, code lost:
    
        r10 = r45.O.e(r2);
        r2 = r8.p4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x02f7, code lost:
    
        if (r2 == 0.0f) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x02fb, code lost:
    
        if (r8.h1 == null) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0302, code lost:
    
        if (r2 <= 0.38f) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0304, code lost:
    
        r4 = 1.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x030e, code lost:
    
        if (r2 <= 0.63f) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0310, code lost:
    
        r2 = 1.0f;
        r3 = 0.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x031c, code lost:
    
        r5 = org.telegram.ui.Components.hs.j;
        r18 = r5.getInterpolation(r4);
        r5.getInterpolation(r2);
        r2 = r3;
        r14 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0357, code lost:
    
        r46.save();
        r46.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight() - r8.z1.getMeasuredHeight());
        r3 = 1.0f - r8.i4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0377, code lost:
    
        if (r3 == 0.0f) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x037c, code lost:
    
        if (r2 == 0.0f) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x037e, code lost:
    
        r3 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0380, code lost:
    
        r3 = 0.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x038b, code lost:
    
        if (r8.j4 < 0.7f) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x038f, code lost:
    
        if (r8.r4 == false) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0393, code lost:
    
        r4 = r8.q4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0399, code lost:
    
        if (r4 == 1.0f) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x039b, code lost:
    
        r4 = r4 + 0.12f;
        r8.q4 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x03a0, code lost:
    
        if (r4 <= 1.0f) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x03a2, code lost:
    
        r8.q4 = 1.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x03b7, code lost:
    
        r4 = org.telegram.messenger.AndroidUtilities.dpf2(72.0f);
        r3 = com.google.android.gms.internal.vision.e2.y(1.0f, r3, org.telegram.messenger.AndroidUtilities.dpf2(24.0f) * r14, r4 * r3);
        r5 = r8.q4;
        r3 = com.google.android.gms.internal.vision.e2.y(1.0f, r5, r4, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x03d9, code lost:
    
        if (r3 <= r4) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x03db, code lost:
    
        r26 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x03e0, code lost:
    
        r2 = org.telegram.messenger.q.z(1.0f, r2, (1.0f - r10) * r8.i4, r5);
        r9 = r7;
        r6 = r30 + r26;
        r46.scale(r2, r2, r9, r6);
        r4 = r13 + r26;
        r12.set(r9 - org.telegram.messenger.AndroidUtilities.dpf2(18.0f), r4, org.telegram.messenger.AndroidUtilities.dpf2(18.0f) + r9, r4 + r15);
        r3 = r45.R;
        r4 = r45.r;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0409, code lost:
    
        if (r3 == null) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x040b, code lost:
    
        r34 = r7;
        r35 = r9;
        r3.setBounds((int) (r12.left - org.telegram.messenger.AndroidUtilities.dpf2(3.0f)), (int) (r12.top - org.telegram.messenger.AndroidUtilities.dpf2(3.0f)), (int) (org.telegram.messenger.AndroidUtilities.dpf2(3.0f) + r12.right), (int) (org.telegram.messenger.AndroidUtilities.dpf2(3.0f) + r12.bottom));
        r45.R.draw(r46);
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0475, code lost:
    
        r8.S3.set(r12);
        r3 = r8.S3;
        r5 = r3.centerX();
        r6 = r3.centerY();
        r3.left = org.telegram.messenger.AndroidUtilities.lerp(r5, r3.left, r2);
        r3.right = org.telegram.messenger.AndroidUtilities.lerp(r5, r3.right, r2);
        r3.top = org.telegram.messenger.AndroidUtilities.lerp(r6, r3.top, r2);
        r3.bottom = org.telegram.messenger.AndroidUtilities.lerp(r6, r3.bottom, r2);
        r2 = r45.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x04a6, code lost:
    
        if (r2 == null) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x04a8, code lost:
    
        r2.m(0.0f, r12.centerY());
        r45.a.invalidate();
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x04b5, code lost:
    
        r36 = 1.0f - r21;
        r12.set((r35 - org.telegram.messenger.AndroidUtilities.dpf2(6.0f)) - (org.telegram.messenger.AndroidUtilities.dpf2(2.0f) * r36), r6 - (org.telegram.messenger.AndroidUtilities.dpf2(2.0f) * r36), (org.telegram.messenger.AndroidUtilities.dpf2(2.0f) * r36) + (org.telegram.messenger.AndroidUtilities.dp(6.0f) + r34), (org.telegram.messenger.AndroidUtilities.dpf2(2.0f) * r36) + (r6 + org.telegram.messenger.AndroidUtilities.dp(12.0f)));
        r2 = r12.bottom;
        r3 = r12.centerX();
        r5 = r12.centerY();
        r46.save();
        r37 = org.telegram.messenger.Utilities.clamp(r8.p4 * 2.0f, 1.0f, 0.0f);
        r9 = r45.s;
        r6 = r9.getAlpha();
        r10 = r21;
        r21 = r15;
        r38 = r14;
        r1 = r46;
        r7 = r1.saveLayerAlpha(r3 - org.telegram.messenger.AndroidUtilities.dp(24.0f), r5 - org.telegram.messenger.AndroidUtilities.dp(24.0f), org.telegram.messenger.AndroidUtilities.dp(24.0f) + r3, org.telegram.messenger.AndroidUtilities.dp(24.0f) + r5, (int) (r6 * (1.0f - r37)), 31);
        r6 = r45.v;
        r6.setAlpha(255);
        r9.setAlpha(255);
        r3 = 1.0f - r33;
        r1.translate(0.0f, org.telegram.messenger.AndroidUtilities.dpf2(2.0f) * r3);
        r1.rotate(r11, r3, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0576, code lost:
    
        if (r10 == 1.0f) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0578, code lost:
    
        r2 = org.telegram.messenger.AndroidUtilities.rectTmp;
        r2.set(0.0f, 0.0f, org.telegram.messenger.AndroidUtilities.dpf2(8.0f), org.telegram.messenger.AndroidUtilities.dpf2(8.0f));
        r1.save();
        r1.clipRect(0.0f, 0.0f, getMeasuredWidth(), (org.telegram.messenger.AndroidUtilities.dpf2(2.0f) * r3) + (r26 + r2));
        r40 = r5;
        r13 = r33;
        r1.translate(r35 - org.telegram.messenger.AndroidUtilities.dpf2(4.0f), (org.telegram.messenger.AndroidUtilities.dpf2(2.0f) * r8.n4) + ((org.telegram.messenger.AndroidUtilities.dpf2(12.0f) * r10) + ((r12.top - org.telegram.messenger.AndroidUtilities.dp(6.0f)) - org.telegram.messenger.AndroidUtilities.lerp(org.telegram.messenger.AndroidUtilities.dpf2(2.0f), (1.0f - r8.o4) * org.telegram.messenger.AndroidUtilities.dpf2(1.5f), r13))));
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x05da, code lost:
    
        if (r11 <= 0.0f) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x05dc, code lost:
    
        r1.rotate(r11, org.telegram.messenger.AndroidUtilities.dp(8.0f), org.telegram.messenger.AndroidUtilities.dp(8.0f));
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x05e9, code lost:
    
        r1.drawLine(org.telegram.messenger.AndroidUtilities.dpf2(8.0f), org.telegram.messenger.AndroidUtilities.dpf2(4.0f), org.telegram.messenger.AndroidUtilities.dpf2(8.0f), org.telegram.messenger.AndroidUtilities.dpf2(6.0f) + (org.telegram.messenger.AndroidUtilities.dpf2(4.0f) * r36), r6);
        r46.drawArc(r2, 0.0f, -180.0f, false, r6);
        r1 = r46;
        r1.drawLine(0.0f, org.telegram.messenger.AndroidUtilities.dpf2(4.0f), 0.0f, com.google.android.gms.internal.vision.e2.w(org.telegram.messenger.AndroidUtilities.dpf2(4.0f), r8.n4, r3, (((org.telegram.messenger.AndroidUtilities.dpf2(4.0f) * r8.o4) * r13) * (!r8.s4 ? 1 : 0)) + org.telegram.messenger.AndroidUtilities.dpf2(4.0f)), r6);
        r1.restore();
        r18 = 0.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0644, code lost:
    
        if (r37 <= r18) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0648, code lost:
    
        if (r8.c1 == false) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x064a, code lost:
    
        r2 = r45.F;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0653, code lost:
    
        if (r10 <= r18) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0657, code lost:
    
        if (r45.S != null) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0659, code lost:
    
        r1.drawRoundRect(r12, org.telegram.messenger.AndroidUtilities.dpf2(3.0f), org.telegram.messenger.AndroidUtilities.dpf2(3.0f), r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0664, code lost:
    
        r3 = r45.L;
        r3.rewind();
        r4 = org.telegram.messenger.AndroidUtilities.rectTmp;
        r4.set(r12);
        r4.right = r12.centerX() - (org.telegram.messenger.AndroidUtilities.dp(1.66f) * r10);
        r5 = org.telegram.messenger.AndroidUtilities.lerp(org.telegram.messenger.AndroidUtilities.dp(3.0f), org.telegram.messenger.AndroidUtilities.dp(1.5f), r10);
        r11 = r45.M;
        r11[7] = r5;
        r11[6] = r5;
        r11[1] = r5;
        r11[0] = r5;
        r5 = org.telegram.messenger.AndroidUtilities.dp(1.5f) * r10;
        r11[5] = r5;
        r11[4] = r5;
        r11[3] = r5;
        r11[2] = r5;
        r5 = android.graphics.Path.Direction.CW;
        r3.addRoundRect(r4, r11, r5);
        r4.set(r12);
        r4.left = (org.telegram.messenger.AndroidUtilities.dp(1.66f) * r10) + r12.centerX();
        r11 = org.telegram.messenger.AndroidUtilities.lerp(org.telegram.messenger.AndroidUtilities.dp(3.0f), org.telegram.messenger.AndroidUtilities.dp(1.5f), r10);
        r13 = r45.N;
        r13[5] = r11;
        r13[4] = r11;
        r13[3] = r11;
        r13[2] = r11;
        r11 = org.telegram.messenger.AndroidUtilities.dp(1.5f) * r10;
        r13[7] = r11;
        r13[6] = r11;
        r13[1] = r11;
        r27 = false;
        r13[0] = r11;
        r3.addRoundRect(r4, r13, r5);
        r1.drawPath(r3, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x070c, code lost:
    
        r9.setAlpha(r6);
        r6.setAlpha(r6);
        r1.restoreToCount(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0715, code lost:
    
        if (r2 == null) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0717, code lost:
    
        r3 = org.telegram.messenger.AndroidUtilities.rectTmp2;
        r3.set((int) (r12.centerX() - ((r2.getIntrinsicWidth() / 2) * 0.9285f)), (int) (r12.centerY() - ((r2.getIntrinsicHeight() / 2) * 0.9285f)), (int) (((r2.getIntrinsicWidth() / 2) * 0.9285f) + r12.centerX()), (int) (((r2.getIntrinsicHeight() / 2) * 0.9285f) + r12.centerY()));
        r2.setBounds(r3);
        r2.setAlpha((int) (r37 * 255.0f));
        r2.draw(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0765, code lost:
    
        if (r10 == 1.0f) goto L146;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDraw(Canvas canvas) {
        float f7;
        float f10;
        float f11;
        float dp;
        float dp2;
        float dpf2;
        float f12;
        float f13;
        float f14;
        float f15;
        ChatActivityEnterView chatActivityEnterView = this.V;
        float f16 = chatActivityEnterView.h4;
        float f17 = f16 <= 0.5f ? f16 / 0.5f : f16 <= 0.75f ? 1.0f - (((f16 - 0.5f) / 0.25f) * 0.1f) : (((f16 - 0.75f) / 0.25f) * 0.1f) + 0.9f;
        long currentTimeMillis = System.currentTimeMillis() - this.K;
        this.K = System.currentTimeMillis();
        float f18 = chatActivityEnterView.l4;
        if (f18 != 10000.0f) {
            f7 = Math.max(0, (int) (chatActivityEnterView.k4 - f18));
            if (f7 > AndroidUtilities.dp(57.0f)) {
                f7 = AndroidUtilities.dp(57.0f);
            }
        } else {
            f7 = 0.0f;
        }
        int measuredWidth = getMeasuredWidth() - AndroidUtilities.dp2(26.0f);
        float dp3 = 1.0f - (f7 / AndroidUtilities.dp(57.0f));
        float measuredHeight = getMeasuredHeight() - AndroidUtilities.dp(194.0f);
        if (chatActivityEnterView.s4) {
            dp = AndroidUtilities.dp(36.0f);
            f10 = 0.25f;
            dp2 = (AndroidUtilities.dpf2(14.0f) * dp3) + ((((1.0f - f17) * AndroidUtilities.dpf2(30.0f)) + (AndroidUtilities.dp(60.0f) + measuredHeight)) - f7);
            dpf2 = AndroidUtilities.dpf2(2.0f) + (((dp / 2.0f) + dp2) - AndroidUtilities.dpf2(8.0f));
            AndroidUtilities.dpf2(16.0f);
            AndroidUtilities.dpf2(2.0f);
            float f19 = dp3 > 0.4f ? 1.0f : dp3 / 0.4f;
            f11 = 26.0f;
            float f20 = chatActivityEnterView.n4;
            f12 = com.google.android.gms.internal.vision.e2.b(1.0f, f19, f20 * 15.0f, (1.0f - f20) * (1.0f - dp3) * 9.0f);
            f13 = dp3;
        } else {
            f10 = 0.25f;
            f11 = 26.0f;
            dp = AndroidUtilities.dp(36.0f) + ((int) (AndroidUtilities.dp(14.0f) * dp3));
            dp2 = (((AndroidUtilities.dp(60.0f) + measuredHeight) + ((int) ((1.0f - f17) * AndroidUtilities.dp(30.0f)))) - ((int) f7)) + (chatActivityEnterView.o4 * dp3 * (-AndroidUtilities.dp(8.0f)));
            dpf2 = AndroidUtilities.dpf2(2.0f) + (((dp / 2.0f) + dp2) - AndroidUtilities.dpf2(8.0f)) + (AndroidUtilities.dpf2(2.0f) * dp3);
            AndroidUtilities.dpf2(16.0f);
            AndroidUtilities.dpf2(2.0f);
            AndroidUtilities.dpf2(2.0f);
            chatActivityEnterView.n4 = 0.0f;
            f12 = (1.0f - dp3) * 9.0f;
            f13 = 0.0f;
        }
        float f21 = dp2;
        boolean z10 = chatActivityEnterView.e4;
        RectF rectF = this.I;
        if (z10) {
            f14 = 1.0f;
            f15 = dp3;
        } else {
            f14 = 1.0f;
            f15 = dp3;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int dp = AndroidUtilities.dp(250.0f);
        if (this.H != size) {
            this.H = size;
            StaticLayout staticLayout = new StaticLayout(this.e, this.n, AndroidUtilities.dp(220.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
            this.f = staticLayout;
            int lineCount = staticLayout.getLineCount();
            this.h = 0.0f;
            for (int i12 = 0; i12 < lineCount; i12++) {
                float lineWidth = this.f.getLineWidth(i12);
                if (lineWidth > this.h) {
                    this.h = lineWidth;
                }
            }
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(dp, TLObject.FLAG_30));
    }

    @Override // android.view.View
    public final boolean onSetAlpha(int i10) {
        return super.onSetAlpha(i10);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ChatActivityEnterView chatActivityEnterView = this.V;
        RectF rectF = chatActivityEnterView.S3;
        int x10 = (int) motionEvent.getX();
        int y3 = (int) motionEvent.getY();
        int action = motionEvent.getAction();
        RectF rectF2 = this.J;
        if (action == 0) {
            if (chatActivityEnterView.s4) {
                this.U = rectF.contains(x10, y3);
            }
            if (chatActivityEnterView.P && chatActivityEnterView.N1 != null && chatActivityEnterView.n4 > 0.1f) {
                this.T = rectF2.contains(x10, y3);
            }
        } else if (motionEvent.getAction() == 1) {
            if (this.U && rectF.contains(x10, y3)) {
                if (chatActivityEnterView.c1) {
                    ChatActivityEnterView.SlideTextView slideTextView = chatActivityEnterView.k1;
                    if (slideTextView != null) {
                        slideTextView.setEnabled(false);
                    }
                    chatActivityEnterView.Z2.t1();
                } else {
                    rg rgVar = new rg(this, 0);
                    ci.d4 d4Var = this.a;
                    if (d4Var != null && d4Var.V) {
                        a();
                    }
                    ll0 ll0Var = chatActivityEnterView.h1;
                    if (ll0Var != null) {
                        ll0Var.setPlaying(false);
                    }
                    if (!MediaController.getInstance().isRecordingPaused() || (chatActivityEnterView.h1.getAudioLeft() <= 0.01f && chatActivityEnterView.h1.getAudioRight() >= 0.99f)) {
                        rgVar.run();
                    } else {
                        ea eaVar = new ea(7, this, rgVar);
                        if (MessagesController.getGlobalMainSettings().getBoolean("trimvoicehint", true)) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, chatActivityEnterView.W3);
                            alertDialog$Builder.a.R = LocaleController.getString(R.string.RecordingTrimTitle);
                            alertDialog$Builder.a.T = LocaleController.getString(R.string.RecordingTrimText);
                            alertDialog$Builder.k(LocaleController.getString(R.string.OK), new s(eaVar, 19));
                            hg.c.p(R.string.Cancel, alertDialog$Builder, null);
                        } else {
                            eaVar.run();
                        }
                    }
                }
                this.T = false;
                this.U = false;
                return true;
            }
            if (this.T && rectF2.contains(x10, y3)) {
                boolean z10 = !chatActivityEnterView.O;
                chatActivityEnterView.O = z10;
                this.y.d(1, z10, true);
                MediaDataController mediaDataController = MediaDataController.getInstance(chatActivityEnterView.Q);
                long j3 = chatActivityEnterView.Q2;
                org.telegram.ui.zn znVar = chatActivityEnterView.P2;
                mediaDataController.toggleDraftVoiceOnce(j3, (znVar == null || !znVar.h4) ? 0L : znVar.d(), chatActivityEnterView.O);
                if (chatActivityEnterView.O) {
                    b();
                } else {
                    a();
                }
                invalidate();
                this.T = false;
                this.U = false;
                return true;
            }
            this.T = false;
            this.U = false;
        } else if (motionEvent.getAction() == 3) {
            this.T = false;
            this.U = false;
        }
        return this.U || this.T;
    }

    @Override // android.view.View
    public void setAlpha(float f7) {
        super.setAlpha(f7);
    }

    public void setBlurredBackgroundFactory(ah.c cVar) {
        this.Q = true;
        if (this.P == null) {
            this.P = new dh.b(org.telegram.ui.ActionBar.i6.ae, this.V.W3);
        }
        ch.d c10 = cVar.c(this, this.P, false);
        this.R = c10;
        c10.q(AndroidUtilities.dp(18.0f));
        this.R.p(AndroidUtilities.dp(3.0f));
        ch.d c11 = cVar.c(this, this.P, false);
        this.S = c11;
        c11.q(AndroidUtilities.dp(18.0f));
        this.S.p(AndroidUtilities.dp(3.0f));
        c();
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.y || super.verifyDrawable(drawable);
    }
}
