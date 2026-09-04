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

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public abstract class r9 extends da {
    public boolean A0;
    public final SparseArray u0 = new SparseArray();
    public boolean v0;
    public boolean w0;
    public boolean x0;
    public boolean y0;
    public boolean z0;

    @Override // org.telegram.ui.Cells.da
    public final boolean D() {
        y9 y9Var;
        RichMessageLayout richMessageLayout;
        CharSequence s10;
        String str;
        if (!this.z0 || (y9Var = this.W) == null || ((t1) y9Var).getMessageObject() == null || (richMessageLayout = ((t1) this.W).getMessageObject().richLayout) == null || richMessageLayout.textBlocks.isEmpty() || (s10 = s()) == null || s10.length() == 0) {
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
        AndroidUtilities.addToClipboard(s10, str);
        return true;
    }

    @Override // org.telegram.ui.Cells.da
    public final void F(boolean z10) {
        y9 y9Var = this.W;
        if (y9Var == null || !((t1) y9Var).g3() || z10) {
            return;
        }
        t1 t1Var = (t1) this.W;
        int id2 = t1Var.getMessageObject().getId();
        SparseArray sparseArray = this.u0;
        Animator animator = (Animator) sparseArray.get(id2);
        if (animator != null) {
            animator.removeAllListeners();
            animator.cancel();
        }
        t1Var.setSelectedBackgroundProgress(0.01f);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.01f, 1.0f);
        int i10 = 1;
        ofFloat.addUpdateListener(new org.telegram.ui.ActionBar.q2(t1Var, id2, i10));
        ofFloat.addListener(new j1(i10, t1Var));
        ofFloat.setDuration(300L);
        ofFloat.start();
        sparseArray.put(id2, ofFloat);
    }

    @Override // org.telegram.ui.Cells.da
    public final void M(y9 y9Var, y9 y9Var2) {
        t1 t1Var = (t1) y9Var;
        t1 t1Var2 = (t1) y9Var2;
        boolean z10 = t1Var2 == null || !(t1Var2.getMessageObject() == null || t1Var2.getMessageObject().getId() == t1Var.getMessageObject().getId());
        this.w = t1Var.getMessageObject().getId();
        try {
            int i10 = t1Var.getMessageObject().messageOwner.edit_date;
        } catch (Exception unused) {
        }
        this.U = 0.0f;
        this.v0 = this.w0;
        this.x0 = this.y0;
        this.z0 = this.A0;
        int i11 = this.w;
        SparseArray sparseArray = this.u0;
        Animator animator = (Animator) sparseArray.get(i11);
        if (animator != null) {
            animator.removeAllListeners();
            animator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new ah.l0(4, this, z10));
        ofFloat.setDuration(250L);
        ofFloat.start();
        sparseArray.put(this.w, ofFloat);
        if (!z10) {
            t1Var.setSelectedBackgroundProgress(0.0f);
        }
        SharedConfig.removeTextSelectionHint();
    }

    public final void X(MessageObject messageObject) {
        try {
            int i10 = messageObject.messageOwner.edit_date;
        } catch (Exception unused) {
        }
        if (this.w == messageObject.getId()) {
            f(true);
        }
    }

    public final void Y(boolean z10, StaticLayout staticLayout, Canvas canvas) {
        if (this.v0) {
            Paint paint = this.p;
            Paint paint2 = this.o;
            if (z10) {
                int i10 = org.telegram.ui.ActionBar.j6.Vb;
                paint2.setColor(u(i10));
                paint.setColor(u(i10));
            } else {
                int i11 = org.telegram.ui.ActionBar.j6.uf;
                paint2.setColor(u(i11));
                paint.setColor(u(i11));
            }
            i(canvas, staticLayout, this.u, this.v, true, true, 0.0f);
        }
    }

    public final void Z(MessageObject messageObject, RichMessageLayout richMessageLayout, Canvas canvas) {
        y9 y9Var;
        Canvas canvas2;
        if (!this.z0 || richMessageLayout == null || (y9Var = this.W) == null || ((t1) y9Var).getMessageObject() == null || ((t1) this.W).getMessageObject().getId() != messageObject.getId()) {
            return;
        }
        boolean isOutOwner = messageObject.isOutOwner();
        Paint paint = this.p;
        Paint paint2 = this.o;
        if (isOutOwner) {
            int i10 = org.telegram.ui.ActionBar.j6.Vb;
            paint2.setColor(u(i10));
            paint.setColor(u(i10));
        } else {
            int i11 = org.telegram.ui.ActionBar.j6.uf;
            paint2.setColor(u(i11));
            paint.setColor(u(i11));
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
                    i(canvas2, layout, clamp, clamp2, z10, z11, 0.0f);
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

    public final void a0(t1 t1Var, int i10, int i11) {
        if (t1Var == null) {
            return;
        }
        this.W = t1Var;
        this.w = t1Var.getMessageObject().getId();
        this.u = i10;
        this.v = i11;
        x();
        w7.h0 h0Var = this.D;
        if (h0Var != null) {
            h0Var.a(true);
        }
        this.g = 0.0f;
        this.f = 0.0f;
        this.e = false;
        ca caVar = this.C;
        if (caVar != null) {
            caVar.setVisibility(0);
        }
        V();
    }

    public final void b0(t1 t1Var) {
        ArrayList<MessageObject.TextLayoutBlock> arrayList;
        RichMessageLayout richMessageLayout;
        this.X = t1Var;
        MessageObject messageObject = t1Var.getMessageObject();
        s1 s1Var = t1Var.Zc;
        boolean z10 = this.w0;
        Rect rect = this.B;
        if (z10 && t1Var.getDescriptionlayout() != null) {
            int i10 = this.c;
            rect.set(i10, this.d, t1Var.getDescriptionlayout().getWidth() + i10, t1Var.getDescriptionlayout().getHeight() + this.d);
            return;
        }
        if (this.y0 && t1Var.getFactCheckLayout() != null) {
            int i11 = this.c;
            rect.set(i11, this.d, t1Var.getFactCheckLayout().getWidth() + i11, t1Var.getFactCheckLayout().getHeight() + this.d);
            return;
        }
        if (this.A0 && messageObject != null && (richMessageLayout = messageObject.richLayout) != null && !richMessageLayout.textBlocks.isEmpty()) {
            RichMessageLayout richMessageLayout2 = messageObject.richLayout;
            int i12 = this.c;
            rect.set(i12, this.d, richMessageLayout2.getMinWidth() + i12, richMessageLayout2.getHeight() + this.d);
        } else if (t1Var.P2() && t1Var.getCaptionLayout().textLayoutBlocks.size() > 0) {
            MessageObject.TextLayoutBlock textLayoutBlock = (MessageObject.TextLayoutBlock) i2.g.h(1, t1Var.getCaptionLayout().textLayoutBlocks);
            int i13 = this.c;
            rect.set(i13, this.d, textLayoutBlock.textLayout.getWidth() + i13, (int) (textLayoutBlock.textYOffset(t1Var.getCaptionLayout().textLayoutBlocks, s1Var) + this.d + textLayoutBlock.padTop + textLayoutBlock.textLayout.getHeight()));
        } else {
            if (messageObject == null || (arrayList = messageObject.textLayoutBlocks) == null || arrayList.size() <= 0) {
                this.X = null;
                return;
            }
            MessageObject.TextLayoutBlock textLayoutBlock2 = (MessageObject.TextLayoutBlock) i2.g.h(1, messageObject.textLayoutBlocks);
            int i14 = this.c;
            rect.set(i14, this.d, textLayoutBlock2.textLayout.getWidth() + i14, (int) (textLayoutBlock2.textYOffset(messageObject.textLayoutBlocks, s1Var) + this.d + textLayoutBlock2.padTop + textLayoutBlock2.textLayout.getHeight()));
        }
    }

    public final void c0(int i10, int i11) {
        if (this.a == i10 && this.b == i11) {
            return;
        }
        this.a = i10;
        this.b = i11;
        x();
    }

    @Override // org.telegram.ui.Cells.da
    public final void f(boolean z10) {
        super.f(z10);
        this.v0 = false;
        this.x0 = false;
        this.z0 = false;
    }

    @Override // org.telegram.ui.Cells.da
    public final void j(int i10, t9 t9Var, boolean z10) {
        t1 t1Var = (t1) (z10 ? this.X : this.W);
        if (t1Var == null) {
            t9Var.b = null;
            return;
        }
        MessageObject messageObject = t1Var.getMessageObject();
        if (this.v0) {
            t9Var.b = t1Var.getDescriptionlayout();
            t9Var.c = 0.0f;
            t9Var.d = 0.0f;
            t9Var.a = 0;
            return;
        }
        if (this.x0) {
            t9Var.b = t1Var.getFactCheckLayout();
            t9Var.c = 0.0f;
            t9Var.d = 0.0f;
            t9Var.a = 0;
            return;
        }
        if (this.z0) {
            RichMessageLayout richMessageLayout = messageObject != null ? messageObject.richLayout : null;
            if (richMessageLayout == null || richMessageLayout.textBlocks.isEmpty()) {
                t9Var.b = null;
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
            t9Var.b = richMessageLayout.textBlocks.get(r4).getLayout();
            t9Var.c = r9.getY();
            t9Var.d = r9.getX();
            t9Var.a = richMessageLayout.textBlockCharOffsets.get(r4).intValue();
            return;
        }
        if (t1Var.P2()) {
            MessageObject.TextLayoutBlocks captionLayout = t1Var.getCaptionLayout();
            if (captionLayout.textLayoutBlocks.size() == 1) {
                t9Var.b = captionLayout.textLayoutBlocks.get(0).textLayout;
                t9Var.c = r9.padTop;
                MessageObject.TextLayoutBlock textLayoutBlock = captionLayout.textLayoutBlocks.get(0);
                float f7 = -(textLayoutBlock.isRtl() ? ((int) Math.ceil(captionLayout.textXOffset)) - (textLayoutBlock.quote ? AndroidUtilities.dp(10.0f) : 0) : 0);
                t9Var.d = f7;
                if (textLayoutBlock.code && !textLayoutBlock.quote) {
                    t9Var.d = f7 + AndroidUtilities.dp(8.0f);
                }
                t9Var.a = 0;
                return;
            }
            for (int i11 = 0; i11 < captionLayout.textLayoutBlocks.size(); i11++) {
                MessageObject.TextLayoutBlock textLayoutBlock2 = captionLayout.textLayoutBlocks.get(i11);
                int i12 = i10 - textLayoutBlock2.charactersOffset;
                if (i12 >= 0 && i12 <= textLayoutBlock2.textLayout.getText().length()) {
                    t9Var.b = textLayoutBlock2.textLayout;
                    t9Var.c = textLayoutBlock2.textYOffset(captionLayout.textLayoutBlocks) + textLayoutBlock2.padTop;
                    float f10 = -(textLayoutBlock2.isRtl() ? ((int) Math.ceil(captionLayout.textXOffset)) - (textLayoutBlock2.quote ? AndroidUtilities.dp(10.0f) : 0) : 0);
                    t9Var.d = f10;
                    if (textLayoutBlock2.code && !textLayoutBlock2.quote) {
                        t9Var.d = f10 + AndroidUtilities.dp(8.0f);
                    }
                    t9Var.a = textLayoutBlock2.charactersOffset;
                    return;
                }
            }
            t9Var.b = null;
            return;
        }
        ArrayList<MessageObject.TextLayoutBlock> arrayList = messageObject.textLayoutBlocks;
        if (arrayList == null) {
            t9Var.b = null;
            return;
        }
        if (arrayList.size() == 1) {
            t9Var.b = messageObject.textLayoutBlocks.get(0).textLayout;
            t9Var.c = r9.padTop;
            MessageObject.TextLayoutBlock textLayoutBlock3 = messageObject.textLayoutBlocks.get(0);
            float f11 = -(textLayoutBlock3.isRtl() ? ((int) Math.ceil(messageObject.textXOffset)) - (textLayoutBlock3.quote ? AndroidUtilities.dp(10.0f) : 0) : 0);
            t9Var.d = f11;
            if (textLayoutBlock3.code && !textLayoutBlock3.quote) {
                t9Var.d = f11 + AndroidUtilities.dp(8.0f);
            }
            t9Var.a = 0;
            return;
        }
        for (int i13 = 0; i13 < messageObject.textLayoutBlocks.size(); i13++) {
            MessageObject.TextLayoutBlock textLayoutBlock4 = messageObject.textLayoutBlocks.get(i13);
            int i14 = i10 - textLayoutBlock4.charactersOffset;
            if (i14 >= 0 && i14 <= textLayoutBlock4.textLayout.getText().length()) {
                t9Var.b = textLayoutBlock4.textLayout;
                t9Var.c = textLayoutBlock4.textYOffset(messageObject.textLayoutBlocks) + textLayoutBlock4.padTop;
                float f12 = -(textLayoutBlock4.isRtl() ? ((int) Math.ceil(messageObject.textXOffset)) - (textLayoutBlock4.quote ? AndroidUtilities.dp(10.0f) : 0) : 0);
                t9Var.d = f12;
                if (textLayoutBlock4.code && !textLayoutBlock4.quote) {
                    t9Var.d = f12 + AndroidUtilities.dp(8.0f);
                }
                t9Var.a = textLayoutBlock4.charactersOffset;
                return;
            }
        }
        t9Var.b = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    @Override // org.telegram.ui.Cells.da
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int l(int i10, int i11, int i12, int i13, y9 y9Var, boolean z10) {
        StaticLayout staticLayout;
        float textYOffset;
        int i14;
        float f7;
        float f10;
        StaticLayout staticLayout2;
        int i15;
        Layout layout;
        t1 t1Var = (t1) y9Var;
        if (t1Var == null) {
            return 0;
        }
        int i16 = i10 - i12;
        int i17 = i11 - i13;
        boolean z11 = z10 ? this.w0 : this.v0;
        boolean z12 = z10 ? this.y0 : this.x0;
        boolean z13 = z10 ? this.A0 : this.z0;
        if (z11) {
            staticLayout2 = t1Var.getDescriptionlayout();
        } else {
            if (!z12) {
                if (z13) {
                    RichMessageLayout richMessageLayout = t1Var.getMessageObject() != null ? t1Var.getMessageObject().richLayout : null;
                    if (richMessageLayout != null && !richMessageLayout.textBlocks.isEmpty()) {
                        ba baVar = (ba) i2.g.h(1, richMessageLayout.textBlocks);
                        Layout layout2 = baVar.getLayout();
                        staticLayout = layout2 instanceof StaticLayout ? (StaticLayout) layout2 : null;
                        f7 = baVar.getY();
                    }
                    return -1;
                }
                if (t1Var.P2()) {
                    MessageObject.TextLayoutBlock textLayoutBlock = t1Var.getCaptionLayout().textLayoutBlocks.get(t1Var.getCaptionLayout().textLayoutBlocks.size() - 1);
                    staticLayout = textLayoutBlock.textLayout;
                    textYOffset = textLayoutBlock.textYOffset(t1Var.getCaptionLayout().textLayoutBlocks);
                    i14 = textLayoutBlock.padTop;
                } else {
                    MessageObject.TextLayoutBlock textLayoutBlock2 = t1Var.getMessageObject().textLayoutBlocks.get(t1Var.getMessageObject().textLayoutBlocks.size() - 1);
                    staticLayout = textLayoutBlock2.textLayout;
                    textYOffset = textLayoutBlock2.textYOffset(t1Var.getMessageObject().textLayoutBlocks);
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
                    s1 s1Var = t1Var.Zc;
                    MessageObject messageObject = t1Var.getMessageObject();
                    t9 t9Var = this.a0;
                    if (!z10 ? this.v0 : this.w0) {
                        t9Var.b = t1Var.getDescriptionlayout();
                        t9Var.d = 0.0f;
                        t9Var.c = 0.0f;
                        t9Var.a = 0;
                    } else {
                        if (!z10 ? this.x0 : this.y0) {
                            if (!z10 ? !this.z0 : !this.A0) {
                                i15 = -1;
                                if (!t1Var.P2()) {
                                    int i18 = 0;
                                    while (true) {
                                        if (i18 >= messageObject.textLayoutBlocks.size()) {
                                            break;
                                        }
                                        MessageObject.TextLayoutBlock textLayoutBlock3 = messageObject.textLayoutBlocks.get(i18);
                                        float f11 = i17;
                                        if (f11 < textLayoutBlock3.textYOffset(messageObject.textLayoutBlocks) || f11 > textLayoutBlock3.textYOffset(messageObject.textLayoutBlocks) + textLayoutBlock3.padTop + textLayoutBlock3.height(s1Var)) {
                                            i18++;
                                        } else {
                                            t9Var.b = textLayoutBlock3.textLayout;
                                            t9Var.c = textLayoutBlock3.textYOffset(messageObject.textLayoutBlocks) + textLayoutBlock3.padTop;
                                            float f12 = -(textLayoutBlock3.isRtl() ? ((int) Math.ceil(messageObject.textXOffset)) - (textLayoutBlock3.quote ? AndroidUtilities.dp(10.0f) : textLayoutBlock3.code ? AndroidUtilities.dp(0.0f) : 0) : 0);
                                            t9Var.d = f12;
                                            if (textLayoutBlock3.code && !textLayoutBlock3.quote) {
                                                t9Var.d = f12 + AndroidUtilities.dp(8.0f);
                                            }
                                            t9Var.a = textLayoutBlock3.charactersOffset;
                                        }
                                    }
                                } else {
                                    MessageObject.TextLayoutBlocks captionLayout = t1Var.getCaptionLayout();
                                    int i19 = 0;
                                    while (true) {
                                        if (i19 >= captionLayout.textLayoutBlocks.size()) {
                                            break;
                                        }
                                        MessageObject.TextLayoutBlock textLayoutBlock4 = captionLayout.textLayoutBlocks.get(i19);
                                        float f13 = i17;
                                        if (f13 < textLayoutBlock4.textYOffset(captionLayout.textLayoutBlocks) || f13 > textLayoutBlock4.textYOffset(captionLayout.textLayoutBlocks) + textLayoutBlock4.padTop + textLayoutBlock4.height(s1Var)) {
                                            i19++;
                                        } else {
                                            t9Var.b = textLayoutBlock4.textLayout;
                                            t9Var.c = textLayoutBlock4.textYOffset(captionLayout.textLayoutBlocks) + textLayoutBlock4.padTop;
                                            float f14 = -(textLayoutBlock4.isRtl() ? ((int) Math.ceil(captionLayout.textXOffset)) - (textLayoutBlock4.quote ? AndroidUtilities.dp(10.0f) : 0) : 0);
                                            t9Var.d = f14;
                                            if (textLayoutBlock4.code && !textLayoutBlock4.quote) {
                                                t9Var.d = f14 + AndroidUtilities.dp(8.0f);
                                            }
                                            t9Var.a = textLayoutBlock4.charactersOffset;
                                        }
                                    }
                                }
                            } else {
                                RichMessageLayout richMessageLayout2 = messageObject != null ? messageObject.richLayout : null;
                                if (richMessageLayout2 == null || richMessageLayout2.textBlocks.isEmpty()) {
                                    i15 = -1;
                                    t9Var.b = null;
                                } else {
                                    int i20 = TLObject.FLAG_31;
                                    int i21 = -1;
                                    int i22 = -1;
                                    int i23 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                    for (int i24 = 0; i24 < richMessageLayout2.textBlocks.size(); i24++) {
                                        ba baVar2 = richMessageLayout2.textBlocks.get(i24);
                                        int y3 = baVar2.getY();
                                        int height = baVar2.getLayout().getHeight() + y3;
                                        int x10 = baVar2.getX();
                                        int width = baVar2.getLayout().getWidth() + x10;
                                        boolean z14 = i17 >= y3 && i17 < height;
                                        boolean z15 = i16 >= x10 && i16 < width;
                                        baVar2.getLayout().getText();
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
                                            ba baVar3 = richMessageLayout2.textBlocks.get(i26);
                                            int y10 = baVar3.getY();
                                            int min2 = Math.min(Math.abs(i17 - y10), Math.abs(i17 - (baVar3.getLayout().getHeight() + y10)));
                                            if (min2 < i25) {
                                                i21 = i26;
                                                i25 = min2;
                                            }
                                        }
                                    }
                                    t9Var.b = richMessageLayout2.textBlocks.get(i21).getLayout();
                                    t9Var.c = r2.getY();
                                    t9Var.d = r2.getX();
                                    t9Var.a = richMessageLayout2.textBlockCharOffsets.get(i21).intValue();
                                }
                            }
                            layout = t9Var.b;
                            if (layout != null) {
                                return i15;
                            }
                            int i27 = (int) (i16 - t9Var.d);
                            int i28 = 0;
                            while (true) {
                                if (i28 >= layout.getLineCount()) {
                                    i28 = -1;
                                    break;
                                }
                                float f15 = i17;
                                if (f15 > t9Var.c + layout.getLineTop(i28) && f15 < t9Var.c + layout.getLineBottom(i28)) {
                                    break;
                                }
                                i28++;
                            }
                            if (i28 >= 0) {
                                return layout.getOffsetForHorizontal(i28, i27) + t9Var.a;
                            }
                            return i15;
                        }
                        t9Var.b = t1Var.getFactCheckLayout();
                        t9Var.d = 0.0f;
                        t9Var.c = 0.0f;
                        t9Var.a = 0;
                    }
                    i15 = -1;
                    layout = t9Var.b;
                    if (layout != null) {
                    }
                }
                return -1;
            }
            staticLayout2 = t1Var.getFactCheckLayout();
        }
        f10 = 0.0f;
        if (staticLayout2 != null) {
        }
        return -1;
    }

    @Override // org.telegram.ui.Cells.da
    public final int n() {
        Layout layout;
        y9 y9Var = this.W;
        if (y9Var != null && ((t1) y9Var).getMessageObject() != null) {
            MessageObject messageObject = ((t1) this.W).getMessageObject();
            if (this.v0) {
                layout = ((t1) this.W).getDescriptionlayout();
            } else if (this.x0) {
                layout = ((t1) this.W).getFactCheckLayout();
            } else if (this.z0) {
                RichMessageLayout richMessageLayout = messageObject != null ? messageObject.richLayout : null;
                if (richMessageLayout != null && !richMessageLayout.textBlocks.isEmpty()) {
                    layout = richMessageLayout.textBlocks.get(0).getLayout();
                }
                layout = null;
            } else if (((t1) this.W).P2()) {
                layout = ((t1) this.W).getCaptionLayout().textLayoutBlocks.get(0).textLayout;
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

    @Override // org.telegram.ui.Cells.da
    public final CharSequence t(y9 y9Var, boolean z10) {
        t1 t1Var = (t1) y9Var;
        if (t1Var == null || t1Var.getMessageObject() == null) {
            return null;
        }
        if (!z10 ? !this.v0 : !this.w0) {
            return t1Var.getDescriptionlayout().getText();
        }
        if (!z10 ? !this.x0 : !this.y0) {
            return t1Var.getFactCheckLayout().getText();
        }
        if (!z10 ? this.z0 : this.A0) {
            return t1Var.P2() ? t1Var.getCaptionLayout().text : t1Var.getMessageObject().messageText;
        }
        RichMessageLayout richMessageLayout = t1Var.getMessageObject().richLayout;
        return richMessageLayout != null ? richMessageLayout.joinedText : "";
    }

    @Override // org.telegram.ui.Cells.da
    public void x() {
        super.x();
        y9 y9Var = this.W;
        if (y9Var != null && ((t1) y9Var).getCurrentMessagesGroup() != null) {
            this.F.invalidate();
        }
        y9 y9Var2 = this.W;
        if (y9Var2 != null) {
            if (this.x0 || this.y0) {
                ((t1) y9Var2).a3();
            }
        }
    }
}
