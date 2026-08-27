package org.telegram.ui.Cells;

import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.CodeHighlighting;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Components.RadialProgress2;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class p1 extends AccessibilityNodeProvider {
    public final Path a = new Path();
    public final RectF b = new RectF();
    public final Rect c = new Rect();
    public final /* synthetic */ s1 d;

    public p1(s1 s1Var) {
        this.d = s1Var;
    }

    public final ClickableSpan a(int i10, boolean z10) {
        if (i10 == 5000) {
            return null;
        }
        s1 s1Var = this.d;
        if (z10) {
            int i11 = i10 - 3000;
            CharSequence charSequence = s1Var.u7.caption;
            if (!(charSequence instanceof Spannable) || i11 < 0) {
                return null;
            }
            Spannable spannable = (Spannable) charSequence;
            ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spannable.getSpans(0, spannable.length(), ClickableSpan.class);
            if (clickableSpanArr.length <= i11) {
                return null;
            }
            return clickableSpanArr[i11];
        }
        int i12 = i10 - 2000;
        CharSequence charSequence2 = s1Var.u7.messageText;
        if (!(charSequence2 instanceof Spannable) || i12 < 0) {
            return null;
        }
        Spannable spannable2 = (Spannable) charSequence2;
        ClickableSpan[] clickableSpanArr2 = (ClickableSpan[]) spannable2.getSpans(0, spannable2.length(), ClickableSpan.class);
        if (clickableSpanArr2.length <= i12) {
            return null;
        }
        return clickableSpanArr2[i12];
    }

    public final RichMessageLayout.RichBlock b(int i10, int[] iArr) {
        RichMessageLayout richMessageLayout;
        int i11;
        MessageObject messageObject = this.d.u7;
        if (messageObject == null || (richMessageLayout = messageObject.richLayout) == null || i10 - 6000 < 0) {
            return null;
        }
        int i12 = 0;
        for (int i13 = 0; i13 < richMessageLayout.blocks.size(); i13++) {
            RichMessageLayout.RichBlock richBlock = richMessageLayout.blocks.get(i13);
            if (richBlock.isVisible()) {
                int accessibilityElementCount = richBlock.getAccessibilityElementCount() + i12;
                if (i11 < accessibilityElementCount) {
                    iArr[0] = i11 - i12;
                    return richBlock;
                }
                i12 = accessibilityElementCount;
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:302:0x02df, code lost:
    
        if (r1 == 4) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:342:0x0443, code lost:
    
        if (r1 == 1) goto L182;
     */
    /* JADX WARN: Code restructure failed: missing block: B:440:0x037f, code lost:
    
        if (r1 != false) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:609:0x0f76, code lost:
    
        if (((android.graphics.Rect) r0.get(r33)).equals(r2) == false) goto L574;
     */
    /* JADX WARN: Code restructure failed: missing block: B:621:0x0fd3, code lost:
    
        if (((android.graphics.Rect) r0.get(r33)).equals(r2) == false) goto L587;
     */
    /* JADX WARN: Code restructure failed: missing block: B:640:0x106c, code lost:
    
        if (((android.graphics.Rect) r0.get(r33)).equals(r2) == false) goto L607;
     */
    /* JADX WARN: Code restructure failed: missing block: B:659:0x1106, code lost:
    
        if (((android.graphics.Rect) r0.get(r33)).equals(r2) == false) goto L629;
     */
    /* JADX WARN: Code restructure failed: missing block: B:675:0x119d, code lost:
    
        if (((android.graphics.Rect) r0.get(r33)).equals(r2) == false) goto L645;
     */
    /* JADX WARN: Code restructure failed: missing block: B:698:0x1246, code lost:
    
        if (((android.graphics.Rect) r0.get(r33)).equals(r2) == false) goto L666;
     */
    /* JADX WARN: Code restructure failed: missing block: B:718:0x12f0, code lost:
    
        if (((android.graphics.Rect) r0.get(r33)).equals(r2) == false) goto L696;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x089c, code lost:
    
        if (r1.isMusic() != false) goto L318;
     */
    /* JADX WARN: Code restructure failed: missing block: B:758:0x13d0, code lost:
    
        if (((android.graphics.Rect) r0.get(r33)).equals(r2) == false) goto L729;
     */
    /* JADX WARN: Incorrect condition in loop: B:747:0x1387 */
    /* JADX WARN: Removed duplicated region for block: B:102:0x094b A[LOOP:3: B:101:0x0949->B:102:0x094b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0965  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0974  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0981 A[LOOP:4: B:112:0x097f->B:113:0x0981, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x099b  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x09ac  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x09c1  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0a3c  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0a46  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0a52  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0a5d  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0aa2  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0ac4  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x08ac  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x07f6  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x077b  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x076e  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x03be  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x0420  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x045d  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x049c  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x05ab  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x078c  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x05cd  */
    /* JADX WARN: Removed duplicated region for block: B:381:0x0663  */
    /* JADX WARN: Removed duplicated region for block: B:382:0x0677  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x07b2  */
    /* JADX WARN: Removed duplicated region for block: B:405:0x0718  */
    /* JADX WARN: Removed duplicated region for block: B:408:0x0742 A[LOOP:11: B:407:0x0740->B:408:0x0742, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:411:0x0730  */
    /* JADX WARN: Removed duplicated region for block: B:431:0x0575  */
    /* JADX WARN: Removed duplicated region for block: B:432:0x046c  */
    /* JADX WARN: Removed duplicated region for block: B:437:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:447:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:473:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0821  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0837  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0855  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x088a  */
    /* JADX WARN: Removed duplicated region for block: B:714:0x12c6  */
    /* JADX WARN: Removed duplicated region for block: B:717:0x12e2  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x08b9  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x08c6  */
    @Override // android.view.accessibility.AccessibilityNodeProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i10) {
        ArrayList arrayList;
        ArrayList arrayList2;
        RectF rectF;
        SparseArray sparseArray;
        SparseArray sparseArray2;
        boolean z10;
        SparseArray sparseArray3;
        MessageObject messageObject;
        String str;
        int i11;
        MessageObject messageObject2;
        String formatShortNumber;
        Rect rect;
        SparseArray sparseArray4;
        SparseArray sparseArray5;
        SparseArray sparseArray6;
        MessageObject messageObject3;
        MessageObject messageObject4;
        StaticLayout[] staticLayoutArr;
        int i12;
        int i13;
        SparseArray sparseArray7;
        SparseArray sparseArray8;
        SparseArray sparseArray9;
        StaticLayout[] staticLayoutArr2;
        StaticLayout[] staticLayoutArr3;
        int i14;
        int i15;
        SparseArray sparseArray10;
        SparseArray sparseArray11;
        SparseArray sparseArray12;
        MessageObject messageObject5;
        SparseArray sparseArray13;
        SparseArray sparseArray14;
        SparseArray sparseArray15;
        ArrayList arrayList3;
        SparseArray sparseArray16;
        SparseArray sparseArray17;
        SparseArray sparseArray18;
        ArrayList arrayList4;
        ArrayList arrayList5;
        RectF rectF2;
        RectF rectF3;
        SparseArray sparseArray19;
        SparseArray sparseArray20;
        SparseArray sparseArray21;
        SparseArray sparseArray22;
        SparseArray sparseArray23;
        SparseArray sparseArray24;
        boolean z11;
        boolean z12;
        int i16;
        TLRPC.Poll poll;
        TLRPC.Poll poll2;
        boolean z13;
        String str2;
        int i17;
        SparseArray sparseArray25;
        SparseArray sparseArray26;
        MessageObject messageObject6;
        int i18;
        boolean z14;
        int dp;
        SparseArray sparseArray27;
        SparseArray sparseArray28;
        MessageObject messageObject7;
        MessageObject messageObject8;
        MessageObject messageObject9;
        boolean z15;
        MessageObject messageObject10;
        SparseArray sparseArray29;
        SparseArray sparseArray30;
        MessageObject messageObject11;
        MessageObject messageObject12;
        boolean z16;
        SparseArray sparseArray31;
        SparseArray sparseArray32;
        SparseArray sparseArray33;
        SparseArray sparseArray34;
        TLRPC.User user;
        TLRPC.User user2;
        int i19;
        SparseArray sparseArray35;
        SparseArray sparseArray36;
        MessageObject messageObject13;
        boolean z17;
        MessageObject messageObject14;
        boolean z18;
        MessageObject messageObject15;
        String str3;
        long j10;
        AccessibilityNodeInfo accessibilityNodeInfo;
        RectF rectF4;
        ArrayList arrayList6;
        ArrayList arrayList7;
        boolean z19;
        MessageObject messageObject16;
        MessageObject messageObject17;
        MessageObject messageObject18;
        Spanned spanned;
        int i20;
        String formatString;
        MessageObject messageObject19;
        MessageObject messageObject20;
        MessageObject messageObject21;
        MessageObject messageObject22;
        boolean z20;
        TLRPC.Poll poll3;
        MessageObject messageObject23;
        MessageObject messageObject24;
        MessageObject messageObject25;
        MessageObject messageObject26;
        MessageObject messageObject27;
        String str4;
        int i21;
        MessageObject messageObject28;
        MessageObject messageObject29;
        int i22;
        MessageObject messageObject30;
        MessageObject messageObject31;
        MessageObject messageObject32;
        MessageObject messageObject33;
        MessageObject messageObject34;
        MessageObject messageObject35;
        MessageObject messageObject36;
        boolean z21;
        MessageObject messageObject37;
        MessageObject messageObject38;
        MessageObject messageObject39;
        MessageObject messageObject40;
        MessageObject messageObject41;
        RadialProgress2 radialProgress2;
        MessageObject messageObject42;
        MessageObject messageObject43;
        String str5;
        int i23;
        MessageObject messageObject44;
        int i24;
        int i25;
        MessageObject messageObject45;
        TLRPC.Poll poll4;
        boolean z22;
        TLRPC.Poll poll5;
        TLRPC.Poll poll6;
        String string;
        TLRPC.Poll poll7;
        MessageObject messageObject46;
        MessageObject messageObject47;
        MessageObject messageObject48;
        int i26;
        StaticLayout staticLayout;
        MessageObject messageObject49;
        MessageObject messageObject50;
        long j11;
        int i27;
        int i28;
        MessageObject messageObject51;
        MessageObject messageObject52;
        int i29;
        StaticLayout[] staticLayoutArr4;
        StaticLayout[] staticLayoutArr5;
        StaticLayout[] staticLayoutArr6;
        TLRPC.User user3;
        MessageObject messageObject53;
        TLRPC.User user4;
        TLRPC.User user5;
        CharSequence adminAccessibilityText;
        boolean z23;
        boolean z24;
        AccessibilityNodeInfo accessibilityNodeInfo2;
        AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo;
        int iconForCurrentState;
        String string2;
        int miniIconForCurrentState;
        boolean z25;
        MessageObject messageObject54;
        MessageObject messageObject55;
        MediaController mediaController;
        MessageObject messageObject56;
        e1 e1Var;
        boolean z26;
        int size;
        int i30;
        boolean z27;
        int size2;
        int i31;
        boolean z28;
        boolean z29;
        int i32;
        MessageObject messageObject57;
        StaticLayout[] staticLayoutArr7;
        boolean z30;
        StaticLayout[] staticLayoutArr8;
        MessageObject messageObject58;
        MessageObject messageObject59;
        RectF rectF5;
        ArrayList arrayList8;
        ArrayList arrayList9;
        ArrayList arrayList10;
        boolean z31;
        boolean z32;
        boolean z33;
        RectF rectF6;
        RectF rectF7;
        RectF rectF8;
        MessageObject messageObject60;
        MessageObject messageObject61;
        MessageObject messageObject62;
        MessageObject messageObject63;
        MessageObject messageObject64;
        TLRPC.User user6;
        MessageObject messageObject65;
        MessageObject messageObject66;
        MessageObject messageObject67;
        MessageObject messageObject68;
        MessageObject messageObject69;
        boolean z34;
        boolean z35;
        long j12;
        MessageObject messageObject70;
        MessageObject messageObject71;
        MessageObject messageObject72;
        MessageObject messageObject73;
        MessageObject messageObject74;
        int[] iArr = {0, 0};
        s1 s1Var = this.d;
        RectF rectF9 = s1Var.u3;
        ArrayList arrayList11 = s1Var.U5;
        ArrayList arrayList12 = s1Var.k7;
        s1Var.getLocationOnScreen(iArr);
        if (i10 != -1) {
            AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain();
            obtain.setSource(s1Var, i10);
            obtain.setParent(s1Var);
            obtain.setPackageName(s1Var.getContext().getPackageName());
            Rect rect2 = this.c;
            if (i10 == 5000) {
                user = s1Var.Ub;
                if (user != null) {
                    user2 = s1Var.Ub;
                    obtain.setText(UserObject.getUserName(user2));
                    float f10 = s1Var.Sa;
                    int i33 = (int) f10;
                    int i34 = (int) s1Var.Ta;
                    i19 = s1Var.Qa;
                    rect2.set(i33, i34, (int) (f10 + i19), (int) (s1Var.Ta + (s1Var.Ga != null ? r10.getHeight() : 10)));
                    obtain.setBoundsInParent(rect2);
                    sparseArray35 = s1Var.ld;
                    if (sparseArray35.get(i10) == null) {
                        sparseArray36 = s1Var.ld;
                        sparseArray36.put(i10, new Rect(rect2));
                    }
                    rect2.offset(iArr[0], iArr[1]);
                    obtain.setBoundsInScreen(rect2);
                    obtain.setClassName("android.widget.TextView");
                    obtain.setEnabled(true);
                    obtain.setClickable(true);
                    obtain.setLongClickable(true);
                    obtain.addAction(16);
                    obtain.addAction(32);
                    z10 = true;
                }
                return null;
            }
            if (i10 >= 6000) {
                int[] iArr2 = {0};
                RichMessageLayout.RichBlock b10 = b(i10, iArr2);
                if (b10 != null) {
                    obtain.setText(b10.getAccessibilityElementText(iArr2[0]));
                    b10.getAccessibilityElementBounds(iArr2[0], rect2);
                    rect2.offset(s1Var.j0, s1Var.n0);
                    obtain.setBoundsInParent(rect2);
                    sparseArray33 = s1Var.ld;
                    if (sparseArray33.get(i10) == null) {
                        sparseArray34 = s1Var.ld;
                        sparseArray34.put(i10, new Rect(rect2));
                    }
                    rect2.offset(iArr[0], iArr[1]);
                    obtain.setBoundsInScreen(rect2);
                    boolean isAccessibilityElementCheckbox = b10.isAccessibilityElementCheckbox(iArr2[0]);
                    if (isAccessibilityElementCheckbox) {
                        obtain.setClassName("android.widget.CheckBox");
                    } else if (b10.isAccessibilityElementText(iArr2[0])) {
                        obtain.setClassName("android.widget.TextView");
                    } else {
                        obtain.setClassName("android.widget.ImageView");
                    }
                    obtain.setEnabled(true);
                    if (isAccessibilityElementCheckbox) {
                        obtain.setCheckable(true);
                        obtain.setChecked(b10.isAccessibilityElementChecked(iArr2[0]));
                    }
                    boolean isAccessibilityElementClickable = b10.isAccessibilityElementClickable(iArr2[0]);
                    obtain.setClickable(isAccessibilityElementClickable);
                    if (isAccessibilityElementClickable) {
                        obtain.addAction(16);
                    }
                    z10 = true;
                }
                return null;
            }
            RectF rectF10 = this.b;
            Path path = this.a;
            if (i10 >= 3000) {
                messageObject11 = s1Var.u7;
                if ((messageObject11.caption instanceof Spannable) && s1Var.Y3 != null) {
                    messageObject12 = s1Var.u7;
                    Spannable spannable = (Spannable) messageObject12.caption;
                    ClickableSpan a2 = a(i10, false);
                    if (a2 != null) {
                        int[] I2 = s1.I2(spannable, a2);
                        obtain.setText(spannable.subSequence(I2[0], I2[1]).toString());
                        ArrayList<MessageObject.TextLayoutBlock> arrayList13 = s1Var.Y3.textLayoutBlocks;
                        int size3 = arrayList13.size();
                        int i35 = 0;
                        while (true) {
                            if (i35 >= size3) {
                                z16 = true;
                                break;
                            }
                            MessageObject.TextLayoutBlock textLayoutBlock = arrayList13.get(i35);
                            i35++;
                            MessageObject.TextLayoutBlock textLayoutBlock2 = textLayoutBlock;
                            int length = textLayoutBlock2.textLayout.getText().length();
                            int i36 = textLayoutBlock2.charactersOffset;
                            int[] iArr3 = iArr;
                            int i37 = I2[0];
                            if (i36 <= i37) {
                                int i38 = length + i36;
                                int i39 = I2[1];
                                if (i38 >= i39) {
                                    textLayoutBlock2.textLayout.getSelectionPath(i37 - i36, i39 - i36, path);
                                    path.computeBounds(rectF10, true);
                                    rect2.set((int) rectF10.left, (int) rectF10.top, (int) rectF10.right, (int) rectF10.bottom);
                                    rect2.offset(0, (int) textLayoutBlock2.textYOffset(s1Var.Y3.textLayoutBlocks, s1Var.Vc));
                                    rect2.offset(s1Var.j0, s1Var.n0);
                                    obtain.setBoundsInParent(rect2);
                                    sparseArray31 = s1Var.ld;
                                    if (sparseArray31.get(i10) == null) {
                                        sparseArray32 = s1Var.ld;
                                        sparseArray32.put(i10, new Rect(rect2));
                                    }
                                    z16 = true;
                                    rect2.offset(iArr3[0], iArr3[1]);
                                    obtain.setBoundsInScreen(rect2);
                                }
                            }
                            iArr = iArr3;
                        }
                        obtain.setClassName("android.widget.TextView");
                        obtain.setEnabled(z16);
                        obtain.setClickable(z16);
                        obtain.setLongClickable(z16);
                        obtain.addAction(16);
                        obtain.addAction(32);
                        z10 = true;
                    }
                }
                return null;
            }
            if (i10 >= 2000) {
                messageObject7 = s1Var.u7;
                if (messageObject7.messageText instanceof Spannable) {
                    messageObject8 = s1Var.u7;
                    Spannable spannable2 = (Spannable) messageObject8.messageText;
                    ClickableSpan a3 = a(i10, false);
                    if (a3 != null) {
                        int[] I22 = s1.I2(spannable2, a3);
                        obtain.setText(spannable2.subSequence(I22[0], I22[1]).toString());
                        messageObject9 = s1Var.u7;
                        ArrayList<MessageObject.TextLayoutBlock> arrayList14 = messageObject9.textLayoutBlocks;
                        int size4 = arrayList14.size();
                        int i40 = 0;
                        while (true) {
                            if (i40 >= size4) {
                                z15 = true;
                                break;
                            }
                            MessageObject.TextLayoutBlock textLayoutBlock3 = arrayList14.get(i40);
                            i40++;
                            MessageObject.TextLayoutBlock textLayoutBlock4 = textLayoutBlock3;
                            int length2 = textLayoutBlock4.textLayout.getText().length();
                            int i41 = textLayoutBlock4.charactersOffset;
                            int i42 = I22[0];
                            if (i41 <= i42) {
                                int i43 = length2 + i41;
                                int i44 = I22[1];
                                if (i43 >= i44) {
                                    textLayoutBlock4.textLayout.getSelectionPath(i42 - i41, i44 - i41, path);
                                    path.computeBounds(rectF10, true);
                                    rect2.set((int) rectF10.left, (int) rectF10.top, (int) rectF10.right, (int) rectF10.bottom);
                                    messageObject10 = s1Var.u7;
                                    rect2.offset(0, (int) textLayoutBlock4.textYOffset(messageObject10.textLayoutBlocks, s1Var.Vc));
                                    rect2.offset(s1Var.j0, s1Var.n0);
                                    obtain.setBoundsInParent(rect2);
                                    sparseArray29 = s1Var.ld;
                                    if (sparseArray29.get(i10) == null) {
                                        sparseArray30 = s1Var.ld;
                                        sparseArray30.put(i10, new Rect(rect2));
                                    }
                                    z15 = true;
                                    rect2.offset(iArr[0], iArr[1]);
                                    obtain.setBoundsInScreen(rect2);
                                }
                            }
                        }
                        obtain.setClassName("android.widget.TextView");
                        obtain.setEnabled(z15);
                        obtain.setClickable(z15);
                        obtain.setLongClickable(z15);
                        obtain.addAction(16);
                        obtain.addAction(32);
                        z10 = true;
                    }
                }
                return null;
            }
            if (i10 >= 1000) {
                int i45 = i10 - 1000;
                if (i45 < arrayList12.size()) {
                    e0 e0Var = (e0) arrayList12.get(i45);
                    if (!e0Var.b) {
                        obtain.setText(e0Var.h.k());
                        obtain.setClassName("android.widget.Button");
                        obtain.setEnabled(true);
                        obtain.setClickable(true);
                        obtain.addAction(16);
                        float f11 = e0Var.c;
                        int i46 = s1Var.o7;
                        int i47 = e0Var.d;
                        rect2.set((int) (i46 * f11), i47, (int) ((f11 + e0Var.e) * i46), e0Var.f + i47);
                        messageObject6 = s1Var.u7;
                        if (messageObject6.isOutOwner()) {
                            dp = (s1Var.getMeasuredWidth() - s1Var.getWidthForButtons()) - AndroidUtilities.dp(10.0f);
                        } else {
                            i18 = s1Var.r8;
                            z14 = s1Var.g8;
                            dp = i18 + AndroidUtilities.dp(z14 ? 1.0f : 7.0f);
                        }
                        rect2.offset(dp, s1Var.I8);
                        obtain.setBoundsInParent(rect2);
                        sparseArray27 = s1Var.ld;
                        if (sparseArray27.get(i10) == null) {
                            sparseArray28 = s1Var.ld;
                            sparseArray28.put(i10, new Rect(rect2));
                        }
                        rect2.offset(iArr[0], iArr[1]);
                        obtain.setBoundsInScreen(rect2);
                        z10 = true;
                    }
                }
                return null;
            }
            if (i10 >= 500) {
                int i48 = i10 - 500;
                if (i48 < arrayList11.size()) {
                    q1 q1Var = (q1) arrayList11.get(i48);
                    StringBuilder sb2 = new StringBuilder(q1Var.p.getText());
                    z11 = s1Var.i6;
                    if (z11) {
                        z12 = q1Var.i;
                        obtain.setSelected(z12);
                        sb2.append(", ");
                        i16 = q1Var.d;
                        sb2.append(i16);
                        sb2.append("%");
                        poll = s1Var.K6;
                        if (poll != null) {
                            poll2 = s1Var.K6;
                            if (poll2.quiz) {
                                z13 = q1Var.i;
                                if (z13 || q1Var.l) {
                                    sb2.append(", ");
                                    if (q1Var.l) {
                                        str2 = "AccDescrQuizCorrectAnswer";
                                        i17 = R.string.AccDescrQuizCorrectAnswer;
                                    } else {
                                        str2 = "AccDescrQuizIncorrectAnswer";
                                        i17 = R.string.AccDescrQuizIncorrectAnswer;
                                    }
                                    sb2.append(LocaleController.getString(str2, i17));
                                }
                            }
                        }
                    } else {
                        obtain.setClassName("android.widget.Button");
                    }
                    obtain.setText(sb2);
                    obtain.setEnabled(true);
                    obtain.addAction(16);
                    int i49 = q1Var.b + s1Var.Hc;
                    int dp2 = s1Var.F8 - AndroidUtilities.dp(76.0f);
                    int i50 = q1Var.a;
                    rect2.set(i50, i49, dp2 + i50, q1Var.c + i49);
                    obtain.setBoundsInParent(rect2);
                    sparseArray25 = s1Var.ld;
                    if (sparseArray25.get(i10) == null) {
                        sparseArray26 = s1Var.ld;
                        sparseArray26.put(i10, new Rect(rect2));
                    }
                    rect2.offset(iArr[0], iArr[1]);
                    obtain.setBoundsInScreen(rect2);
                    obtain.setClickable(true);
                }
                return null;
            }
            if (i10 == 495) {
                obtain.setClassName("android.widget.Button");
                obtain.setEnabled(true);
                obtain.setText(LocaleController.getString(R.string.AccDescrQuizExplanation));
                obtain.addAction(16);
                rect2.set(s1Var.Q6 - AndroidUtilities.dp(8.0f), s1Var.R6 - AndroidUtilities.dp(8.0f), AndroidUtilities.dp(32.0f) + s1Var.Q6, AndroidUtilities.dp(32.0f) + s1Var.R6);
                obtain.setBoundsInParent(rect2);
                sparseArray22 = s1Var.ld;
                if (sparseArray22.get(i10) != null) {
                    sparseArray24 = s1Var.ld;
                }
                sparseArray23 = s1Var.ld;
                sparseArray23.put(i10, new Rect(rect2));
                rect2.offset(iArr[0], iArr[1]);
                obtain.setBoundsInScreen(rect2);
                obtain.setClickable(true);
            } else if (i10 == 499) {
                obtain.setClassName("android.widget.Button");
                obtain.setEnabled(true);
                StaticLayout staticLayout2 = s1Var.K2;
                if (staticLayout2 != null) {
                    obtain.setText(staticLayout2.getText());
                }
                obtain.addAction(16);
                rectF9.round(rect2);
                obtain.setBoundsInParent(rect2);
                sparseArray19 = s1Var.ld;
                if (sparseArray19.get(i10) != null) {
                    sparseArray21 = s1Var.ld;
                }
                sparseArray20 = s1Var.ld;
                sparseArray20.put(i10, new Rect(rect2));
                rect2.offset(iArr[0], iArr[1]);
                obtain.setBoundsInScreen(rect2);
                obtain.setClickable(true);
            } else if (i10 == 492) {
                obtain.setClassName("android.widget.Button");
                obtain.setEnabled(true);
                StaticLayout staticLayout3 = s1Var.F2;
                if (staticLayout3 != null) {
                    obtain.setText(staticLayout3.getText());
                }
                obtain.addAction(16);
                s1Var.U2.round(rect2);
                arrayList3 = s1Var.T2;
                if (arrayList3 != null) {
                    arrayList4 = s1Var.T2;
                    if (arrayList4.size() > 1) {
                        arrayList5 = s1Var.T2;
                        k1 k1Var = (k1) arrayList5.get(0);
                        rectF2 = k1Var.e;
                        if (!rectF2.isEmpty()) {
                            int i51 = rect2.left;
                            int i52 = rect2.top;
                            int i53 = rect2.right;
                            float f12 = rect2.bottom;
                            rectF3 = k1Var.e;
                            rect2.set(i51, i52, i53, (int) (f12 - rectF3.height()));
                        }
                    }
                }
                obtain.setBoundsInParent(rect2);
                sparseArray16 = s1Var.ld;
                if (sparseArray16.get(i10) != null) {
                    sparseArray18 = s1Var.ld;
                }
                sparseArray17 = s1Var.ld;
                sparseArray17.put(i10, new Rect(rect2));
                rect2.offset(iArr[0], iArr[1]);
                obtain.setBoundsInScreen(rect2);
                obtain.setClickable(true);
            } else if (i10 == 491 || i10 == 490 || i10 == 489) {
                int i54 = i10 == 491 ? 5 : i10 == 490 ? 31 : 30;
                for (int i55 = 0; i55 < arrayList.size(); i55++) {
                    arrayList2 = s1Var.T2;
                    k1 k1Var2 = (k1) arrayList2.get(i55);
                    if (k1Var2.a == i54) {
                        obtain.setClassName("android.widget.Button");
                        obtain.setEnabled(true);
                        StaticLayout staticLayout4 = k1Var2.d;
                        if (staticLayout4 != null) {
                            obtain.setText(staticLayout4.getText());
                        }
                        obtain.addAction(16);
                        rectF = k1Var2.e;
                        rectF.round(rect2);
                        obtain.setBoundsInParent(rect2);
                        sparseArray = s1Var.ld;
                        if (sparseArray.get(i10) != null) {
                            sparseArray3 = s1Var.ld;
                        }
                        sparseArray2 = s1Var.ld;
                        sparseArray2.put(i10, new Rect(rect2));
                        z10 = true;
                        rect2.offset(iArr[0], iArr[1]);
                        obtain.setBoundsInScreen(rect2);
                        obtain.setClickable(true);
                    }
                }
            } else if (i10 == 498) {
                obtain.setClassName("android.widget.ImageButton");
                obtain.setEnabled(true);
                messageObject5 = s1Var.u7;
                if (s1.S(s1Var, messageObject5)) {
                    obtain.setContentDescription(LocaleController.getString("AccDescrOpenChat", R.string.AccDescrOpenChat));
                } else {
                    obtain.setContentDescription(LocaleController.getString("ShareFile", R.string.ShareFile));
                }
                obtain.addAction(16);
                float f13 = s1Var.Ca;
                rect2.set((int) f13, (int) s1Var.Da, AndroidUtilities.dp(40.0f) + ((int) f13), AndroidUtilities.dp(32.0f) + ((int) s1Var.Da));
                obtain.setBoundsInParent(rect2);
                sparseArray13 = s1Var.ld;
                if (sparseArray13.get(i10) != null) {
                    sparseArray15 = s1Var.ld;
                }
                sparseArray14 = s1Var.ld;
                sparseArray14.put(i10, new Rect(rect2));
                rect2.offset(iArr[0], iArr[1]);
                obtain.setBoundsInScreen(rect2);
                obtain.setClickable(true);
            } else if (i10 == 497) {
                obtain.setEnabled(true);
                StringBuilder sb3 = new StringBuilder();
                sb3.append(LocaleController.getString("Reply", R.string.Reply));
                sb3.append(", ");
                StaticLayout staticLayout5 = s1Var.y9;
                if (staticLayout5 != null) {
                    sb3.append(staticLayout5.getText());
                    sb3.append(", ");
                }
                StaticLayout staticLayout6 = s1Var.z9;
                if (staticLayout6 != null) {
                    sb3.append(staticLayout6.getText());
                }
                obtain.setContentDescription(sb3.toString());
                obtain.addAction(16);
                int i56 = s1Var.C9;
                int i57 = s1Var.D9;
                i14 = s1Var.F9;
                i15 = s1Var.H9;
                rect2.set(i56, i57, Math.max(i14, i15) + i56, s1Var.D9 + ((int) s1Var.E9));
                obtain.setBoundsInParent(rect2);
                sparseArray10 = s1Var.ld;
                if (sparseArray10.get(i10) != null) {
                    sparseArray12 = s1Var.ld;
                }
                sparseArray11 = s1Var.ld;
                sparseArray11.put(i10, new Rect(rect2));
                rect2.offset(iArr[0], iArr[1]);
                obtain.setBoundsInScreen(rect2);
                obtain.setClickable(true);
            } else if (i10 == 494) {
                obtain.setEnabled(true);
                StringBuilder sb4 = new StringBuilder();
                staticLayoutArr = s1Var.bb;
                if (staticLayoutArr[0] != null) {
                    staticLayoutArr2 = s1Var.bb;
                    if (staticLayoutArr2[1] != null) {
                        int i58 = 0;
                        while (i58 < 2) {
                            staticLayoutArr3 = s1Var.bb;
                            sb4.append(staticLayoutArr3[i58].getText());
                            sb4.append(i58 == 0 ? " " : "\n");
                            i58++;
                        }
                    }
                }
                obtain.setContentDescription(sb4.toString());
                obtain.addAction(16);
                float f14 = s1Var.eb;
                float[] fArr = s1Var.hb;
                int min = (int) Math.min(f14 - fArr[0], f14 - fArr[1]);
                int i59 = s1Var.fb;
                i12 = s1Var.cb;
                int i60 = s1Var.fb;
                i13 = s1Var.gb;
                rect2.set(min, i59, i12 + min, i13 + i60);
                obtain.setBoundsInParent(rect2);
                sparseArray7 = s1Var.ld;
                if (sparseArray7.get(i10) != null) {
                    sparseArray9 = s1Var.ld;
                }
                sparseArray8 = s1Var.ld;
                sparseArray8.put(i10, new Rect(rect2));
                rect2.offset(iArr[0], iArr[1]);
                obtain.setBoundsInScreen(rect2);
                obtain.setClickable(true);
            } else if (i10 == 496) {
                obtain.setClassName("android.widget.Button");
                obtain.setEnabled(true);
                int repliesCount = s1Var.getRepliesCount();
                messageObject2 = s1Var.u7;
                if (messageObject2 != null) {
                    messageObject3 = s1Var.u7;
                    if (!messageObject3.shouldDrawWithoutBackground()) {
                        messageObject4 = s1Var.u7;
                        if (!messageObject4.isAnimatedEmoji()) {
                            formatShortNumber = s1Var.Y7 ? LocaleController.getString("ViewInChat", R.string.ViewInChat) : repliesCount == 0 ? LocaleController.getString("LeaveAComment", R.string.LeaveAComment) : LocaleController.formatPluralString("CommentsCount", repliesCount, new Object[0]);
                            if (formatShortNumber != null) {
                                obtain.setText(formatShortNumber);
                            }
                            obtain.addAction(16);
                            rect = s1Var.g9;
                            rect2.set(rect);
                            obtain.setBoundsInParent(rect2);
                            sparseArray4 = s1Var.ld;
                            if (sparseArray4.get(i10) != null) {
                                sparseArray6 = s1Var.ld;
                            }
                            sparseArray5 = s1Var.ld;
                            sparseArray5.put(i10, new Rect(rect2));
                            rect2.offset(iArr[0], iArr[1]);
                            obtain.setBoundsInScreen(rect2);
                            obtain.setClickable(true);
                        }
                    }
                }
                formatShortNumber = (s1Var.Y7 || repliesCount <= 0) ? null : LocaleController.formatShortNumber(repliesCount, null);
                if (formatShortNumber != null) {
                }
                obtain.addAction(16);
                rect = s1Var.g9;
                rect2.set(rect);
                obtain.setBoundsInParent(rect2);
                sparseArray4 = s1Var.ld;
                if (sparseArray4.get(i10) != null) {
                }
                sparseArray5 = s1Var.ld;
                sparseArray5.put(i10, new Rect(rect2));
                rect2.offset(iArr[0], iArr[1]);
                obtain.setBoundsInScreen(rect2);
                obtain.setClickable(true);
            } else if (i10 == 493) {
                obtain.setClassName("android.widget.Button");
                obtain.setEnabled(true);
                messageObject = s1Var.u7;
                if (messageObject.isVoiceTranscriptionOpen()) {
                    str = "AccActionCloseTranscription";
                    i11 = R.string.AccActionCloseTranscription;
                } else {
                    str = "AccActionOpenTranscription";
                    i11 = R.string.AccActionOpenTranscription;
                }
                obtain.setText(LocaleController.getString(str, i11));
                obtain.addAction(16);
                if (s1Var.I5 != null) {
                    float f15 = s1Var.J5;
                    rect2.set((int) f15, (int) s1Var.K5, (int) (f15 + r0.x()), (int) (s1Var.K5 + s1Var.I5.i()));
                }
                obtain.setBoundsInParent(rect2);
                rect2.offset(iArr[0], iArr[1]);
                obtain.setBoundsInScreen(rect2);
                obtain.setClickable(true);
            }
            z10 = true;
            obtain.setFocusable(z10);
            obtain.setVisibleToUser(z10);
            return obtain;
        }
        AccessibilityNodeInfo obtain2 = AccessibilityNodeInfo.obtain(s1Var);
        s1Var.onInitializeAccessibilityNodeInfo(obtain2);
        messageObject13 = s1Var.u7;
        if (messageObject13 != null) {
            messageObject72 = s1Var.u7;
            if (messageObject72.isOut()) {
                messageObject73 = s1Var.u7;
                if (!messageObject73.scheduled) {
                    messageObject74 = s1Var.u7;
                    if (messageObject74.isUnread()) {
                        z17 = true;
                        messageObject14 = s1Var.u7;
                        if (messageObject14 != null) {
                            messageObject71 = s1Var.u7;
                            if (messageObject71.isContentUnread()) {
                                z18 = true;
                                messageObject15 = s1Var.u7;
                                if (messageObject15 != null) {
                                    messageObject70 = s1Var.u7;
                                    str3 = " ";
                                    j10 = messageObject70.loadedFileSize;
                                } else {
                                    str3 = " ";
                                    j10 = 0;
                                }
                                if (s1Var.y3 != null) {
                                    z34 = s1Var.z3;
                                    if (z34 == z17) {
                                        z35 = s1Var.A3;
                                        if (z35 == z18) {
                                            j12 = s1Var.B3;
                                            if (j12 == j10) {
                                                accessibilityNodeInfo = obtain2;
                                                rectF4 = rectF9;
                                                arrayList6 = arrayList11;
                                                arrayList7 = arrayList12;
                                                if (Build.VERSION.SDK_INT >= 24) {
                                                    accessibilityNodeInfo2 = accessibilityNodeInfo;
                                                    accessibilityNodeInfo2.setContentDescription(s1Var.y3.toString());
                                                } else {
                                                    accessibilityNodeInfo2 = accessibilityNodeInfo;
                                                    accessibilityNodeInfo2.setText(s1Var.y3);
                                                }
                                                accessibilityNodeInfo2.setEnabled(true);
                                                collectionItemInfo = accessibilityNodeInfo2.getCollectionItemInfo();
                                                if (collectionItemInfo != null) {
                                                    accessibilityNodeInfo2.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(collectionItemInfo.getRowIndex(), 1, 0, 1, false));
                                                }
                                                accessibilityNodeInfo2.addAction(new AccessibilityNodeInfo.AccessibilityAction(R.id.acc_action_msg_options, LocaleController.getString("AccActionMessageOptions", R.string.AccActionMessageOptions)));
                                                iconForCurrentState = s1Var.getIconForCurrentState();
                                                if (iconForCurrentState != 0) {
                                                    string2 = LocaleController.getString("AccActionPlay", R.string.AccActionPlay);
                                                } else if (iconForCurrentState == 1) {
                                                    string2 = LocaleController.getString("AccActionPause", R.string.AccActionPause);
                                                } else if (iconForCurrentState == 2) {
                                                    string2 = LocaleController.getString("AccActionDownload", R.string.AccActionDownload);
                                                } else if (iconForCurrentState == 3) {
                                                    string2 = LocaleController.getString("AccActionCancelDownload", R.string.AccActionCancelDownload);
                                                } else if (iconForCurrentState != 5) {
                                                    messageObject69 = s1Var.u7;
                                                    string2 = messageObject69.type == 16 ? LocaleController.getString("CallAgain", R.string.CallAgain) : null;
                                                } else {
                                                    string2 = LocaleController.getString("AccActionOpenFile", R.string.AccActionOpenFile);
                                                }
                                                accessibilityNodeInfo2.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, string2));
                                                accessibilityNodeInfo2.addAction(new AccessibilityNodeInfo.AccessibilityAction(32, LocaleController.getString("AccActionEnterSelectionMode", R.string.AccActionEnterSelectionMode)));
                                                miniIconForCurrentState = s1Var.getMiniIconForCurrentState();
                                                if (miniIconForCurrentState == 2) {
                                                    accessibilityNodeInfo2.addAction(new AccessibilityNodeInfo.AccessibilityAction(R.id.acc_action_small_button, LocaleController.getString("AccActionDownload", R.string.AccActionDownload)));
                                                }
                                                z25 = s1Var.ua;
                                                if (!z25 || s1Var.da) {
                                                    accessibilityNodeInfo2.addAction(new AccessibilityNodeInfo.AccessibilityAction(R.id.acc_action_summarize, LocaleController.getString("SummaryTitle", R.string.SummaryTitle)));
                                                }
                                                messageObject54 = s1Var.u7;
                                                if (messageObject54.textLayoutBlocks != null) {
                                                    messageObject68 = s1Var.u7;
                                                    ArrayList<MessageObject.TextLayoutBlock> arrayList15 = messageObject68.textLayoutBlocks;
                                                    int size5 = arrayList15.size();
                                                    int i61 = 0;
                                                    while (true) {
                                                        if (i61 >= size5) {
                                                            break;
                                                        }
                                                        MessageObject.TextLayoutBlock textLayoutBlock5 = arrayList15.get(i61);
                                                        i61++;
                                                        if (textLayoutBlock5.hasCodeCopyButton) {
                                                            accessibilityNodeInfo2.addAction(new AccessibilityNodeInfo.AccessibilityAction(R.id.acc_action_copy_code, LocaleController.getString("CopyCode", R.string.CopyCode)));
                                                            break;
                                                        }
                                                    }
                                                }
                                                messageObject55 = s1Var.u7;
                                                if (!messageObject55.isVoice()) {
                                                    messageObject66 = s1Var.u7;
                                                    if (!messageObject66.isRoundVideo()) {
                                                        messageObject67 = s1Var.u7;
                                                    }
                                                }
                                                mediaController = MediaController.getInstance();
                                                messageObject56 = s1Var.u7;
                                                if (mediaController.isPlayingMessage(messageObject56)) {
                                                    e1Var = s1Var.E5;
                                                    e1Var.f(accessibilityNodeInfo2);
                                                }
                                                z26 = s1Var.H5;
                                                if (z26 && s1Var.I5 != null) {
                                                    accessibilityNodeInfo2.addChild(s1Var, 493);
                                                }
                                                if (Build.VERSION.SDK_INT < 24) {
                                                    if (s1Var.J7) {
                                                        user6 = s1Var.Ub;
                                                        if (user6 != null) {
                                                            messageObject65 = s1Var.u7;
                                                            if (!messageObject65.isOut()) {
                                                                accessibilityNodeInfo2.addChild(s1Var, 5000);
                                                            }
                                                        }
                                                    }
                                                    messageObject61 = s1Var.u7;
                                                    if (messageObject61.messageText instanceof Spannable) {
                                                        messageObject64 = s1Var.u7;
                                                        Spannable spannable3 = (Spannable) messageObject64.messageText;
                                                        int i62 = 0;
                                                        for (CharacterStyle characterStyle : (CharacterStyle[]) spannable3.getSpans(0, spannable3.length(), ClickableSpan.class)) {
                                                            accessibilityNodeInfo2.addChild(s1Var, i62 + 2000);
                                                            i62++;
                                                        }
                                                    }
                                                    messageObject62 = s1Var.u7;
                                                    if ((messageObject62.caption instanceof Spannable) && s1Var.Y3 != null) {
                                                        messageObject63 = s1Var.u7;
                                                        Spannable spannable4 = (Spannable) messageObject63.caption;
                                                        int i63 = 0;
                                                        for (CharacterStyle characterStyle2 : (CharacterStyle[]) spannable4.getSpans(0, spannable4.length(), ClickableSpan.class)) {
                                                            accessibilityNodeInfo2.addChild(s1Var, i63 + 3000);
                                                            i63++;
                                                        }
                                                    }
                                                }
                                                size = arrayList7.size();
                                                int i64 = 0;
                                                i30 = 0;
                                                while (i30 < size) {
                                                    Object obj = arrayList7.get(i30);
                                                    i30++;
                                                    accessibilityNodeInfo2.addChild(s1Var, i64 + MediaDataController.MAX_STYLE_RUNS_COUNT);
                                                    i64++;
                                                }
                                                z27 = s1Var.T6;
                                                if (z27 && s1Var.Q6 != -1) {
                                                    messageObject60 = s1Var.u7;
                                                    if (messageObject60.isPoll()) {
                                                        accessibilityNodeInfo2.addChild(s1Var, 495);
                                                    }
                                                }
                                                size2 = arrayList6.size();
                                                int i65 = 0;
                                                i31 = 0;
                                                while (i31 < size2) {
                                                    Object obj2 = arrayList6.get(i31);
                                                    i31++;
                                                    accessibilityNodeInfo2.addChild(s1Var, i65 + 500);
                                                    i65++;
                                                }
                                                z28 = s1Var.N2;
                                                if (z28 && !rectF4.isEmpty()) {
                                                    accessibilityNodeInfo2.addChild(s1Var, 499);
                                                }
                                                z29 = s1Var.O2;
                                                if (z29 && (rectF5 = s1Var.U2) != null && !rectF5.isEmpty()) {
                                                    accessibilityNodeInfo2.addChild(s1Var, 492);
                                                    arrayList8 = s1Var.T2;
                                                    if (arrayList8 != null) {
                                                        arrayList9 = s1Var.T2;
                                                        if (arrayList9.size() > 1) {
                                                            arrayList10 = s1Var.T2;
                                                            int size6 = arrayList10.size();
                                                            int i66 = 0;
                                                            while (i66 < size6) {
                                                                Object obj3 = arrayList10.get(i66);
                                                                i66++;
                                                                k1 k1Var3 = (k1) obj3;
                                                                z31 = s1Var.Q2;
                                                                if (z31 && k1Var3.a == 5) {
                                                                    rectF8 = k1Var3.e;
                                                                    if (!rectF8.isEmpty()) {
                                                                        accessibilityNodeInfo2.addChild(s1Var, 491);
                                                                    }
                                                                }
                                                                z32 = s1Var.R2;
                                                                if (z32 && k1Var3.a == 31) {
                                                                    rectF7 = k1Var3.e;
                                                                    if (!rectF7.isEmpty()) {
                                                                        accessibilityNodeInfo2.addChild(s1Var, 490);
                                                                    }
                                                                }
                                                                z33 = s1Var.P2;
                                                                if (z33 && k1Var3.a == 30) {
                                                                    rectF6 = k1Var3.e;
                                                                    if (!rectF6.isEmpty()) {
                                                                        accessibilityNodeInfo2.addChild(s1Var, 489);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                if (s1Var.V8 != null) {
                                                    accessibilityNodeInfo2.addChild(s1Var, 496);
                                                }
                                                i32 = s1Var.qa;
                                                if (i32 != 1 || i32 == 2) {
                                                    accessibilityNodeInfo2.addChild(s1Var, 498);
                                                }
                                                if (s1Var.y9 != null) {
                                                    accessibilityNodeInfo2.addChild(s1Var, 497);
                                                }
                                                messageObject57 = s1Var.u7;
                                                if (messageObject57 != null) {
                                                    messageObject58 = s1Var.u7;
                                                    if (messageObject58.richLayout != null) {
                                                        messageObject59 = s1Var.u7;
                                                        RichMessageLayout richMessageLayout = messageObject59.richLayout;
                                                        int i67 = 0;
                                                        for (int i68 = 0; i68 < richMessageLayout.blocks.size(); i68++) {
                                                            RichMessageLayout.RichBlock richBlock = richMessageLayout.blocks.get(i68);
                                                            if (richBlock.isVisible()) {
                                                                int accessibilityElementCount = richBlock.getAccessibilityElementCount();
                                                                for (int i69 = 0; i69 < accessibilityElementCount; i69++) {
                                                                    accessibilityNodeInfo2.addChild(s1Var, i67 + 6000 + i69);
                                                                }
                                                                i67 += accessibilityElementCount;
                                                            }
                                                        }
                                                    }
                                                }
                                                staticLayoutArr7 = s1Var.bb;
                                                if (staticLayoutArr7[0] != null) {
                                                    staticLayoutArr8 = s1Var.bb;
                                                    if (staticLayoutArr8[1] != null) {
                                                        accessibilityNodeInfo2.addAction(new AccessibilityNodeInfo.AccessibilityAction(R.id.acc_action_open_forwarded_origin, LocaleController.getString("AccActionOpenForwardedOrigin", R.string.AccActionOpenForwardedOrigin)));
                                                    }
                                                }
                                                z30 = s1Var.f1;
                                                if (z30 && s1Var.getBackground() == null) {
                                                    return accessibilityNodeInfo2;
                                                }
                                                accessibilityNodeInfo2.setSelected(true);
                                                return accessibilityNodeInfo2;
                                            }
                                        }
                                    }
                                }
                                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                                if (s1Var.J7) {
                                    user3 = s1Var.Ub;
                                    if (user3 != null) {
                                        messageObject53 = s1Var.u7;
                                        if (!messageObject53.isOut()) {
                                            user4 = s1Var.Ub;
                                            spannableStringBuilder.append((CharSequence) UserObject.getUserName(user4));
                                            rectF4 = rectF9;
                                            user5 = s1Var.Ub;
                                            arrayList6 = arrayList11;
                                            arrayList7 = arrayList12;
                                            spannableStringBuilder.setSpan(new o1(this, user5), 0, spannableStringBuilder.length(), 33);
                                            adminAccessibilityText = s1Var.getAdminAccessibilityText();
                                            if (TextUtils.isEmpty(adminAccessibilityText)) {
                                                accessibilityNodeInfo = obtain2;
                                            } else {
                                                z23 = s1Var.Ka;
                                                if (z23) {
                                                    SpannableStringBuilder append = spannableStringBuilder.append(' ');
                                                    z24 = s1Var.Ia;
                                                    accessibilityNodeInfo = obtain2;
                                                    append.append((CharSequence) LocaleController.formatString(z24 ? R.string.AccDescrWithAdminTag : R.string.AccDescrWithMemberTag, adminAccessibilityText));
                                                } else {
                                                    accessibilityNodeInfo = obtain2;
                                                    spannableStringBuilder.append((CharSequence) ", ").append(adminAccessibilityText);
                                                }
                                            }
                                            spannableStringBuilder.append('\n');
                                            z19 = s1Var.db;
                                            if (z19) {
                                                int i70 = 0;
                                                while (i70 < 2) {
                                                    staticLayoutArr4 = s1Var.bb;
                                                    if (staticLayoutArr4[i70] != null) {
                                                        staticLayoutArr5 = s1Var.bb;
                                                        if (staticLayoutArr5[i70].getText() != null) {
                                                            staticLayoutArr6 = s1Var.bb;
                                                            spannableStringBuilder.append(staticLayoutArr6[i70].getText());
                                                            spannableStringBuilder.append((CharSequence) (i70 == 0 ? str3 : "\n"));
                                                        }
                                                    }
                                                    i70++;
                                                }
                                            }
                                            if (s1Var.H1 != null) {
                                                i29 = s1Var.G1;
                                                if (i29 == 1) {
                                                    String attachFileName = FileLoader.getAttachFileName(s1Var.H1);
                                                    if (attachFileName.indexOf(46) != -1) {
                                                        spannableStringBuilder.append((CharSequence) LocaleController.formatString(R.string.AccDescrDocumentType, attachFileName.substring(attachFileName.lastIndexOf(46) + 1).toUpperCase(Locale.ROOT)));
                                                    }
                                                }
                                            }
                                            messageObject16 = s1Var.u7;
                                            if (messageObject16.richLayout != null) {
                                                messageObject51 = s1Var.u7;
                                                if (!messageObject51.richLayout.blocks.isEmpty()) {
                                                    messageObject52 = s1Var.u7;
                                                    ArrayList<RichMessageLayout.RichBlock> arrayList16 = messageObject52.richLayout.blocks;
                                                    int size7 = arrayList16.size();
                                                    int i71 = 0;
                                                    while (i71 < size7) {
                                                        RichMessageLayout.RichBlock richBlock2 = arrayList16.get(i71);
                                                        i71++;
                                                        RichMessageLayout.RichBlock richBlock3 = richBlock2;
                                                        if (richBlock3.isVisible()) {
                                                            int length3 = spannableStringBuilder.length();
                                                            ArrayList<RichMessageLayout.RichBlock> arrayList17 = arrayList16;
                                                            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                                                            richBlock3.appendAccessibilityText(spannableStringBuilder2);
                                                            int i72 = size7;
                                                            CharSequence accessibilityLabel = richBlock3.getAccessibilityLabel();
                                                            CharSequence accessibilityListMarker = richBlock3.getAccessibilityListMarker();
                                                            if (!TextUtils.isEmpty(accessibilityListMarker)) {
                                                                spannableStringBuilder.append(accessibilityListMarker);
                                                                if (!TextUtils.isEmpty(accessibilityLabel) || spannableStringBuilder2.length() > 0) {
                                                                    spannableStringBuilder.append(' ');
                                                                }
                                                            }
                                                            if (!TextUtils.isEmpty(accessibilityLabel)) {
                                                                spannableStringBuilder.append(accessibilityLabel);
                                                                if (spannableStringBuilder2.length() > 0) {
                                                                    spannableStringBuilder.append((CharSequence) ", ");
                                                                }
                                                            }
                                                            spannableStringBuilder.append((CharSequence) spannableStringBuilder2);
                                                            if (spannableStringBuilder.length() > length3 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) != '\n') {
                                                                spannableStringBuilder.append('\n');
                                                            }
                                                            arrayList16 = arrayList17;
                                                            size7 = i72;
                                                        }
                                                    }
                                                    if (s1Var.H1 != null) {
                                                        i26 = s1Var.G1;
                                                        if (i26 != 1) {
                                                            i27 = s1Var.G1;
                                                            if (i27 != 2) {
                                                                i28 = s1Var.G1;
                                                            }
                                                        }
                                                        if (s1Var.K4 == 1) {
                                                            staticLayout = s1Var.u4;
                                                            if (staticLayout != null) {
                                                                spannableStringBuilder.append((CharSequence) "\n");
                                                                messageObject49 = s1Var.u7;
                                                                boolean isSending = messageObject49.isSending();
                                                                String str6 = isSending ? "AccDescrUploadProgress" : "AccDescrDownloadProgress";
                                                                int i73 = isSending ? R.string.AccDescrUploadProgress : R.string.AccDescrDownloadProgress;
                                                                messageObject50 = s1Var.u7;
                                                                String formatFileSize = AndroidUtilities.formatFileSize(messageObject50.loadedFileSize);
                                                                j11 = s1Var.u1;
                                                                spannableStringBuilder.append((CharSequence) LocaleController.formatString(str6, i73, formatFileSize, AndroidUtilities.formatFileSize(j11)));
                                                            }
                                                        }
                                                    }
                                                    messageObject19 = s1Var.u7;
                                                    if (messageObject19.isMusic()) {
                                                        spannableStringBuilder.append((CharSequence) "\n");
                                                        int i74 = R.string.AccDescrMusicInfo;
                                                        messageObject46 = s1Var.u7;
                                                        String musicAuthor = messageObject46.getMusicAuthor();
                                                        messageObject47 = s1Var.u7;
                                                        spannableStringBuilder.append((CharSequence) LocaleController.formatString("AccDescrMusicInfo", i74, musicAuthor, messageObject47.getMusicTitle()));
                                                        spannableStringBuilder.append((CharSequence) ", ");
                                                        messageObject48 = s1Var.u7;
                                                        spannableStringBuilder.append((CharSequence) LocaleController.formatDuration((int) messageObject48.getDuration()));
                                                    } else {
                                                        messageObject20 = s1Var.u7;
                                                        if (!messageObject20.isVoice()) {
                                                            z20 = s1Var.md;
                                                        }
                                                        spannableStringBuilder.append((CharSequence) ", ");
                                                        messageObject21 = s1Var.u7;
                                                        spannableStringBuilder.append((CharSequence) LocaleController.formatDuration((int) messageObject21.getDuration()));
                                                        spannableStringBuilder.append((CharSequence) ", ");
                                                        messageObject22 = s1Var.u7;
                                                        if (messageObject22.isContentUnread()) {
                                                            spannableStringBuilder.append((CharSequence) LocaleController.getString("AccDescrMsgNotPlayed", R.string.AccDescrMsgNotPlayed));
                                                        } else {
                                                            spannableStringBuilder.append((CharSequence) LocaleController.getString("AccDescrMsgPlayed", R.string.AccDescrMsgPlayed));
                                                        }
                                                    }
                                                    poll3 = s1Var.K6;
                                                    if (poll3 != null) {
                                                        spannableStringBuilder.append((CharSequence) ", ");
                                                        poll4 = s1Var.K6;
                                                        spannableStringBuilder.append((CharSequence) poll4.question.text);
                                                        spannableStringBuilder.append((CharSequence) ", ");
                                                        z22 = s1Var.p6;
                                                        if (z22) {
                                                            string = LocaleController.getString("FinalResults", R.string.FinalResults);
                                                        } else {
                                                            poll5 = s1Var.K6;
                                                            if (poll5.quiz) {
                                                                poll7 = s1Var.K6;
                                                                string = poll7.public_voters ? LocaleController.getString("QuizPoll", R.string.QuizPoll) : LocaleController.getString("AnonymousQuizPoll", R.string.AnonymousQuizPoll);
                                                            } else {
                                                                poll6 = s1Var.K6;
                                                                string = poll6.public_voters ? LocaleController.getString("PublicPoll", R.string.PublicPoll) : LocaleController.getString("AnonymousPoll", R.string.AnonymousPoll);
                                                            }
                                                        }
                                                        spannableStringBuilder.append((CharSequence) string);
                                                    }
                                                    if (s1Var.H1 != null) {
                                                        i24 = s1Var.G1;
                                                        if (i24 == 4) {
                                                            spannableStringBuilder.append((CharSequence) ", ");
                                                            messageObject45 = s1Var.u7;
                                                            spannableStringBuilder.append((CharSequence) LocaleController.formatDuration((int) messageObject45.getDuration()));
                                                        }
                                                        if (s1Var.K4 != 0) {
                                                            i25 = s1Var.G1;
                                                        }
                                                        spannableStringBuilder.append((CharSequence) ", ");
                                                        spannableStringBuilder.append((CharSequence) AndroidUtilities.formatFileSize(s1Var.H1.size));
                                                    }
                                                    messageObject23 = s1Var.u7;
                                                    if (messageObject23.isVoiceTranscriptionOpen()) {
                                                        spannableStringBuilder.append((CharSequence) "\n");
                                                        messageObject44 = s1Var.u7;
                                                        spannableStringBuilder.append(messageObject44.getVoiceTranscription());
                                                    } else {
                                                        messageObject24 = s1Var.u7;
                                                        if (MessageObject.getMedia(messageObject24.messageOwner) != null) {
                                                            messageObject25 = s1Var.u7;
                                                            if (!TextUtils.isEmpty(messageObject25.caption)) {
                                                                spannableStringBuilder.append((CharSequence) "\n");
                                                                messageObject26 = s1Var.u7;
                                                                spannableStringBuilder.append(messageObject26.caption);
                                                            }
                                                        }
                                                    }
                                                    messageObject27 = s1Var.u7;
                                                    if (messageObject27.isOut()) {
                                                        messageObject39 = s1Var.u7;
                                                        if (messageObject39.isSent()) {
                                                            spannableStringBuilder.append((CharSequence) "\n");
                                                            messageObject42 = s1Var.u7;
                                                            if (messageObject42.scheduled) {
                                                                spannableStringBuilder.append((CharSequence) LocaleController.formatString("AccDescrScheduledDate", R.string.AccDescrScheduledDate, s1Var.pb));
                                                                str4 = str3;
                                                            } else {
                                                                int i75 = R.string.AccDescrSentDate;
                                                                StringBuilder sb5 = new StringBuilder();
                                                                sb5.append(LocaleController.getString("TodayAt", R.string.TodayAt));
                                                                str4 = str3;
                                                                sb5.append(str4);
                                                                sb5.append((Object) s1Var.pb);
                                                                spannableStringBuilder.append((CharSequence) LocaleController.formatString("AccDescrSentDate", i75, sb5.toString()));
                                                                spannableStringBuilder.append((CharSequence) ", ");
                                                                messageObject43 = s1Var.u7;
                                                                if (messageObject43.isUnread()) {
                                                                    str5 = "AccDescrMsgUnread";
                                                                    i23 = R.string.AccDescrMsgUnread;
                                                                } else {
                                                                    str5 = "AccDescrMsgRead";
                                                                    i23 = R.string.AccDescrMsgRead;
                                                                }
                                                                spannableStringBuilder.append((CharSequence) LocaleController.getString(str5, i23));
                                                            }
                                                        } else {
                                                            str4 = str3;
                                                            messageObject40 = s1Var.u7;
                                                            if (messageObject40.isSending()) {
                                                                spannableStringBuilder.append((CharSequence) "\n");
                                                                spannableStringBuilder.append((CharSequence) LocaleController.getString("AccDescrMsgSending", R.string.AccDescrMsgSending));
                                                                radialProgress2 = s1Var.K0;
                                                                float f16 = (radialProgress2.c ? radialProgress2.j : radialProgress2.i).w;
                                                                if (f16 > 0.0f) {
                                                                    spannableStringBuilder.append((CharSequence) Integer.toString(Math.round(f16 * 100.0f))).append((CharSequence) "%");
                                                                }
                                                            } else {
                                                                messageObject41 = s1Var.u7;
                                                                if (messageObject41.isSendError()) {
                                                                    spannableStringBuilder.append((CharSequence) "\n");
                                                                    spannableStringBuilder.append((CharSequence) LocaleController.getString("AccDescrMsgSendingError", R.string.AccDescrMsgSendingError));
                                                                }
                                                            }
                                                        }
                                                        i21 = 0;
                                                    } else {
                                                        str4 = str3;
                                                        spannableStringBuilder.append((CharSequence) "\n");
                                                        i21 = 0;
                                                        spannableStringBuilder.append((CharSequence) LocaleController.formatString("AccDescrReceivedDate", R.string.AccDescrReceivedDate, LocaleController.getString("TodayAt", R.string.TodayAt) + str4 + ((Object) s1Var.pb)));
                                                    }
                                                    if (s1Var.getRepliesCount() > 0 && !s1Var.P2()) {
                                                        spannableStringBuilder.append((CharSequence) "\n");
                                                        spannableStringBuilder.append((CharSequence) LocaleController.formatPluralString("AccDescrNumberOfReplies", s1Var.getRepliesCount(), new Object[i21]));
                                                    }
                                                    messageObject28 = s1Var.u7;
                                                    if (messageObject28.messageOwner.reactions != null) {
                                                        messageObject31 = s1Var.u7;
                                                        if (messageObject31.messageOwner.reactions.results != null) {
                                                            messageObject32 = s1Var.u7;
                                                            String str7 = "";
                                                            if (messageObject32.messageOwner.reactions.results.size() == 1) {
                                                                messageObject35 = s1Var.u7;
                                                                TLRPC.ReactionCount reactionCount = messageObject35.messageOwner.reactions.results.get(0);
                                                                TLRPC.Reaction reaction = reactionCount.reaction;
                                                                String str8 = reaction instanceof TLRPC.TL_reactionEmoji ? ((TLRPC.TL_reactionEmoji) reaction).emoticon : "";
                                                                int i76 = reactionCount.count;
                                                                if (i76 == 1) {
                                                                    spannableStringBuilder.append((CharSequence) "\n");
                                                                    messageObject36 = s1Var.u7;
                                                                    if (messageObject36.messageOwner.reactions.recent_reactions != null) {
                                                                        messageObject37 = s1Var.u7;
                                                                        if (messageObject37.messageOwner.reactions.recent_reactions.size() == 1) {
                                                                            messageObject38 = s1Var.u7;
                                                                            TLRPC.MessagePeerReaction messagePeerReaction = messageObject38.messageOwner.reactions.recent_reactions.get(0);
                                                                            if (messagePeerReaction != null) {
                                                                                TLRPC.User user7 = MessagesController.getInstance(s1Var.E7).getUser(Long.valueOf(MessageObject.getPeerId(messagePeerReaction.peer_id)));
                                                                                z21 = UserObject.isUserSelf(user7);
                                                                                if (user7 != null) {
                                                                                    str7 = UserObject.getFirstName(user7);
                                                                                }
                                                                                if (z21) {
                                                                                    spannableStringBuilder.append((CharSequence) LocaleController.formatString("AccDescrReactedWith", R.string.AccDescrReactedWith, str7, str8));
                                                                                } else {
                                                                                    spannableStringBuilder.append((CharSequence) LocaleController.formatString("AccDescrYouReactedWith", R.string.AccDescrYouReactedWith, str8));
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    z21 = false;
                                                                    if (z21) {
                                                                    }
                                                                } else if (i76 > 1) {
                                                                    spannableStringBuilder.append((CharSequence) "\n");
                                                                    spannableStringBuilder.append((CharSequence) LocaleController.formatPluralString("AccDescrNumberOfPeopleReactions", reactionCount.count, str8));
                                                                }
                                                            } else {
                                                                spannableStringBuilder.append((CharSequence) LocaleController.getString("Reactions", R.string.Reactions)).append((CharSequence) ": ");
                                                                messageObject33 = s1Var.u7;
                                                                int size8 = messageObject33.messageOwner.reactions.results.size();
                                                                int i77 = 0;
                                                                while (i77 < size8) {
                                                                    messageObject34 = s1Var.u7;
                                                                    TLRPC.ReactionCount reactionCount2 = messageObject34.messageOwner.reactions.results.get(i77);
                                                                    TLRPC.Reaction reaction2 = reactionCount2.reaction;
                                                                    int i78 = i77;
                                                                    spannableStringBuilder.append((CharSequence) (reaction2 instanceof TLRPC.TL_reactionEmoji ? ((TLRPC.TL_reactionEmoji) reaction2).emoticon : "")).append((CharSequence) str4).append((CharSequence) (reactionCount2.count + ""));
                                                                    i77 = i78 + 1;
                                                                    if (i77 < size8) {
                                                                        spannableStringBuilder.append((CharSequence) ", ");
                                                                    }
                                                                }
                                                                spannableStringBuilder.append((CharSequence) "\n");
                                                            }
                                                        }
                                                    }
                                                    messageObject29 = s1Var.u7;
                                                    if ((messageObject29.messageOwner.flags & 1024) != 0) {
                                                        spannableStringBuilder.append((CharSequence) "\n");
                                                        messageObject30 = s1Var.u7;
                                                        i22 = 0;
                                                        spannableStringBuilder.append((CharSequence) LocaleController.formatPluralString("AccDescrNumberOfViews", messageObject30.messageOwner.views, new Object[0]));
                                                    } else {
                                                        i22 = 0;
                                                    }
                                                    spannableStringBuilder.append((CharSequence) "\n");
                                                    for (CharacterStyle characterStyle3 : (CharacterStyle[]) spannableStringBuilder.getSpans(i22, spannableStringBuilder.length(), ClickableSpan.class)) {
                                                        int spanStart = spannableStringBuilder.getSpanStart(characterStyle3);
                                                        int spanEnd = spannableStringBuilder.getSpanEnd(characterStyle3);
                                                        spannableStringBuilder.removeSpan(characterStyle3);
                                                        spannableStringBuilder.setSpan(new i(2, this, characterStyle3), spanStart, spanEnd, 33);
                                                    }
                                                    s1Var.y3 = spannableStringBuilder;
                                                    s1Var.z3 = z17;
                                                    s1Var.A3 = z18;
                                                    s1Var.B3 = j10;
                                                    if (Build.VERSION.SDK_INT >= 24) {
                                                    }
                                                    accessibilityNodeInfo2.setEnabled(true);
                                                    collectionItemInfo = accessibilityNodeInfo2.getCollectionItemInfo();
                                                    if (collectionItemInfo != null) {
                                                    }
                                                    accessibilityNodeInfo2.addAction(new AccessibilityNodeInfo.AccessibilityAction(R.id.acc_action_msg_options, LocaleController.getString("AccActionMessageOptions", R.string.AccActionMessageOptions)));
                                                    iconForCurrentState = s1Var.getIconForCurrentState();
                                                    if (iconForCurrentState != 0) {
                                                    }
                                                    accessibilityNodeInfo2.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, string2));
                                                    accessibilityNodeInfo2.addAction(new AccessibilityNodeInfo.AccessibilityAction(32, LocaleController.getString("AccActionEnterSelectionMode", R.string.AccActionEnterSelectionMode)));
                                                    miniIconForCurrentState = s1Var.getMiniIconForCurrentState();
                                                    if (miniIconForCurrentState == 2) {
                                                    }
                                                    z25 = s1Var.ua;
                                                    if (!z25) {
                                                    }
                                                    accessibilityNodeInfo2.addAction(new AccessibilityNodeInfo.AccessibilityAction(R.id.acc_action_summarize, LocaleController.getString("SummaryTitle", R.string.SummaryTitle)));
                                                    messageObject54 = s1Var.u7;
                                                    if (messageObject54.textLayoutBlocks != null) {
                                                    }
                                                    messageObject55 = s1Var.u7;
                                                    if (!messageObject55.isVoice()) {
                                                    }
                                                    mediaController = MediaController.getInstance();
                                                    messageObject56 = s1Var.u7;
                                                    if (mediaController.isPlayingMessage(messageObject56)) {
                                                    }
                                                    z26 = s1Var.H5;
                                                    if (z26) {
                                                        accessibilityNodeInfo2.addChild(s1Var, 493);
                                                    }
                                                    if (Build.VERSION.SDK_INT < 24) {
                                                    }
                                                    size = arrayList7.size();
                                                    int i642 = 0;
                                                    i30 = 0;
                                                    while (i30 < size) {
                                                    }
                                                    z27 = s1Var.T6;
                                                    if (z27) {
                                                        messageObject60 = s1Var.u7;
                                                        if (messageObject60.isPoll()) {
                                                        }
                                                    }
                                                    size2 = arrayList6.size();
                                                    int i652 = 0;
                                                    i31 = 0;
                                                    while (i31 < size2) {
                                                    }
                                                    z28 = s1Var.N2;
                                                    if (z28) {
                                                        accessibilityNodeInfo2.addChild(s1Var, 499);
                                                    }
                                                    z29 = s1Var.O2;
                                                    if (z29) {
                                                        accessibilityNodeInfo2.addChild(s1Var, 492);
                                                        arrayList8 = s1Var.T2;
                                                        if (arrayList8 != null) {
                                                        }
                                                    }
                                                    if (s1Var.V8 != null) {
                                                    }
                                                    i32 = s1Var.qa;
                                                    if (i32 != 1) {
                                                    }
                                                    accessibilityNodeInfo2.addChild(s1Var, 498);
                                                    if (s1Var.y9 != null) {
                                                    }
                                                    messageObject57 = s1Var.u7;
                                                    if (messageObject57 != null) {
                                                    }
                                                    staticLayoutArr7 = s1Var.bb;
                                                    if (staticLayoutArr7[0] != null) {
                                                    }
                                                    z30 = s1Var.f1;
                                                    if (z30) {
                                                    }
                                                    accessibilityNodeInfo2.setSelected(true);
                                                    return accessibilityNodeInfo2;
                                                }
                                            }
                                            messageObject17 = s1Var.u7;
                                            if (!TextUtils.isEmpty(messageObject17.messageText)) {
                                                messageObject18 = s1Var.u7;
                                                CharSequence charSequence = messageObject18.messageText;
                                                if (charSequence instanceof Spanned) {
                                                    Spanned spanned2 = (Spanned) charSequence;
                                                    CodeHighlighting.Span[] spanArr = (CodeHighlighting.Span[]) spanned2.getSpans(0, spanned2.length(), CodeHighlighting.Span.class);
                                                    if (spanArr != null && spanArr.length > 0) {
                                                        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(charSequence);
                                                        Arrays.sort(spanArr, new n1(spanned2, 0));
                                                        int length4 = spanArr.length;
                                                        int i79 = 0;
                                                        while (i79 < length4) {
                                                            int i80 = length4;
                                                            CodeHighlighting.Span span = spanArr[i79];
                                                            CodeHighlighting.Span[] spanArr2 = spanArr;
                                                            int spanStart2 = spanned2.getSpanStart(span);
                                                            if (spanStart2 < 0) {
                                                                spanned = spanned2;
                                                                i20 = i79;
                                                            } else {
                                                                spanned = spanned2;
                                                                if (TextUtils.isEmpty(span.lng)) {
                                                                    formatString = LocaleController.getString(R.string.AccDescrCodeBlock);
                                                                    i20 = i79;
                                                                } else {
                                                                    i20 = i79;
                                                                    formatString = LocaleController.formatString(R.string.AccDescrCodeBlockLanguage, MessageObject.TextLayoutBlock.capitalizeLanguage(span.lng));
                                                                }
                                                                spannableStringBuilder3.insert(spanStart2, (CharSequence) (((Object) formatString) + ". "));
                                                            }
                                                            i79 = i20 + 1;
                                                            length4 = i80;
                                                            spanArr = spanArr2;
                                                            spanned2 = spanned;
                                                        }
                                                        charSequence = spannableStringBuilder3;
                                                    }
                                                }
                                                spannableStringBuilder.append(charSequence);
                                            }
                                            if (s1Var.H1 != null) {
                                            }
                                            messageObject19 = s1Var.u7;
                                            if (messageObject19.isMusic()) {
                                            }
                                            poll3 = s1Var.K6;
                                            if (poll3 != null) {
                                            }
                                            if (s1Var.H1 != null) {
                                            }
                                            messageObject23 = s1Var.u7;
                                            if (messageObject23.isVoiceTranscriptionOpen()) {
                                            }
                                            messageObject27 = s1Var.u7;
                                            if (messageObject27.isOut()) {
                                            }
                                            if (s1Var.getRepliesCount() > 0) {
                                                spannableStringBuilder.append((CharSequence) "\n");
                                                spannableStringBuilder.append((CharSequence) LocaleController.formatPluralString("AccDescrNumberOfReplies", s1Var.getRepliesCount(), new Object[i21]));
                                            }
                                            messageObject28 = s1Var.u7;
                                            if (messageObject28.messageOwner.reactions != null) {
                                            }
                                            messageObject29 = s1Var.u7;
                                            if ((messageObject29.messageOwner.flags & 1024) != 0) {
                                            }
                                            spannableStringBuilder.append((CharSequence) "\n");
                                            while (r5 < r2) {
                                            }
                                            s1Var.y3 = spannableStringBuilder;
                                            s1Var.z3 = z17;
                                            s1Var.A3 = z18;
                                            s1Var.B3 = j10;
                                            if (Build.VERSION.SDK_INT >= 24) {
                                            }
                                            accessibilityNodeInfo2.setEnabled(true);
                                            collectionItemInfo = accessibilityNodeInfo2.getCollectionItemInfo();
                                            if (collectionItemInfo != null) {
                                            }
                                            accessibilityNodeInfo2.addAction(new AccessibilityNodeInfo.AccessibilityAction(R.id.acc_action_msg_options, LocaleController.getString("AccActionMessageOptions", R.string.AccActionMessageOptions)));
                                            iconForCurrentState = s1Var.getIconForCurrentState();
                                            if (iconForCurrentState != 0) {
                                            }
                                            accessibilityNodeInfo2.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, string2));
                                            accessibilityNodeInfo2.addAction(new AccessibilityNodeInfo.AccessibilityAction(32, LocaleController.getString("AccActionEnterSelectionMode", R.string.AccActionEnterSelectionMode)));
                                            miniIconForCurrentState = s1Var.getMiniIconForCurrentState();
                                            if (miniIconForCurrentState == 2) {
                                            }
                                            z25 = s1Var.ua;
                                            if (!z25) {
                                            }
                                            accessibilityNodeInfo2.addAction(new AccessibilityNodeInfo.AccessibilityAction(R.id.acc_action_summarize, LocaleController.getString("SummaryTitle", R.string.SummaryTitle)));
                                            messageObject54 = s1Var.u7;
                                            if (messageObject54.textLayoutBlocks != null) {
                                            }
                                            messageObject55 = s1Var.u7;
                                            if (!messageObject55.isVoice()) {
                                            }
                                            mediaController = MediaController.getInstance();
                                            messageObject56 = s1Var.u7;
                                            if (mediaController.isPlayingMessage(messageObject56)) {
                                            }
                                            z26 = s1Var.H5;
                                            if (z26) {
                                            }
                                            if (Build.VERSION.SDK_INT < 24) {
                                            }
                                            size = arrayList7.size();
                                            int i6422 = 0;
                                            i30 = 0;
                                            while (i30 < size) {
                                            }
                                            z27 = s1Var.T6;
                                            if (z27) {
                                            }
                                            size2 = arrayList6.size();
                                            int i6522 = 0;
                                            i31 = 0;
                                            while (i31 < size2) {
                                            }
                                            z28 = s1Var.N2;
                                            if (z28) {
                                            }
                                            z29 = s1Var.O2;
                                            if (z29) {
                                            }
                                            if (s1Var.V8 != null) {
                                            }
                                            i32 = s1Var.qa;
                                            if (i32 != 1) {
                                            }
                                            accessibilityNodeInfo2.addChild(s1Var, 498);
                                            if (s1Var.y9 != null) {
                                            }
                                            messageObject57 = s1Var.u7;
                                            if (messageObject57 != null) {
                                            }
                                            staticLayoutArr7 = s1Var.bb;
                                            if (staticLayoutArr7[0] != null) {
                                            }
                                            z30 = s1Var.f1;
                                            if (z30) {
                                            }
                                            accessibilityNodeInfo2.setSelected(true);
                                            return accessibilityNodeInfo2;
                                        }
                                    }
                                }
                                accessibilityNodeInfo = obtain2;
                                rectF4 = rectF9;
                                arrayList6 = arrayList11;
                                arrayList7 = arrayList12;
                                z19 = s1Var.db;
                                if (z19) {
                                }
                                if (s1Var.H1 != null) {
                                }
                                messageObject16 = s1Var.u7;
                                if (messageObject16.richLayout != null) {
                                }
                                messageObject17 = s1Var.u7;
                                if (!TextUtils.isEmpty(messageObject17.messageText)) {
                                }
                                if (s1Var.H1 != null) {
                                }
                                messageObject19 = s1Var.u7;
                                if (messageObject19.isMusic()) {
                                }
                                poll3 = s1Var.K6;
                                if (poll3 != null) {
                                }
                                if (s1Var.H1 != null) {
                                }
                                messageObject23 = s1Var.u7;
                                if (messageObject23.isVoiceTranscriptionOpen()) {
                                }
                                messageObject27 = s1Var.u7;
                                if (messageObject27.isOut()) {
                                }
                                if (s1Var.getRepliesCount() > 0) {
                                }
                                messageObject28 = s1Var.u7;
                                if (messageObject28.messageOwner.reactions != null) {
                                }
                                messageObject29 = s1Var.u7;
                                if ((messageObject29.messageOwner.flags & 1024) != 0) {
                                }
                                spannableStringBuilder.append((CharSequence) "\n");
                                while (r5 < r2) {
                                }
                                s1Var.y3 = spannableStringBuilder;
                                s1Var.z3 = z17;
                                s1Var.A3 = z18;
                                s1Var.B3 = j10;
                                if (Build.VERSION.SDK_INT >= 24) {
                                }
                                accessibilityNodeInfo2.setEnabled(true);
                                collectionItemInfo = accessibilityNodeInfo2.getCollectionItemInfo();
                                if (collectionItemInfo != null) {
                                }
                                accessibilityNodeInfo2.addAction(new AccessibilityNodeInfo.AccessibilityAction(R.id.acc_action_msg_options, LocaleController.getString("AccActionMessageOptions", R.string.AccActionMessageOptions)));
                                iconForCurrentState = s1Var.getIconForCurrentState();
                                if (iconForCurrentState != 0) {
                                }
                                accessibilityNodeInfo2.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, string2));
                                accessibilityNodeInfo2.addAction(new AccessibilityNodeInfo.AccessibilityAction(32, LocaleController.getString("AccActionEnterSelectionMode", R.string.AccActionEnterSelectionMode)));
                                miniIconForCurrentState = s1Var.getMiniIconForCurrentState();
                                if (miniIconForCurrentState == 2) {
                                }
                                z25 = s1Var.ua;
                                if (!z25) {
                                }
                                accessibilityNodeInfo2.addAction(new AccessibilityNodeInfo.AccessibilityAction(R.id.acc_action_summarize, LocaleController.getString("SummaryTitle", R.string.SummaryTitle)));
                                messageObject54 = s1Var.u7;
                                if (messageObject54.textLayoutBlocks != null) {
                                }
                                messageObject55 = s1Var.u7;
                                if (!messageObject55.isVoice()) {
                                }
                                mediaController = MediaController.getInstance();
                                messageObject56 = s1Var.u7;
                                if (mediaController.isPlayingMessage(messageObject56)) {
                                }
                                z26 = s1Var.H5;
                                if (z26) {
                                }
                                if (Build.VERSION.SDK_INT < 24) {
                                }
                                size = arrayList7.size();
                                int i64222 = 0;
                                i30 = 0;
                                while (i30 < size) {
                                }
                                z27 = s1Var.T6;
                                if (z27) {
                                }
                                size2 = arrayList6.size();
                                int i65222 = 0;
                                i31 = 0;
                                while (i31 < size2) {
                                }
                                z28 = s1Var.N2;
                                if (z28) {
                                }
                                z29 = s1Var.O2;
                                if (z29) {
                                }
                                if (s1Var.V8 != null) {
                                }
                                i32 = s1Var.qa;
                                if (i32 != 1) {
                                }
                                accessibilityNodeInfo2.addChild(s1Var, 498);
                                if (s1Var.y9 != null) {
                                }
                                messageObject57 = s1Var.u7;
                                if (messageObject57 != null) {
                                }
                                staticLayoutArr7 = s1Var.bb;
                                if (staticLayoutArr7[0] != null) {
                                }
                                z30 = s1Var.f1;
                                if (z30) {
                                }
                                accessibilityNodeInfo2.setSelected(true);
                                return accessibilityNodeInfo2;
                            }
                        }
                        z18 = false;
                        messageObject15 = s1Var.u7;
                        if (messageObject15 != null) {
                        }
                        if (s1Var.y3 != null) {
                        }
                        SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder();
                        if (s1Var.J7) {
                        }
                        accessibilityNodeInfo = obtain2;
                        rectF4 = rectF9;
                        arrayList6 = arrayList11;
                        arrayList7 = arrayList12;
                        z19 = s1Var.db;
                        if (z19) {
                        }
                        if (s1Var.H1 != null) {
                        }
                        messageObject16 = s1Var.u7;
                        if (messageObject16.richLayout != null) {
                        }
                        messageObject17 = s1Var.u7;
                        if (!TextUtils.isEmpty(messageObject17.messageText)) {
                        }
                        if (s1Var.H1 != null) {
                        }
                        messageObject19 = s1Var.u7;
                        if (messageObject19.isMusic()) {
                        }
                        poll3 = s1Var.K6;
                        if (poll3 != null) {
                        }
                        if (s1Var.H1 != null) {
                        }
                        messageObject23 = s1Var.u7;
                        if (messageObject23.isVoiceTranscriptionOpen()) {
                        }
                        messageObject27 = s1Var.u7;
                        if (messageObject27.isOut()) {
                        }
                        if (s1Var.getRepliesCount() > 0) {
                        }
                        messageObject28 = s1Var.u7;
                        if (messageObject28.messageOwner.reactions != null) {
                        }
                        messageObject29 = s1Var.u7;
                        if ((messageObject29.messageOwner.flags & 1024) != 0) {
                        }
                        spannableStringBuilder4.append((CharSequence) "\n");
                        while (r5 < r2) {
                        }
                        s1Var.y3 = spannableStringBuilder4;
                        s1Var.z3 = z17;
                        s1Var.A3 = z18;
                        s1Var.B3 = j10;
                        if (Build.VERSION.SDK_INT >= 24) {
                        }
                        accessibilityNodeInfo2.setEnabled(true);
                        collectionItemInfo = accessibilityNodeInfo2.getCollectionItemInfo();
                        if (collectionItemInfo != null) {
                        }
                        accessibilityNodeInfo2.addAction(new AccessibilityNodeInfo.AccessibilityAction(R.id.acc_action_msg_options, LocaleController.getString("AccActionMessageOptions", R.string.AccActionMessageOptions)));
                        iconForCurrentState = s1Var.getIconForCurrentState();
                        if (iconForCurrentState != 0) {
                        }
                        accessibilityNodeInfo2.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, string2));
                        accessibilityNodeInfo2.addAction(new AccessibilityNodeInfo.AccessibilityAction(32, LocaleController.getString("AccActionEnterSelectionMode", R.string.AccActionEnterSelectionMode)));
                        miniIconForCurrentState = s1Var.getMiniIconForCurrentState();
                        if (miniIconForCurrentState == 2) {
                        }
                        z25 = s1Var.ua;
                        if (!z25) {
                        }
                        accessibilityNodeInfo2.addAction(new AccessibilityNodeInfo.AccessibilityAction(R.id.acc_action_summarize, LocaleController.getString("SummaryTitle", R.string.SummaryTitle)));
                        messageObject54 = s1Var.u7;
                        if (messageObject54.textLayoutBlocks != null) {
                        }
                        messageObject55 = s1Var.u7;
                        if (!messageObject55.isVoice()) {
                        }
                        mediaController = MediaController.getInstance();
                        messageObject56 = s1Var.u7;
                        if (mediaController.isPlayingMessage(messageObject56)) {
                        }
                        z26 = s1Var.H5;
                        if (z26) {
                        }
                        if (Build.VERSION.SDK_INT < 24) {
                        }
                        size = arrayList7.size();
                        int i642222 = 0;
                        i30 = 0;
                        while (i30 < size) {
                        }
                        z27 = s1Var.T6;
                        if (z27) {
                        }
                        size2 = arrayList6.size();
                        int i652222 = 0;
                        i31 = 0;
                        while (i31 < size2) {
                        }
                        z28 = s1Var.N2;
                        if (z28) {
                        }
                        z29 = s1Var.O2;
                        if (z29) {
                        }
                        if (s1Var.V8 != null) {
                        }
                        i32 = s1Var.qa;
                        if (i32 != 1) {
                        }
                        accessibilityNodeInfo2.addChild(s1Var, 498);
                        if (s1Var.y9 != null) {
                        }
                        messageObject57 = s1Var.u7;
                        if (messageObject57 != null) {
                        }
                        staticLayoutArr7 = s1Var.bb;
                        if (staticLayoutArr7[0] != null) {
                        }
                        z30 = s1Var.f1;
                        if (z30) {
                        }
                        accessibilityNodeInfo2.setSelected(true);
                        return accessibilityNodeInfo2;
                    }
                }
            }
        }
        z17 = false;
        messageObject14 = s1Var.u7;
        if (messageObject14 != null) {
        }
        z18 = false;
        messageObject15 = s1Var.u7;
        if (messageObject15 != null) {
        }
        if (s1Var.y3 != null) {
        }
        SpannableStringBuilder spannableStringBuilder42 = new SpannableStringBuilder();
        if (s1Var.J7) {
        }
        accessibilityNodeInfo = obtain2;
        rectF4 = rectF9;
        arrayList6 = arrayList11;
        arrayList7 = arrayList12;
        z19 = s1Var.db;
        if (z19) {
        }
        if (s1Var.H1 != null) {
        }
        messageObject16 = s1Var.u7;
        if (messageObject16.richLayout != null) {
        }
        messageObject17 = s1Var.u7;
        if (!TextUtils.isEmpty(messageObject17.messageText)) {
        }
        if (s1Var.H1 != null) {
        }
        messageObject19 = s1Var.u7;
        if (messageObject19.isMusic()) {
        }
        poll3 = s1Var.K6;
        if (poll3 != null) {
        }
        if (s1Var.H1 != null) {
        }
        messageObject23 = s1Var.u7;
        if (messageObject23.isVoiceTranscriptionOpen()) {
        }
        messageObject27 = s1Var.u7;
        if (messageObject27.isOut()) {
        }
        if (s1Var.getRepliesCount() > 0) {
        }
        messageObject28 = s1Var.u7;
        if (messageObject28.messageOwner.reactions != null) {
        }
        messageObject29 = s1Var.u7;
        if ((messageObject29.messageOwner.flags & 1024) != 0) {
        }
        spannableStringBuilder42.append((CharSequence) "\n");
        while (r5 < r2) {
        }
        s1Var.y3 = spannableStringBuilder42;
        s1Var.z3 = z17;
        s1Var.A3 = z18;
        s1Var.B3 = j10;
        if (Build.VERSION.SDK_INT >= 24) {
        }
        accessibilityNodeInfo2.setEnabled(true);
        collectionItemInfo = accessibilityNodeInfo2.getCollectionItemInfo();
        if (collectionItemInfo != null) {
        }
        accessibilityNodeInfo2.addAction(new AccessibilityNodeInfo.AccessibilityAction(R.id.acc_action_msg_options, LocaleController.getString("AccActionMessageOptions", R.string.AccActionMessageOptions)));
        iconForCurrentState = s1Var.getIconForCurrentState();
        if (iconForCurrentState != 0) {
        }
        accessibilityNodeInfo2.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, string2));
        accessibilityNodeInfo2.addAction(new AccessibilityNodeInfo.AccessibilityAction(32, LocaleController.getString("AccActionEnterSelectionMode", R.string.AccActionEnterSelectionMode)));
        miniIconForCurrentState = s1Var.getMiniIconForCurrentState();
        if (miniIconForCurrentState == 2) {
        }
        z25 = s1Var.ua;
        if (!z25) {
        }
        accessibilityNodeInfo2.addAction(new AccessibilityNodeInfo.AccessibilityAction(R.id.acc_action_summarize, LocaleController.getString("SummaryTitle", R.string.SummaryTitle)));
        messageObject54 = s1Var.u7;
        if (messageObject54.textLayoutBlocks != null) {
        }
        messageObject55 = s1Var.u7;
        if (!messageObject55.isVoice()) {
        }
        mediaController = MediaController.getInstance();
        messageObject56 = s1Var.u7;
        if (mediaController.isPlayingMessage(messageObject56)) {
        }
        z26 = s1Var.H5;
        if (z26) {
        }
        if (Build.VERSION.SDK_INT < 24) {
        }
        size = arrayList7.size();
        int i6422222 = 0;
        i30 = 0;
        while (i30 < size) {
        }
        z27 = s1Var.T6;
        if (z27) {
        }
        size2 = arrayList6.size();
        int i6522222 = 0;
        i31 = 0;
        while (i31 < size2) {
        }
        z28 = s1Var.N2;
        if (z28) {
        }
        z29 = s1Var.O2;
        if (z29) {
        }
        if (s1Var.V8 != null) {
        }
        i32 = s1Var.qa;
        if (i32 != 1) {
        }
        accessibilityNodeInfo2.addChild(s1Var, 498);
        if (s1Var.y9 != null) {
        }
        messageObject57 = s1Var.u7;
        if (messageObject57 != null) {
        }
        staticLayoutArr7 = s1Var.bb;
        if (staticLayoutArr7[0] != null) {
        }
        z30 = s1Var.f1;
        if (z30) {
        }
        accessibilityNodeInfo2.setSelected(true);
        return accessibilityNodeInfo2;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final boolean performAction(int i10, int i11, Bundle bundle) {
        j1 j1Var;
        h1 h1Var;
        TLRPC.Message message;
        TLRPC.MessageReplyHeader messageReplyHeader;
        s1 s1Var = this.d;
        ArrayList arrayList = s1Var.U5;
        ArrayList arrayList2 = s1Var.k7;
        if (i10 == -1) {
            s1Var.performAccessibilityAction(i11, bundle);
            return true;
        }
        if (i11 == 64) {
            s1Var.H3(i10, 32768, null);
            return true;
        }
        if (i11 == 16) {
            if (i10 == 5000) {
                j1 j1Var2 = s1Var.Fc;
                if (j1Var2 != null) {
                    j1Var2.v0(s1Var, s1Var.Ub, 0.0f, 0.0f);
                    return true;
                }
            } else if (i10 >= 6000) {
                int[] iArr = {0};
                RichMessageLayout.RichBlock b10 = b(i10, iArr);
                if (b10 != null && b10.onAccessibilityElementClick(iArr[0], s1Var)) {
                    s1Var.H3(i10, 1, null);
                    AndroidUtilities.makeAccessibilityAnnouncement(b10.getAccessibilityElementStateDescription(iArr[0]));
                    return true;
                }
            } else if (i10 >= 3000) {
                ClickableSpan a2 = a(i10, true);
                if (a2 != null) {
                    s1Var.Fc.R0(s1Var, a2, false);
                    s1Var.H3(i10, 1, null);
                    return true;
                }
            } else {
                if (i10 < 2000) {
                    if (i10 >= 1000) {
                        int i12 = i10 - 1000;
                        if (i12 < arrayList2.size()) {
                            e0 e0Var = (e0) arrayList2.get(i12);
                            j1 j1Var3 = s1Var.Fc;
                            if (j1Var3 != null && !e0Var.m) {
                                BotInlineKeyboard.ButtonCustom buttonCustom = e0Var.j;
                                if (buttonCustom != null) {
                                    j1Var3.L(s1Var, buttonCustom);
                                } else {
                                    TL_keyboard.KeyboardInlineButton keyboardInlineButton = e0Var.i;
                                    if (keyboardInlineButton != null) {
                                        j1Var3.e1(s1Var, keyboardInlineButton);
                                    }
                                }
                            }
                            s1Var.H3(i10, 1, null);
                            return true;
                        }
                    } else if (i10 >= 500) {
                        int i13 = i10 - 500;
                        if (i13 < arrayList.size()) {
                            q1 q1Var = (q1) arrayList.get(i13);
                            if (s1Var.Fc != null) {
                                ArrayList arrayList3 = new ArrayList();
                                arrayList3.add(q1Var.s);
                                s1Var.Fc.j(s1Var, arrayList3, -1, 0, 0);
                            }
                            s1Var.H3(i10, 1, null);
                            return true;
                        }
                    } else {
                        if (i10 == 495) {
                            s1Var.w1();
                            return true;
                        }
                        if (i10 == 499) {
                            j1 j1Var4 = s1Var.Fc;
                            if (j1Var4 != null) {
                                j1Var4.O0(s1Var.X2, s1Var);
                                return true;
                            }
                        } else if (i10 == 492) {
                            j1 j1Var5 = s1Var.Fc;
                            if (j1Var5 != null) {
                                j1Var5.O0(5, s1Var);
                                return true;
                            }
                        } else if (i10 == 491) {
                            j1 j1Var6 = s1Var.Fc;
                            if (j1Var6 != null) {
                                j1Var6.O0(5, s1Var);
                                return true;
                            }
                        } else if (i10 == 490) {
                            j1 j1Var7 = s1Var.Fc;
                            if (j1Var7 != null) {
                                j1Var7.O0(31, s1Var);
                                return true;
                            }
                        } else if (i10 == 489) {
                            j1 j1Var8 = s1Var.Fc;
                            if (j1Var8 != null) {
                                j1Var8.O0(30, s1Var);
                                return true;
                            }
                        } else if (i10 == 498) {
                            j1 j1Var9 = s1Var.Fc;
                            if (j1Var9 != null) {
                                j1Var9.t(s1Var);
                                return true;
                            }
                        } else if (i10 == 497) {
                            if (s1Var.Fc != null && ((!s1Var.S7 || s1Var.Q7 || s1Var.u7.getReplyTopMsgId() != 0) && (s1Var.u7.hasValidReplyMessageObject() || s1Var.u9 || ((message = s1Var.u7.messageOwner) != null && (messageReplyHeader = message.reply_to) != null && messageReplyHeader.reply_from != null)))) {
                                s1Var.Fc.R1(s1Var, s1Var.u7.getReplyMsgId(), 0.0f, 0.0f, false);
                                return true;
                            }
                        } else if (i10 == 494) {
                            j1 j1Var10 = s1Var.Fc;
                            if (j1Var10 != null) {
                                TLRPC.Chat chat = s1Var.fc;
                                if (chat != null) {
                                    j1Var10.Y(s1Var, chat, s1Var.u7.messageOwner.fwd_from.channel_post, s1Var.c1, s1Var.d1, false);
                                    return true;
                                }
                                TLRPC.User user = s1Var.dc;
                                if (user != null) {
                                    j1Var10.v0(s1Var, user, s1Var.c1, s1Var.d1);
                                    return true;
                                }
                                if (s1Var.gc != null) {
                                    j1Var10.p(s1Var);
                                    return true;
                                }
                            }
                        } else if (i10 == 496) {
                            j1 j1Var11 = s1Var.Fc;
                            if (j1Var11 != null) {
                                if (s1Var.Y7) {
                                    j1Var11.t(s1Var);
                                    return true;
                                }
                                j1Var11.x(s1Var);
                                return true;
                            }
                        } else if (i10 == 493 && (h1Var = s1Var.I5) != null) {
                            h1Var.m();
                            return true;
                        }
                    }
                    return false;
                }
                ClickableSpan a3 = a(i10, false);
                if (a3 != null) {
                    s1Var.Fc.R0(s1Var, a3, false);
                    s1Var.H3(i10, 1, null);
                    return true;
                }
            }
        } else if (i11 == 32) {
            ClickableSpan a10 = a(i10, i10 >= 3000);
            if (a10 != null && (j1Var = s1Var.Fc) != null) {
                j1Var.R0(s1Var, a10, true);
                s1Var.H3(i10, 2, null);
            }
        }
        return true;
    }
}
