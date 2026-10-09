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

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class r1 extends AccessibilityNodeProvider {
    public final Path a = new Path();
    public final RectF b = new RectF();
    public final Rect c = new Rect();
    public final /* synthetic */ u1 d;

    public r1(u1 u1Var) {
        this.d = u1Var;
    }

    public final ClickableSpan a(int i10, boolean z10) {
        if (i10 == 5000) {
            return null;
        }
        u1 u1Var = this.d;
        if (z10) {
            int i11 = i10 - 3000;
            CharSequence charSequence = u1Var.y7.caption;
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
        CharSequence charSequence2 = u1Var.y7.messageText;
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
        MessageObject messageObject = this.d.y7;
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
    /* JADX WARN: Code restructure failed: missing block: B:614:0x0f7f, code lost:
    
        if (((android.graphics.Rect) r0.get(r33)).equals(r2) == false) goto L579;
     */
    /* JADX WARN: Code restructure failed: missing block: B:626:0x0fdb, code lost:
    
        if (((android.graphics.Rect) r0.get(r33)).equals(r2) == false) goto L592;
     */
    /* JADX WARN: Code restructure failed: missing block: B:645:0x1074, code lost:
    
        if (((android.graphics.Rect) r0.get(r33)).equals(r2) == false) goto L612;
     */
    /* JADX WARN: Code restructure failed: missing block: B:664:0x110e, code lost:
    
        if (((android.graphics.Rect) r0.get(r33)).equals(r2) == false) goto L634;
     */
    /* JADX WARN: Code restructure failed: missing block: B:680:0x11a5, code lost:
    
        if (((android.graphics.Rect) r0.get(r33)).equals(r2) == false) goto L650;
     */
    /* JADX WARN: Code restructure failed: missing block: B:703:0x124e, code lost:
    
        if (((android.graphics.Rect) r0.get(r33)).equals(r2) == false) goto L671;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x089b, code lost:
    
        if (r1.isMusic() != false) goto L318;
     */
    /* JADX WARN: Code restructure failed: missing block: B:723:0x12f8, code lost:
    
        if (((android.graphics.Rect) r0.get(r33)).equals(r2) == false) goto L701;
     */
    /* JADX WARN: Code restructure failed: missing block: B:763:0x13d9, code lost:
    
        if (((android.graphics.Rect) r0.get(r33)).equals(r2) == false) goto L735;
     */
    /* JADX WARN: Incorrect condition in loop: B:752:0x1390 */
    /* JADX WARN: Removed duplicated region for block: B:102:0x094a A[LOOP:3: B:101:0x0948->B:102:0x094a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0964  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0973  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0980 A[LOOP:4: B:112:0x097e->B:113:0x0980, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x099a  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x09ab  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x09c0  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0a3d  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0a47  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0a53  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0a5e  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0aa3  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0ac5  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x08ab  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x07f5  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x077a  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x076d  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x03be  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x0420  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x045d  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x049c  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x05aa  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x078b  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x05cc  */
    /* JADX WARN: Removed duplicated region for block: B:381:0x0662  */
    /* JADX WARN: Removed duplicated region for block: B:382:0x0676  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x07b1  */
    /* JADX WARN: Removed duplicated region for block: B:405:0x0717  */
    /* JADX WARN: Removed duplicated region for block: B:408:0x0741 A[LOOP:11: B:407:0x073f->B:408:0x0741, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:411:0x072f  */
    /* JADX WARN: Removed duplicated region for block: B:431:0x0574  */
    /* JADX WARN: Removed duplicated region for block: B:432:0x046c  */
    /* JADX WARN: Removed duplicated region for block: B:437:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:447:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:473:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0820  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0836  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0854  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0889  */
    /* JADX WARN: Removed duplicated region for block: B:719:0x12ce  */
    /* JADX WARN: Removed duplicated region for block: B:722:0x12ea  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x08b8  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x08c5  */
    @Override // android.view.accessibility.AccessibilityNodeProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i10) {
        boolean z10;
        int i11;
        ArrayList arrayList;
        ArrayList arrayList2;
        RectF rectF;
        SparseArray sparseArray;
        SparseArray sparseArray2;
        boolean z11;
        SparseArray sparseArray3;
        MessageObject messageObject;
        String str;
        int i12;
        MessageObject messageObject2;
        String formatShortNumber;
        Rect rect;
        SparseArray sparseArray4;
        SparseArray sparseArray5;
        SparseArray sparseArray6;
        MessageObject messageObject3;
        MessageObject messageObject4;
        StaticLayout[] staticLayoutArr;
        int i13;
        int i14;
        SparseArray sparseArray7;
        SparseArray sparseArray8;
        SparseArray sparseArray9;
        StaticLayout[] staticLayoutArr2;
        StaticLayout[] staticLayoutArr3;
        int i15;
        int i16;
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
        boolean z12;
        boolean z13;
        int i17;
        TLRPC.Poll poll;
        TLRPC.Poll poll2;
        boolean z14;
        String str2;
        int i18;
        SparseArray sparseArray25;
        SparseArray sparseArray26;
        MessageObject messageObject6;
        int i19;
        boolean z15;
        int dp;
        SparseArray sparseArray27;
        SparseArray sparseArray28;
        MessageObject messageObject7;
        MessageObject messageObject8;
        MessageObject messageObject9;
        boolean z16;
        MessageObject messageObject10;
        SparseArray sparseArray29;
        SparseArray sparseArray30;
        MessageObject messageObject11;
        MessageObject messageObject12;
        boolean z17;
        SparseArray sparseArray31;
        SparseArray sparseArray32;
        SparseArray sparseArray33;
        SparseArray sparseArray34;
        TLRPC.User user;
        TLRPC.User user2;
        int i20;
        SparseArray sparseArray35;
        SparseArray sparseArray36;
        MessageObject messageObject13;
        boolean z18;
        MessageObject messageObject14;
        boolean z19;
        MessageObject messageObject15;
        String str3;
        long j3;
        AccessibilityNodeInfo accessibilityNodeInfo;
        RectF rectF4;
        ArrayList arrayList6;
        ArrayList arrayList7;
        boolean z20;
        MessageObject messageObject16;
        MessageObject messageObject17;
        MessageObject messageObject18;
        Spanned spanned;
        int i21;
        String formatString;
        MessageObject messageObject19;
        MessageObject messageObject20;
        MessageObject messageObject21;
        MessageObject messageObject22;
        boolean z21;
        TLRPC.Poll poll3;
        MessageObject messageObject23;
        MessageObject messageObject24;
        MessageObject messageObject25;
        MessageObject messageObject26;
        MessageObject messageObject27;
        String str4;
        int i22;
        MessageObject messageObject28;
        MessageObject messageObject29;
        int i23;
        MessageObject messageObject30;
        MessageObject messageObject31;
        MessageObject messageObject32;
        MessageObject messageObject33;
        MessageObject messageObject34;
        MessageObject messageObject35;
        MessageObject messageObject36;
        boolean z22;
        MessageObject messageObject37;
        MessageObject messageObject38;
        MessageObject messageObject39;
        MessageObject messageObject40;
        MessageObject messageObject41;
        RadialProgress2 radialProgress2;
        MessageObject messageObject42;
        MessageObject messageObject43;
        String str5;
        int i24;
        MessageObject messageObject44;
        int i25;
        int i26;
        MessageObject messageObject45;
        TLRPC.Poll poll4;
        boolean z23;
        TLRPC.Poll poll5;
        TLRPC.Poll poll6;
        String string;
        TLRPC.Poll poll7;
        MessageObject messageObject46;
        MessageObject messageObject47;
        MessageObject messageObject48;
        int i27;
        StaticLayout staticLayout;
        MessageObject messageObject49;
        MessageObject messageObject50;
        long j10;
        int i28;
        int i29;
        MessageObject messageObject51;
        MessageObject messageObject52;
        int i30;
        StaticLayout[] staticLayoutArr4;
        StaticLayout[] staticLayoutArr5;
        StaticLayout[] staticLayoutArr6;
        TLRPC.User user3;
        MessageObject messageObject53;
        TLRPC.User user4;
        TLRPC.User user5;
        CharSequence adminAccessibilityText;
        boolean z24;
        boolean z25;
        AccessibilityNodeInfo accessibilityNodeInfo2;
        AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo;
        int iconForCurrentState;
        String string2;
        int miniIconForCurrentState;
        boolean z26;
        MessageObject messageObject54;
        MessageObject messageObject55;
        MediaController mediaController;
        MessageObject messageObject56;
        g1 g1Var;
        boolean z27;
        int size;
        int i31;
        boolean z28;
        int size2;
        int i32;
        boolean z29;
        boolean z30;
        StaticLayout staticLayout2;
        int i33;
        MessageObject messageObject57;
        StaticLayout[] staticLayoutArr7;
        boolean z31;
        StaticLayout[] staticLayoutArr8;
        MessageObject messageObject58;
        MessageObject messageObject59;
        RectF rectF5;
        ArrayList arrayList8;
        ArrayList arrayList9;
        ArrayList arrayList10;
        boolean z32;
        boolean z33;
        boolean z34;
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
        boolean z35;
        boolean z36;
        long j11;
        MessageObject messageObject70;
        MessageObject messageObject71;
        MessageObject messageObject72;
        MessageObject messageObject73;
        MessageObject messageObject74;
        int[] iArr = {0, 0};
        u1 u1Var = this.d;
        RectF rectF9 = u1Var.y3;
        ArrayList arrayList11 = u1Var.Y5;
        ArrayList arrayList12 = u1Var.o7;
        u1Var.getLocationOnScreen(iArr);
        if (i10 != -1) {
            AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain();
            obtain.setSource(u1Var, i10);
            obtain.setParent(u1Var);
            obtain.setPackageName(u1Var.getContext().getPackageName());
            Rect rect2 = this.c;
            if (i10 == 5000) {
                user = u1Var.Yb;
                if (user != null) {
                    user2 = u1Var.Yb;
                    obtain.setText(UserObject.getUserName(user2));
                    float f7 = u1Var.Wa;
                    int i34 = (int) f7;
                    int i35 = (int) u1Var.Xa;
                    i20 = u1Var.Ua;
                    rect2.set(i34, i35, (int) (f7 + i20), (int) (u1Var.Xa + (u1Var.Ka != null ? r10.getHeight() : 10)));
                    obtain.setBoundsInParent(rect2);
                    sparseArray35 = u1Var.pd;
                    if (sparseArray35.get(i10) == null) {
                        sparseArray36 = u1Var.pd;
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
                    z11 = true;
                }
                return null;
            }
            if (i10 >= 6000) {
                int[] iArr2 = {0};
                RichMessageLayout.RichBlock b10 = b(i10, iArr2);
                if (b10 != null) {
                    obtain.setText(b10.getAccessibilityElementText(iArr2[0]));
                    b10.getAccessibilityElementBounds(iArr2[0], rect2);
                    rect2.offset(u1Var.n0, u1Var.r0);
                    obtain.setBoundsInParent(rect2);
                    sparseArray33 = u1Var.pd;
                    if (sparseArray33.get(i10) == null) {
                        sparseArray34 = u1Var.pd;
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
                    z11 = true;
                }
                return null;
            }
            RectF rectF10 = this.b;
            Path path = this.a;
            if (i10 >= 3000) {
                messageObject11 = u1Var.y7;
                if ((messageObject11.caption instanceof Spannable) && u1Var.c4 != null) {
                    messageObject12 = u1Var.y7;
                    Spannable spannable = (Spannable) messageObject12.caption;
                    ClickableSpan a2 = a(i10, false);
                    if (a2 != null) {
                        int[] J2 = u1.J2(spannable, a2);
                        obtain.setText(spannable.subSequence(J2[0], J2[1]).toString());
                        ArrayList<MessageObject.TextLayoutBlock> arrayList13 = u1Var.c4.textLayoutBlocks;
                        int size3 = arrayList13.size();
                        int i36 = 0;
                        while (true) {
                            if (i36 >= size3) {
                                z17 = true;
                                break;
                            }
                            MessageObject.TextLayoutBlock textLayoutBlock = arrayList13.get(i36);
                            i36++;
                            MessageObject.TextLayoutBlock textLayoutBlock2 = textLayoutBlock;
                            int length = textLayoutBlock2.textLayout.getText().length();
                            int i37 = textLayoutBlock2.charactersOffset;
                            int[] iArr3 = iArr;
                            int i38 = J2[0];
                            if (i37 <= i38) {
                                int i39 = length + i37;
                                int i40 = J2[1];
                                if (i39 >= i40) {
                                    textLayoutBlock2.textLayout.getSelectionPath(i38 - i37, i40 - i37, path);
                                    path.computeBounds(rectF10, true);
                                    rect2.set((int) rectF10.left, (int) rectF10.top, (int) rectF10.right, (int) rectF10.bottom);
                                    rect2.offset(0, (int) textLayoutBlock2.textYOffset(u1Var.c4.textLayoutBlocks, u1Var.Zc));
                                    rect2.offset(u1Var.n0, u1Var.r0);
                                    obtain.setBoundsInParent(rect2);
                                    sparseArray31 = u1Var.pd;
                                    if (sparseArray31.get(i10) == null) {
                                        sparseArray32 = u1Var.pd;
                                        sparseArray32.put(i10, new Rect(rect2));
                                    }
                                    z17 = true;
                                    rect2.offset(iArr3[0], iArr3[1]);
                                    obtain.setBoundsInScreen(rect2);
                                }
                            }
                            iArr = iArr3;
                        }
                        obtain.setClassName("android.widget.TextView");
                        obtain.setEnabled(z17);
                        obtain.setClickable(z17);
                        obtain.setLongClickable(z17);
                        obtain.addAction(16);
                        obtain.addAction(32);
                        z11 = true;
                    }
                }
                return null;
            }
            if (i10 >= 2000) {
                messageObject7 = u1Var.y7;
                if (messageObject7.messageText instanceof Spannable) {
                    messageObject8 = u1Var.y7;
                    Spannable spannable2 = (Spannable) messageObject8.messageText;
                    ClickableSpan a10 = a(i10, false);
                    if (a10 != null) {
                        int[] J22 = u1.J2(spannable2, a10);
                        obtain.setText(spannable2.subSequence(J22[0], J22[1]).toString());
                        messageObject9 = u1Var.y7;
                        ArrayList<MessageObject.TextLayoutBlock> arrayList14 = messageObject9.textLayoutBlocks;
                        int size4 = arrayList14.size();
                        int i41 = 0;
                        while (true) {
                            if (i41 >= size4) {
                                z16 = true;
                                break;
                            }
                            MessageObject.TextLayoutBlock textLayoutBlock3 = arrayList14.get(i41);
                            i41++;
                            MessageObject.TextLayoutBlock textLayoutBlock4 = textLayoutBlock3;
                            int length2 = textLayoutBlock4.textLayout.getText().length();
                            int i42 = textLayoutBlock4.charactersOffset;
                            int i43 = J22[0];
                            if (i42 <= i43) {
                                int i44 = length2 + i42;
                                int i45 = J22[1];
                                if (i44 >= i45) {
                                    textLayoutBlock4.textLayout.getSelectionPath(i43 - i42, i45 - i42, path);
                                    path.computeBounds(rectF10, true);
                                    rect2.set((int) rectF10.left, (int) rectF10.top, (int) rectF10.right, (int) rectF10.bottom);
                                    messageObject10 = u1Var.y7;
                                    rect2.offset(0, (int) textLayoutBlock4.textYOffset(messageObject10.textLayoutBlocks, u1Var.Zc));
                                    rect2.offset(u1Var.n0, u1Var.r0);
                                    obtain.setBoundsInParent(rect2);
                                    sparseArray29 = u1Var.pd;
                                    if (sparseArray29.get(i10) == null) {
                                        sparseArray30 = u1Var.pd;
                                        sparseArray30.put(i10, new Rect(rect2));
                                    }
                                    z16 = true;
                                    rect2.offset(iArr[0], iArr[1]);
                                    obtain.setBoundsInScreen(rect2);
                                }
                            }
                        }
                        obtain.setClassName("android.widget.TextView");
                        obtain.setEnabled(z16);
                        obtain.setClickable(z16);
                        obtain.setLongClickable(z16);
                        obtain.addAction(16);
                        obtain.addAction(32);
                        z11 = true;
                    }
                }
                return null;
            }
            if (i10 >= 1000) {
                int i46 = i10 - 1000;
                if (i46 < arrayList12.size()) {
                    e0 e0Var = (e0) arrayList12.get(i46);
                    if (!e0Var.b) {
                        obtain.setText(e0Var.h.k());
                        obtain.setClassName("android.widget.Button");
                        obtain.setEnabled(true);
                        obtain.setClickable(true);
                        obtain.addAction(16);
                        float f10 = e0Var.c;
                        int i47 = u1Var.s7;
                        int i48 = e0Var.d;
                        rect2.set((int) (i47 * f10), i48, (int) ((f10 + e0Var.e) * i47), e0Var.f + i48);
                        messageObject6 = u1Var.y7;
                        if (messageObject6.isOutOwner()) {
                            dp = (u1Var.getMeasuredWidth() - u1Var.getWidthForButtons()) - AndroidUtilities.dp(10.0f);
                        } else {
                            i19 = u1Var.v8;
                            z15 = u1Var.k8;
                            dp = i19 + AndroidUtilities.dp(z15 ? 1.0f : 7.0f);
                        }
                        rect2.offset(dp, u1Var.M8);
                        obtain.setBoundsInParent(rect2);
                        sparseArray27 = u1Var.pd;
                        if (sparseArray27.get(i10) == null) {
                            sparseArray28 = u1Var.pd;
                            sparseArray28.put(i10, new Rect(rect2));
                        }
                        rect2.offset(iArr[0], iArr[1]);
                        obtain.setBoundsInScreen(rect2);
                        z11 = true;
                    }
                }
                return null;
            }
            if (i10 >= 500) {
                int i49 = i10 - 500;
                if (i49 < arrayList11.size()) {
                    s1 s1Var = (s1) arrayList11.get(i49);
                    StringBuilder sb2 = new StringBuilder(s1Var.p.getText());
                    z12 = u1Var.m6;
                    if (z12) {
                        z13 = s1Var.i;
                        obtain.setSelected(z13);
                        sb2.append(", ");
                        i17 = s1Var.d;
                        sb2.append(i17);
                        sb2.append("%");
                        poll = u1Var.O6;
                        if (poll != null) {
                            poll2 = u1Var.O6;
                            if (poll2.quiz) {
                                z14 = s1Var.i;
                                if (z14 || s1Var.l) {
                                    sb2.append(", ");
                                    if (s1Var.l) {
                                        str2 = "AccDescrQuizCorrectAnswer";
                                        i18 = R.string.AccDescrQuizCorrectAnswer;
                                    } else {
                                        str2 = "AccDescrQuizIncorrectAnswer";
                                        i18 = R.string.AccDescrQuizIncorrectAnswer;
                                    }
                                    sb2.append(LocaleController.getString(str2, i18));
                                }
                            }
                        }
                    } else {
                        obtain.setClassName("android.widget.Button");
                    }
                    obtain.setText(sb2);
                    obtain.setEnabled(true);
                    obtain.addAction(16);
                    int i50 = s1Var.b + u1Var.Lc;
                    int dp2 = u1Var.J8 - AndroidUtilities.dp(76.0f);
                    int i51 = s1Var.a;
                    rect2.set(i51, i50, dp2 + i51, s1Var.c + i50);
                    obtain.setBoundsInParent(rect2);
                    sparseArray25 = u1Var.pd;
                    if (sparseArray25.get(i10) == null) {
                        sparseArray26 = u1Var.pd;
                        sparseArray26.put(i10, new Rect(rect2));
                    }
                    z10 = true;
                    rect2.offset(iArr[0], iArr[1]);
                    obtain.setBoundsInScreen(rect2);
                    obtain.setClickable(true);
                }
                return null;
            }
            z10 = true;
            if (i10 == 495) {
                obtain.setClassName("android.widget.Button");
                obtain.setEnabled(true);
                obtain.setText(LocaleController.getString(R.string.AccDescrQuizExplanation));
                obtain.addAction(16);
                rect2.set(u1Var.U6 - AndroidUtilities.dp(8.0f), u1Var.V6 - AndroidUtilities.dp(8.0f), AndroidUtilities.dp(32.0f) + u1Var.U6, AndroidUtilities.dp(32.0f) + u1Var.V6);
                obtain.setBoundsInParent(rect2);
                sparseArray22 = u1Var.pd;
                if (sparseArray22.get(i10) != null) {
                    sparseArray24 = u1Var.pd;
                }
                sparseArray23 = u1Var.pd;
                sparseArray23.put(i10, new Rect(rect2));
                z10 = true;
                rect2.offset(iArr[0], iArr[1]);
                obtain.setBoundsInScreen(rect2);
                obtain.setClickable(true);
            } else if (i10 == 499) {
                obtain.setClassName("android.widget.Button");
                obtain.setEnabled(true);
                StaticLayout staticLayout3 = u1Var.O2;
                if (staticLayout3 != null) {
                    obtain.setText(staticLayout3.getText());
                }
                obtain.addAction(16);
                rectF9.round(rect2);
                obtain.setBoundsInParent(rect2);
                sparseArray19 = u1Var.pd;
                if (sparseArray19.get(i10) != null) {
                    sparseArray21 = u1Var.pd;
                }
                sparseArray20 = u1Var.pd;
                sparseArray20.put(i10, new Rect(rect2));
                z10 = true;
                rect2.offset(iArr[0], iArr[1]);
                obtain.setBoundsInScreen(rect2);
                obtain.setClickable(true);
            } else if (i10 == 492) {
                obtain.setClassName("android.widget.Button");
                obtain.setEnabled(true);
                StaticLayout staticLayout4 = u1Var.J2;
                if (staticLayout4 != null) {
                    obtain.setText(staticLayout4.getText());
                }
                obtain.addAction(16);
                u1Var.Y2.round(rect2);
                arrayList3 = u1Var.X2;
                if (arrayList3 != null) {
                    arrayList4 = u1Var.X2;
                    if (arrayList4.size() > 1) {
                        arrayList5 = u1Var.X2;
                        m1 m1Var = (m1) arrayList5.get(0);
                        rectF2 = m1Var.e;
                        if (!rectF2.isEmpty()) {
                            int i52 = rect2.left;
                            int i53 = rect2.top;
                            int i54 = rect2.right;
                            float f11 = rect2.bottom;
                            rectF3 = m1Var.e;
                            rect2.set(i52, i53, i54, (int) (f11 - rectF3.height()));
                        }
                    }
                }
                obtain.setBoundsInParent(rect2);
                sparseArray16 = u1Var.pd;
                if (sparseArray16.get(i10) != null) {
                    sparseArray18 = u1Var.pd;
                }
                sparseArray17 = u1Var.pd;
                sparseArray17.put(i10, new Rect(rect2));
                z10 = true;
                rect2.offset(iArr[0], iArr[1]);
                obtain.setBoundsInScreen(rect2);
                obtain.setClickable(true);
            } else {
                if (i10 == 491) {
                    i11 = 491;
                } else if (i10 == 490 || i10 == 489) {
                    i11 = 491;
                } else if (i10 == 498) {
                    obtain.setClassName("android.widget.ImageButton");
                    obtain.setEnabled(true);
                    messageObject5 = u1Var.y7;
                    if (u1.T(u1Var, messageObject5)) {
                        obtain.setContentDescription(LocaleController.getString("AccDescrOpenChat", R.string.AccDescrOpenChat));
                    } else {
                        obtain.setContentDescription(LocaleController.getString("ShareFile", R.string.ShareFile));
                    }
                    obtain.addAction(16);
                    float f12 = u1Var.Ga;
                    rect2.set((int) f12, (int) u1Var.Ha, AndroidUtilities.dp(40.0f) + ((int) f12), AndroidUtilities.dp(32.0f) + ((int) u1Var.Ha));
                    obtain.setBoundsInParent(rect2);
                    sparseArray13 = u1Var.pd;
                    if (sparseArray13.get(i10) != null) {
                        sparseArray15 = u1Var.pd;
                    }
                    sparseArray14 = u1Var.pd;
                    sparseArray14.put(i10, new Rect(rect2));
                    z10 = true;
                    rect2.offset(iArr[0], iArr[1]);
                    obtain.setBoundsInScreen(rect2);
                    obtain.setClickable(true);
                } else if (i10 == 497) {
                    obtain.setEnabled(true);
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(LocaleController.getString("Reply", R.string.Reply));
                    sb3.append(", ");
                    StaticLayout staticLayout5 = u1Var.C9;
                    if (staticLayout5 != null) {
                        sb3.append(staticLayout5.getText());
                        sb3.append(", ");
                    }
                    StaticLayout staticLayout6 = u1Var.D9;
                    if (staticLayout6 != null) {
                        sb3.append(staticLayout6.getText());
                    }
                    obtain.setContentDescription(sb3.toString());
                    obtain.addAction(16);
                    int i55 = u1Var.G9;
                    int i56 = u1Var.H9;
                    i15 = u1Var.J9;
                    i16 = u1Var.L9;
                    rect2.set(i55, i56, Math.max(i15, i16) + i55, u1Var.H9 + ((int) u1Var.I9));
                    obtain.setBoundsInParent(rect2);
                    sparseArray10 = u1Var.pd;
                    if (sparseArray10.get(i10) != null) {
                        sparseArray12 = u1Var.pd;
                    }
                    sparseArray11 = u1Var.pd;
                    sparseArray11.put(i10, new Rect(rect2));
                    z10 = true;
                    rect2.offset(iArr[0], iArr[1]);
                    obtain.setBoundsInScreen(rect2);
                    obtain.setClickable(true);
                } else if (i10 == 494) {
                    obtain.setEnabled(true);
                    StringBuilder sb4 = new StringBuilder();
                    staticLayoutArr = u1Var.fb;
                    if (staticLayoutArr[0] != null) {
                        staticLayoutArr2 = u1Var.fb;
                        if (staticLayoutArr2[1] != null) {
                            int i57 = 0;
                            while (i57 < 2) {
                                staticLayoutArr3 = u1Var.fb;
                                sb4.append(staticLayoutArr3[i57].getText());
                                sb4.append(i57 == 0 ? " " : "\n");
                                i57++;
                            }
                        }
                    }
                    obtain.setContentDescription(sb4.toString());
                    obtain.addAction(16);
                    float f13 = u1Var.ib;
                    float[] fArr = u1Var.lb;
                    int min = (int) Math.min(f13 - fArr[0], f13 - fArr[1]);
                    int i58 = u1Var.jb;
                    i13 = u1Var.gb;
                    int i59 = u1Var.jb;
                    i14 = u1Var.kb;
                    rect2.set(min, i58, i13 + min, i14 + i59);
                    obtain.setBoundsInParent(rect2);
                    sparseArray7 = u1Var.pd;
                    if (sparseArray7.get(i10) != null) {
                        sparseArray9 = u1Var.pd;
                    }
                    sparseArray8 = u1Var.pd;
                    sparseArray8.put(i10, new Rect(rect2));
                    z10 = true;
                    rect2.offset(iArr[0], iArr[1]);
                    obtain.setBoundsInScreen(rect2);
                    obtain.setClickable(true);
                } else if (i10 == 496) {
                    obtain.setClassName("android.widget.Button");
                    obtain.setEnabled(true);
                    int repliesCount = u1Var.getRepliesCount();
                    messageObject2 = u1Var.y7;
                    if (messageObject2 != null) {
                        messageObject3 = u1Var.y7;
                        if (!messageObject3.shouldDrawWithoutBackground()) {
                            messageObject4 = u1Var.y7;
                            if (!messageObject4.isAnimatedEmoji()) {
                                formatShortNumber = u1Var.c8 ? LocaleController.getString("ViewInChat", R.string.ViewInChat) : repliesCount == 0 ? LocaleController.getString("LeaveAComment", R.string.LeaveAComment) : LocaleController.formatPluralString("CommentsCount", repliesCount, new Object[0]);
                                if (formatShortNumber != null) {
                                    obtain.setText(formatShortNumber);
                                }
                                obtain.addAction(16);
                                rect = u1Var.k9;
                                rect2.set(rect);
                                obtain.setBoundsInParent(rect2);
                                sparseArray4 = u1Var.pd;
                                if (sparseArray4.get(i10) != null) {
                                    sparseArray6 = u1Var.pd;
                                }
                                sparseArray5 = u1Var.pd;
                                sparseArray5.put(i10, new Rect(rect2));
                                z10 = true;
                                rect2.offset(iArr[0], iArr[1]);
                                obtain.setBoundsInScreen(rect2);
                                obtain.setClickable(true);
                            }
                        }
                    }
                    formatShortNumber = (u1Var.c8 || repliesCount <= 0) ? null : LocaleController.formatShortNumber(repliesCount, null);
                    if (formatShortNumber != null) {
                    }
                    obtain.addAction(16);
                    rect = u1Var.k9;
                    rect2.set(rect);
                    obtain.setBoundsInParent(rect2);
                    sparseArray4 = u1Var.pd;
                    if (sparseArray4.get(i10) != null) {
                    }
                    sparseArray5 = u1Var.pd;
                    sparseArray5.put(i10, new Rect(rect2));
                    z10 = true;
                    rect2.offset(iArr[0], iArr[1]);
                    obtain.setBoundsInScreen(rect2);
                    obtain.setClickable(true);
                } else if (i10 == 493) {
                    obtain.setClassName("android.widget.Button");
                    obtain.setEnabled(true);
                    messageObject = u1Var.y7;
                    if (messageObject.isVoiceTranscriptionOpen()) {
                        str = "AccActionCloseTranscription";
                        i12 = R.string.AccActionCloseTranscription;
                    } else {
                        str = "AccActionOpenTranscription";
                        i12 = R.string.AccActionOpenTranscription;
                    }
                    obtain.setText(LocaleController.getString(str, i12));
                    obtain.addAction(16);
                    if (u1Var.M5 != null) {
                        float f14 = u1Var.N5;
                        rect2.set((int) f14, (int) u1Var.O5, (int) (f14 + r0.x()), (int) (u1Var.O5 + u1Var.M5.i()));
                    }
                    obtain.setBoundsInParent(rect2);
                    z10 = true;
                    rect2.offset(iArr[0], iArr[1]);
                    obtain.setBoundsInScreen(rect2);
                    obtain.setClickable(true);
                }
                int i60 = i10 == i11 ? 5 : i10 == 490 ? 31 : 30;
                for (int i61 = 0; i61 < arrayList.size(); i61++) {
                    arrayList2 = u1Var.X2;
                    m1 m1Var2 = (m1) arrayList2.get(i61);
                    if (m1Var2.a == i60) {
                        obtain.setClassName("android.widget.Button");
                        obtain.setEnabled(true);
                        StaticLayout staticLayout7 = m1Var2.d;
                        if (staticLayout7 != null) {
                            obtain.setText(staticLayout7.getText());
                        }
                        obtain.addAction(16);
                        rectF = m1Var2.e;
                        rectF.round(rect2);
                        obtain.setBoundsInParent(rect2);
                        sparseArray = u1Var.pd;
                        if (sparseArray.get(i10) != null) {
                            sparseArray3 = u1Var.pd;
                        }
                        sparseArray2 = u1Var.pd;
                        sparseArray2.put(i10, new Rect(rect2));
                        z11 = true;
                        rect2.offset(iArr[0], iArr[1]);
                        obtain.setBoundsInScreen(rect2);
                        obtain.setClickable(true);
                    }
                }
                z11 = true;
            }
            z11 = z10;
            obtain.setFocusable(z11);
            obtain.setVisibleToUser(z11);
            return obtain;
        }
        AccessibilityNodeInfo obtain2 = AccessibilityNodeInfo.obtain(u1Var);
        u1Var.onInitializeAccessibilityNodeInfo(obtain2);
        messageObject13 = u1Var.y7;
        if (messageObject13 != null) {
            messageObject72 = u1Var.y7;
            if (messageObject72.isOut()) {
                messageObject73 = u1Var.y7;
                if (!messageObject73.scheduled) {
                    messageObject74 = u1Var.y7;
                    if (messageObject74.isUnread()) {
                        z18 = true;
                        messageObject14 = u1Var.y7;
                        if (messageObject14 != null) {
                            messageObject71 = u1Var.y7;
                            if (messageObject71.isContentUnread()) {
                                z19 = true;
                                messageObject15 = u1Var.y7;
                                if (messageObject15 != null) {
                                    messageObject70 = u1Var.y7;
                                    str3 = " ";
                                    j3 = messageObject70.loadedFileSize;
                                } else {
                                    str3 = " ";
                                    j3 = 0;
                                }
                                if (u1Var.C3 != null) {
                                    z35 = u1Var.D3;
                                    if (z35 == z18) {
                                        z36 = u1Var.E3;
                                        if (z36 == z19) {
                                            j11 = u1Var.F3;
                                            if (j11 == j3) {
                                                accessibilityNodeInfo = obtain2;
                                                rectF4 = rectF9;
                                                arrayList6 = arrayList11;
                                                arrayList7 = arrayList12;
                                                if (Build.VERSION.SDK_INT >= 24) {
                                                    accessibilityNodeInfo2 = accessibilityNodeInfo;
                                                    accessibilityNodeInfo2.setContentDescription(u1Var.C3.toString());
                                                } else {
                                                    accessibilityNodeInfo2 = accessibilityNodeInfo;
                                                    accessibilityNodeInfo2.setText(u1Var.C3);
                                                }
                                                accessibilityNodeInfo2.setEnabled(true);
                                                collectionItemInfo = accessibilityNodeInfo2.getCollectionItemInfo();
                                                if (collectionItemInfo != null) {
                                                    accessibilityNodeInfo2.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(collectionItemInfo.getRowIndex(), 1, 0, 1, false));
                                                }
                                                accessibilityNodeInfo2.addAction(new AccessibilityNodeInfo.AccessibilityAction(R.id.acc_action_msg_options, LocaleController.getString("AccActionMessageOptions", R.string.AccActionMessageOptions)));
                                                iconForCurrentState = u1Var.getIconForCurrentState();
                                                if (iconForCurrentState != 0) {
                                                    string2 = LocaleController.getString("AccActionPlay", R.string.AccActionPlay);
                                                } else if (iconForCurrentState == 1) {
                                                    string2 = LocaleController.getString("AccActionPause", R.string.AccActionPause);
                                                } else if (iconForCurrentState == 2) {
                                                    string2 = LocaleController.getString("AccActionDownload", R.string.AccActionDownload);
                                                } else if (iconForCurrentState == 3) {
                                                    string2 = LocaleController.getString("AccActionCancelDownload", R.string.AccActionCancelDownload);
                                                } else if (iconForCurrentState != 5) {
                                                    messageObject69 = u1Var.y7;
                                                    string2 = messageObject69.type == 16 ? LocaleController.getString("CallAgain", R.string.CallAgain) : null;
                                                } else {
                                                    string2 = LocaleController.getString("AccActionOpenFile", R.string.AccActionOpenFile);
                                                }
                                                accessibilityNodeInfo2.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, string2));
                                                accessibilityNodeInfo2.addAction(new AccessibilityNodeInfo.AccessibilityAction(32, LocaleController.getString("AccActionEnterSelectionMode", R.string.AccActionEnterSelectionMode)));
                                                miniIconForCurrentState = u1Var.getMiniIconForCurrentState();
                                                if (miniIconForCurrentState == 2) {
                                                    accessibilityNodeInfo2.addAction(new AccessibilityNodeInfo.AccessibilityAction(R.id.acc_action_small_button, LocaleController.getString("AccActionDownload", R.string.AccActionDownload)));
                                                }
                                                z26 = u1Var.ya;
                                                if (!z26 || u1Var.ha) {
                                                    accessibilityNodeInfo2.addAction(new AccessibilityNodeInfo.AccessibilityAction(R.id.acc_action_summarize, LocaleController.getString("SummaryTitle", R.string.SummaryTitle)));
                                                }
                                                messageObject54 = u1Var.y7;
                                                if (messageObject54.textLayoutBlocks != null) {
                                                    messageObject68 = u1Var.y7;
                                                    ArrayList<MessageObject.TextLayoutBlock> arrayList15 = messageObject68.textLayoutBlocks;
                                                    int size5 = arrayList15.size();
                                                    int i62 = 0;
                                                    while (true) {
                                                        if (i62 >= size5) {
                                                            break;
                                                        }
                                                        MessageObject.TextLayoutBlock textLayoutBlock5 = arrayList15.get(i62);
                                                        i62++;
                                                        if (textLayoutBlock5.hasCodeCopyButton) {
                                                            accessibilityNodeInfo2.addAction(new AccessibilityNodeInfo.AccessibilityAction(R.id.acc_action_copy_code, LocaleController.getString("CopyCode", R.string.CopyCode)));
                                                            break;
                                                        }
                                                    }
                                                }
                                                messageObject55 = u1Var.y7;
                                                if (!messageObject55.isVoice()) {
                                                    messageObject66 = u1Var.y7;
                                                    if (!messageObject66.isRoundVideo()) {
                                                        messageObject67 = u1Var.y7;
                                                    }
                                                }
                                                mediaController = MediaController.getInstance();
                                                messageObject56 = u1Var.y7;
                                                if (mediaController.isPlayingMessage(messageObject56)) {
                                                    g1Var = u1Var.I5;
                                                    g1Var.f(accessibilityNodeInfo2);
                                                }
                                                z27 = u1Var.L5;
                                                if (z27 && u1Var.M5 != null) {
                                                    accessibilityNodeInfo2.addChild(u1Var, 493);
                                                }
                                                if (Build.VERSION.SDK_INT < 24) {
                                                    if (u1Var.N7) {
                                                        user6 = u1Var.Yb;
                                                        if (user6 != null) {
                                                            messageObject65 = u1Var.y7;
                                                            if (!messageObject65.isOut()) {
                                                                accessibilityNodeInfo2.addChild(u1Var, 5000);
                                                            }
                                                        }
                                                    }
                                                    messageObject61 = u1Var.y7;
                                                    if (messageObject61.messageText instanceof Spannable) {
                                                        messageObject64 = u1Var.y7;
                                                        Spannable spannable3 = (Spannable) messageObject64.messageText;
                                                        int i63 = 0;
                                                        for (CharacterStyle characterStyle : (CharacterStyle[]) spannable3.getSpans(0, spannable3.length(), ClickableSpan.class)) {
                                                            accessibilityNodeInfo2.addChild(u1Var, i63 + 2000);
                                                            i63++;
                                                        }
                                                    }
                                                    messageObject62 = u1Var.y7;
                                                    if ((messageObject62.caption instanceof Spannable) && u1Var.c4 != null) {
                                                        messageObject63 = u1Var.y7;
                                                        Spannable spannable4 = (Spannable) messageObject63.caption;
                                                        int i64 = 0;
                                                        for (CharacterStyle characterStyle2 : (CharacterStyle[]) spannable4.getSpans(0, spannable4.length(), ClickableSpan.class)) {
                                                            accessibilityNodeInfo2.addChild(u1Var, i64 + 3000);
                                                            i64++;
                                                        }
                                                    }
                                                }
                                                size = arrayList7.size();
                                                int i65 = 0;
                                                i31 = 0;
                                                while (i31 < size) {
                                                    Object obj = arrayList7.get(i31);
                                                    i31++;
                                                    accessibilityNodeInfo2.addChild(u1Var, i65 + MediaDataController.MAX_STYLE_RUNS_COUNT);
                                                    i65++;
                                                }
                                                z28 = u1Var.X6;
                                                if (z28 && u1Var.U6 != -1) {
                                                    messageObject60 = u1Var.y7;
                                                    if (messageObject60.isPoll()) {
                                                        accessibilityNodeInfo2.addChild(u1Var, 495);
                                                    }
                                                }
                                                size2 = arrayList6.size();
                                                int i66 = 0;
                                                i32 = 0;
                                                while (i32 < size2) {
                                                    Object obj2 = arrayList6.get(i32);
                                                    i32++;
                                                    accessibilityNodeInfo2.addChild(u1Var, i66 + 500);
                                                    i66++;
                                                }
                                                z29 = u1Var.R2;
                                                if (z29 && !rectF4.isEmpty()) {
                                                    accessibilityNodeInfo2.addChild(u1Var, 499);
                                                }
                                                z30 = u1Var.S2;
                                                if (z30 && (rectF5 = u1Var.Y2) != null && !rectF5.isEmpty()) {
                                                    accessibilityNodeInfo2.addChild(u1Var, 492);
                                                    arrayList8 = u1Var.X2;
                                                    if (arrayList8 != null) {
                                                        arrayList9 = u1Var.X2;
                                                        if (arrayList9.size() > 1) {
                                                            arrayList10 = u1Var.X2;
                                                            int size6 = arrayList10.size();
                                                            int i67 = 0;
                                                            while (i67 < size6) {
                                                                Object obj3 = arrayList10.get(i67);
                                                                i67++;
                                                                m1 m1Var3 = (m1) obj3;
                                                                z32 = u1Var.U2;
                                                                if (z32 && m1Var3.a == 5) {
                                                                    rectF8 = m1Var3.e;
                                                                    if (!rectF8.isEmpty()) {
                                                                        accessibilityNodeInfo2.addChild(u1Var, 491);
                                                                    }
                                                                }
                                                                z33 = u1Var.V2;
                                                                if (z33 && m1Var3.a == 31) {
                                                                    rectF7 = m1Var3.e;
                                                                    if (!rectF7.isEmpty()) {
                                                                        accessibilityNodeInfo2.addChild(u1Var, 490);
                                                                    }
                                                                }
                                                                z34 = u1Var.T2;
                                                                if (z34 && m1Var3.a == 30) {
                                                                    rectF6 = m1Var3.e;
                                                                    if (!rectF6.isEmpty()) {
                                                                        accessibilityNodeInfo2.addChild(u1Var, 489);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                staticLayout2 = u1Var.Z8;
                                                if (staticLayout2 != null) {
                                                    accessibilityNodeInfo2.addChild(u1Var, 496);
                                                }
                                                i33 = u1Var.ua;
                                                if (i33 != 1 || i33 == 2) {
                                                    accessibilityNodeInfo2.addChild(u1Var, 498);
                                                }
                                                if (u1Var.C9 != null) {
                                                    accessibilityNodeInfo2.addChild(u1Var, 497);
                                                }
                                                messageObject57 = u1Var.y7;
                                                if (messageObject57 != null) {
                                                    messageObject58 = u1Var.y7;
                                                    if (messageObject58.richLayout != null) {
                                                        messageObject59 = u1Var.y7;
                                                        RichMessageLayout richMessageLayout = messageObject59.richLayout;
                                                        int i68 = 0;
                                                        for (int i69 = 0; i69 < richMessageLayout.blocks.size(); i69++) {
                                                            RichMessageLayout.RichBlock richBlock = richMessageLayout.blocks.get(i69);
                                                            if (richBlock.isVisible()) {
                                                                int accessibilityElementCount = richBlock.getAccessibilityElementCount();
                                                                for (int i70 = 0; i70 < accessibilityElementCount; i70++) {
                                                                    accessibilityNodeInfo2.addChild(u1Var, i68 + 6000 + i70);
                                                                }
                                                                i68 += accessibilityElementCount;
                                                            }
                                                        }
                                                    }
                                                }
                                                staticLayoutArr7 = u1Var.fb;
                                                if (staticLayoutArr7[0] != null) {
                                                    staticLayoutArr8 = u1Var.fb;
                                                    if (staticLayoutArr8[1] != null) {
                                                        accessibilityNodeInfo2.addAction(new AccessibilityNodeInfo.AccessibilityAction(R.id.acc_action_open_forwarded_origin, LocaleController.getString("AccActionOpenForwardedOrigin", R.string.AccActionOpenForwardedOrigin)));
                                                    }
                                                }
                                                z31 = u1Var.j1;
                                                if (z31 && u1Var.getBackground() == null) {
                                                    return accessibilityNodeInfo2;
                                                }
                                                accessibilityNodeInfo2.setSelected(true);
                                                return accessibilityNodeInfo2;
                                            }
                                        }
                                    }
                                }
                                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                                if (u1Var.N7) {
                                    user3 = u1Var.Yb;
                                    if (user3 != null) {
                                        messageObject53 = u1Var.y7;
                                        if (!messageObject53.isOut()) {
                                            user4 = u1Var.Yb;
                                            spannableStringBuilder.append((CharSequence) UserObject.getUserName(user4));
                                            rectF4 = rectF9;
                                            user5 = u1Var.Yb;
                                            arrayList6 = arrayList11;
                                            arrayList7 = arrayList12;
                                            spannableStringBuilder.setSpan(new q1(this, user5), 0, spannableStringBuilder.length(), 33);
                                            adminAccessibilityText = u1Var.getAdminAccessibilityText();
                                            if (TextUtils.isEmpty(adminAccessibilityText)) {
                                                accessibilityNodeInfo = obtain2;
                                            } else {
                                                z24 = u1Var.Oa;
                                                if (z24) {
                                                    SpannableStringBuilder append = spannableStringBuilder.append(' ');
                                                    z25 = u1Var.Ma;
                                                    accessibilityNodeInfo = obtain2;
                                                    append.append((CharSequence) LocaleController.formatString(z25 ? R.string.AccDescrWithAdminTag : R.string.AccDescrWithMemberTag, adminAccessibilityText));
                                                } else {
                                                    accessibilityNodeInfo = obtain2;
                                                    spannableStringBuilder.append((CharSequence) ", ").append(adminAccessibilityText);
                                                }
                                            }
                                            spannableStringBuilder.append('\n');
                                            z20 = u1Var.hb;
                                            if (z20) {
                                                int i71 = 0;
                                                while (i71 < 2) {
                                                    staticLayoutArr4 = u1Var.fb;
                                                    if (staticLayoutArr4[i71] != null) {
                                                        staticLayoutArr5 = u1Var.fb;
                                                        if (staticLayoutArr5[i71].getText() != null) {
                                                            staticLayoutArr6 = u1Var.fb;
                                                            spannableStringBuilder.append(staticLayoutArr6[i71].getText());
                                                            spannableStringBuilder.append((CharSequence) (i71 == 0 ? str3 : "\n"));
                                                        }
                                                    }
                                                    i71++;
                                                }
                                            }
                                            if (u1Var.L1 != null) {
                                                i30 = u1Var.K1;
                                                if (i30 == 1) {
                                                    String attachFileName = FileLoader.getAttachFileName(u1Var.L1);
                                                    if (attachFileName.indexOf(46) != -1) {
                                                        spannableStringBuilder.append((CharSequence) LocaleController.formatString(R.string.AccDescrDocumentType, attachFileName.substring(attachFileName.lastIndexOf(46) + 1).toUpperCase(Locale.ROOT)));
                                                    }
                                                }
                                            }
                                            messageObject16 = u1Var.y7;
                                            if (messageObject16.richLayout != null) {
                                                messageObject51 = u1Var.y7;
                                                if (!messageObject51.richLayout.blocks.isEmpty()) {
                                                    messageObject52 = u1Var.y7;
                                                    ArrayList<RichMessageLayout.RichBlock> arrayList16 = messageObject52.richLayout.blocks;
                                                    int size7 = arrayList16.size();
                                                    int i72 = 0;
                                                    while (i72 < size7) {
                                                        RichMessageLayout.RichBlock richBlock2 = arrayList16.get(i72);
                                                        i72++;
                                                        RichMessageLayout.RichBlock richBlock3 = richBlock2;
                                                        if (richBlock3.isVisible()) {
                                                            int length3 = spannableStringBuilder.length();
                                                            ArrayList<RichMessageLayout.RichBlock> arrayList17 = arrayList16;
                                                            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                                                            richBlock3.appendAccessibilityText(spannableStringBuilder2);
                                                            int i73 = size7;
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
                                                            size7 = i73;
                                                        }
                                                    }
                                                    if (u1Var.L1 != null) {
                                                        i27 = u1Var.K1;
                                                        if (i27 != 1) {
                                                            i28 = u1Var.K1;
                                                            if (i28 != 2) {
                                                                i29 = u1Var.K1;
                                                            }
                                                        }
                                                        if (u1Var.O4 == 1) {
                                                            staticLayout = u1Var.y4;
                                                            if (staticLayout != null) {
                                                                spannableStringBuilder.append((CharSequence) "\n");
                                                                messageObject49 = u1Var.y7;
                                                                boolean isSending = messageObject49.isSending();
                                                                String str6 = isSending ? "AccDescrUploadProgress" : "AccDescrDownloadProgress";
                                                                int i74 = isSending ? R.string.AccDescrUploadProgress : R.string.AccDescrDownloadProgress;
                                                                messageObject50 = u1Var.y7;
                                                                String formatFileSize = AndroidUtilities.formatFileSize(messageObject50.loadedFileSize);
                                                                j10 = u1Var.y1;
                                                                spannableStringBuilder.append((CharSequence) LocaleController.formatString(str6, i74, formatFileSize, AndroidUtilities.formatFileSize(j10)));
                                                            }
                                                        }
                                                    }
                                                    messageObject19 = u1Var.y7;
                                                    if (messageObject19.isMusic()) {
                                                        spannableStringBuilder.append((CharSequence) "\n");
                                                        int i75 = R.string.AccDescrMusicInfo;
                                                        messageObject46 = u1Var.y7;
                                                        String musicAuthor = messageObject46.getMusicAuthor();
                                                        messageObject47 = u1Var.y7;
                                                        spannableStringBuilder.append((CharSequence) LocaleController.formatString("AccDescrMusicInfo", i75, musicAuthor, messageObject47.getMusicTitle()));
                                                        spannableStringBuilder.append((CharSequence) ", ");
                                                        messageObject48 = u1Var.y7;
                                                        spannableStringBuilder.append((CharSequence) LocaleController.formatDuration((int) messageObject48.getDuration()));
                                                    } else {
                                                        messageObject20 = u1Var.y7;
                                                        if (!messageObject20.isVoice()) {
                                                            z21 = u1Var.qd;
                                                        }
                                                        spannableStringBuilder.append((CharSequence) ", ");
                                                        messageObject21 = u1Var.y7;
                                                        spannableStringBuilder.append((CharSequence) LocaleController.formatDuration((int) messageObject21.getDuration()));
                                                        spannableStringBuilder.append((CharSequence) ", ");
                                                        messageObject22 = u1Var.y7;
                                                        if (messageObject22.isContentUnread()) {
                                                            spannableStringBuilder.append((CharSequence) LocaleController.getString("AccDescrMsgNotPlayed", R.string.AccDescrMsgNotPlayed));
                                                        } else {
                                                            spannableStringBuilder.append((CharSequence) LocaleController.getString("AccDescrMsgPlayed", R.string.AccDescrMsgPlayed));
                                                        }
                                                    }
                                                    poll3 = u1Var.O6;
                                                    if (poll3 != null) {
                                                        spannableStringBuilder.append((CharSequence) ", ");
                                                        poll4 = u1Var.O6;
                                                        spannableStringBuilder.append((CharSequence) poll4.question.text);
                                                        spannableStringBuilder.append((CharSequence) ", ");
                                                        z23 = u1Var.t6;
                                                        if (z23) {
                                                            string = LocaleController.getString("FinalResults", R.string.FinalResults);
                                                        } else {
                                                            poll5 = u1Var.O6;
                                                            if (poll5.quiz) {
                                                                poll7 = u1Var.O6;
                                                                string = poll7.public_voters ? LocaleController.getString("QuizPoll", R.string.QuizPoll) : LocaleController.getString("AnonymousQuizPoll", R.string.AnonymousQuizPoll);
                                                            } else {
                                                                poll6 = u1Var.O6;
                                                                string = poll6.public_voters ? LocaleController.getString("PublicPoll", R.string.PublicPoll) : LocaleController.getString("AnonymousPoll", R.string.AnonymousPoll);
                                                            }
                                                        }
                                                        spannableStringBuilder.append((CharSequence) string);
                                                    }
                                                    if (u1Var.L1 != null) {
                                                        i25 = u1Var.K1;
                                                        if (i25 == 4) {
                                                            spannableStringBuilder.append((CharSequence) ", ");
                                                            messageObject45 = u1Var.y7;
                                                            spannableStringBuilder.append((CharSequence) LocaleController.formatDuration((int) messageObject45.getDuration()));
                                                        }
                                                        if (u1Var.O4 != 0) {
                                                            i26 = u1Var.K1;
                                                        }
                                                        spannableStringBuilder.append((CharSequence) ", ");
                                                        spannableStringBuilder.append((CharSequence) AndroidUtilities.formatFileSize(u1Var.L1.size));
                                                    }
                                                    messageObject23 = u1Var.y7;
                                                    if (messageObject23.isVoiceTranscriptionOpen()) {
                                                        spannableStringBuilder.append((CharSequence) "\n");
                                                        messageObject44 = u1Var.y7;
                                                        spannableStringBuilder.append(messageObject44.getVoiceTranscription());
                                                    } else {
                                                        messageObject24 = u1Var.y7;
                                                        if (MessageObject.getMedia(messageObject24.messageOwner) != null) {
                                                            messageObject25 = u1Var.y7;
                                                            if (!TextUtils.isEmpty(messageObject25.caption)) {
                                                                spannableStringBuilder.append((CharSequence) "\n");
                                                                messageObject26 = u1Var.y7;
                                                                spannableStringBuilder.append(messageObject26.caption);
                                                            }
                                                        }
                                                    }
                                                    messageObject27 = u1Var.y7;
                                                    if (messageObject27.isOut()) {
                                                        messageObject39 = u1Var.y7;
                                                        if (messageObject39.isSent()) {
                                                            spannableStringBuilder.append((CharSequence) "\n");
                                                            messageObject42 = u1Var.y7;
                                                            if (messageObject42.scheduled) {
                                                                spannableStringBuilder.append((CharSequence) LocaleController.formatString("AccDescrScheduledDate", R.string.AccDescrScheduledDate, u1Var.tb));
                                                                str4 = str3;
                                                            } else {
                                                                int i76 = R.string.AccDescrSentDate;
                                                                StringBuilder sb5 = new StringBuilder();
                                                                sb5.append(LocaleController.getString("TodayAt", R.string.TodayAt));
                                                                str4 = str3;
                                                                sb5.append(str4);
                                                                sb5.append((Object) u1Var.tb);
                                                                spannableStringBuilder.append((CharSequence) LocaleController.formatString("AccDescrSentDate", i76, sb5.toString()));
                                                                spannableStringBuilder.append((CharSequence) ", ");
                                                                messageObject43 = u1Var.y7;
                                                                if (messageObject43.isUnread()) {
                                                                    str5 = "AccDescrMsgUnread";
                                                                    i24 = R.string.AccDescrMsgUnread;
                                                                } else {
                                                                    str5 = "AccDescrMsgRead";
                                                                    i24 = R.string.AccDescrMsgRead;
                                                                }
                                                                spannableStringBuilder.append((CharSequence) LocaleController.getString(str5, i24));
                                                            }
                                                        } else {
                                                            str4 = str3;
                                                            messageObject40 = u1Var.y7;
                                                            if (messageObject40.isSending()) {
                                                                spannableStringBuilder.append((CharSequence) "\n");
                                                                spannableStringBuilder.append((CharSequence) LocaleController.getString("AccDescrMsgSending", R.string.AccDescrMsgSending));
                                                                radialProgress2 = u1Var.O0;
                                                                float f15 = (radialProgress2.c ? radialProgress2.j : radialProgress2.i).w;
                                                                if (f15 > 0.0f) {
                                                                    spannableStringBuilder.append((CharSequence) Integer.toString(Math.round(f15 * 100.0f))).append((CharSequence) "%");
                                                                }
                                                            } else {
                                                                messageObject41 = u1Var.y7;
                                                                if (messageObject41.isSendError()) {
                                                                    spannableStringBuilder.append((CharSequence) "\n");
                                                                    spannableStringBuilder.append((CharSequence) LocaleController.getString("AccDescrMsgSendingError", R.string.AccDescrMsgSendingError));
                                                                }
                                                            }
                                                        }
                                                        i22 = 0;
                                                    } else {
                                                        str4 = str3;
                                                        spannableStringBuilder.append((CharSequence) "\n");
                                                        i22 = 0;
                                                        spannableStringBuilder.append((CharSequence) LocaleController.formatString("AccDescrReceivedDate", R.string.AccDescrReceivedDate, LocaleController.getString("TodayAt", R.string.TodayAt) + str4 + ((Object) u1Var.tb)));
                                                    }
                                                    if (u1Var.getRepliesCount() > 0 && !u1Var.Q2()) {
                                                        spannableStringBuilder.append((CharSequence) "\n");
                                                        spannableStringBuilder.append((CharSequence) LocaleController.formatPluralString("AccDescrNumberOfReplies", u1Var.getRepliesCount(), new Object[i22]));
                                                    }
                                                    messageObject28 = u1Var.y7;
                                                    if (messageObject28.messageOwner.reactions != null) {
                                                        messageObject31 = u1Var.y7;
                                                        if (messageObject31.messageOwner.reactions.results != null) {
                                                            messageObject32 = u1Var.y7;
                                                            String str7 = "";
                                                            if (messageObject32.messageOwner.reactions.results.size() == 1) {
                                                                messageObject35 = u1Var.y7;
                                                                TLRPC.ReactionCount reactionCount = messageObject35.messageOwner.reactions.results.get(0);
                                                                TLRPC.Reaction reaction = reactionCount.reaction;
                                                                String str8 = reaction instanceof TLRPC.TL_reactionEmoji ? ((TLRPC.TL_reactionEmoji) reaction).emoticon : "";
                                                                int i77 = reactionCount.count;
                                                                if (i77 == 1) {
                                                                    spannableStringBuilder.append((CharSequence) "\n");
                                                                    messageObject36 = u1Var.y7;
                                                                    if (messageObject36.messageOwner.reactions.recent_reactions != null) {
                                                                        messageObject37 = u1Var.y7;
                                                                        if (messageObject37.messageOwner.reactions.recent_reactions.size() == 1) {
                                                                            messageObject38 = u1Var.y7;
                                                                            TLRPC.MessagePeerReaction messagePeerReaction = messageObject38.messageOwner.reactions.recent_reactions.get(0);
                                                                            if (messagePeerReaction != null) {
                                                                                TLRPC.User user7 = MessagesController.getInstance(u1Var.I7).getUser(Long.valueOf(MessageObject.getPeerId(messagePeerReaction.peer_id)));
                                                                                z22 = UserObject.isUserSelf(user7);
                                                                                if (user7 != null) {
                                                                                    str7 = UserObject.getFirstName(user7);
                                                                                }
                                                                                if (z22) {
                                                                                    spannableStringBuilder.append((CharSequence) LocaleController.formatString("AccDescrReactedWith", R.string.AccDescrReactedWith, str7, str8));
                                                                                } else {
                                                                                    spannableStringBuilder.append((CharSequence) LocaleController.formatString("AccDescrYouReactedWith", R.string.AccDescrYouReactedWith, str8));
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    z22 = false;
                                                                    if (z22) {
                                                                    }
                                                                } else if (i77 > 1) {
                                                                    spannableStringBuilder.append((CharSequence) "\n");
                                                                    spannableStringBuilder.append((CharSequence) LocaleController.formatPluralString("AccDescrNumberOfPeopleReactions", reactionCount.count, str8));
                                                                }
                                                            } else {
                                                                spannableStringBuilder.append((CharSequence) LocaleController.getString("Reactions", R.string.Reactions)).append((CharSequence) ": ");
                                                                messageObject33 = u1Var.y7;
                                                                int size8 = messageObject33.messageOwner.reactions.results.size();
                                                                int i78 = 0;
                                                                while (i78 < size8) {
                                                                    messageObject34 = u1Var.y7;
                                                                    TLRPC.ReactionCount reactionCount2 = messageObject34.messageOwner.reactions.results.get(i78);
                                                                    TLRPC.Reaction reaction2 = reactionCount2.reaction;
                                                                    int i79 = i78;
                                                                    spannableStringBuilder.append((CharSequence) (reaction2 instanceof TLRPC.TL_reactionEmoji ? ((TLRPC.TL_reactionEmoji) reaction2).emoticon : "")).append((CharSequence) str4).append((CharSequence) (reactionCount2.count + ""));
                                                                    i78 = i79 + 1;
                                                                    if (i78 < size8) {
                                                                        spannableStringBuilder.append((CharSequence) ", ");
                                                                    }
                                                                }
                                                                spannableStringBuilder.append((CharSequence) "\n");
                                                            }
                                                        }
                                                    }
                                                    messageObject29 = u1Var.y7;
                                                    if ((messageObject29.messageOwner.flags & 1024) != 0) {
                                                        spannableStringBuilder.append((CharSequence) "\n");
                                                        messageObject30 = u1Var.y7;
                                                        i23 = 0;
                                                        spannableStringBuilder.append((CharSequence) LocaleController.formatPluralString("AccDescrNumberOfViews", messageObject30.messageOwner.views, new Object[0]));
                                                    } else {
                                                        i23 = 0;
                                                    }
                                                    spannableStringBuilder.append((CharSequence) "\n");
                                                    for (CharacterStyle characterStyle3 : (CharacterStyle[]) spannableStringBuilder.getSpans(i23, spannableStringBuilder.length(), ClickableSpan.class)) {
                                                        int spanStart = spannableStringBuilder.getSpanStart(characterStyle3);
                                                        int spanEnd = spannableStringBuilder.getSpanEnd(characterStyle3);
                                                        spannableStringBuilder.removeSpan(characterStyle3);
                                                        spannableStringBuilder.setSpan(new i(2, this, characterStyle3), spanStart, spanEnd, 33);
                                                    }
                                                    u1Var.C3 = spannableStringBuilder;
                                                    u1Var.D3 = z18;
                                                    u1Var.E3 = z19;
                                                    u1Var.F3 = j3;
                                                    if (Build.VERSION.SDK_INT >= 24) {
                                                    }
                                                    accessibilityNodeInfo2.setEnabled(true);
                                                    collectionItemInfo = accessibilityNodeInfo2.getCollectionItemInfo();
                                                    if (collectionItemInfo != null) {
                                                    }
                                                    accessibilityNodeInfo2.addAction(new AccessibilityNodeInfo.AccessibilityAction(R.id.acc_action_msg_options, LocaleController.getString("AccActionMessageOptions", R.string.AccActionMessageOptions)));
                                                    iconForCurrentState = u1Var.getIconForCurrentState();
                                                    if (iconForCurrentState != 0) {
                                                    }
                                                    accessibilityNodeInfo2.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, string2));
                                                    accessibilityNodeInfo2.addAction(new AccessibilityNodeInfo.AccessibilityAction(32, LocaleController.getString("AccActionEnterSelectionMode", R.string.AccActionEnterSelectionMode)));
                                                    miniIconForCurrentState = u1Var.getMiniIconForCurrentState();
                                                    if (miniIconForCurrentState == 2) {
                                                    }
                                                    z26 = u1Var.ya;
                                                    if (!z26) {
                                                    }
                                                    accessibilityNodeInfo2.addAction(new AccessibilityNodeInfo.AccessibilityAction(R.id.acc_action_summarize, LocaleController.getString("SummaryTitle", R.string.SummaryTitle)));
                                                    messageObject54 = u1Var.y7;
                                                    if (messageObject54.textLayoutBlocks != null) {
                                                    }
                                                    messageObject55 = u1Var.y7;
                                                    if (!messageObject55.isVoice()) {
                                                    }
                                                    mediaController = MediaController.getInstance();
                                                    messageObject56 = u1Var.y7;
                                                    if (mediaController.isPlayingMessage(messageObject56)) {
                                                    }
                                                    z27 = u1Var.L5;
                                                    if (z27) {
                                                        accessibilityNodeInfo2.addChild(u1Var, 493);
                                                    }
                                                    if (Build.VERSION.SDK_INT < 24) {
                                                    }
                                                    size = arrayList7.size();
                                                    int i652 = 0;
                                                    i31 = 0;
                                                    while (i31 < size) {
                                                    }
                                                    z28 = u1Var.X6;
                                                    if (z28) {
                                                        messageObject60 = u1Var.y7;
                                                        if (messageObject60.isPoll()) {
                                                        }
                                                    }
                                                    size2 = arrayList6.size();
                                                    int i662 = 0;
                                                    i32 = 0;
                                                    while (i32 < size2) {
                                                    }
                                                    z29 = u1Var.R2;
                                                    if (z29) {
                                                        accessibilityNodeInfo2.addChild(u1Var, 499);
                                                    }
                                                    z30 = u1Var.S2;
                                                    if (z30) {
                                                        accessibilityNodeInfo2.addChild(u1Var, 492);
                                                        arrayList8 = u1Var.X2;
                                                        if (arrayList8 != null) {
                                                        }
                                                    }
                                                    staticLayout2 = u1Var.Z8;
                                                    if (staticLayout2 != null) {
                                                    }
                                                    i33 = u1Var.ua;
                                                    if (i33 != 1) {
                                                    }
                                                    accessibilityNodeInfo2.addChild(u1Var, 498);
                                                    if (u1Var.C9 != null) {
                                                    }
                                                    messageObject57 = u1Var.y7;
                                                    if (messageObject57 != null) {
                                                    }
                                                    staticLayoutArr7 = u1Var.fb;
                                                    if (staticLayoutArr7[0] != null) {
                                                    }
                                                    z31 = u1Var.j1;
                                                    if (z31) {
                                                    }
                                                    accessibilityNodeInfo2.setSelected(true);
                                                    return accessibilityNodeInfo2;
                                                }
                                            }
                                            messageObject17 = u1Var.y7;
                                            if (!TextUtils.isEmpty(messageObject17.messageText)) {
                                                messageObject18 = u1Var.y7;
                                                CharSequence charSequence = messageObject18.messageText;
                                                if (charSequence instanceof Spanned) {
                                                    Spanned spanned2 = (Spanned) charSequence;
                                                    CodeHighlighting.Span[] spanArr = (CodeHighlighting.Span[]) spanned2.getSpans(0, spanned2.length(), CodeHighlighting.Span.class);
                                                    if (spanArr != null && spanArr.length > 0) {
                                                        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(charSequence);
                                                        Arrays.sort(spanArr, new p1(spanned2, 0));
                                                        int length4 = spanArr.length;
                                                        int i80 = 0;
                                                        while (i80 < length4) {
                                                            int i81 = length4;
                                                            CodeHighlighting.Span span = spanArr[i80];
                                                            CodeHighlighting.Span[] spanArr2 = spanArr;
                                                            int spanStart2 = spanned2.getSpanStart(span);
                                                            if (spanStart2 < 0) {
                                                                spanned = spanned2;
                                                                i21 = i80;
                                                            } else {
                                                                spanned = spanned2;
                                                                if (TextUtils.isEmpty(span.lng)) {
                                                                    formatString = LocaleController.getString(R.string.AccDescrCodeBlock);
                                                                    i21 = i80;
                                                                } else {
                                                                    i21 = i80;
                                                                    formatString = LocaleController.formatString(R.string.AccDescrCodeBlockLanguage, MessageObject.TextLayoutBlock.capitalizeLanguage(span.lng));
                                                                }
                                                                spannableStringBuilder3.insert(spanStart2, (CharSequence) (((Object) formatString) + ". "));
                                                            }
                                                            i80 = i21 + 1;
                                                            length4 = i81;
                                                            spanArr = spanArr2;
                                                            spanned2 = spanned;
                                                        }
                                                        charSequence = spannableStringBuilder3;
                                                    }
                                                }
                                                spannableStringBuilder.append(charSequence);
                                            }
                                            if (u1Var.L1 != null) {
                                            }
                                            messageObject19 = u1Var.y7;
                                            if (messageObject19.isMusic()) {
                                            }
                                            poll3 = u1Var.O6;
                                            if (poll3 != null) {
                                            }
                                            if (u1Var.L1 != null) {
                                            }
                                            messageObject23 = u1Var.y7;
                                            if (messageObject23.isVoiceTranscriptionOpen()) {
                                            }
                                            messageObject27 = u1Var.y7;
                                            if (messageObject27.isOut()) {
                                            }
                                            if (u1Var.getRepliesCount() > 0) {
                                                spannableStringBuilder.append((CharSequence) "\n");
                                                spannableStringBuilder.append((CharSequence) LocaleController.formatPluralString("AccDescrNumberOfReplies", u1Var.getRepliesCount(), new Object[i22]));
                                            }
                                            messageObject28 = u1Var.y7;
                                            if (messageObject28.messageOwner.reactions != null) {
                                            }
                                            messageObject29 = u1Var.y7;
                                            if ((messageObject29.messageOwner.flags & 1024) != 0) {
                                            }
                                            spannableStringBuilder.append((CharSequence) "\n");
                                            while (r5 < r2) {
                                            }
                                            u1Var.C3 = spannableStringBuilder;
                                            u1Var.D3 = z18;
                                            u1Var.E3 = z19;
                                            u1Var.F3 = j3;
                                            if (Build.VERSION.SDK_INT >= 24) {
                                            }
                                            accessibilityNodeInfo2.setEnabled(true);
                                            collectionItemInfo = accessibilityNodeInfo2.getCollectionItemInfo();
                                            if (collectionItemInfo != null) {
                                            }
                                            accessibilityNodeInfo2.addAction(new AccessibilityNodeInfo.AccessibilityAction(R.id.acc_action_msg_options, LocaleController.getString("AccActionMessageOptions", R.string.AccActionMessageOptions)));
                                            iconForCurrentState = u1Var.getIconForCurrentState();
                                            if (iconForCurrentState != 0) {
                                            }
                                            accessibilityNodeInfo2.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, string2));
                                            accessibilityNodeInfo2.addAction(new AccessibilityNodeInfo.AccessibilityAction(32, LocaleController.getString("AccActionEnterSelectionMode", R.string.AccActionEnterSelectionMode)));
                                            miniIconForCurrentState = u1Var.getMiniIconForCurrentState();
                                            if (miniIconForCurrentState == 2) {
                                            }
                                            z26 = u1Var.ya;
                                            if (!z26) {
                                            }
                                            accessibilityNodeInfo2.addAction(new AccessibilityNodeInfo.AccessibilityAction(R.id.acc_action_summarize, LocaleController.getString("SummaryTitle", R.string.SummaryTitle)));
                                            messageObject54 = u1Var.y7;
                                            if (messageObject54.textLayoutBlocks != null) {
                                            }
                                            messageObject55 = u1Var.y7;
                                            if (!messageObject55.isVoice()) {
                                            }
                                            mediaController = MediaController.getInstance();
                                            messageObject56 = u1Var.y7;
                                            if (mediaController.isPlayingMessage(messageObject56)) {
                                            }
                                            z27 = u1Var.L5;
                                            if (z27) {
                                            }
                                            if (Build.VERSION.SDK_INT < 24) {
                                            }
                                            size = arrayList7.size();
                                            int i6522 = 0;
                                            i31 = 0;
                                            while (i31 < size) {
                                            }
                                            z28 = u1Var.X6;
                                            if (z28) {
                                            }
                                            size2 = arrayList6.size();
                                            int i6622 = 0;
                                            i32 = 0;
                                            while (i32 < size2) {
                                            }
                                            z29 = u1Var.R2;
                                            if (z29) {
                                            }
                                            z30 = u1Var.S2;
                                            if (z30) {
                                            }
                                            staticLayout2 = u1Var.Z8;
                                            if (staticLayout2 != null) {
                                            }
                                            i33 = u1Var.ua;
                                            if (i33 != 1) {
                                            }
                                            accessibilityNodeInfo2.addChild(u1Var, 498);
                                            if (u1Var.C9 != null) {
                                            }
                                            messageObject57 = u1Var.y7;
                                            if (messageObject57 != null) {
                                            }
                                            staticLayoutArr7 = u1Var.fb;
                                            if (staticLayoutArr7[0] != null) {
                                            }
                                            z31 = u1Var.j1;
                                            if (z31) {
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
                                z20 = u1Var.hb;
                                if (z20) {
                                }
                                if (u1Var.L1 != null) {
                                }
                                messageObject16 = u1Var.y7;
                                if (messageObject16.richLayout != null) {
                                }
                                messageObject17 = u1Var.y7;
                                if (!TextUtils.isEmpty(messageObject17.messageText)) {
                                }
                                if (u1Var.L1 != null) {
                                }
                                messageObject19 = u1Var.y7;
                                if (messageObject19.isMusic()) {
                                }
                                poll3 = u1Var.O6;
                                if (poll3 != null) {
                                }
                                if (u1Var.L1 != null) {
                                }
                                messageObject23 = u1Var.y7;
                                if (messageObject23.isVoiceTranscriptionOpen()) {
                                }
                                messageObject27 = u1Var.y7;
                                if (messageObject27.isOut()) {
                                }
                                if (u1Var.getRepliesCount() > 0) {
                                }
                                messageObject28 = u1Var.y7;
                                if (messageObject28.messageOwner.reactions != null) {
                                }
                                messageObject29 = u1Var.y7;
                                if ((messageObject29.messageOwner.flags & 1024) != 0) {
                                }
                                spannableStringBuilder.append((CharSequence) "\n");
                                while (r5 < r2) {
                                }
                                u1Var.C3 = spannableStringBuilder;
                                u1Var.D3 = z18;
                                u1Var.E3 = z19;
                                u1Var.F3 = j3;
                                if (Build.VERSION.SDK_INT >= 24) {
                                }
                                accessibilityNodeInfo2.setEnabled(true);
                                collectionItemInfo = accessibilityNodeInfo2.getCollectionItemInfo();
                                if (collectionItemInfo != null) {
                                }
                                accessibilityNodeInfo2.addAction(new AccessibilityNodeInfo.AccessibilityAction(R.id.acc_action_msg_options, LocaleController.getString("AccActionMessageOptions", R.string.AccActionMessageOptions)));
                                iconForCurrentState = u1Var.getIconForCurrentState();
                                if (iconForCurrentState != 0) {
                                }
                                accessibilityNodeInfo2.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, string2));
                                accessibilityNodeInfo2.addAction(new AccessibilityNodeInfo.AccessibilityAction(32, LocaleController.getString("AccActionEnterSelectionMode", R.string.AccActionEnterSelectionMode)));
                                miniIconForCurrentState = u1Var.getMiniIconForCurrentState();
                                if (miniIconForCurrentState == 2) {
                                }
                                z26 = u1Var.ya;
                                if (!z26) {
                                }
                                accessibilityNodeInfo2.addAction(new AccessibilityNodeInfo.AccessibilityAction(R.id.acc_action_summarize, LocaleController.getString("SummaryTitle", R.string.SummaryTitle)));
                                messageObject54 = u1Var.y7;
                                if (messageObject54.textLayoutBlocks != null) {
                                }
                                messageObject55 = u1Var.y7;
                                if (!messageObject55.isVoice()) {
                                }
                                mediaController = MediaController.getInstance();
                                messageObject56 = u1Var.y7;
                                if (mediaController.isPlayingMessage(messageObject56)) {
                                }
                                z27 = u1Var.L5;
                                if (z27) {
                                }
                                if (Build.VERSION.SDK_INT < 24) {
                                }
                                size = arrayList7.size();
                                int i65222 = 0;
                                i31 = 0;
                                while (i31 < size) {
                                }
                                z28 = u1Var.X6;
                                if (z28) {
                                }
                                size2 = arrayList6.size();
                                int i66222 = 0;
                                i32 = 0;
                                while (i32 < size2) {
                                }
                                z29 = u1Var.R2;
                                if (z29) {
                                }
                                z30 = u1Var.S2;
                                if (z30) {
                                }
                                staticLayout2 = u1Var.Z8;
                                if (staticLayout2 != null) {
                                }
                                i33 = u1Var.ua;
                                if (i33 != 1) {
                                }
                                accessibilityNodeInfo2.addChild(u1Var, 498);
                                if (u1Var.C9 != null) {
                                }
                                messageObject57 = u1Var.y7;
                                if (messageObject57 != null) {
                                }
                                staticLayoutArr7 = u1Var.fb;
                                if (staticLayoutArr7[0] != null) {
                                }
                                z31 = u1Var.j1;
                                if (z31) {
                                }
                                accessibilityNodeInfo2.setSelected(true);
                                return accessibilityNodeInfo2;
                            }
                        }
                        z19 = false;
                        messageObject15 = u1Var.y7;
                        if (messageObject15 != null) {
                        }
                        if (u1Var.C3 != null) {
                        }
                        SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder();
                        if (u1Var.N7) {
                        }
                        accessibilityNodeInfo = obtain2;
                        rectF4 = rectF9;
                        arrayList6 = arrayList11;
                        arrayList7 = arrayList12;
                        z20 = u1Var.hb;
                        if (z20) {
                        }
                        if (u1Var.L1 != null) {
                        }
                        messageObject16 = u1Var.y7;
                        if (messageObject16.richLayout != null) {
                        }
                        messageObject17 = u1Var.y7;
                        if (!TextUtils.isEmpty(messageObject17.messageText)) {
                        }
                        if (u1Var.L1 != null) {
                        }
                        messageObject19 = u1Var.y7;
                        if (messageObject19.isMusic()) {
                        }
                        poll3 = u1Var.O6;
                        if (poll3 != null) {
                        }
                        if (u1Var.L1 != null) {
                        }
                        messageObject23 = u1Var.y7;
                        if (messageObject23.isVoiceTranscriptionOpen()) {
                        }
                        messageObject27 = u1Var.y7;
                        if (messageObject27.isOut()) {
                        }
                        if (u1Var.getRepliesCount() > 0) {
                        }
                        messageObject28 = u1Var.y7;
                        if (messageObject28.messageOwner.reactions != null) {
                        }
                        messageObject29 = u1Var.y7;
                        if ((messageObject29.messageOwner.flags & 1024) != 0) {
                        }
                        spannableStringBuilder4.append((CharSequence) "\n");
                        while (r5 < r2) {
                        }
                        u1Var.C3 = spannableStringBuilder4;
                        u1Var.D3 = z18;
                        u1Var.E3 = z19;
                        u1Var.F3 = j3;
                        if (Build.VERSION.SDK_INT >= 24) {
                        }
                        accessibilityNodeInfo2.setEnabled(true);
                        collectionItemInfo = accessibilityNodeInfo2.getCollectionItemInfo();
                        if (collectionItemInfo != null) {
                        }
                        accessibilityNodeInfo2.addAction(new AccessibilityNodeInfo.AccessibilityAction(R.id.acc_action_msg_options, LocaleController.getString("AccActionMessageOptions", R.string.AccActionMessageOptions)));
                        iconForCurrentState = u1Var.getIconForCurrentState();
                        if (iconForCurrentState != 0) {
                        }
                        accessibilityNodeInfo2.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, string2));
                        accessibilityNodeInfo2.addAction(new AccessibilityNodeInfo.AccessibilityAction(32, LocaleController.getString("AccActionEnterSelectionMode", R.string.AccActionEnterSelectionMode)));
                        miniIconForCurrentState = u1Var.getMiniIconForCurrentState();
                        if (miniIconForCurrentState == 2) {
                        }
                        z26 = u1Var.ya;
                        if (!z26) {
                        }
                        accessibilityNodeInfo2.addAction(new AccessibilityNodeInfo.AccessibilityAction(R.id.acc_action_summarize, LocaleController.getString("SummaryTitle", R.string.SummaryTitle)));
                        messageObject54 = u1Var.y7;
                        if (messageObject54.textLayoutBlocks != null) {
                        }
                        messageObject55 = u1Var.y7;
                        if (!messageObject55.isVoice()) {
                        }
                        mediaController = MediaController.getInstance();
                        messageObject56 = u1Var.y7;
                        if (mediaController.isPlayingMessage(messageObject56)) {
                        }
                        z27 = u1Var.L5;
                        if (z27) {
                        }
                        if (Build.VERSION.SDK_INT < 24) {
                        }
                        size = arrayList7.size();
                        int i652222 = 0;
                        i31 = 0;
                        while (i31 < size) {
                        }
                        z28 = u1Var.X6;
                        if (z28) {
                        }
                        size2 = arrayList6.size();
                        int i662222 = 0;
                        i32 = 0;
                        while (i32 < size2) {
                        }
                        z29 = u1Var.R2;
                        if (z29) {
                        }
                        z30 = u1Var.S2;
                        if (z30) {
                        }
                        staticLayout2 = u1Var.Z8;
                        if (staticLayout2 != null) {
                        }
                        i33 = u1Var.ua;
                        if (i33 != 1) {
                        }
                        accessibilityNodeInfo2.addChild(u1Var, 498);
                        if (u1Var.C9 != null) {
                        }
                        messageObject57 = u1Var.y7;
                        if (messageObject57 != null) {
                        }
                        staticLayoutArr7 = u1Var.fb;
                        if (staticLayoutArr7[0] != null) {
                        }
                        z31 = u1Var.j1;
                        if (z31) {
                        }
                        accessibilityNodeInfo2.setSelected(true);
                        return accessibilityNodeInfo2;
                    }
                }
            }
        }
        z18 = false;
        messageObject14 = u1Var.y7;
        if (messageObject14 != null) {
        }
        z19 = false;
        messageObject15 = u1Var.y7;
        if (messageObject15 != null) {
        }
        if (u1Var.C3 != null) {
        }
        SpannableStringBuilder spannableStringBuilder42 = new SpannableStringBuilder();
        if (u1Var.N7) {
        }
        accessibilityNodeInfo = obtain2;
        rectF4 = rectF9;
        arrayList6 = arrayList11;
        arrayList7 = arrayList12;
        z20 = u1Var.hb;
        if (z20) {
        }
        if (u1Var.L1 != null) {
        }
        messageObject16 = u1Var.y7;
        if (messageObject16.richLayout != null) {
        }
        messageObject17 = u1Var.y7;
        if (!TextUtils.isEmpty(messageObject17.messageText)) {
        }
        if (u1Var.L1 != null) {
        }
        messageObject19 = u1Var.y7;
        if (messageObject19.isMusic()) {
        }
        poll3 = u1Var.O6;
        if (poll3 != null) {
        }
        if (u1Var.L1 != null) {
        }
        messageObject23 = u1Var.y7;
        if (messageObject23.isVoiceTranscriptionOpen()) {
        }
        messageObject27 = u1Var.y7;
        if (messageObject27.isOut()) {
        }
        if (u1Var.getRepliesCount() > 0) {
        }
        messageObject28 = u1Var.y7;
        if (messageObject28.messageOwner.reactions != null) {
        }
        messageObject29 = u1Var.y7;
        if ((messageObject29.messageOwner.flags & 1024) != 0) {
        }
        spannableStringBuilder42.append((CharSequence) "\n");
        while (r5 < r2) {
        }
        u1Var.C3 = spannableStringBuilder42;
        u1Var.D3 = z18;
        u1Var.E3 = z19;
        u1Var.F3 = j3;
        if (Build.VERSION.SDK_INT >= 24) {
        }
        accessibilityNodeInfo2.setEnabled(true);
        collectionItemInfo = accessibilityNodeInfo2.getCollectionItemInfo();
        if (collectionItemInfo != null) {
        }
        accessibilityNodeInfo2.addAction(new AccessibilityNodeInfo.AccessibilityAction(R.id.acc_action_msg_options, LocaleController.getString("AccActionMessageOptions", R.string.AccActionMessageOptions)));
        iconForCurrentState = u1Var.getIconForCurrentState();
        if (iconForCurrentState != 0) {
        }
        accessibilityNodeInfo2.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, string2));
        accessibilityNodeInfo2.addAction(new AccessibilityNodeInfo.AccessibilityAction(32, LocaleController.getString("AccActionEnterSelectionMode", R.string.AccActionEnterSelectionMode)));
        miniIconForCurrentState = u1Var.getMiniIconForCurrentState();
        if (miniIconForCurrentState == 2) {
        }
        z26 = u1Var.ya;
        if (!z26) {
        }
        accessibilityNodeInfo2.addAction(new AccessibilityNodeInfo.AccessibilityAction(R.id.acc_action_summarize, LocaleController.getString("SummaryTitle", R.string.SummaryTitle)));
        messageObject54 = u1Var.y7;
        if (messageObject54.textLayoutBlocks != null) {
        }
        messageObject55 = u1Var.y7;
        if (!messageObject55.isVoice()) {
        }
        mediaController = MediaController.getInstance();
        messageObject56 = u1Var.y7;
        if (mediaController.isPlayingMessage(messageObject56)) {
        }
        z27 = u1Var.L5;
        if (z27) {
        }
        if (Build.VERSION.SDK_INT < 24) {
        }
        size = arrayList7.size();
        int i6522222 = 0;
        i31 = 0;
        while (i31 < size) {
        }
        z28 = u1Var.X6;
        if (z28) {
        }
        size2 = arrayList6.size();
        int i6622222 = 0;
        i32 = 0;
        while (i32 < size2) {
        }
        z29 = u1Var.R2;
        if (z29) {
        }
        z30 = u1Var.S2;
        if (z30) {
        }
        staticLayout2 = u1Var.Z8;
        if (staticLayout2 != null) {
        }
        i33 = u1Var.ua;
        if (i33 != 1) {
        }
        accessibilityNodeInfo2.addChild(u1Var, 498);
        if (u1Var.C9 != null) {
        }
        messageObject57 = u1Var.y7;
        if (messageObject57 != null) {
        }
        staticLayoutArr7 = u1Var.fb;
        if (staticLayoutArr7[0] != null) {
        }
        z31 = u1Var.j1;
        if (z31) {
        }
        accessibilityNodeInfo2.setSelected(true);
        return accessibilityNodeInfo2;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final boolean performAction(int i10, int i11, Bundle bundle) {
        l1 l1Var;
        j1 j1Var;
        TLRPC.Message message;
        TLRPC.MessageReplyHeader messageReplyHeader;
        u1 u1Var = this.d;
        ArrayList arrayList = u1Var.Y5;
        ArrayList arrayList2 = u1Var.o7;
        if (i10 == -1) {
            u1Var.performAccessibilityAction(i11, bundle);
            return true;
        }
        if (i11 == 64) {
            u1Var.I3(i10, 32768, null);
            return true;
        }
        if (i11 == 16) {
            if (i10 == 5000) {
                l1 l1Var2 = u1Var.Jc;
                if (l1Var2 != null) {
                    l1Var2.A0(u1Var, u1Var.Yb, 0.0f, 0.0f);
                    return true;
                }
            } else if (i10 >= 6000) {
                int[] iArr = {0};
                RichMessageLayout.RichBlock b10 = b(i10, iArr);
                if (b10 != null && b10.onAccessibilityElementClick(iArr[0], u1Var)) {
                    u1Var.I3(i10, 1, null);
                    AndroidUtilities.makeAccessibilityAnnouncement(b10.getAccessibilityElementStateDescription(iArr[0]));
                    return true;
                }
            } else if (i10 >= 3000) {
                ClickableSpan a2 = a(i10, true);
                if (a2 != null) {
                    u1Var.Jc.b1(u1Var, a2, false);
                    u1Var.I3(i10, 1, null);
                    return true;
                }
            } else {
                if (i10 < 2000) {
                    if (i10 >= 1000) {
                        int i12 = i10 - 1000;
                        if (i12 < arrayList2.size()) {
                            e0 e0Var = (e0) arrayList2.get(i12);
                            l1 l1Var3 = u1Var.Jc;
                            if (l1Var3 != null && !e0Var.m) {
                                BotInlineKeyboard.ButtonCustom buttonCustom = e0Var.j;
                                if (buttonCustom != null) {
                                    l1Var3.E(u1Var, buttonCustom);
                                } else {
                                    TL_keyboard.KeyboardInlineButton keyboardInlineButton = e0Var.i;
                                    if (keyboardInlineButton != null) {
                                        l1Var3.s1(u1Var, keyboardInlineButton);
                                    }
                                }
                            }
                            u1Var.I3(i10, 1, null);
                            return true;
                        }
                    } else if (i10 >= 500) {
                        int i13 = i10 - 500;
                        if (i13 < arrayList.size()) {
                            s1 s1Var = (s1) arrayList.get(i13);
                            if (u1Var.Jc != null) {
                                ArrayList arrayList3 = new ArrayList();
                                arrayList3.add(s1Var.s);
                                u1Var.Jc.j(u1Var, arrayList3, -1, 0, 0);
                            }
                            u1Var.I3(i10, 1, null);
                            return true;
                        }
                    } else {
                        if (i10 == 495) {
                            u1Var.x1();
                            return true;
                        }
                        if (i10 == 499) {
                            l1 l1Var4 = u1Var.Jc;
                            if (l1Var4 != null) {
                                l1Var4.V0(u1Var.b3, u1Var);
                                return true;
                            }
                        } else if (i10 == 492) {
                            l1 l1Var5 = u1Var.Jc;
                            if (l1Var5 != null) {
                                l1Var5.V0(5, u1Var);
                                return true;
                            }
                        } else if (i10 == 491) {
                            l1 l1Var6 = u1Var.Jc;
                            if (l1Var6 != null) {
                                l1Var6.V0(5, u1Var);
                                return true;
                            }
                        } else if (i10 == 490) {
                            l1 l1Var7 = u1Var.Jc;
                            if (l1Var7 != null) {
                                l1Var7.V0(31, u1Var);
                                return true;
                            }
                        } else if (i10 == 489) {
                            l1 l1Var8 = u1Var.Jc;
                            if (l1Var8 != null) {
                                l1Var8.V0(30, u1Var);
                                return true;
                            }
                        } else if (i10 == 498) {
                            l1 l1Var9 = u1Var.Jc;
                            if (l1Var9 != null) {
                                l1Var9.r(u1Var);
                                return true;
                            }
                        } else if (i10 == 497) {
                            if (u1Var.Jc != null && ((!u1Var.W7 || u1Var.U7 || u1Var.y7.getReplyTopMsgId() != 0) && (u1Var.y7.hasValidReplyMessageObject() || u1Var.y9 || ((message = u1Var.y7.messageOwner) != null && (messageReplyHeader = message.reply_to) != null && messageReplyHeader.reply_from != null)))) {
                                u1Var.Jc.h2(u1Var, u1Var.y7.getReplyMsgId(), 0.0f, 0.0f, false);
                                return true;
                            }
                        } else if (i10 == 494) {
                            l1 l1Var10 = u1Var.Jc;
                            if (l1Var10 != null) {
                                TLRPC.Chat chat = u1Var.jc;
                                if (chat != null) {
                                    l1Var10.T(u1Var, chat, u1Var.y7.messageOwner.fwd_from.channel_post, u1Var.g1, u1Var.h1, false);
                                    return true;
                                }
                                TLRPC.User user = u1Var.hc;
                                if (user != null) {
                                    l1Var10.A0(u1Var, user, u1Var.g1, u1Var.h1);
                                    return true;
                                }
                                if (u1Var.kc != null) {
                                    l1Var10.o(u1Var);
                                    return true;
                                }
                            }
                        } else if (i10 == 496) {
                            l1 l1Var11 = u1Var.Jc;
                            if (l1Var11 != null) {
                                if (u1Var.c8) {
                                    l1Var11.r(u1Var);
                                    return true;
                                }
                                l1Var11.u(u1Var);
                                return true;
                            }
                        } else if (i10 == 493 && (j1Var = u1Var.M5) != null) {
                            j1Var.m();
                            return true;
                        }
                    }
                    return false;
                }
                ClickableSpan a10 = a(i10, false);
                if (a10 != null) {
                    u1Var.Jc.b1(u1Var, a10, false);
                    u1Var.I3(i10, 1, null);
                    return true;
                }
            }
        } else if (i11 == 32) {
            ClickableSpan a11 = a(i10, i10 >= 3000);
            if (a11 != null && (l1Var = u1Var.Jc) != null) {
                l1Var.b1(u1Var, a11, true);
                u1Var.I3(i10, 2, null);
            }
        }
        return true;
    }
}
