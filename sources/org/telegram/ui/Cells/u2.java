package org.telegram.ui.Cells;

import android.graphics.Canvas;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.hc;
import org.telegram.messenger.id;
import org.telegram.messenger.qp;
import org.telegram.messenger.t10;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class u2 extends z {
    public StaticLayout D;
    public boolean E;
    public int F;
    public boolean G;
    public int H;
    public TLRPC.RecentMeUrl f;
    public ImageReceiver h;
    public org.telegram.ui.Components.w8 n;
    public int r;
    public StaticLayout s;
    public int w;
    public int x;
    public int y;

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.h.P();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.h.R();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        if (this.G) {
            canvas2 = canvas;
            canvas2.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), org.telegram.ui.ActionBar.k6.u0);
        } else {
            canvas2 = canvas;
        }
        if (this.s != null) {
            canvas2.save();
            canvas2.translate(this.r, org.telegram.messenger.g0.L(13.0f));
            this.s.draw(canvas2);
            canvas2.restore();
        }
        if (this.D != null) {
            canvas2.save();
            canvas2.translate(this.y, this.x);
            try {
                this.D.draw(canvas2);
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
            canvas2.restore();
        }
        if (this.E) {
            z.s(this.w, org.telegram.messenger.g0.L(16.5f), org.telegram.ui.ActionBar.k6.f1);
            z.s(this.w, org.telegram.messenger.g0.L(16.5f), org.telegram.ui.ActionBar.k6.i1);
            org.telegram.ui.ActionBar.k6.f1.draw(canvas2);
            org.telegram.ui.ActionBar.k6.i1.draw(canvas2);
        }
        this.h.h(canvas2, null);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(29:3|(3:5|(1:7)(1:120)|8)(2:121|(4:123|(1:125)(1:135)|(3:127|(2:129|(1:131)(1:132))|133)|134)(28:136|(3:138|(1:140)(1:142)|141)(2:143|(6:145|(1:147)(1:156)|148|(1:150)(1:155)|151|(1:153)(1:154))(2:157|(3:159|(1:161)(1:163)|162)(1:164)))|10|(1:12)|13|(1:15)(1:119)|16|17|(2:19|(1:21))|22|23|24|25|26|27|28|29|30|31|(3:33|(1:35)(1:104)|36)(3:105|(1:107)(1:109)|108)|37|38|39|40|41|42|43|(4:45|(4:49|(1:51)|52|(2:54|(1:56)))|57|(1:69)(2:63|(2:65|66)(1:68)))(4:72|(4:76|(2:78|(1:80))|81|(1:83))|84|(1:95)(2:90|(2:92|93)(1:94)))))|9|10|(0)|13|(0)(0)|16|17|(0)|22|23|24|25|26|27|28|29|30|31|(0)(0)|37|38|39|40|41|42|43|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x02ee, code lost:
    
        org.telegram.messenger.a8.g(r0, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x02eb, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x02ec, code lost:
    
        r2 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x025e, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0266, code lost:
    
        org.telegram.messenger.a8.g(r0, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0260, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0261, code lost:
    
        r7 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0263, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0264, code lost:
    
        r7 = r13;
        r6 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x02e9, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x036a  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        String str;
        String str2;
        int measuredWidth;
        int L;
        int measuredWidth2;
        if (!z9) {
            return;
        }
        int i13 = this.H;
        ImageReceiver imageReceiver = this.h;
        org.telegram.ui.Components.w8 w8Var = this.n;
        TextPaint textPaint = org.telegram.ui.ActionBar.k6.B0[0];
        TextPaint textPaint2 = org.telegram.ui.ActionBar.k6.F0[0];
        this.E = false;
        TLRPC.RecentMeUrl recentMeUrl = this.f;
        if (recentMeUrl instanceof TLRPC.TL_recentMeUrlChat) {
            TLRPC.Chat M0 = qp.s1(i13).M0(Long.valueOf(this.f.chat_id));
            this.E = M0.verified;
            if (id.a0) {
                getMeasuredWidth();
                org.telegram.messenger.g0.L(org.telegram.messenger.g0.C);
                this.r = org.telegram.messenger.g0.L(14.0f);
            } else {
                org.telegram.messenger.g0.L(org.telegram.messenger.g0.C);
                this.r = org.telegram.messenger.g0.L(r6 + 4);
            }
            str2 = M0.title;
            w8Var.q(M0);
            imageReceiver.i0(M0, w8Var, this.f);
        } else {
            if (!(recentMeUrl instanceof TLRPC.TL_recentMeUrlUser)) {
                if (recentMeUrl instanceof TLRPC.TL_recentMeUrlStickerSet) {
                    if (id.a0) {
                        this.r = org.telegram.messenger.g0.L(14.0f);
                    } else {
                        this.r = org.telegram.messenger.g0.L(org.telegram.messenger.g0.C);
                    }
                    String str3 = this.f.set.set.title;
                    w8Var.k(5L, str3, null, null);
                    str = null;
                    imageReceiver.q0(hc.b(this.f.set.cover), null, w8Var, null, this.f, 0);
                    str2 = str3;
                } else {
                    str = null;
                    if (recentMeUrl instanceof TLRPC.TL_recentMeUrlChatInvite) {
                        if (id.a0) {
                            this.r = org.telegram.messenger.g0.L(14.0f);
                        } else {
                            this.r = org.telegram.messenger.g0.L(org.telegram.messenger.g0.C);
                        }
                        TLRPC.ChatInvite chatInvite = this.f.chat_invite;
                        TLRPC.Chat chat = chatInvite.chat;
                        if (chat != null) {
                            w8Var.q(chat);
                            TLRPC.RecentMeUrl recentMeUrl2 = this.f;
                            TLRPC.Chat chat2 = recentMeUrl2.chat_invite.chat;
                            str2 = chat2.title;
                            this.E = chat2.verified;
                            imageReceiver.i0(chat2, w8Var, recentMeUrl2);
                        } else {
                            String str4 = chatInvite.title;
                            w8Var.k(5L, str4, null, null);
                            imageReceiver.q0(hc.i(org.telegram.messenger.w7.w(this.f.chat_invite.photo.sizes, 50, false, null, false), this.f.chat_invite.photo), "50_50", w8Var, null, this.f, 0);
                            str2 = str4;
                        }
                        if (id.a0) {
                            getMeasuredWidth();
                            org.telegram.messenger.g0.L(org.telegram.messenger.g0.C);
                            this.r = org.telegram.messenger.g0.L(14.0f);
                        } else {
                            org.telegram.messenger.g0.L(org.telegram.messenger.g0.C);
                            this.r = org.telegram.messenger.g0.L(r3 + 4);
                        }
                    } else if (recentMeUrl instanceof TLRPC.TL_recentMeUrlUnknown) {
                        if (id.a0) {
                            this.r = org.telegram.messenger.g0.L(14.0f);
                        } else {
                            this.r = org.telegram.messenger.g0.L(org.telegram.messenger.g0.C);
                        }
                        imageReceiver.q0(null, null, w8Var, null, this.f, 0);
                        str2 = "Url";
                    } else {
                        imageReceiver.q0(null, null, w8Var, null, recentMeUrl, 0);
                        str2 = "";
                    }
                }
                String str5 = qp.s1(i13).U2 + "/" + this.f.url;
                if (TextUtils.isEmpty(str2)) {
                    str2 = id.M0(2131749329, str);
                }
                if (id.a0) {
                    measuredWidth = getMeasuredWidth() - this.r;
                    L = org.telegram.messenger.g0.L(14.0f);
                } else {
                    measuredWidth = getMeasuredWidth() - this.r;
                    L = org.telegram.messenger.g0.L(org.telegram.messenger.g0.C);
                }
                int i14 = measuredWidth - L;
                if (this.E) {
                    int intrinsicWidth = org.telegram.ui.ActionBar.k6.f1.getIntrinsicWidth() + org.telegram.messenger.g0.L(6.0f);
                    i14 -= intrinsicWidth;
                    if (id.a0) {
                        this.r += intrinsicWidth;
                    }
                }
                int max = Math.max(org.telegram.messenger.g0.L(12.0f), i14);
                CharSequence ellipsize = TextUtils.ellipsize(str2.replace('\n', ' '), textPaint, max - org.telegram.messenger.g0.L(12.0f), TextUtils.TruncateAt.END);
                TextPaint textPaint3 = textPaint2;
                int i15 = max;
                this.s = new StaticLayout(ellipsize, textPaint, max, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                int measuredWidth3 = getMeasuredWidth();
                int i16 = org.telegram.messenger.g0.C;
                int L2 = measuredWidth3 - org.telegram.messenger.g0.L(i16 + 16);
                if (id.a0) {
                    this.y = org.telegram.messenger.g0.L(16.0f);
                    measuredWidth2 = getMeasuredWidth() - org.telegram.messenger.g0.L(org.telegram.messenger.g0.Q1() ? 65.0f : 61.0f);
                } else {
                    this.y = org.telegram.messenger.g0.L(i16);
                    measuredWidth2 = org.telegram.messenger.g0.L(org.telegram.messenger.g0.Q1() ? 13.0f : 9.0f);
                }
                imageReceiver.y0(measuredWidth2, this.F, org.telegram.messenger.g0.L(52.0f), org.telegram.messenger.g0.L(52.0f));
                int max2 = Math.max(org.telegram.messenger.g0.L(12.0f), L2);
                int i17 = max2;
                this.D = new StaticLayout(TextUtils.ellipsize(str5, textPaint3, max2 - org.telegram.messenger.g0.L(12.0f), TextUtils.TruncateAt.END), textPaint3, max2, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                if (id.a0) {
                    StaticLayout staticLayout = this.s;
                    if (staticLayout != null && staticLayout.getLineCount() > 0) {
                        float lineRight = this.s.getLineRight(0);
                        if (lineRight == i15) {
                            double ceil = Math.ceil(this.s.getLineWidth(0));
                            double d = i15;
                            if (ceil < d) {
                                this.r = (int) (this.r - (d - ceil));
                            }
                        }
                        if (this.E) {
                            this.w = (int) (this.r + lineRight + org.telegram.messenger.g0.L(6.0f));
                        }
                    }
                    StaticLayout staticLayout2 = this.D;
                    if (staticLayout2 == null || staticLayout2.getLineCount() <= 0 || this.D.getLineRight(0) != i17) {
                        return;
                    }
                    double ceil2 = Math.ceil(this.D.getLineWidth(0));
                    double d2 = i17;
                    if (ceil2 < d2) {
                        this.y = (int) (this.y - (d2 - ceil2));
                        return;
                    }
                    return;
                }
                StaticLayout staticLayout3 = this.s;
                if (staticLayout3 != null && staticLayout3.getLineCount() > 0) {
                    float lineLeft = this.s.getLineLeft(0);
                    double ceil3 = Math.ceil(this.s.getLineWidth(0));
                    if (this.E) {
                        this.w = (int) ((((i15 - ceil3) + this.r) - org.telegram.messenger.g0.L(6.0f)) - org.telegram.ui.ActionBar.k6.f1.getIntrinsicWidth());
                    }
                    if (lineLeft == 0.0f) {
                        double d10 = i15;
                        if (ceil3 < d10) {
                            this.r = (int) ((d10 - ceil3) + this.r);
                        }
                    }
                }
                StaticLayout staticLayout4 = this.D;
                if (staticLayout4 == null || staticLayout4.getLineCount() <= 0 || this.D.getLineLeft(0) != 0.0f) {
                    return;
                }
                double ceil4 = Math.ceil(this.D.getLineWidth(0));
                double d11 = i17;
                if (ceil4 < d11) {
                    this.y = (int) ((d11 - ceil4) + this.y);
                    return;
                }
                return;
            }
            TLRPC.User a22 = qp.s1(i13).a2(Long.valueOf(this.f.user_id));
            if (id.a0) {
                this.r = org.telegram.messenger.g0.L(14.0f);
            } else {
                this.r = org.telegram.messenger.g0.L(org.telegram.messenger.g0.C);
            }
            if (a22 != null) {
                if (a22.bot) {
                    org.telegram.messenger.g0.L(16.5f);
                    if (id.a0) {
                        getMeasuredWidth();
                        org.telegram.messenger.g0.L(org.telegram.messenger.g0.C);
                        this.r = org.telegram.messenger.g0.L(14.0f);
                    } else {
                        org.telegram.messenger.g0.L(org.telegram.messenger.g0.C);
                        this.r = org.telegram.messenger.g0.L(r6 + 4);
                    }
                }
                this.E = a22.verified;
            }
            str2 = t10.p(a22);
            w8Var.r(a22);
            imageReceiver.i0(a22, w8Var, this.f);
        }
        str = null;
        String str52 = qp.s1(i13).U2 + "/" + this.f.url;
        if (TextUtils.isEmpty(str2)) {
        }
        if (id.a0) {
        }
        int i142 = measuredWidth - L;
        if (this.E) {
        }
        int max3 = Math.max(org.telegram.messenger.g0.L(12.0f), i142);
        CharSequence ellipsize2 = TextUtils.ellipsize(str2.replace('\n', ' '), textPaint, max3 - org.telegram.messenger.g0.L(12.0f), TextUtils.TruncateAt.END);
        TextPaint textPaint32 = textPaint2;
        int i152 = max3;
        this.s = new StaticLayout(ellipsize2, textPaint, max3, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        int measuredWidth32 = getMeasuredWidth();
        int i162 = org.telegram.messenger.g0.C;
        int L22 = measuredWidth32 - org.telegram.messenger.g0.L(i162 + 16);
        if (id.a0) {
        }
        imageReceiver.y0(measuredWidth2, this.F, org.telegram.messenger.g0.L(52.0f), org.telegram.messenger.g0.L(52.0f));
        int max22 = Math.max(org.telegram.messenger.g0.L(12.0f), L22);
        int i172 = max22;
        this.D = new StaticLayout(TextUtils.ellipsize(str52, textPaint32, max22 - org.telegram.messenger.g0.L(12.0f), TextUtils.TruncateAt.END), textPaint32, max22, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        if (id.a0) {
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        setMeasuredDimension(View.MeasureSpec.getSize(i7), org.telegram.messenger.g0.L(72.0f));
    }

    public void setDialogSelected(boolean z9) {
        if (this.G != z9) {
            invalidate();
        }
        this.G = z9;
    }

    public void setRecentMeUrl(TLRPC.RecentMeUrl recentMeUrl) {
        this.f = recentMeUrl;
        requestLayout();
    }
}
