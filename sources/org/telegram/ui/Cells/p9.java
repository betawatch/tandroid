package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.StaticLayout;
import android.util.SparseArray;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public abstract class p9 extends ba {
    public final SparseArray p0 = new SparseArray();
    public boolean q0;
    public boolean r0;
    public boolean s0;
    public boolean t0;
    public boolean u0;
    public boolean v0;

    @Override // org.telegram.ui.Cells.ba
    public final boolean C() {
        w9 w9Var;
        RichMessageLayout richMessageLayout;
        CharSequence r10;
        String str;
        if (!this.u0 || (w9Var = this.W) == null || ((u1) w9Var).getMessageObject() == null || (richMessageLayout = ((u1) this.W).getMessageObject().richLayout) == null || richMessageLayout.textBlocks.isEmpty() || (r10 = r()) == null || r10.length() == 0) {
            return false;
        }
        try {
            str = richMessageLayout.getSelectionHtml(this.u, this.v);
        } catch (Exception e7) {
            FileLog.e(e7);
            str = null;
        }
        if (str == null || str.length() == 0) {
            return false;
        }
        AndroidUtilities.addToClipboard(r10, str);
        return true;
    }

    @Override // org.telegram.ui.Cells.ba
    public final void E(boolean z10) {
        w9 w9Var = this.W;
        if (w9Var == null || !((u1) w9Var).g3() || z10) {
            return;
        }
        u1 u1Var = (u1) this.W;
        int id2 = u1Var.getMessageObject().getId();
        SparseArray sparseArray = this.p0;
        Animator animator = (Animator) sparseArray.get(id2);
        if (animator != null) {
            animator.removeAllListeners();
            animator.cancel();
        }
        u1Var.setSelectedBackgroundProgress(0.01f);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.01f, 1.0f);
        int i10 = 1;
        ofFloat.addUpdateListener(new org.telegram.ui.ActionBar.q2(u1Var, id2, i10));
        ofFloat.addListener(new k1(i10, u1Var));
        ofFloat.setDuration(300L);
        ofFloat.start();
        sparseArray.put(id2, ofFloat);
    }

    @Override // org.telegram.ui.Cells.ba
    public final void L(w9 w9Var, w9 w9Var2) {
        u1 u1Var = (u1) w9Var;
        u1 u1Var2 = (u1) w9Var2;
        boolean z10 = u1Var2 == null || !(u1Var2.getMessageObject() == null || u1Var2.getMessageObject().getId() == u1Var.getMessageObject().getId());
        this.w = u1Var.getMessageObject().getId();
        try {
            int i10 = u1Var.getMessageObject().messageOwner.edit_date;
        } catch (Exception unused) {
        }
        this.U = 0.0f;
        this.q0 = this.r0;
        this.s0 = this.t0;
        this.u0 = this.v0;
        int i11 = this.w;
        SparseArray sparseArray = this.p0;
        Animator animator = (Animator) sparseArray.get(i11);
        if (animator != null) {
            animator.removeAllListeners();
            animator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new ai.cb(3, this, z10));
        ofFloat.setDuration(250L);
        ofFloat.start();
        sparseArray.put(this.w, ofFloat);
        if (!z10) {
            u1Var.setSelectedBackgroundProgress(0.0f);
        }
        SharedConfig.removeTextSelectionHint();
    }

    public final void W(MessageObject messageObject) {
        try {
            int i10 = messageObject.messageOwner.edit_date;
        } catch (Exception unused) {
        }
        if (this.w == messageObject.getId()) {
            f(true);
        }
    }

    public final void X(boolean z10, StaticLayout staticLayout, Canvas canvas) {
        if (this.q0) {
            Paint paint = this.p;
            Paint paint2 = this.o;
            if (z10) {
                int i10 = org.telegram.ui.ActionBar.i6.Vb;
                paint2.setColor(t(i10));
                paint.setColor(t(i10));
            } else {
                int i11 = org.telegram.ui.ActionBar.i6.uf;
                paint2.setColor(t(i11));
                paint.setColor(t(i11));
            }
            h(canvas, staticLayout, this.u, this.v, true, true, 0.0f);
        }
    }

    public final void Y(MessageObject messageObject, RichMessageLayout richMessageLayout, Canvas canvas) {
        w9 w9Var;
        Canvas canvas2;
        if (!this.u0 || richMessageLayout == null || (w9Var = this.W) == null || ((u1) w9Var).getMessageObject() == null || ((u1) this.W).getMessageObject().getId() != messageObject.getId()) {
            return;
        }
        boolean isOutOwner = messageObject.isOutOwner();
        Paint paint = this.p;
        Paint paint2 = this.o;
        if (isOutOwner) {
            int i10 = org.telegram.ui.ActionBar.i6.Vb;
            paint2.setColor(t(i10));
            paint.setColor(t(i10));
        } else {
            int i11 = org.telegram.ui.ActionBar.i6.uf;
            paint2.setColor(t(i11));
            paint.setColor(t(i11));
        }
        int i12 = 0;
        while (i12 < richMessageLayout.textBlocks.size()) {
            Layout layout = richMessageLayout.textBlocks.get(i12).getLayout();
            if (layout != null && layout.getText() != null) {
                int intValue = richMessageLayout.textBlockCharOffsets.get(i12).intValue();
                int length = layout.getText().length();
                int clamp = Utilities.clamp(this.u - intValue, length, 0);
                int clamp2 = Utilities.clamp(this.v - intValue, length, 0);
                if (clamp != clamp2) {
                    boolean z10 = this.u >= intValue;
                    boolean z11 = this.v <= intValue + length;
                    canvas.save();
                    canvas.translate(r1.getX(), r1.getY());
                    canvas2 = canvas;
                    h(canvas2, layout, clamp, clamp2, z10, z11, 0.0f);
                    canvas2.restore();
                    i12++;
                    canvas = canvas2;
                }
            }
            canvas2 = canvas;
            i12++;
            canvas = canvas2;
        }
    }

    public final void Z(u1 u1Var, int i10, int i11) {
        if (u1Var == null) {
            return;
        }
        this.W = u1Var;
        this.w = u1Var.getMessageObject().getId();
        this.u = i10;
        this.v = i11;
        w();
        w7.h0 h0Var = this.D;
        if (h0Var != null) {
            h0Var.a(true);
        }
        this.g = 0.0f;
        this.f = 0.0f;
        this.e = false;
        aa aaVar = this.C;
        if (aaVar != null) {
            aaVar.setVisibility(0);
        }
        U();
    }

    public final void a0(u1 u1Var) {
        ArrayList<MessageObject.TextLayoutBlock> arrayList;
        RichMessageLayout richMessageLayout;
        this.X = u1Var;
        MessageObject messageObject = u1Var.getMessageObject();
        t1 t1Var = u1Var.Zc;
        boolean z10 = this.r0;
        Rect rect = this.B;
        if (z10 && u1Var.getDescriptionlayout() != null) {
            int i10 = this.c;
            rect.set(i10, this.d, u1Var.getDescriptionlayout().getWidth() + i10, u1Var.getDescriptionlayout().getHeight() + this.d);
            return;
        }
        if (this.t0 && u1Var.getFactCheckLayout() != null) {
            int i11 = this.c;
            rect.set(i11, this.d, u1Var.getFactCheckLayout().getWidth() + i11, u1Var.getFactCheckLayout().getHeight() + this.d);
            return;
        }
        if (this.v0 && messageObject != null && (richMessageLayout = messageObject.richLayout) != null && !richMessageLayout.textBlocks.isEmpty()) {
            RichMessageLayout richMessageLayout2 = messageObject.richLayout;
            int i12 = this.c;
            rect.set(i12, this.d, richMessageLayout2.getMinWidth() + i12, richMessageLayout2.getHeight() + this.d);
        } else if (u1Var.P2() && u1Var.getCaptionLayout().textLayoutBlocks.size() > 0) {
            MessageObject.TextLayoutBlock textLayoutBlock = (MessageObject.TextLayoutBlock) hg.c.g(1, u1Var.getCaptionLayout().textLayoutBlocks);
            int i13 = this.c;
            rect.set(i13, this.d, textLayoutBlock.textLayout.getWidth() + i13, (int) (textLayoutBlock.textYOffset(u1Var.getCaptionLayout().textLayoutBlocks, t1Var) + this.d + textLayoutBlock.padTop + textLayoutBlock.textLayout.getHeight()));
        } else {
            if (messageObject == null || (arrayList = messageObject.textLayoutBlocks) == null || arrayList.size() <= 0) {
                this.X = null;
                return;
            }
            MessageObject.TextLayoutBlock textLayoutBlock2 = (MessageObject.TextLayoutBlock) hg.c.g(1, messageObject.textLayoutBlocks);
            int i14 = this.c;
            rect.set(i14, this.d, textLayoutBlock2.textLayout.getWidth() + i14, (int) (textLayoutBlock2.textYOffset(messageObject.textLayoutBlocks, t1Var) + this.d + textLayoutBlock2.padTop + textLayoutBlock2.textLayout.getHeight()));
        }
    }

    public final void b0(int i10, int i11) {
        if (this.a == i10 && this.b == i11) {
            return;
        }
        this.a = i10;
        this.b = i11;
        w();
    }

    @Override // org.telegram.ui.Cells.ba
    public final void f(boolean z10) {
        super.f(z10);
        this.q0 = false;
        this.s0 = false;
        this.u0 = false;
    }

    @Override // org.telegram.ui.Cells.ba
    public final void i(int i10, r9 r9Var, boolean z10) {
        u1 u1Var = (u1) (z10 ? this.X : this.W);
        if (u1Var == null) {
            r9Var.b = null;
            return;
        }
        MessageObject messageObject = u1Var.getMessageObject();
        if (this.q0) {
            r9Var.b = u1Var.getDescriptionlayout();
            r9Var.c = 0.0f;
            r9Var.d = 0.0f;
            r9Var.a = 0;
            return;
        }
        if (this.s0) {
            r9Var.b = u1Var.getFactCheckLayout();
            r9Var.c = 0.0f;
            r9Var.d = 0.0f;
            r9Var.a = 0;
            return;
        }
        if (this.u0) {
            RichMessageLayout richMessageLayout = messageObject != null ? messageObject.richLayout : null;
            if (richMessageLayout == null || richMessageLayout.textBlocks.isEmpty()) {
                r9Var.b = null;
                return;
            }
            while (true) {
                if (r4 >= richMessageLayout.textBlocks.size()) {
                    r4 = -1;
                    break;
                }
                int intValue = richMessageLayout.textBlockCharOffsets.get(r4).intValue();
                int length = richMessageLayout.textBlocks.get(r4).getLayout().getText().length();
                if (i10 >= intValue && i10 <= intValue + length) {
                    break;
                } else {
                    r4++;
                }
            }
            if (r4 < 0) {
                r4 = richMessageLayout.textBlocks.size() - 1;
            }
            r9Var.b = richMessageLayout.textBlocks.get(r4).getLayout();
            r9Var.c = r9.getY();
            r9Var.d = r9.getX();
            r9Var.a = richMessageLayout.textBlockCharOffsets.get(r4).intValue();
            return;
        }
        if (u1Var.P2()) {
            MessageObject.TextLayoutBlocks captionLayout = u1Var.getCaptionLayout();
            if (captionLayout.textLayoutBlocks.size() == 1) {
                r9Var.b = captionLayout.textLayoutBlocks.get(0).textLayout;
                r9Var.c = r9.padTop;
                MessageObject.TextLayoutBlock textLayoutBlock = captionLayout.textLayoutBlocks.get(0);
                float f7 = -(textLayoutBlock.isRtl() ? ((int) Math.ceil(captionLayout.textXOffset)) - (textLayoutBlock.quote ? AndroidUtilities.dp(10.0f) : 0) : 0);
                r9Var.d = f7;
                if (textLayoutBlock.code && !textLayoutBlock.quote) {
                    r9Var.d = f7 + AndroidUtilities.dp(8.0f);
                }
                r9Var.a = 0;
                return;
            }
            for (int i11 = 0; i11 < captionLayout.textLayoutBlocks.size(); i11++) {
                MessageObject.TextLayoutBlock textLayoutBlock2 = captionLayout.textLayoutBlocks.get(i11);
                int i12 = i10 - textLayoutBlock2.charactersOffset;
                if (i12 >= 0 && i12 <= textLayoutBlock2.textLayout.getText().length()) {
                    r9Var.b = textLayoutBlock2.textLayout;
                    r9Var.c = textLayoutBlock2.textYOffset(captionLayout.textLayoutBlocks) + textLayoutBlock2.padTop;
                    float f10 = -(textLayoutBlock2.isRtl() ? ((int) Math.ceil(captionLayout.textXOffset)) - (textLayoutBlock2.quote ? AndroidUtilities.dp(10.0f) : 0) : 0);
                    r9Var.d = f10;
                    if (textLayoutBlock2.code && !textLayoutBlock2.quote) {
                        r9Var.d = f10 + AndroidUtilities.dp(8.0f);
                    }
                    r9Var.a = textLayoutBlock2.charactersOffset;
                    return;
                }
            }
            r9Var.b = null;
            return;
        }
        ArrayList<MessageObject.TextLayoutBlock> arrayList = messageObject.textLayoutBlocks;
        if (arrayList == null) {
            r9Var.b = null;
            return;
        }
        if (arrayList.size() == 1) {
            r9Var.b = messageObject.textLayoutBlocks.get(0).textLayout;
            r9Var.c = r9.padTop;
            MessageObject.TextLayoutBlock textLayoutBlock3 = messageObject.textLayoutBlocks.get(0);
            float f11 = -(textLayoutBlock3.isRtl() ? ((int) Math.ceil(messageObject.textXOffset)) - (textLayoutBlock3.quote ? AndroidUtilities.dp(10.0f) : 0) : 0);
            r9Var.d = f11;
            if (textLayoutBlock3.code && !textLayoutBlock3.quote) {
                r9Var.d = f11 + AndroidUtilities.dp(8.0f);
            }
            r9Var.a = 0;
            return;
        }
        for (int i13 = 0; i13 < messageObject.textLayoutBlocks.size(); i13++) {
            MessageObject.TextLayoutBlock textLayoutBlock4 = messageObject.textLayoutBlocks.get(i13);
            int i14 = i10 - textLayoutBlock4.charactersOffset;
            if (i14 >= 0 && i14 <= textLayoutBlock4.textLayout.getText().length()) {
                r9Var.b = textLayoutBlock4.textLayout;
                r9Var.c = textLayoutBlock4.textYOffset(messageObject.textLayoutBlocks) + textLayoutBlock4.padTop;
                float f12 = -(textLayoutBlock4.isRtl() ? ((int) Math.ceil(messageObject.textXOffset)) - (textLayoutBlock4.quote ? AndroidUtilities.dp(10.0f) : 0) : 0);
                r9Var.d = f12;
                if (textLayoutBlock4.code && !textLayoutBlock4.quote) {
                    r9Var.d = f12 + AndroidUtilities.dp(8.0f);
                }
                r9Var.a = textLayoutBlock4.charactersOffset;
                return;
            }
        }
        r9Var.b = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    @Override // org.telegram.ui.Cells.ba
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int k(int i10, int i11, int i12, int i13, w9 w9Var, boolean z10) {
        StaticLayout staticLayout;
        float textYOffset;
        int i14;
        float f7;
        float f10;
        StaticLayout staticLayout2;
        int i15;
        Layout layout;
        u1 u1Var = (u1) w9Var;
        if (u1Var == null) {
            return 0;
        }
        int i16 = i10 - i12;
        int i17 = i11 - i13;
        boolean z11 = z10 ? this.r0 : this.q0;
        boolean z12 = z10 ? this.t0 : this.s0;
        boolean z13 = z10 ? this.v0 : this.u0;
        if (z11) {
            staticLayout2 = u1Var.getDescriptionlayout();
        } else {
            if (!z12) {
                if (z13) {
                    RichMessageLayout richMessageLayout = u1Var.getMessageObject() != null ? u1Var.getMessageObject().richLayout : null;
                    if (richMessageLayout != null && !richMessageLayout.textBlocks.isEmpty()) {
                        z9 z9Var = (z9) hg.c.g(1, richMessageLayout.textBlocks);
                        Layout layout2 = z9Var.getLayout();
                        staticLayout = layout2 instanceof StaticLayout ? (StaticLayout) layout2 : null;
                        f7 = z9Var.getY();
                    }
                    return -1;
                }
                if (u1Var.P2()) {
                    MessageObject.TextLayoutBlock textLayoutBlock = u1Var.getCaptionLayout().textLayoutBlocks.get(u1Var.getCaptionLayout().textLayoutBlocks.size() - 1);
                    staticLayout = textLayoutBlock.textLayout;
                    textYOffset = textLayoutBlock.textYOffset(u1Var.getCaptionLayout().textLayoutBlocks);
                    i14 = textLayoutBlock.padTop;
                } else {
                    MessageObject.TextLayoutBlock textLayoutBlock2 = u1Var.getMessageObject().textLayoutBlocks.get(u1Var.getMessageObject().textLayoutBlocks.size() - 1);
                    staticLayout = textLayoutBlock2.textLayout;
                    textYOffset = textLayoutBlock2.textYOffset(u1Var.getMessageObject().textLayoutBlocks);
                    i14 = textLayoutBlock2.padTop;
                }
                f7 = i14 + textYOffset;
                StaticLayout staticLayout3 = staticLayout;
                f10 = f7;
                staticLayout2 = staticLayout3;
                if (staticLayout2 != null) {
                    if (i17 < 0) {
                        i17 = 1;
                    }
                    int lineBottom = (int) (f10 + staticLayout2.getLineBottom(staticLayout2.getLineCount() - 1));
                    if (i17 > lineBottom) {
                        i17 = lineBottom - 1;
                    }
                    t1 t1Var = u1Var.Zc;
                    MessageObject messageObject = u1Var.getMessageObject();
                    r9 r9Var = this.a0;
                    if (!z10 ? this.q0 : this.r0) {
                        r9Var.b = u1Var.getDescriptionlayout();
                        r9Var.d = 0.0f;
                        r9Var.c = 0.0f;
                        r9Var.a = 0;
                    } else {
                        if (!z10 ? this.s0 : this.t0) {
                            if (!z10 ? !this.u0 : !this.v0) {
                                i15 = -1;
                                if (!u1Var.P2()) {
                                    int i18 = 0;
                                    while (true) {
                                        if (i18 >= messageObject.textLayoutBlocks.size()) {
                                            break;
                                        }
                                        MessageObject.TextLayoutBlock textLayoutBlock3 = messageObject.textLayoutBlocks.get(i18);
                                        float f11 = i17;
                                        if (f11 < textLayoutBlock3.textYOffset(messageObject.textLayoutBlocks) || f11 > textLayoutBlock3.textYOffset(messageObject.textLayoutBlocks) + textLayoutBlock3.padTop + textLayoutBlock3.height(t1Var)) {
                                            i18++;
                                        } else {
                                            r9Var.b = textLayoutBlock3.textLayout;
                                            r9Var.c = textLayoutBlock3.textYOffset(messageObject.textLayoutBlocks) + textLayoutBlock3.padTop;
                                            float f12 = -(textLayoutBlock3.isRtl() ? ((int) Math.ceil(messageObject.textXOffset)) - (textLayoutBlock3.quote ? AndroidUtilities.dp(10.0f) : textLayoutBlock3.code ? AndroidUtilities.dp(0.0f) : 0) : 0);
                                            r9Var.d = f12;
                                            if (textLayoutBlock3.code && !textLayoutBlock3.quote) {
                                                r9Var.d = f12 + AndroidUtilities.dp(8.0f);
                                            }
                                            r9Var.a = textLayoutBlock3.charactersOffset;
                                        }
                                    }
                                } else {
                                    MessageObject.TextLayoutBlocks captionLayout = u1Var.getCaptionLayout();
                                    int i19 = 0;
                                    while (true) {
                                        if (i19 >= captionLayout.textLayoutBlocks.size()) {
                                            break;
                                        }
                                        MessageObject.TextLayoutBlock textLayoutBlock4 = captionLayout.textLayoutBlocks.get(i19);
                                        float f13 = i17;
                                        if (f13 < textLayoutBlock4.textYOffset(captionLayout.textLayoutBlocks) || f13 > textLayoutBlock4.textYOffset(captionLayout.textLayoutBlocks) + textLayoutBlock4.padTop + textLayoutBlock4.height(t1Var)) {
                                            i19++;
                                        } else {
                                            r9Var.b = textLayoutBlock4.textLayout;
                                            r9Var.c = textLayoutBlock4.textYOffset(captionLayout.textLayoutBlocks) + textLayoutBlock4.padTop;
                                            float f14 = -(textLayoutBlock4.isRtl() ? ((int) Math.ceil(captionLayout.textXOffset)) - (textLayoutBlock4.quote ? AndroidUtilities.dp(10.0f) : 0) : 0);
                                            r9Var.d = f14;
                                            if (textLayoutBlock4.code && !textLayoutBlock4.quote) {
                                                r9Var.d = f14 + AndroidUtilities.dp(8.0f);
                                            }
                                            r9Var.a = textLayoutBlock4.charactersOffset;
                                        }
                                    }
                                }
                            } else {
                                RichMessageLayout richMessageLayout2 = messageObject != null ? messageObject.richLayout : null;
                                if (richMessageLayout2 == null || richMessageLayout2.textBlocks.isEmpty()) {
                                    i15 = -1;
                                    r9Var.b = null;
                                } else {
                                    int i20 = TLObject.FLAG_31;
                                    int i21 = -1;
                                    int i22 = -1;
                                    int i23 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                    for (int i24 = 0; i24 < richMessageLayout2.textBlocks.size(); i24++) {
                                        z9 z9Var2 = richMessageLayout2.textBlocks.get(i24);
                                        int y3 = z9Var2.getY();
                                        int height = z9Var2.getLayout().getHeight() + y3;
                                        int x10 = z9Var2.getX();
                                        int width = z9Var2.getLayout().getWidth() + x10;
                                        boolean z14 = i17 >= y3 && i17 < height;
                                        boolean z15 = i16 >= x10 && i16 < width;
                                        z9Var2.getLayout().getText();
                                        if (z14) {
                                            if (x10 <= i16 && x10 > i20) {
                                                i20 = x10;
                                                i21 = i24;
                                            }
                                            int min = z15 ? 0 : Math.min(Math.abs(i16 - x10), Math.abs(i16 - width));
                                            if (min < i23) {
                                                i23 = min;
                                                i22 = i24;
                                            }
                                        }
                                    }
                                    i15 = -1;
                                    if (i21 < 0) {
                                        i21 = i22;
                                    }
                                    if (i21 < 0) {
                                        int i25 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                        i21 = 0;
                                        for (int i26 = 0; i26 < richMessageLayout2.textBlocks.size(); i26++) {
                                            z9 z9Var3 = richMessageLayout2.textBlocks.get(i26);
                                            int y10 = z9Var3.getY();
                                            int min2 = Math.min(Math.abs(i17 - y10), Math.abs(i17 - (z9Var3.getLayout().getHeight() + y10)));
                                            if (min2 < i25) {
                                                i21 = i26;
                                                i25 = min2;
                                            }
                                        }
                                    }
                                    r9Var.b = richMessageLayout2.textBlocks.get(i21).getLayout();
                                    r9Var.c = r2.getY();
                                    r9Var.d = r2.getX();
                                    r9Var.a = richMessageLayout2.textBlockCharOffsets.get(i21).intValue();
                                }
                            }
                            layout = r9Var.b;
                            if (layout != null) {
                                return i15;
                            }
                            int i27 = (int) (i16 - r9Var.d);
                            int i28 = 0;
                            while (true) {
                                if (i28 >= layout.getLineCount()) {
                                    i28 = i15;
                                    break;
                                }
                                float f15 = i17;
                                if (f15 > r9Var.c + layout.getLineTop(i28) && f15 < r9Var.c + layout.getLineBottom(i28)) {
                                    break;
                                }
                                i28++;
                            }
                            if (i28 >= 0) {
                                return layout.getOffsetForHorizontal(i28, i27) + r9Var.a;
                            }
                            return i15;
                        }
                        r9Var.b = u1Var.getFactCheckLayout();
                        r9Var.d = 0.0f;
                        r9Var.c = 0.0f;
                        r9Var.a = 0;
                    }
                    i15 = -1;
                    layout = r9Var.b;
                    if (layout != null) {
                    }
                }
                return -1;
            }
            staticLayout2 = u1Var.getFactCheckLayout();
        }
        f10 = 0.0f;
        if (staticLayout2 != null) {
        }
        return -1;
    }

    @Override // org.telegram.ui.Cells.ba
    public final int m() {
        Layout layout;
        w9 w9Var = this.W;
        if (w9Var != null && ((u1) w9Var).getMessageObject() != null) {
            MessageObject messageObject = ((u1) this.W).getMessageObject();
            if (this.q0) {
                layout = ((u1) this.W).getDescriptionlayout();
            } else if (this.s0) {
                layout = ((u1) this.W).getFactCheckLayout();
            } else if (this.u0) {
                RichMessageLayout richMessageLayout = messageObject != null ? messageObject.richLayout : null;
                if (richMessageLayout != null && !richMessageLayout.textBlocks.isEmpty()) {
                    layout = richMessageLayout.textBlocks.get(0).getLayout();
                }
                layout = null;
            } else if (((u1) this.W).P2()) {
                layout = ((u1) this.W).getCaptionLayout().textLayoutBlocks.get(0).textLayout;
            } else {
                ArrayList<MessageObject.TextLayoutBlock> arrayList = messageObject.textLayoutBlocks;
                if (arrayList != null) {
                    layout = arrayList.get(0).textLayout;
                }
                layout = null;
            }
            if (layout != null) {
                return layout.getLineBottom(0) - layout.getLineTop(0);
            }
        }
        return 0;
    }

    @Override // org.telegram.ui.Cells.ba
    public final CharSequence s(w9 w9Var, boolean z10) {
        u1 u1Var = (u1) w9Var;
        if (u1Var == null || u1Var.getMessageObject() == null) {
            return null;
        }
        if (!z10 ? !this.q0 : !this.r0) {
            return u1Var.getDescriptionlayout().getText();
        }
        if (!z10 ? !this.s0 : !this.t0) {
            return u1Var.getFactCheckLayout().getText();
        }
        if (!z10 ? this.u0 : this.v0) {
            return u1Var.P2() ? u1Var.getCaptionLayout().text : u1Var.getMessageObject().messageText;
        }
        RichMessageLayout richMessageLayout = u1Var.getMessageObject().richLayout;
        return richMessageLayout != null ? richMessageLayout.joinedText : "";
    }

    @Override // org.telegram.ui.Cells.ba
    public void w() {
        super.w();
        w9 w9Var = this.W;
        if (w9Var != null && ((u1) w9Var).getCurrentMessagesGroup() != null) {
            this.F.invalidate();
        }
        w9 w9Var2 = this.W;
        if (w9Var2 != null) {
            if (this.s0 || this.t0) {
                ((u1) w9Var2).a3();
            }
        }
    }
}
