package org.telegram.ui.Components;

import android.content.SharedPreferences;
import android.text.Spanned;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SavedMessagesController;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class nq0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ nq0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String[] currentKeyboardLanguage;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i10 = this.a;
        Object obj = this.b;
        switch (i10) {
            case 0:
                ((oq0) obj).setVisibility(8);
                break;
            case 1:
                yu0 yu0Var = ((nr0) obj).D;
                if (yu0Var.z1) {
                    yu0Var.b1(false);
                    break;
                }
                break;
            case 2:
                ((vs0) obj).f.m1(false);
                break;
            case 3:
                org.telegram.ui.ActionBar.p2 p2Var = ((gt0) obj).f.s1;
                if (p2Var != null) {
                    p2Var.presentFragment(new PremiumPreviewFragment(0, "similar_channels"));
                    break;
                }
                break;
            case 4:
                ((nq0) obj).run();
                break;
            case 5:
                hu0 hu0Var = (hu0) obj;
                ArrayList arrayList3 = hu0Var.f;
                if (hu0Var.h) {
                    hu0Var.h = false;
                    ArrayList<Long> arrayList4 = new ArrayList<>();
                    for (int i11 = 0; i11 < arrayList3.size(); i11++) {
                        if (((SavedMessagesController.SavedDialog) arrayList3.get(i11)).pinned) {
                            arrayList4.add(Long.valueOf(((SavedMessagesController.SavedDialog) arrayList3.get(i11)).dialogId));
                        }
                    }
                    hu0Var.x.s1.getMessagesController().getSavedMessagesController().updatePinnedOrder(arrayList4);
                    break;
                }
                break;
            case 6:
                ((ju0) obj).F();
                break;
            case 7:
                ((qv0) obj).X();
                break;
            case 8:
                ((zv0) obj).getClass();
                break;
            case 9:
                sw0 sw0Var = (sw0) obj;
                if (!sw0Var.w) {
                    sw0Var.y = 0.0f;
                    break;
                }
                break;
            case 10:
                ((fy0) obj).b();
                break;
            case 11:
                qy0 qy0Var = (qy0) obj;
                int i12 = qy0Var.a;
                qy0Var.C = null;
                oy0 oy0Var = qy0Var.c;
                if (oy0Var != null && oy0Var.getEditField() != null && qy0Var.c.getFieldText() != null) {
                    int selectionStart = qy0Var.c.getEditField().getSelectionStart();
                    int selectionEnd = qy0Var.c.getEditField().getSelectionEnd();
                    if (selectionStart != selectionEnd) {
                        qy0Var.s = false;
                        dg.u2 u2Var = qy0Var.d;
                        if (u2Var != null) {
                            u2Var.invalidate();
                            break;
                        }
                    } else {
                        CharSequence fieldText = qy0Var.c.getFieldText();
                        boolean z4 = fieldText instanceof Spanned;
                        Emoji.EmojiSpan[] emojiSpanArr = z4 ? (Emoji.EmojiSpan[]) ((Spanned) fieldText).getSpans(Math.max(0, selectionEnd - 24), selectionEnd, Emoji.EmojiSpan.class) : null;
                        if (emojiSpanArr == null || emojiSpanArr.length <= 0 || !SharedConfig.suggestAnimatedEmoji || !UserConfig.getInstance(i12).isPremium()) {
                            u5[] u5VarArr = z4 ? (u5[]) ((Spanned) fieldText).getSpans(Math.max(0, selectionEnd), selectionEnd, u5.class) : null;
                            if ((u5VarArr == null || u5VarArr.length == 0) && selectionEnd < 52) {
                                qy0Var.s = true;
                                qy0Var.c();
                                qy0Var.Q = null;
                                String substring = fieldText.toString().substring(0, selectionEnd);
                                if (substring != null) {
                                    String str = qy0Var.E;
                                    if (str == null || qy0Var.D != 1 || !str.equals(substring) || qy0Var.x || (arrayList = qy0Var.w) == null || arrayList.isEmpty()) {
                                        int i13 = qy0Var.F + 1;
                                        qy0Var.F = i13;
                                        long currentTimeMillis = System.currentTimeMillis();
                                        if (qy0Var.G == null || Math.abs(currentTimeMillis - qy0Var.I) > 360) {
                                            qy0Var.I = currentTimeMillis;
                                            currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
                                        } else {
                                            qy0Var.I = currentTimeMillis;
                                            currentKeyboardLanguage = qy0Var.G;
                                        }
                                        String[] strArr = qy0Var.G;
                                        if (strArr == null || !Arrays.equals(currentKeyboardLanguage, strArr)) {
                                            MediaDataController.getInstance(i12).fetchNewEmojiKeywords(currentKeyboardLanguage);
                                        }
                                        qy0Var.G = currentKeyboardLanguage;
                                        Runnable runnable = qy0Var.H;
                                        if (runnable != null) {
                                            AndroidUtilities.cancelRunOnUIThread(runnable);
                                            qy0Var.H = null;
                                        }
                                        qy0Var.H = new cg.v1(qy0Var, currentKeyboardLanguage, substring, i13, 26);
                                        ArrayList arrayList5 = qy0Var.w;
                                        if (arrayList5 == null || arrayList5.isEmpty()) {
                                            AndroidUtilities.runOnUIThread(qy0Var.H, 600L);
                                        } else {
                                            qy0Var.H.run();
                                        }
                                    } else {
                                        qy0Var.v = false;
                                        qy0Var.c();
                                        qy0Var.d.setVisibility(0);
                                        qy0Var.R = AndroidUtilities.dp(10.0f);
                                        qy0Var.d.invalidate();
                                    }
                                }
                                dg.u2 u2Var2 = qy0Var.d;
                                if (u2Var2 != null) {
                                    u2Var2.invalidate();
                                    break;
                                }
                            }
                        } else {
                            Emoji.EmojiSpan emojiSpan = emojiSpanArr[emojiSpanArr.length - 1];
                            if (emojiSpan != null) {
                                Spanned spanned = (Spanned) fieldText;
                                int spanStart = spanned.getSpanStart(emojiSpan);
                                int spanEnd = spanned.getSpanEnd(emojiSpan);
                                if (selectionStart == spanEnd) {
                                    String substring2 = fieldText.toString().substring(spanStart, spanEnd);
                                    qy0Var.s = true;
                                    qy0Var.c();
                                    qy0Var.Q = emojiSpan;
                                    qy0Var.T = null;
                                    qy0Var.S = null;
                                    if (substring2 != null) {
                                        String str2 = qy0Var.E;
                                        if (str2 == null || qy0Var.D != 2 || !str2.equals(substring2) || qy0Var.x || (arrayList2 = qy0Var.w) == null || arrayList2.isEmpty()) {
                                            int i14 = qy0Var.F + 1;
                                            qy0Var.F = i14;
                                            Runnable runnable2 = qy0Var.H;
                                            if (runnable2 != null) {
                                                AndroidUtilities.cancelRunOnUIThread(runnable2);
                                            }
                                            qy0Var.H = new ey(qy0Var, substring2, i14, 19);
                                            ArrayList arrayList6 = qy0Var.w;
                                            if (arrayList6 == null || arrayList6.isEmpty()) {
                                                AndroidUtilities.runOnUIThread(qy0Var.H, 600L);
                                            } else {
                                                qy0Var.H.run();
                                            }
                                        } else {
                                            qy0Var.v = false;
                                            qy0Var.c();
                                            dg.u2 u2Var3 = qy0Var.d;
                                            if (u2Var3 != null) {
                                                u2Var3.setVisibility(0);
                                                qy0Var.d.invalidate();
                                            }
                                        }
                                    }
                                    dg.u2 u2Var4 = qy0Var.d;
                                    if (u2Var4 != null) {
                                        u2Var4.invalidate();
                                        break;
                                    }
                                }
                            }
                        }
                        Runnable runnable3 = qy0Var.H;
                        if (runnable3 != null) {
                            AndroidUtilities.cancelRunOnUIThread(runnable3);
                            qy0Var.H = null;
                        }
                        qy0Var.s = false;
                        dg.u2 u2Var5 = qy0Var.d;
                        if (u2Var5 != null) {
                            u2Var5.invalidate();
                            break;
                        }
                    }
                } else {
                    qy0Var.s = false;
                    qy0Var.v = true;
                    dg.u2 u2Var6 = qy0Var.d;
                    if (u2Var6 != null) {
                        u2Var6.invalidate();
                        break;
                    }
                }
                break;
            case 12:
                wy0 wy0Var = (wy0) obj;
                wy0Var.D = null;
                wy0Var.b();
                break;
            case 13:
                boolean[] zArr = (boolean[]) obj;
                if (!zArr[0]) {
                    SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
                    globalMainSettings.edit().putInt("showchattagsinfo", globalMainSettings.getInt("showchattagsinfo", 3) - 1).apply();
                    zArr[0] = true;
                    break;
                }
                break;
            case 14:
                ((r01) obj).a();
                break;
            case 15:
                ArrayList arrayList7 = ((x01) obj).a;
                for (int i15 = 0; i15 < arrayList7.size(); i15++) {
                    ((View) arrayList7.get(i15)).setVisibility(8);
                    if (arrayList7.get(i15) instanceof org.telegram.ui.Cells.s1) {
                        ((org.telegram.ui.Cells.s1) arrayList7.get(i15)).J3(false, false);
                        ((org.telegram.ui.Cells.s1) arrayList7.get(i15)).L3(false, false, false);
                    }
                }
                break;
            case 16:
                w11 w11Var = (w11) obj;
                w11Var.G = null;
                w11Var.E.animate().scaleX(1.0f).scaleY(1.0f).setDuration(150L).setInterpolator(mr.f).start();
                break;
            case 17:
                a21 a21Var = (a21) obj;
                ViewPropertyAnimator duration = a21Var.animate().alpha(0.0f).setListener(new od0(a21Var, 21)).setDuration(300L);
                a21Var.b = duration;
                duration.start();
                break;
            case 18:
                c21 c21Var = (c21) obj;
                Utilities.Callback callback = c21Var.b;
                if (callback != null) {
                    callback.run(Long.valueOf(c21Var.a.s));
                    break;
                }
                break;
            case 19:
                w21 w21Var = ((n21) obj).b;
                if (w21Var.k()) {
                    w21Var.l();
                    break;
                }
                break;
            case 20:
                MessageObject messageObject = (MessageObject) obj;
                NotificationCenter.getInstance(messageObject.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.voiceTranscriptionUpdate, messageObject);
                break;
            case 21:
                ((Utilities.Callback2) obj).run(null, Boolean.FALSE);
                break;
            case 22:
                ((org.telegram.ui.ActionBar.p1) obj).dismiss();
                break;
            case 23:
                ((f41) obj).c.setVisibility(8);
                break;
            case 24:
                ((org.telegram.ui.yk) obj).c.presentFragment(new org.telegram.ui.t31());
                break;
            case 25:
                ((p41) obj).requestLayout();
                break;
            case 26:
                ((g51) obj).f();
                break;
            case 27:
                UndoView undoView = (UndoView) obj;
                int i16 = UndoView.b0;
                undoView.getClass();
                try {
                    undoView.f.performHapticFeedback(3, 2);
                    break;
                } catch (Exception unused) {
                    return;
                }
            case 28:
                ((j61) obj).invalidateSelf();
                break;
            default:
                vz vzVar = ((w61) obj).b;
                if (vzVar != null) {
                    vzVar.e(false, true, false);
                    break;
                }
                break;
        }
    }
}
