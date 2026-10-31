package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.jj;
import org.telegram.messenger.tz;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.jb0;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.xn;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public class z9 extends LinearLayout {
    public final f D;
    public Drawable E;
    public boolean F;
    public final org.telegram.ui.Components.t5 G;
    public org.telegram.ui.Components.e9 a;
    public org.telegram.ui.Components.e9 b;
    public Drawable c;
    public Drawable d;
    public ColorDrawable e;
    public boolean f;
    public boolean h;
    public final q1[] n;
    public final Drawable r;
    public final org.telegram.ui.ActionBar.z4 s;
    public final int w;
    public org.telegram.ui.ActionBar.k2 x;
    public int y;

    public z9(Context context, org.telegram.ui.ActionBar.z4 z4Var, int i10) {
        this(context, z4Var, i10, 0L, null);
    }

    private Drawable getCompactBackground() {
        int x02 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.ua, false);
        ColorDrawable colorDrawable = this.e;
        if (colorDrawable == null || colorDrawable.getColor() != x02) {
            this.e = new ColorDrawable(x02);
        }
        return this.e;
    }

    public final boolean a() {
        int i10 = this.w;
        return i10 == 3 || i10 == 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.w == 2 || a()) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return false;
    }

    public q1[] getCells() {
        return this.n;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        int i10 = 0;
        while (true) {
            q1[] q1VarArr = this.n;
            if (i10 >= q1VarArr.length) {
                return;
            }
            q1VarArr[i10].invalidate();
            i10++;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable drawable = this.E;
        if (drawable instanceof xn) {
            ((xn) drawable).f(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.ui.Components.e9 e9Var = this.a;
        if (e9Var != null) {
            e9Var.dispose();
            this.a = null;
        }
        org.telegram.ui.Components.e9 e9Var2 = this.b;
        if (e9Var2 != null) {
            e9Var2.dispose();
            this.b = null;
        }
        Drawable drawable = this.E;
        if (drawable instanceof xn) {
            ((xn) drawable).g(this);
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onDraw(Canvas canvas) {
        Drawable drawable = this.E;
        if (drawable == null) {
            drawable = org.telegram.ui.ActionBar.t6.t0();
        }
        if (org.telegram.ui.ActionBar.t6.d != null) {
            invalidate();
        }
        boolean z10 = this.E == null && tz.H0;
        if (z10) {
            drawable = getCompactBackground();
        }
        if (this.f != z10) {
            this.f = z10;
            this.h = this.c != null;
        }
        Drawable drawable2 = this.c;
        org.telegram.ui.Components.t5 t5Var = this.G;
        if (drawable != drawable2 && drawable != null) {
            if (org.telegram.ui.ActionBar.t6.h1() || this.F || this.h) {
                this.d = this.c;
                this.b = this.a;
            } else {
                org.telegram.ui.Components.e9 e9Var = this.a;
                if (e9Var != null) {
                    e9Var.dispose();
                    this.a = null;
                }
            }
            this.c = drawable;
            t5Var.e(true, 0.0f);
        }
        boolean z11 = this.F;
        org.telegram.ui.ActionBar.z4 z4Var = this.s;
        float e = (z11 || this.h) ? t5Var.e(false, 1.0f) : z4Var.getThemeAnimationValue();
        int i10 = 0;
        while (i10 < 2) {
            Drawable drawable3 = i10 == 0 ? this.d : this.c;
            if (drawable3 != null) {
                int i11 = (i10 != 1 || this.d == null || (z4Var == null && !this.F)) ? zs.e4 : (int) (255.0f * e);
                if (i11 > 0) {
                    drawable3.setAlpha(i11);
                    if ((drawable3 instanceof ColorDrawable) || (drawable3 instanceof GradientDrawable) || (drawable3 instanceof jb0)) {
                        drawable3.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
                        if (drawable3 instanceof org.telegram.ui.Components.f9) {
                            this.a = ((org.telegram.ui.Components.f9) drawable3).c(canvas, this);
                        } else {
                            drawable3.draw(canvas);
                        }
                    } else if (drawable3 instanceof BitmapDrawable) {
                        BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable3;
                        bitmapDrawable.setFilterBitmap(true);
                        if (bitmapDrawable.getTileModeX() == Shader.TileMode.REPEAT) {
                            canvas.save();
                            float f7 = 2.0f / org.telegram.messenger.i0.p;
                            canvas.scale(f7, f7);
                            drawable3.setBounds(0, 0, (int) Math.ceil(getMeasuredWidth() / f7), (int) Math.ceil(getMeasuredHeight() / f7));
                        } else {
                            int measuredHeight = getMeasuredHeight();
                            float max = Math.max(getMeasuredWidth() / drawable3.getIntrinsicWidth(), measuredHeight / drawable3.getIntrinsicHeight());
                            int ceil = (int) Math.ceil(drawable3.getIntrinsicWidth() * max);
                            int ceil2 = (int) Math.ceil(drawable3.getIntrinsicHeight() * max);
                            int measuredWidth = (getMeasuredWidth() - ceil) / 2;
                            int i12 = (measuredHeight - ceil2) / 2;
                            canvas.save();
                            canvas.clipRect(0, 0, ceil, getMeasuredHeight());
                            drawable3.setBounds(measuredWidth, i12, ceil + measuredWidth, ceil2 + i12);
                        }
                        drawable3.draw(canvas);
                        canvas.restore();
                    } else {
                        vh.n5.j(canvas, drawable3, getWidth(), getHeight());
                    }
                    if (i10 == 0 && this.d != null && e >= 1.0f) {
                        org.telegram.ui.Components.e9 e9Var2 = this.b;
                        if (e9Var2 != null) {
                            e9Var2.dispose();
                            this.b = null;
                        }
                        this.d = null;
                        this.h = false;
                        invalidate();
                    }
                }
            }
            i10++;
        }
        if ((getParent() instanceof tk0) && ((tk0) getParent()).b1()) {
            return;
        }
        int measuredWidth2 = getMeasuredWidth();
        int measuredHeight2 = getMeasuredHeight();
        Drawable drawable4 = this.r;
        drawable4.setBounds(0, 0, measuredWidth2, measuredHeight2);
        drawable4.draw(canvas);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.w == 2 || a()) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.w == 2 || a()) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    public void setOverrideBackground(Drawable drawable) {
        this.E = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        if ((this.E instanceof xn) && isAttachedToWindow()) {
            ((xn) this.E).f(this);
        }
        invalidate();
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.E || drawable == this.d || super.verifyDrawable(drawable);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:38:0x042b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0487 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public z9(Context context, org.telegram.ui.ActionBar.z4 z4Var, int i10, long j10, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        int i11;
        String str;
        jj jjVar;
        jj jjVar2;
        int i12;
        q1[] q1VarArr;
        Context context2 = context;
        int i13 = i10;
        this.n = new q1[2];
        this.y = -1;
        this.D = new f(this, 9);
        this.G = new org.telegram.ui.Components.t5(this, 0L, 350L, gr.h);
        this.w = i13;
        int i14 = d20.s0;
        this.s = z4Var;
        setWillNotDraw(false);
        setOrientation(1);
        setPadding(0, org.telegram.messenger.i0.L(11.0f), 0, org.telegram.messenger.i0.L(11.0f));
        org.telegram.ui.ActionBar.p6 p6Var2 = p6Var;
        this.r = org.telegram.ui.ActionBar.t6.X0(context2, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.b7, p6Var2));
        int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        if (i13 == 3) {
            boolean z10 = j10 < 0;
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.message = cd.L0(z10 ? 2131752433 : 2131743777, null);
            TLRPC.TL_messageReplyHeader tL_messageReplyHeader = new TLRPC.TL_messageReplyHeader();
            tL_message.reply_to = tL_messageReplyHeader;
            tL_messageReplyHeader.flags |= 1;
            if (j10 == 0) {
                tL_messageReplyHeader.reply_to_peer_id = new TLRPC.TL_peerUser();
                tL_message.reply_to.reply_to_peer_id.user_id = d20.i(d20.s0).e();
            } else {
                tL_messageReplyHeader.reply_to_peer_id = new TLRPC.TL_peerChannel();
                tL_message.reply_to.reply_to_peer_id.channel_id = -j10;
            }
            TLRPC.Message message = new TLRPC.Message();
            tL_message.replyMessage = message;
            message.media = new TLRPC.TL_messageMediaEmpty();
            if (j10 == 0) {
                tL_message.replyMessage.from_id = new TLRPC.TL_peerUser();
                tL_message.replyMessage.from_id.user_id = d20.i(d20.s0).e();
                tL_message.replyMessage.peer_id = new TLRPC.TL_peerUser();
                tL_message.replyMessage.peer_id.user_id = d20.i(d20.s0).e();
            } else {
                tL_message.replyMessage.from_id = new TLRPC.TL_peerChannel();
                TLRPC.Message message2 = tL_message.replyMessage;
                long j11 = -j10;
                message2.from_id.channel_id = j11;
                message2.peer_id = new TLRPC.TL_peerChannel();
                tL_message.replyMessage.peer_id.channel_id = j11;
            }
            tL_message.replyMessage.message = cd.L0(z10 ? 2131752430 : 2131743774, null);
            TLRPC.TL_messageMediaWebPage tL_messageMediaWebPage = new TLRPC.TL_messageMediaWebPage();
            tL_message.media = tL_messageMediaWebPage;
            tL_messageMediaWebPage.webpage = new TLRPC.TL_webPage();
            TLRPC.WebPage webPage = tL_message.media.webpage;
            webPage.embed_url = "https://telegram.org/";
            webPage.flags |= 2;
            webPage.site_name = cd.L0(R.string.AppName, null);
            TLRPC.WebPage webPage2 = tL_message.media.webpage;
            webPage2.flags |= 4;
            webPage2.title = cd.L0(z10 ? 2131752431 : 2131743775, null);
            TLRPC.WebPage webPage3 = tL_message.media.webpage;
            webPage3.flags |= 8;
            webPage3.description = cd.L0(z10 ? 2131752432 : 2131743776, null);
            tL_message.date = currentTimeMillis - 3540;
            tL_message.dialog_id = 1L;
            tL_message.flags = zs.i4;
            if (j10 == 0) {
                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                tL_message.from_id = tL_peerUser;
                tL_peerUser.user_id = d20.i(d20.s0).e();
            } else {
                TLRPC.TL_peerChannel tL_peerChannel = new TLRPC.TL_peerChannel();
                tL_message.from_id = tL_peerChannel;
                tL_peerChannel.channel_id = -j10;
            }
            tL_message.id = 1;
            tL_message.out = false;
            if (j10 == 0) {
                TLRPC.TL_peerUser tL_peerUser2 = new TLRPC.TL_peerUser();
                tL_message.peer_id = tL_peerUser2;
                tL_peerUser2.user_id = 0L;
            } else {
                TLRPC.TL_peerChannel tL_peerChannel2 = new TLRPC.TL_peerChannel();
                tL_message.peer_id = tL_peerChannel2;
                tL_peerChannel2.channel_id = -j10;
            }
            jj jjVar3 = new jj(d20.s0, tL_message, true, false);
            jjVar3.u1 = true;
            jjVar3.j2 = true;
            jjVar3.Q1 = false;
            jjVar3.T = 1L;
            jjVar2 = jjVar3;
        } else if (i13 == 2) {
            TLRPC.TL_message tL_message2 = new TLRPC.TL_message();
            tL_message2.message = cd.L0(2131751354, null);
            tL_message2.date = currentTimeMillis - 3540;
            tL_message2.dialog_id = 1L;
            tL_message2.flags = zs.i4;
            TLRPC.TL_peerUser tL_peerUser3 = new TLRPC.TL_peerUser();
            tL_message2.from_id = tL_peerUser3;
            tL_peerUser3.user_id = d20.i(d20.s0).e();
            tL_message2.id = 1;
            tL_message2.media = new TLRPC.TL_messageMediaEmpty();
            tL_message2.out = false;
            TLRPC.TL_peerUser tL_peerUser4 = new TLRPC.TL_peerUser();
            tL_message2.peer_id = tL_peerUser4;
            tL_peerUser4.user_id = 0L;
            jjVar2 = new jj(d20.s0, tL_message2, true, false);
            jjVar2.Q1 = false;
            jjVar2.T = 1L;
            jjVar2.G = cd.L0(2131751352, null);
            jjVar2.k2 = context2.getDrawable(R.drawable.dino_pic);
            jjVar2.c1 = 5;
            jjVar2.d1 = 0L;
        } else {
            TLRPC.TL_message tL_message3 = new TLRPC.TL_message();
            if (i13 == 0) {
                tL_message3.message = cd.L0(2131750606, null);
            } else {
                tL_message3.message = cd.L0(2131748271, null);
            }
            int indexOf = tL_message3.message.indexOf("👋");
            if (indexOf >= 0) {
                TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = new TLRPC.TL_messageEntityCustomEmoji();
                tL_messageEntityCustomEmoji.offset = indexOf;
                tL_messageEntityCustomEmoji.length = 2;
                tL_messageEntityCustomEmoji.document_id = 5386654653003864312L;
                tL_message3.entities.add(tL_messageEntityCustomEmoji);
            }
            int i15 = currentTimeMillis - 3540;
            tL_message3.date = i15;
            tL_message3.dialog_id = 1L;
            tL_message3.flags = zs.i4;
            TLRPC.TL_peerUser tL_peerUser5 = new TLRPC.TL_peerUser();
            tL_message3.from_id = tL_peerUser5;
            tL_peerUser5.user_id = d20.i(d20.s0).e();
            tL_message3.id = 1;
            tL_message3.media = new TLRPC.TL_messageMediaEmpty();
            tL_message3.out = true;
            TLRPC.TL_peerUser tL_peerUser6 = new TLRPC.TL_peerUser();
            tL_message3.peer_id = tL_peerUser6;
            tL_peerUser6.user_id = 0L;
            jj jjVar4 = new jj(d20.s0, tL_message3, true, false);
            TLRPC.TL_message tL_message4 = new TLRPC.TL_message();
            if (i13 == 0) {
                tL_message4.message = cd.L0(2131750608, null);
            } else {
                String L0 = cd.L0(2131748273, null);
                StringBuilder sb2 = new StringBuilder(L0);
                int indexOf2 = L0.indexOf(42);
                int lastIndexOf = L0.lastIndexOf(42);
                if (indexOf2 != -1 && lastIndexOf != -1) {
                    sb2.replace(lastIndexOf, lastIndexOf + 1, "");
                    sb2.replace(indexOf2, indexOf2 + 1, "");
                    TLRPC.TL_messageEntityTextUrl tL_messageEntityTextUrl = new TLRPC.TL_messageEntityTextUrl();
                    tL_messageEntityTextUrl.offset = indexOf2;
                    tL_messageEntityTextUrl.length = (lastIndexOf - indexOf2) - 1;
                    tL_messageEntityTextUrl.url = "https://telegram.org";
                    tL_message4.entities.add(tL_messageEntityTextUrl);
                }
                tL_message4.message = sb2.toString();
            }
            int indexOf3 = tL_message4.message.indexOf("😎");
            if (indexOf3 >= 0) {
                TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji2 = new TLRPC.TL_messageEntityCustomEmoji();
                tL_messageEntityCustomEmoji2.offset = indexOf3;
                tL_messageEntityCustomEmoji2.length = 2;
                tL_messageEntityCustomEmoji2.document_id = 5373141891321699086L;
                tL_message4.entities.add(tL_messageEntityCustomEmoji2);
            }
            tL_message4.date = currentTimeMillis - 2640;
            tL_message4.dialog_id = 1L;
            tL_message4.flags = zs.i4;
            TLRPC.TL_peerUser tL_peerUser7 = new TLRPC.TL_peerUser();
            tL_message4.from_id = tL_peerUser7;
            tL_peerUser7.user_id = d20.i(d20.s0).e();
            tL_message4.id = 1;
            tL_message4.media = new TLRPC.TL_messageMediaEmpty();
            tL_message4.out = true;
            TLRPC.TL_peerUser tL_peerUser8 = new TLRPC.TL_peerUser();
            tL_message4.peer_id = tL_peerUser8;
            tL_peerUser8.user_id = 0L;
            jj jjVar5 = new jj(d20.s0, tL_message4, true, false);
            jjVar5.Q1 = false;
            jjVar5.c1 = 5;
            jjVar5.d1 = 0L;
            jjVar5.T = 1L;
            TLRPC.TL_message tL_message5 = new TLRPC.TL_message();
            if (i13 == 0) {
                tL_message5.message = cd.L0(2131750609, null);
            } else {
                tL_message5.message = cd.L0(2131748274, null);
            }
            tL_message5.date = i15;
            tL_message5.dialog_id = 1L;
            tL_message5.flags = zs.o4;
            tL_message5.from_id = new TLRPC.TL_peerUser();
            tL_message5.id = 1;
            TLRPC.TL_messageReplyHeader tL_messageReplyHeader2 = new TLRPC.TL_messageReplyHeader();
            tL_message5.reply_to = tL_messageReplyHeader2;
            tL_messageReplyHeader2.flags |= 16;
            tL_messageReplyHeader2.reply_to_msg_id = 5;
            tL_message5.media = new TLRPC.TL_messageMediaEmpty();
            i11 = 0;
            tL_message5.out = false;
            TLRPC.TL_peerUser tL_peerUser9 = new TLRPC.TL_peerUser();
            tL_message5.peer_id = tL_peerUser9;
            tL_peerUser9.user_id = d20.i(d20.s0).e();
            jj jjVar6 = new jj(d20.s0, tL_message5, true, false);
            if (i13 == 0) {
                str = null;
            } else {
                str = null;
                jjVar6.B0 = cd.L0(2131748272, null);
            }
            jjVar6.T = 1L;
            jjVar6.Q1 = false;
            jjVar6.C = jjVar4;
            if (i13 == 4) {
                TLRPC.TL_user tL_user = new TLRPC.TL_user();
                String L02 = cd.L0(2131749404, str);
                tL_user.first_name = L02;
                jjVar6.G = L02;
                jjVar6.k2 = new org.telegram.ui.Components.r8(0, tL_user);
            }
            jjVar = jjVar6;
            jjVar2 = jjVar5;
            i12 = i11;
            while (true) {
                q1VarArr = this.n;
                if (i12 < q1VarArr.length) {
                    return;
                }
                int i16 = i13;
                q1VarArr[i12] = new y9(this, context2, i14, p6Var2, context, i16);
                this.n[i12].setDelegate(new k2.m0(this));
                q1 q1Var = this.n[i12];
                q1Var.d6 = (i16 == 2 || i16 == 4) ? 1 : i11;
                q1Var.setFullyDraw(true);
                jj jjVar7 = i12 == 0 ? jjVar : jjVar2;
                if (jjVar7 != null) {
                    this.n[i12].s3(jjVar7, null, false, false, false, false);
                    addView(this.n[i12], w7.b6.o(-1, -2));
                }
                i12++;
                context2 = context;
                p6Var2 = p6Var;
                i13 = i16;
            }
        }
        jjVar = null;
        i11 = 0;
        i12 = i11;
        while (true) {
            q1VarArr = this.n;
            if (i12 < q1VarArr.length) {
            }
            i12++;
            context2 = context;
            p6Var2 = p6Var;
            i13 = i16;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchSetPressed(boolean z10) {
    }
}
