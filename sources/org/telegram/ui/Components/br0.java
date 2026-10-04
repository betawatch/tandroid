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

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final /* synthetic */ class br0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ br0(ci.k2 k2Var, int i10) {
        this.a = 10;
        this.b = k2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String[] currentKeyboardLanguage;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i10 = this.a;
        int i11 = 0;
        Object obj = this.b;
        switch (i10) {
            case 0:
                er0 er0Var = (er0) obj;
                cr0[] cr0VarArr = er0Var.a;
                if (er0Var.b != 1) {
                    for (cr0 cr0Var : cr0VarArr) {
                        org.telegram.ui.ActionBar.i5 i5Var = cr0Var.d;
                        i5Var.setAlpha(1.0f);
                        i5Var.setScaleX(1.0f);
                        i5Var.setScaleY(1.0f);
                        cr0Var.e.setAlpha(0.0f);
                    }
                    er0Var.E = false;
                    AndroidUtilities.runOnUIThread(er0Var.G, 4000L);
                    break;
                } else {
                    er0Var.E = !er0Var.E;
                    int length = cr0VarArr.length;
                    while (i11 < length) {
                        cr0 cr0Var2 = cr0VarArr[i11];
                        org.telegram.ui.ActionBar.i5 i5Var2 = cr0Var2.d;
                        org.telegram.ui.ActionBar.i5 i5Var3 = cr0Var2.e;
                        i5Var2.setPivotX(0.0f);
                        i5Var3.setPivotX(0.0f);
                        if (er0Var.E) {
                            i5Var2.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                            i5Var3.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                        } else {
                            i5Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                            i5Var3.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                        }
                        i11++;
                    }
                    AndroidUtilities.runOnUIThread(er0Var.G, 4000L);
                    break;
                }
            case 1:
                ((cr0) obj).setVisibility(8);
                break;
            case 2:
                pv0 pv0Var = ((ds0) obj).G;
                if (pv0Var.C1) {
                    pv0Var.b1(false);
                    break;
                }
                break;
            case 3:
                ((nt0) obj).f.m1(false);
                break;
            case 4:
                org.telegram.ui.ActionBar.n2 n2Var = ((yt0) obj).f.v1;
                if (n2Var != null) {
                    n2Var.presentFragment(new PremiumPreviewFragment(0, "similar_channels"));
                    break;
                }
                break;
            case 5:
                ((br0) obj).run();
                break;
            case 6:
                zu0 zu0Var = (zu0) obj;
                ArrayList arrayList3 = zu0Var.f;
                if (zu0Var.h) {
                    zu0Var.h = false;
                    ArrayList<Long> arrayList4 = new ArrayList<>();
                    while (i11 < arrayList3.size()) {
                        if (((SavedMessagesController.SavedDialog) arrayList3.get(i11)).pinned) {
                            arrayList4.add(Long.valueOf(((SavedMessagesController.SavedDialog) arrayList3.get(i11)).dialogId));
                        }
                        i11++;
                    }
                    zu0Var.x.v1.getMessagesController().getSavedMessagesController().updatePinnedOrder(arrayList4);
                    break;
                }
                break;
            case 7:
                ((av0) obj).F();
                break;
            case 8:
                ((lw0) obj).X();
                break;
            case 9:
                ((uw0) obj).getClass();
                break;
            case 10:
                ((rx0) obj).l0(0);
                break;
            case 11:
                mx0 mx0Var = (mx0) obj;
                if (!mx0Var.w) {
                    mx0Var.y = 0.0f;
                    break;
                }
                break;
            case 12:
                ((yy0) obj).b();
                break;
            case 13:
                iz0 iz0Var = (iz0) obj;
                int i12 = iz0Var.a;
                iz0Var.F = null;
                gz0 gz0Var = iz0Var.c;
                if (gz0Var != null && gz0Var.getEditField() != null && iz0Var.c.getFieldText() != null) {
                    int selectionStart = iz0Var.c.getEditField().getSelectionStart();
                    int selectionEnd = iz0Var.c.getEditField().getSelectionEnd();
                    if (selectionStart != selectionEnd) {
                        iz0Var.s = false;
                        ai.f0 f0Var = iz0Var.d;
                        if (f0Var != null) {
                            f0Var.invalidate();
                            break;
                        }
                    } else {
                        CharSequence fieldText = iz0Var.c.getFieldText();
                        boolean z10 = fieldText instanceof Spanned;
                        Emoji.EmojiSpan[] emojiSpanArr = z10 ? (Emoji.EmojiSpan[]) ((Spanned) fieldText).getSpans(Math.max(0, selectionEnd - 24), selectionEnd, Emoji.EmojiSpan.class) : null;
                        if (emojiSpanArr == null || emojiSpanArr.length <= 0 || !SharedConfig.suggestAnimatedEmoji || !UserConfig.getInstance(i12).isPremium()) {
                            z5[] z5VarArr = z10 ? (z5[]) ((Spanned) fieldText).getSpans(Math.max(0, selectionEnd), selectionEnd, z5.class) : null;
                            if ((z5VarArr == null || z5VarArr.length == 0) && selectionEnd < 52) {
                                iz0Var.s = true;
                                iz0Var.c();
                                iz0Var.T = null;
                                String substring = fieldText.toString().substring(0, selectionEnd);
                                if (substring != null) {
                                    String str = iz0Var.H;
                                    if (str == null || iz0Var.G != 1 || !str.equals(substring) || iz0Var.x || (arrayList = iz0Var.w) == null || arrayList.isEmpty()) {
                                        int i13 = iz0Var.I + 1;
                                        iz0Var.I = i13;
                                        long currentTimeMillis = System.currentTimeMillis();
                                        if (iz0Var.J == null || Math.abs(currentTimeMillis - iz0Var.L) > 360) {
                                            iz0Var.L = currentTimeMillis;
                                            currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
                                        } else {
                                            iz0Var.L = currentTimeMillis;
                                            currentKeyboardLanguage = iz0Var.J;
                                        }
                                        String[] strArr = iz0Var.J;
                                        if (strArr == null || !Arrays.equals(currentKeyboardLanguage, strArr)) {
                                            MediaDataController.getInstance(i12).fetchNewEmojiKeywords(currentKeyboardLanguage);
                                        }
                                        iz0Var.J = currentKeyboardLanguage;
                                        Runnable runnable = iz0Var.K;
                                        if (runnable != null) {
                                            AndroidUtilities.cancelRunOnUIThread(runnable);
                                            iz0Var.K = null;
                                        }
                                        iz0Var.K = new ai.c9(iz0Var, currentKeyboardLanguage, substring, i13, 27);
                                        ArrayList arrayList5 = iz0Var.w;
                                        if (arrayList5 == null || arrayList5.isEmpty()) {
                                            AndroidUtilities.runOnUIThread(iz0Var.K, 600L);
                                        } else {
                                            iz0Var.K.run();
                                        }
                                    } else {
                                        iz0Var.v = false;
                                        iz0Var.c();
                                        iz0Var.d.setVisibility(0);
                                        iz0Var.U = AndroidUtilities.dp(10.0f);
                                        iz0Var.d.invalidate();
                                    }
                                }
                                ai.f0 f0Var2 = iz0Var.d;
                                if (f0Var2 != null) {
                                    f0Var2.invalidate();
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
                                    iz0Var.s = true;
                                    iz0Var.c();
                                    iz0Var.T = emojiSpan;
                                    iz0Var.W = null;
                                    iz0Var.V = null;
                                    if (substring2 != null) {
                                        String str2 = iz0Var.H;
                                        if (str2 == null || iz0Var.G != 2 || !str2.equals(substring2) || iz0Var.x || (arrayList2 = iz0Var.w) == null || arrayList2.isEmpty()) {
                                            int i14 = iz0Var.I + 1;
                                            iz0Var.I = i14;
                                            Runnable runnable2 = iz0Var.K;
                                            if (runnable2 != null) {
                                                AndroidUtilities.cancelRunOnUIThread(runnable2);
                                            }
                                            iz0Var.K = new zm(iz0Var, substring2, i14, 21);
                                            ArrayList arrayList6 = iz0Var.w;
                                            if (arrayList6 == null || arrayList6.isEmpty()) {
                                                AndroidUtilities.runOnUIThread(iz0Var.K, 600L);
                                            } else {
                                                iz0Var.K.run();
                                            }
                                        } else {
                                            iz0Var.v = false;
                                            iz0Var.c();
                                            ai.f0 f0Var3 = iz0Var.d;
                                            if (f0Var3 != null) {
                                                f0Var3.setVisibility(0);
                                                iz0Var.d.invalidate();
                                            }
                                        }
                                    }
                                    ai.f0 f0Var4 = iz0Var.d;
                                    if (f0Var4 != null) {
                                        f0Var4.invalidate();
                                        break;
                                    }
                                }
                            }
                        }
                        Runnable runnable3 = iz0Var.K;
                        if (runnable3 != null) {
                            AndroidUtilities.cancelRunOnUIThread(runnable3);
                            iz0Var.K = null;
                        }
                        iz0Var.s = false;
                        ai.f0 f0Var5 = iz0Var.d;
                        if (f0Var5 != null) {
                            f0Var5.invalidate();
                            break;
                        }
                    }
                } else {
                    iz0Var.s = false;
                    iz0Var.v = true;
                    ai.f0 f0Var6 = iz0Var.d;
                    if (f0Var6 != null) {
                        f0Var6.invalidate();
                        break;
                    }
                }
                break;
            case 14:
                oz0 oz0Var = (oz0) obj;
                oz0Var.G = null;
                oz0Var.b();
                break;
            case 15:
                boolean[] zArr = (boolean[]) obj;
                if (!zArr[0]) {
                    SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
                    globalMainSettings.edit().putInt("showchattagsinfo", globalMainSettings.getInt("showchattagsinfo", 3) - 1).apply();
                    zArr[0] = true;
                    break;
                }
                break;
            case 16:
                ((l11) obj).a();
                break;
            case 17:
                ArrayList arrayList7 = ((s11) obj).a;
                for (int i15 = 0; i15 < arrayList7.size(); i15++) {
                    ((View) arrayList7.get(i15)).setVisibility(8);
                    if (arrayList7.get(i15) instanceof org.telegram.ui.Cells.u1) {
                        ((org.telegram.ui.Cells.u1) arrayList7.get(i15)).J3(false, false);
                        ((org.telegram.ui.Cells.u1) arrayList7.get(i15)).L3(false, false, false);
                    }
                }
                break;
            case 18:
                s21 s21Var = (s21) obj;
                s21Var.J = null;
                s21Var.H.animate().scaleX(1.0f).scaleY(1.0f).setDuration(150L).setInterpolator(tr.f).start();
                break;
            case 19:
                w21 w21Var = (w21) obj;
                ViewPropertyAnimator duration = w21Var.animate().alpha(0.0f).setListener(new hd0(w21Var, 23)).setDuration(300L);
                w21Var.b = duration;
                duration.start();
                break;
            case 20:
                y21 y21Var = (y21) obj;
                Utilities.Callback callback = y21Var.b;
                if (callback != null) {
                    callback.run(Long.valueOf(y21Var.a.s));
                    break;
                }
                break;
            case 21:
                v31 v31Var = ((m31) obj).b;
                if (v31Var.k()) {
                    v31Var.l();
                    break;
                }
                break;
            case 22:
                MessageObject messageObject = (MessageObject) obj;
                NotificationCenter.getInstance(messageObject.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.voiceTranscriptionUpdate, messageObject);
                break;
            case 23:
                ((Utilities.Callback2) obj).run(null, Boolean.FALSE);
                break;
            case 24:
                ((org.telegram.ui.ActionBar.n1) obj).dismiss();
                break;
            case 25:
                ((d51) obj).c.setVisibility(8);
                break;
            case 26:
                ((org.telegram.ui.wk) obj).c.presentFragment(new org.telegram.ui.y31());
                break;
            case 27:
                ((n51) obj).requestLayout();
                break;
            case 28:
                ((e61) obj).f();
                break;
            default:
                UndoView undoView = (UndoView) obj;
                int i16 = UndoView.e0;
                undoView.getClass();
                try {
                    undoView.f.performHapticFeedback(3, 2);
                    break;
                } catch (Exception unused) {
                    return;
                }
        }
    }

    public /* synthetic */ br0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }
}
