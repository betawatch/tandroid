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

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public abstract class n9 extends z9 {
    public boolean A0;
    public final SparseArray u0 = new SparseArray();
    public boolean v0;
    public boolean w0;
    public boolean x0;
    public boolean y0;
    public boolean z0;

    @Override // org.telegram.ui.Cells.z9
    public final boolean D() {
        u9 u9Var;
        RichMessageLayout richMessageLayout;
        CharSequence s6;
        String str;
        if (!this.z0 || (u9Var = this.W) == null || ((t1) u9Var).getMessageObject() == null || (richMessageLayout = ((t1) this.W).getMessageObject().richLayout) == null || richMessageLayout.textBlocks.isEmpty() || (s6 = s()) == null || s6.length() == 0) {
            return false;
        }
        try {
            str = richMessageLayout.getSelectionHtml(this.u, this.v);
        } catch (Exception e6) {
            FileLog.e(e6);
            str = null;
        }
        if (str == null || str.length() == 0) {
            return false;
        }
        AndroidUtilities.addToClipboard(s6, str);
        return true;
    }

    @Override // org.telegram.ui.Cells.z9
    public final void F(boolean z4) {
        u9 u9Var = this.W;
        if (u9Var == null || !((t1) u9Var).g3() || z4) {
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
        ofFloat.addUpdateListener(new jh.b(t1Var, id2, 2));
        ofFloat.addListener(new j1(1, t1Var));
        ofFloat.setDuration(300L);
        ofFloat.start();
        sparseArray.put(id2, ofFloat);
    }

    @Override // org.telegram.ui.Cells.z9
    public final void M(u9 u9Var, u9 u9Var2) {
        t1 t1Var = (t1) u9Var;
        t1 t1Var2 = (t1) u9Var2;
        boolean z4 = t1Var2 == null || !(t1Var2.getMessageObject() == null || t1Var2.getMessageObject().getId() == t1Var.getMessageObject().getId());
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
        ofFloat.addUpdateListener(new eg.z0(4, this, z4));
        ofFloat.setDuration(250L);
        ofFloat.start();
        sparseArray.put(this.w, ofFloat);
        if (!z4) {
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

    public final void Y(boolean z4, StaticLayout staticLayout, Canvas canvas) {
        if (this.v0) {
            Paint paint = this.p;
            Paint paint2 = this.o;
            if (z4) {
                int i10 = org.telegram.ui.ActionBar.k6.Vb;
                paint2.setColor(u(i10));
                paint.setColor(u(i10));
            } else {
                int i11 = org.telegram.ui.ActionBar.k6.uf;
                paint2.setColor(u(i11));
                paint.setColor(u(i11));
            }
            i(canvas, staticLayout, this.u, this.v, true, true, 0.0f);
        }
    }

    public final void Z(MessageObject messageObject, RichMessageLayout richMessageLayout, Canvas canvas) {
        u9 u9Var;
        Canvas canvas2;
        if (!this.z0 || richMessageLayout == null || (u9Var = this.W) == null || ((t1) u9Var).getMessageObject() == null || ((t1) this.W).getMessageObject().getId() != messageObject.getId()) {
            return;
        }
        boolean isOutOwner = messageObject.isOutOwner();
        Paint paint = this.p;
        Paint paint2 = this.o;
        if (isOutOwner) {
            int i10 = org.telegram.ui.ActionBar.k6.Vb;
            paint2.setColor(u(i10));
            paint.setColor(u(i10));
        } else {
            int i11 = org.telegram.ui.ActionBar.k6.uf;
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
                    boolean z4 = this.u >= intValue;
                    boolean z10 = this.v <= intValue + length;
                    canvas.save();
                    canvas.translate(r1.getX(), r1.getY());
                    canvas2 = canvas;
                    i(canvas2, layout, clamp, clamp2, z4, z10, 0.0f);
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
        k7.y5 y5Var = this.D;
        if (y5Var != null) {
            y5Var.a(true);
        }
        this.g = 0.0f;
        this.f = 0.0f;
        this.e = false;
        y9 y9Var = this.C;
        if (y9Var != null) {
            y9Var.setVisibility(0);
        }
        V();
    }

    public final void b0(t1 t1Var) {
        ArrayList<MessageObject.TextLayoutBlock> arrayList;
        RichMessageLayout richMessageLayout;
        this.X = t1Var;
        MessageObject messageObject = t1Var.getMessageObject();
        s1 s1Var = t1Var.Wc;
        boolean z4 = this.w0;
        Rect rect = this.B;
        if (z4 && t1Var.getDescriptionlayout() != null) {
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
            MessageObject.TextLayoutBlock textLayoutBlock = (MessageObject.TextLayoutBlock) l.d.i(1, t1Var.getCaptionLayout().textLayoutBlocks);
            int i13 = this.c;
            rect.set(i13, this.d, textLayoutBlock.textLayout.getWidth() + i13, (int) (textLayoutBlock.textYOffset(t1Var.getCaptionLayout().textLayoutBlocks, s1Var) + this.d + textLayoutBlock.padTop + textLayoutBlock.textLayout.getHeight()));
        } else {
            if (messageObject == null || (arrayList = messageObject.textLayoutBlocks) == null || arrayList.size() <= 0) {
                this.X = null;
                return;
            }
            MessageObject.TextLayoutBlock textLayoutBlock2 = (MessageObject.TextLayoutBlock) l.d.i(1, messageObject.textLayoutBlocks);
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

    @Override // org.telegram.ui.Cells.z9
    public final void f(boolean z4) {
        super.f(z4);
        this.v0 = false;
        this.x0 = false;
        this.z0 = false;
    }

    @Override // org.telegram.ui.Cells.z9
    public final void j(int i10, p9 p9Var, boolean z4) {
        t1 t1Var = (t1) (z4 ? this.X : this.W);
        if (t1Var == null) {
            p9Var.b = null;
            return;
        }
        MessageObject messageObject = t1Var.getMessageObject();
        if (this.v0) {
            p9Var.b = t1Var.getDescriptionlayout();
            p9Var.c = 0.0f;
            p9Var.d = 0.0f;
            p9Var.a = 0;
            return;
        }
        if (this.x0) {
            p9Var.b = t1Var.getFactCheckLayout();
            p9Var.c = 0.0f;
            p9Var.d = 0.0f;
            p9Var.a = 0;
            return;
        }
        if (this.z0) {
            RichMessageLayout richMessageLayout = messageObject != null ? messageObject.richLayout : null;
            if (richMessageLayout == null || richMessageLayout.textBlocks.isEmpty()) {
                p9Var.b = null;
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
            p9Var.b = richMessageLayout.textBlocks.get(r4).getLayout();
            p9Var.c = r9.getY();
            p9Var.d = r9.getX();
            p9Var.a = richMessageLayout.textBlockCharOffsets.get(r4).intValue();
            return;
        }
        if (t1Var.P2()) {
            MessageObject.TextLayoutBlocks captionLayout = t1Var.getCaptionLayout();
            if (captionLayout.textLayoutBlocks.size() == 1) {
                p9Var.b = captionLayout.textLayoutBlocks.get(0).textLayout;
                p9Var.c = r9.padTop;
                MessageObject.TextLayoutBlock textLayoutBlock = captionLayout.textLayoutBlocks.get(0);
                float f10 = -(textLayoutBlock.isRtl() ? ((int) Math.ceil(captionLayout.textXOffset)) - (textLayoutBlock.quote ? AndroidUtilities.dp(10.0f) : 0) : 0);
                p9Var.d = f10;
                if (textLayoutBlock.code && !textLayoutBlock.quote) {
                    p9Var.d = f10 + AndroidUtilities.dp(8.0f);
                }
                p9Var.a = 0;
                return;
            }
            for (int i11 = 0; i11 < captionLayout.textLayoutBlocks.size(); i11++) {
                MessageObject.TextLayoutBlock textLayoutBlock2 = captionLayout.textLayoutBlocks.get(i11);
                int i12 = i10 - textLayoutBlock2.charactersOffset;
                if (i12 >= 0 && i12 <= textLayoutBlock2.textLayout.getText().length()) {
                    p9Var.b = textLayoutBlock2.textLayout;
                    p9Var.c = textLayoutBlock2.textYOffset(captionLayout.textLayoutBlocks) + textLayoutBlock2.padTop;
                    float f11 = -(textLayoutBlock2.isRtl() ? ((int) Math.ceil(captionLayout.textXOffset)) - (textLayoutBlock2.quote ? AndroidUtilities.dp(10.0f) : 0) : 0);
                    p9Var.d = f11;
                    if (textLayoutBlock2.code && !textLayoutBlock2.quote) {
                        p9Var.d = f11 + AndroidUtilities.dp(8.0f);
                    }
                    p9Var.a = textLayoutBlock2.charactersOffset;
                    return;
                }
            }
            p9Var.b = null;
            return;
        }
        ArrayList<MessageObject.TextLayoutBlock> arrayList = messageObject.textLayoutBlocks;
        if (arrayList == null) {
            p9Var.b = null;
            return;
        }
        if (arrayList.size() == 1) {
            p9Var.b = messageObject.textLayoutBlocks.get(0).textLayout;
            p9Var.c = r9.padTop;
            MessageObject.TextLayoutBlock textLayoutBlock3 = messageObject.textLayoutBlocks.get(0);
            float f12 = -(textLayoutBlock3.isRtl() ? ((int) Math.ceil(messageObject.textXOffset)) - (textLayoutBlock3.quote ? AndroidUtilities.dp(10.0f) : 0) : 0);
            p9Var.d = f12;
            if (textLayoutBlock3.code && !textLayoutBlock3.quote) {
                p9Var.d = f12 + AndroidUtilities.dp(8.0f);
            }
            p9Var.a = 0;
            return;
        }
        for (int i13 = 0; i13 < messageObject.textLayoutBlocks.size(); i13++) {
            MessageObject.TextLayoutBlock textLayoutBlock4 = messageObject.textLayoutBlocks.get(i13);
            int i14 = i10 - textLayoutBlock4.charactersOffset;
            if (i14 >= 0 && i14 <= textLayoutBlock4.textLayout.getText().length()) {
                p9Var.b = textLayoutBlock4.textLayout;
                p9Var.c = textLayoutBlock4.textYOffset(messageObject.textLayoutBlocks) + textLayoutBlock4.padTop;
                float f13 = -(textLayoutBlock4.isRtl() ? ((int) Math.ceil(messageObject.textXOffset)) - (textLayoutBlock4.quote ? AndroidUtilities.dp(10.0f) : 0) : 0);
                p9Var.d = f13;
                if (textLayoutBlock4.code && !textLayoutBlock4.quote) {
                    p9Var.d = f13 + AndroidUtilities.dp(8.0f);
                }
                p9Var.a = textLayoutBlock4.charactersOffset;
                return;
            }
        }
        p9Var.b = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    @Override // org.telegram.ui.Cells.z9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int l(int i10, int i11, int i12, int i13, u9 u9Var, boolean z4) {
        StaticLayout staticLayout;
        float textYOffset;
        int i14;
        float f10;
        float f11;
        StaticLayout staticLayout2;
        int i15;
        Layout layout;
        t1 t1Var = (t1) u9Var;
        if (t1Var == null) {
            return 0;
        }
        int i16 = i10 - i12;
        int i17 = i11 - i13;
        boolean z10 = z4 ? this.w0 : this.v0;
        boolean z11 = z4 ? this.y0 : this.x0;
        boolean z12 = z4 ? this.A0 : this.z0;
        if (z10) {
            staticLayout2 = t1Var.getDescriptionlayout();
        } else {
            if (!z11) {
                if (z12) {
                    RichMessageLayout richMessageLayout = t1Var.getMessageObject() != null ? t1Var.getMessageObject().richLayout : null;
                    if (richMessageLayout != null && !richMessageLayout.textBlocks.isEmpty()) {
                        x9 x9Var = (x9) l.d.i(1, richMessageLayout.textBlocks);
                        Layout layout2 = x9Var.getLayout();
                        staticLayout = layout2 instanceof StaticLayout ? (StaticLayout) layout2 : null;
                        f10 = x9Var.getY();
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
                f10 = i14 + textYOffset;
                StaticLayout staticLayout3 = staticLayout;
                f11 = f10;
                staticLayout2 = staticLayout3;
                if (staticLayout2 != null) {
                    if (i17 < 0) {
                        i17 = 1;
                    }
                    int lineBottom = (int) (f11 + staticLayout2.getLineBottom(staticLayout2.getLineCount() - 1));
                    if (i17 > lineBottom) {
                        i17 = lineBottom - 1;
                    }
                    s1 s1Var = t1Var.Wc;
                    MessageObject messageObject = t1Var.getMessageObject();
                    p9 p9Var = this.a0;
                    if (!z4 ? this.v0 : this.w0) {
                        p9Var.b = t1Var.getDescriptionlayout();
                        p9Var.d = 0.0f;
                        p9Var.c = 0.0f;
                        p9Var.a = 0;
                    } else {
                        if (!z4 ? this.x0 : this.y0) {
                            if (!z4 ? !this.z0 : !this.A0) {
                                i15 = -1;
                                if (!t1Var.P2()) {
                                    int i18 = 0;
                                    while (true) {
                                        if (i18 >= messageObject.textLayoutBlocks.size()) {
                                            break;
                                        }
                                        MessageObject.TextLayoutBlock textLayoutBlock3 = messageObject.textLayoutBlocks.get(i18);
                                        float f12 = i17;
                                        if (f12 < textLayoutBlock3.textYOffset(messageObject.textLayoutBlocks) || f12 > textLayoutBlock3.textYOffset(messageObject.textLayoutBlocks) + textLayoutBlock3.padTop + textLayoutBlock3.height(s1Var)) {
                                            i18++;
                                        } else {
                                            p9Var.b = textLayoutBlock3.textLayout;
                                            p9Var.c = textLayoutBlock3.textYOffset(messageObject.textLayoutBlocks) + textLayoutBlock3.padTop;
                                            float f13 = -(textLayoutBlock3.isRtl() ? ((int) Math.ceil(messageObject.textXOffset)) - (textLayoutBlock3.quote ? AndroidUtilities.dp(10.0f) : textLayoutBlock3.code ? AndroidUtilities.dp(0.0f) : 0) : 0);
                                            p9Var.d = f13;
                                            if (textLayoutBlock3.code && !textLayoutBlock3.quote) {
                                                p9Var.d = f13 + AndroidUtilities.dp(8.0f);
                                            }
                                            p9Var.a = textLayoutBlock3.charactersOffset;
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
                                        float f14 = i17;
                                        if (f14 < textLayoutBlock4.textYOffset(captionLayout.textLayoutBlocks) || f14 > textLayoutBlock4.textYOffset(captionLayout.textLayoutBlocks) + textLayoutBlock4.padTop + textLayoutBlock4.height(s1Var)) {
                                            i19++;
                                        } else {
                                            p9Var.b = textLayoutBlock4.textLayout;
                                            p9Var.c = textLayoutBlock4.textYOffset(captionLayout.textLayoutBlocks) + textLayoutBlock4.padTop;
                                            float f15 = -(textLayoutBlock4.isRtl() ? ((int) Math.ceil(captionLayout.textXOffset)) - (textLayoutBlock4.quote ? AndroidUtilities.dp(10.0f) : 0) : 0);
                                            p9Var.d = f15;
                                            if (textLayoutBlock4.code && !textLayoutBlock4.quote) {
                                                p9Var.d = f15 + AndroidUtilities.dp(8.0f);
                                            }
                                            p9Var.a = textLayoutBlock4.charactersOffset;
                                        }
                                    }
                                }
                            } else {
                                RichMessageLayout richMessageLayout2 = messageObject != null ? messageObject.richLayout : null;
                                if (richMessageLayout2 == null || richMessageLayout2.textBlocks.isEmpty()) {
                                    i15 = -1;
                                    p9Var.b = null;
                                } else {
                                    int i20 = TLObject.FLAG_31;
                                    int i21 = -1;
                                    int i22 = -1;
                                    int i23 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                    for (int i24 = 0; i24 < richMessageLayout2.textBlocks.size(); i24++) {
                                        x9 x9Var2 = richMessageLayout2.textBlocks.get(i24);
                                        int y10 = x9Var2.getY();
                                        int height = x9Var2.getLayout().getHeight() + y10;
                                        int x10 = x9Var2.getX();
                                        int width = x9Var2.getLayout().getWidth() + x10;
                                        boolean z13 = i17 >= y10 && i17 < height;
                                        boolean z14 = i16 >= x10 && i16 < width;
                                        x9Var2.getLayout().getText();
                                        if (z13) {
                                            if (x10 <= i16 && x10 > i20) {
                                                i20 = x10;
                                                i21 = i24;
                                            }
                                            int min = z14 ? 0 : Math.min(Math.abs(i16 - x10), Math.abs(i16 - width));
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
                                            x9 x9Var3 = richMessageLayout2.textBlocks.get(i26);
                                            int y11 = x9Var3.getY();
                                            int min2 = Math.min(Math.abs(i17 - y11), Math.abs(i17 - (x9Var3.getLayout().getHeight() + y11)));
                                            if (min2 < i25) {
                                                i21 = i26;
                                                i25 = min2;
                                            }
                                        }
                                    }
                                    p9Var.b = richMessageLayout2.textBlocks.get(i21).getLayout();
                                    p9Var.c = r2.getY();
                                    p9Var.d = r2.getX();
                                    p9Var.a = richMessageLayout2.textBlockCharOffsets.get(i21).intValue();
                                }
                            }
                            layout = p9Var.b;
                            if (layout != null) {
                                return i15;
                            }
                            int i27 = (int) (i16 - p9Var.d);
                            int i28 = 0;
                            while (true) {
                                if (i28 >= layout.getLineCount()) {
                                    i28 = -1;
                                    break;
                                }
                                float f16 = i17;
                                if (f16 > p9Var.c + layout.getLineTop(i28) && f16 < p9Var.c + layout.getLineBottom(i28)) {
                                    break;
                                }
                                i28++;
                            }
                            if (i28 >= 0) {
                                return layout.getOffsetForHorizontal(i28, i27) + p9Var.a;
                            }
                            return i15;
                        }
                        p9Var.b = t1Var.getFactCheckLayout();
                        p9Var.d = 0.0f;
                        p9Var.c = 0.0f;
                        p9Var.a = 0;
                    }
                    i15 = -1;
                    layout = p9Var.b;
                    if (layout != null) {
                    }
                }
                return -1;
            }
            staticLayout2 = t1Var.getFactCheckLayout();
        }
        f11 = 0.0f;
        if (staticLayout2 != null) {
        }
        return -1;
    }

    @Override // org.telegram.ui.Cells.z9
    public final int n() {
        Layout layout;
        u9 u9Var = this.W;
        if (u9Var != null && ((t1) u9Var).getMessageObject() != null) {
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

    @Override // org.telegram.ui.Cells.z9
    public final CharSequence t(u9 u9Var, boolean z4) {
        t1 t1Var = (t1) u9Var;
        if (t1Var == null || t1Var.getMessageObject() == null) {
            return null;
        }
        if (!z4 ? !this.v0 : !this.w0) {
            return t1Var.getDescriptionlayout().getText();
        }
        if (!z4 ? !this.x0 : !this.y0) {
            return t1Var.getFactCheckLayout().getText();
        }
        if (!z4 ? this.z0 : this.A0) {
            return t1Var.P2() ? t1Var.getCaptionLayout().text : t1Var.getMessageObject().messageText;
        }
        RichMessageLayout richMessageLayout = t1Var.getMessageObject().richLayout;
        return richMessageLayout != null ? richMessageLayout.joinedText : "";
    }

    @Override // org.telegram.ui.Cells.z9
    public void x() {
        super.x();
        u9 u9Var = this.W;
        if (u9Var != null && ((t1) u9Var).getCurrentMessagesGroup() != null) {
            this.F.invalidate();
        }
        u9 u9Var2 = this.W;
        if (u9Var2 != null) {
            if (this.x0 || this.y0) {
                ((t1) u9Var2).a3();
            }
        }
    }
}
