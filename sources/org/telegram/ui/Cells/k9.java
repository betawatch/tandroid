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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public abstract class k9 extends w9 {
    public boolean A0;
    public final SparseArray u0 = new SparseArray();
    public boolean v0;
    public boolean w0;
    public boolean x0;
    public boolean y0;
    public boolean z0;

    @Override // org.telegram.ui.Cells.w9
    public final boolean D() {
        r9 r9Var;
        RichMessageLayout richMessageLayout;
        CharSequence s10;
        String str;
        if (!this.z0 || (r9Var = this.W) == null || ((s1) r9Var).getMessageObject() == null || (richMessageLayout = ((s1) this.W).getMessageObject().richLayout) == null || richMessageLayout.textBlocks.isEmpty() || (s10 = s()) == null || s10.length() == 0) {
            return false;
        }
        try {
            str = richMessageLayout.getSelectionHtml(this.u, this.v);
        } catch (Exception e9) {
            FileLog.e(e9);
            str = null;
        }
        if (str == null || str.length() == 0) {
            return false;
        }
        AndroidUtilities.addToClipboard(s10, str);
        return true;
    }

    @Override // org.telegram.ui.Cells.w9
    public final void F(boolean z10) {
        r9 r9Var = this.W;
        if (r9Var == null || !((s1) r9Var).f3() || z10) {
            return;
        }
        s1 s1Var = (s1) this.W;
        int id2 = s1Var.getMessageObject().getId();
        SparseArray sparseArray = this.u0;
        Animator animator = (Animator) sparseArray.get(id2);
        if (animator != null) {
            animator.removeAllListeners();
            animator.cancel();
        }
        s1Var.setSelectedBackgroundProgress(0.01f);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.01f, 1.0f);
        ofFloat.addUpdateListener(new eh.b(s1Var, id2, 2));
        ofFloat.addListener(new i1(1, s1Var));
        ofFloat.setDuration(300L);
        ofFloat.start();
        sparseArray.put(id2, ofFloat);
    }

    @Override // org.telegram.ui.Cells.w9
    public final void M(r9 r9Var, r9 r9Var2) {
        s1 s1Var = (s1) r9Var;
        s1 s1Var2 = (s1) r9Var2;
        boolean z10 = s1Var2 == null || !(s1Var2.getMessageObject() == null || s1Var2.getMessageObject().getId() == s1Var.getMessageObject().getId());
        this.w = s1Var.getMessageObject().getId();
        try {
            int i10 = s1Var.getMessageObject().messageOwner.edit_date;
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
        ofFloat.addUpdateListener(new ig.y(4, this, z10));
        ofFloat.setDuration(250L);
        ofFloat.start();
        sparseArray.put(this.w, ofFloat);
        if (!z10) {
            s1Var.setSelectedBackgroundProgress(0.0f);
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
                int i10 = org.telegram.ui.ActionBar.g6.Vb;
                paint2.setColor(u(i10));
                paint.setColor(u(i10));
            } else {
                int i11 = org.telegram.ui.ActionBar.g6.uf;
                paint2.setColor(u(i11));
                paint.setColor(u(i11));
            }
            i(canvas, staticLayout, this.u, this.v, true, true, 0.0f);
        }
    }

    public final void Z(MessageObject messageObject, RichMessageLayout richMessageLayout, Canvas canvas) {
        r9 r9Var;
        Canvas canvas2;
        if (!this.z0 || richMessageLayout == null || (r9Var = this.W) == null || ((s1) r9Var).getMessageObject() == null || ((s1) this.W).getMessageObject().getId() != messageObject.getId()) {
            return;
        }
        boolean isOutOwner = messageObject.isOutOwner();
        Paint paint = this.p;
        Paint paint2 = this.o;
        if (isOutOwner) {
            int i10 = org.telegram.ui.ActionBar.g6.Vb;
            paint2.setColor(u(i10));
            paint.setColor(u(i10));
        } else {
            int i11 = org.telegram.ui.ActionBar.g6.uf;
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

    public final void a0(s1 s1Var, int i10, int i11) {
        if (s1Var == null) {
            return;
        }
        this.W = s1Var;
        this.w = s1Var.getMessageObject().getId();
        this.u = i10;
        this.v = i11;
        x();
        h7.j0 j0Var = this.D;
        if (j0Var != null) {
            j0Var.a(true);
        }
        this.g = 0.0f;
        this.f = 0.0f;
        this.e = false;
        v9 v9Var = this.C;
        if (v9Var != null) {
            v9Var.setVisibility(0);
        }
        V();
    }

    public final void b0(s1 s1Var) {
        ArrayList<MessageObject.TextLayoutBlock> arrayList;
        RichMessageLayout richMessageLayout;
        this.X = s1Var;
        MessageObject messageObject = s1Var.getMessageObject();
        r1 r1Var = s1Var.Vc;
        boolean z10 = this.w0;
        Rect rect = this.B;
        if (z10 && s1Var.getDescriptionlayout() != null) {
            int i10 = this.c;
            rect.set(i10, this.d, s1Var.getDescriptionlayout().getWidth() + i10, s1Var.getDescriptionlayout().getHeight() + this.d);
            return;
        }
        if (this.y0 && s1Var.getFactCheckLayout() != null) {
            int i11 = this.c;
            rect.set(i11, this.d, s1Var.getFactCheckLayout().getWidth() + i11, s1Var.getFactCheckLayout().getHeight() + this.d);
            return;
        }
        if (this.A0 && messageObject != null && (richMessageLayout = messageObject.richLayout) != null && !richMessageLayout.textBlocks.isEmpty()) {
            RichMessageLayout richMessageLayout2 = messageObject.richLayout;
            int i12 = this.c;
            rect.set(i12, this.d, richMessageLayout2.getMinWidth() + i12, richMessageLayout2.getHeight() + this.d);
        } else if (s1Var.O2() && s1Var.getCaptionLayout().textLayoutBlocks.size() > 0) {
            MessageObject.TextLayoutBlock textLayoutBlock = (MessageObject.TextLayoutBlock) i0.a.i(1, s1Var.getCaptionLayout().textLayoutBlocks);
            int i13 = this.c;
            rect.set(i13, this.d, textLayoutBlock.textLayout.getWidth() + i13, (int) (textLayoutBlock.textYOffset(s1Var.getCaptionLayout().textLayoutBlocks, r1Var) + this.d + textLayoutBlock.padTop + textLayoutBlock.textLayout.getHeight()));
        } else {
            if (messageObject == null || (arrayList = messageObject.textLayoutBlocks) == null || arrayList.size() <= 0) {
                this.X = null;
                return;
            }
            MessageObject.TextLayoutBlock textLayoutBlock2 = (MessageObject.TextLayoutBlock) i0.a.i(1, messageObject.textLayoutBlocks);
            int i14 = this.c;
            rect.set(i14, this.d, textLayoutBlock2.textLayout.getWidth() + i14, (int) (textLayoutBlock2.textYOffset(messageObject.textLayoutBlocks, r1Var) + this.d + textLayoutBlock2.padTop + textLayoutBlock2.textLayout.getHeight()));
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

    @Override // org.telegram.ui.Cells.w9
    public final void f(boolean z10) {
        super.f(z10);
        this.v0 = false;
        this.x0 = false;
        this.z0 = false;
    }

    @Override // org.telegram.ui.Cells.w9
    public final void j(int i10, m9 m9Var, boolean z10) {
        s1 s1Var = (s1) (z10 ? this.X : this.W);
        if (s1Var == null) {
            m9Var.b = null;
            return;
        }
        MessageObject messageObject = s1Var.getMessageObject();
        if (this.v0) {
            m9Var.b = s1Var.getDescriptionlayout();
            m9Var.c = 0.0f;
            m9Var.d = 0.0f;
            m9Var.a = 0;
            return;
        }
        if (this.x0) {
            m9Var.b = s1Var.getFactCheckLayout();
            m9Var.c = 0.0f;
            m9Var.d = 0.0f;
            m9Var.a = 0;
            return;
        }
        if (this.z0) {
            RichMessageLayout richMessageLayout = messageObject != null ? messageObject.richLayout : null;
            if (richMessageLayout == null || richMessageLayout.textBlocks.isEmpty()) {
                m9Var.b = null;
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
            m9Var.b = richMessageLayout.textBlocks.get(r4).getLayout();
            m9Var.c = r9.getY();
            m9Var.d = r9.getX();
            m9Var.a = richMessageLayout.textBlockCharOffsets.get(r4).intValue();
            return;
        }
        if (s1Var.O2()) {
            MessageObject.TextLayoutBlocks captionLayout = s1Var.getCaptionLayout();
            if (captionLayout.textLayoutBlocks.size() == 1) {
                m9Var.b = captionLayout.textLayoutBlocks.get(0).textLayout;
                m9Var.c = r9.padTop;
                MessageObject.TextLayoutBlock textLayoutBlock = captionLayout.textLayoutBlocks.get(0);
                float f10 = -(textLayoutBlock.isRtl() ? ((int) Math.ceil(captionLayout.textXOffset)) - (textLayoutBlock.quote ? AndroidUtilities.dp(10.0f) : 0) : 0);
                m9Var.d = f10;
                if (textLayoutBlock.code && !textLayoutBlock.quote) {
                    m9Var.d = f10 + AndroidUtilities.dp(8.0f);
                }
                m9Var.a = 0;
                return;
            }
            for (int i11 = 0; i11 < captionLayout.textLayoutBlocks.size(); i11++) {
                MessageObject.TextLayoutBlock textLayoutBlock2 = captionLayout.textLayoutBlocks.get(i11);
                int i12 = i10 - textLayoutBlock2.charactersOffset;
                if (i12 >= 0 && i12 <= textLayoutBlock2.textLayout.getText().length()) {
                    m9Var.b = textLayoutBlock2.textLayout;
                    m9Var.c = textLayoutBlock2.textYOffset(captionLayout.textLayoutBlocks) + textLayoutBlock2.padTop;
                    float f11 = -(textLayoutBlock2.isRtl() ? ((int) Math.ceil(captionLayout.textXOffset)) - (textLayoutBlock2.quote ? AndroidUtilities.dp(10.0f) : 0) : 0);
                    m9Var.d = f11;
                    if (textLayoutBlock2.code && !textLayoutBlock2.quote) {
                        m9Var.d = f11 + AndroidUtilities.dp(8.0f);
                    }
                    m9Var.a = textLayoutBlock2.charactersOffset;
                    return;
                }
            }
            m9Var.b = null;
            return;
        }
        ArrayList<MessageObject.TextLayoutBlock> arrayList = messageObject.textLayoutBlocks;
        if (arrayList == null) {
            m9Var.b = null;
            return;
        }
        if (arrayList.size() == 1) {
            m9Var.b = messageObject.textLayoutBlocks.get(0).textLayout;
            m9Var.c = r9.padTop;
            MessageObject.TextLayoutBlock textLayoutBlock3 = messageObject.textLayoutBlocks.get(0);
            float f12 = -(textLayoutBlock3.isRtl() ? ((int) Math.ceil(messageObject.textXOffset)) - (textLayoutBlock3.quote ? AndroidUtilities.dp(10.0f) : 0) : 0);
            m9Var.d = f12;
            if (textLayoutBlock3.code && !textLayoutBlock3.quote) {
                m9Var.d = f12 + AndroidUtilities.dp(8.0f);
            }
            m9Var.a = 0;
            return;
        }
        for (int i13 = 0; i13 < messageObject.textLayoutBlocks.size(); i13++) {
            MessageObject.TextLayoutBlock textLayoutBlock4 = messageObject.textLayoutBlocks.get(i13);
            int i14 = i10 - textLayoutBlock4.charactersOffset;
            if (i14 >= 0 && i14 <= textLayoutBlock4.textLayout.getText().length()) {
                m9Var.b = textLayoutBlock4.textLayout;
                m9Var.c = textLayoutBlock4.textYOffset(messageObject.textLayoutBlocks) + textLayoutBlock4.padTop;
                float f13 = -(textLayoutBlock4.isRtl() ? ((int) Math.ceil(messageObject.textXOffset)) - (textLayoutBlock4.quote ? AndroidUtilities.dp(10.0f) : 0) : 0);
                m9Var.d = f13;
                if (textLayoutBlock4.code && !textLayoutBlock4.quote) {
                    m9Var.d = f13 + AndroidUtilities.dp(8.0f);
                }
                m9Var.a = textLayoutBlock4.charactersOffset;
                return;
            }
        }
        m9Var.b = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    @Override // org.telegram.ui.Cells.w9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int l(int i10, int i11, int i12, int i13, r9 r9Var, boolean z10) {
        StaticLayout staticLayout;
        float textYOffset;
        int i14;
        float f10;
        float f11;
        StaticLayout staticLayout2;
        int i15;
        Layout layout;
        s1 s1Var = (s1) r9Var;
        if (s1Var == null) {
            return 0;
        }
        int i16 = i10 - i12;
        int i17 = i11 - i13;
        boolean z11 = z10 ? this.w0 : this.v0;
        boolean z12 = z10 ? this.y0 : this.x0;
        boolean z13 = z10 ? this.A0 : this.z0;
        if (z11) {
            staticLayout2 = s1Var.getDescriptionlayout();
        } else {
            if (!z12) {
                if (z13) {
                    RichMessageLayout richMessageLayout = s1Var.getMessageObject() != null ? s1Var.getMessageObject().richLayout : null;
                    if (richMessageLayout != null && !richMessageLayout.textBlocks.isEmpty()) {
                        u9 u9Var = (u9) i0.a.i(1, richMessageLayout.textBlocks);
                        Layout layout2 = u9Var.getLayout();
                        staticLayout = layout2 instanceof StaticLayout ? (StaticLayout) layout2 : null;
                        f10 = u9Var.getY();
                    }
                    return -1;
                }
                if (s1Var.O2()) {
                    MessageObject.TextLayoutBlock textLayoutBlock = s1Var.getCaptionLayout().textLayoutBlocks.get(s1Var.getCaptionLayout().textLayoutBlocks.size() - 1);
                    staticLayout = textLayoutBlock.textLayout;
                    textYOffset = textLayoutBlock.textYOffset(s1Var.getCaptionLayout().textLayoutBlocks);
                    i14 = textLayoutBlock.padTop;
                } else {
                    MessageObject.TextLayoutBlock textLayoutBlock2 = s1Var.getMessageObject().textLayoutBlocks.get(s1Var.getMessageObject().textLayoutBlocks.size() - 1);
                    staticLayout = textLayoutBlock2.textLayout;
                    textYOffset = textLayoutBlock2.textYOffset(s1Var.getMessageObject().textLayoutBlocks);
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
                    r1 r1Var = s1Var.Vc;
                    MessageObject messageObject = s1Var.getMessageObject();
                    m9 m9Var = this.a0;
                    if (!z10 ? this.v0 : this.w0) {
                        m9Var.b = s1Var.getDescriptionlayout();
                        m9Var.d = 0.0f;
                        m9Var.c = 0.0f;
                        m9Var.a = 0;
                    } else {
                        if (!z10 ? this.x0 : this.y0) {
                            if (!z10 ? !this.z0 : !this.A0) {
                                i15 = -1;
                                if (!s1Var.O2()) {
                                    int i18 = 0;
                                    while (true) {
                                        if (i18 >= messageObject.textLayoutBlocks.size()) {
                                            break;
                                        }
                                        MessageObject.TextLayoutBlock textLayoutBlock3 = messageObject.textLayoutBlocks.get(i18);
                                        float f12 = i17;
                                        if (f12 < textLayoutBlock3.textYOffset(messageObject.textLayoutBlocks) || f12 > textLayoutBlock3.textYOffset(messageObject.textLayoutBlocks) + textLayoutBlock3.padTop + textLayoutBlock3.height(r1Var)) {
                                            i18++;
                                        } else {
                                            m9Var.b = textLayoutBlock3.textLayout;
                                            m9Var.c = textLayoutBlock3.textYOffset(messageObject.textLayoutBlocks) + textLayoutBlock3.padTop;
                                            float f13 = -(textLayoutBlock3.isRtl() ? ((int) Math.ceil(messageObject.textXOffset)) - (textLayoutBlock3.quote ? AndroidUtilities.dp(10.0f) : textLayoutBlock3.code ? AndroidUtilities.dp(0.0f) : 0) : 0);
                                            m9Var.d = f13;
                                            if (textLayoutBlock3.code && !textLayoutBlock3.quote) {
                                                m9Var.d = f13 + AndroidUtilities.dp(8.0f);
                                            }
                                            m9Var.a = textLayoutBlock3.charactersOffset;
                                        }
                                    }
                                } else {
                                    MessageObject.TextLayoutBlocks captionLayout = s1Var.getCaptionLayout();
                                    int i19 = 0;
                                    while (true) {
                                        if (i19 >= captionLayout.textLayoutBlocks.size()) {
                                            break;
                                        }
                                        MessageObject.TextLayoutBlock textLayoutBlock4 = captionLayout.textLayoutBlocks.get(i19);
                                        float f14 = i17;
                                        if (f14 < textLayoutBlock4.textYOffset(captionLayout.textLayoutBlocks) || f14 > textLayoutBlock4.textYOffset(captionLayout.textLayoutBlocks) + textLayoutBlock4.padTop + textLayoutBlock4.height(r1Var)) {
                                            i19++;
                                        } else {
                                            m9Var.b = textLayoutBlock4.textLayout;
                                            m9Var.c = textLayoutBlock4.textYOffset(captionLayout.textLayoutBlocks) + textLayoutBlock4.padTop;
                                            float f15 = -(textLayoutBlock4.isRtl() ? ((int) Math.ceil(captionLayout.textXOffset)) - (textLayoutBlock4.quote ? AndroidUtilities.dp(10.0f) : 0) : 0);
                                            m9Var.d = f15;
                                            if (textLayoutBlock4.code && !textLayoutBlock4.quote) {
                                                m9Var.d = f15 + AndroidUtilities.dp(8.0f);
                                            }
                                            m9Var.a = textLayoutBlock4.charactersOffset;
                                        }
                                    }
                                }
                            } else {
                                RichMessageLayout richMessageLayout2 = messageObject != null ? messageObject.richLayout : null;
                                if (richMessageLayout2 == null || richMessageLayout2.textBlocks.isEmpty()) {
                                    i15 = -1;
                                    m9Var.b = null;
                                } else {
                                    int i20 = TLObject.FLAG_31;
                                    int i21 = -1;
                                    int i22 = -1;
                                    int i23 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                    for (int i24 = 0; i24 < richMessageLayout2.textBlocks.size(); i24++) {
                                        u9 u9Var2 = richMessageLayout2.textBlocks.get(i24);
                                        int y10 = u9Var2.getY();
                                        int height = u9Var2.getLayout().getHeight() + y10;
                                        int x8 = u9Var2.getX();
                                        int width = u9Var2.getLayout().getWidth() + x8;
                                        boolean z14 = i17 >= y10 && i17 < height;
                                        boolean z15 = i16 >= x8 && i16 < width;
                                        u9Var2.getLayout().getText();
                                        if (z14) {
                                            if (x8 <= i16 && x8 > i20) {
                                                i20 = x8;
                                                i21 = i24;
                                            }
                                            int min = z15 ? 0 : Math.min(Math.abs(i16 - x8), Math.abs(i16 - width));
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
                                            u9 u9Var3 = richMessageLayout2.textBlocks.get(i26);
                                            int y11 = u9Var3.getY();
                                            int min2 = Math.min(Math.abs(i17 - y11), Math.abs(i17 - (u9Var3.getLayout().getHeight() + y11)));
                                            if (min2 < i25) {
                                                i21 = i26;
                                                i25 = min2;
                                            }
                                        }
                                    }
                                    m9Var.b = richMessageLayout2.textBlocks.get(i21).getLayout();
                                    m9Var.c = r2.getY();
                                    m9Var.d = r2.getX();
                                    m9Var.a = richMessageLayout2.textBlockCharOffsets.get(i21).intValue();
                                }
                            }
                            layout = m9Var.b;
                            if (layout != null) {
                                return i15;
                            }
                            int i27 = (int) (i16 - m9Var.d);
                            int i28 = 0;
                            while (true) {
                                if (i28 >= layout.getLineCount()) {
                                    i28 = -1;
                                    break;
                                }
                                float f16 = i17;
                                if (f16 > m9Var.c + layout.getLineTop(i28) && f16 < m9Var.c + layout.getLineBottom(i28)) {
                                    break;
                                }
                                i28++;
                            }
                            if (i28 >= 0) {
                                return layout.getOffsetForHorizontal(i28, i27) + m9Var.a;
                            }
                            return i15;
                        }
                        m9Var.b = s1Var.getFactCheckLayout();
                        m9Var.d = 0.0f;
                        m9Var.c = 0.0f;
                        m9Var.a = 0;
                    }
                    i15 = -1;
                    layout = m9Var.b;
                    if (layout != null) {
                    }
                }
                return -1;
            }
            staticLayout2 = s1Var.getFactCheckLayout();
        }
        f11 = 0.0f;
        if (staticLayout2 != null) {
        }
        return -1;
    }

    @Override // org.telegram.ui.Cells.w9
    public final int n() {
        Layout layout;
        r9 r9Var = this.W;
        if (r9Var != null && ((s1) r9Var).getMessageObject() != null) {
            MessageObject messageObject = ((s1) this.W).getMessageObject();
            if (this.v0) {
                layout = ((s1) this.W).getDescriptionlayout();
            } else if (this.x0) {
                layout = ((s1) this.W).getFactCheckLayout();
            } else if (this.z0) {
                RichMessageLayout richMessageLayout = messageObject != null ? messageObject.richLayout : null;
                if (richMessageLayout != null && !richMessageLayout.textBlocks.isEmpty()) {
                    layout = richMessageLayout.textBlocks.get(0).getLayout();
                }
                layout = null;
            } else if (((s1) this.W).O2()) {
                layout = ((s1) this.W).getCaptionLayout().textLayoutBlocks.get(0).textLayout;
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

    @Override // org.telegram.ui.Cells.w9
    public final CharSequence t(r9 r9Var, boolean z10) {
        s1 s1Var = (s1) r9Var;
        if (s1Var == null || s1Var.getMessageObject() == null) {
            return null;
        }
        if (!z10 ? !this.v0 : !this.w0) {
            return s1Var.getDescriptionlayout().getText();
        }
        if (!z10 ? !this.x0 : !this.y0) {
            return s1Var.getFactCheckLayout().getText();
        }
        if (!z10 ? this.z0 : this.A0) {
            return s1Var.O2() ? s1Var.getCaptionLayout().text : s1Var.getMessageObject().messageText;
        }
        RichMessageLayout richMessageLayout = s1Var.getMessageObject().richLayout;
        return richMessageLayout != null ? richMessageLayout.joinedText : "";
    }

    @Override // org.telegram.ui.Cells.w9
    public void x() {
        super.x();
        r9 r9Var = this.W;
        if (r9Var != null && ((s1) r9Var).getCurrentMessagesGroup() != null) {
            this.F.invalidate();
        }
        r9 r9Var2 = this.W;
        if (r9Var2 != null) {
            if (this.x0 || this.y0) {
                ((s1) r9Var2).Z2();
            }
        }
    }
}
