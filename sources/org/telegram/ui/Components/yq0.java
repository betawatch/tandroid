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

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final /* synthetic */ class yq0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ yq0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
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
                br0 br0Var = (br0) obj;
                zq0[] zq0VarArr = br0Var.a;
                if (br0Var.b != 1) {
                    for (zq0 zq0Var : zq0VarArr) {
                        org.telegram.ui.ActionBar.j5 j5Var = zq0Var.d;
                        j5Var.setAlpha(1.0f);
                        j5Var.setScaleX(1.0f);
                        j5Var.setScaleY(1.0f);
                        zq0Var.e.setAlpha(0.0f);
                    }
                    br0Var.E = false;
                    AndroidUtilities.runOnUIThread(br0Var.G, 4000L);
                    break;
                } else {
                    br0Var.E = !br0Var.E;
                    int length = zq0VarArr.length;
                    while (i11 < length) {
                        zq0 zq0Var2 = zq0VarArr[i11];
                        org.telegram.ui.ActionBar.j5 j5Var2 = zq0Var2.d;
                        org.telegram.ui.ActionBar.j5 j5Var3 = zq0Var2.e;
                        j5Var2.setPivotX(0.0f);
                        j5Var3.setPivotX(0.0f);
                        if (br0Var.E) {
                            j5Var2.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                            j5Var3.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                        } else {
                            j5Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                            j5Var3.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                        }
                        i11++;
                    }
                    AndroidUtilities.runOnUIThread(br0Var.G, 4000L);
                    break;
                }
            case 1:
                ((zq0) obj).setVisibility(8);
                break;
            case 2:
                lv0 lv0Var = ((zr0) obj).G;
                if (lv0Var.C1) {
                    lv0Var.b1(false);
                    break;
                }
                break;
            case 3:
                ((jt0) obj).f.m1(false);
                break;
            case 4:
                org.telegram.ui.ActionBar.n2 n2Var = ((ut0) obj).f.v1;
                if (n2Var != null) {
                    n2Var.presentFragment(new PremiumPreviewFragment(0, "similar_channels"));
                    break;
                }
                break;
            case 5:
                ((yq0) obj).run();
                break;
            case 6:
                vu0 vu0Var = (vu0) obj;
                ArrayList arrayList3 = vu0Var.f;
                if (vu0Var.h) {
                    vu0Var.h = false;
                    ArrayList<Long> arrayList4 = new ArrayList<>();
                    while (i11 < arrayList3.size()) {
                        if (((SavedMessagesController.SavedDialog) arrayList3.get(i11)).pinned) {
                            arrayList4.add(Long.valueOf(((SavedMessagesController.SavedDialog) arrayList3.get(i11)).dialogId));
                        }
                        i11++;
                    }
                    vu0Var.x.v1.getMessagesController().getSavedMessagesController().updatePinnedOrder(arrayList4);
                    break;
                }
                break;
            case 7:
                ((wu0) obj).F();
                break;
            case 8:
                ((cw0) obj).X();
                break;
            case 9:
                ((lw0) obj).getClass();
                break;
            case 10:
                ex0 ex0Var = (ex0) obj;
                if (!ex0Var.w) {
                    ex0Var.y = 0.0f;
                    break;
                }
                break;
            case 11:
                ((qy0) obj).b();
                break;
            case 12:
                az0 az0Var = (az0) obj;
                int i12 = az0Var.a;
                az0Var.F = null;
                yy0 yy0Var = az0Var.c;
                if (yy0Var != null && yy0Var.getEditField() != null && az0Var.c.getFieldText() != null) {
                    int selectionStart = az0Var.c.getEditField().getSelectionStart();
                    int selectionEnd = az0Var.c.getEditField().getSelectionEnd();
                    if (selectionStart != selectionEnd) {
                        az0Var.s = false;
                        ai.f0 f0Var = az0Var.d;
                        if (f0Var != null) {
                            f0Var.invalidate();
                            break;
                        }
                    } else {
                        CharSequence fieldText = az0Var.c.getFieldText();
                        boolean z10 = fieldText instanceof Spanned;
                        Emoji.EmojiSpan[] emojiSpanArr = z10 ? (Emoji.EmojiSpan[]) ((Spanned) fieldText).getSpans(Math.max(0, selectionEnd - 24), selectionEnd, Emoji.EmojiSpan.class) : null;
                        if (emojiSpanArr == null || emojiSpanArr.length <= 0 || !SharedConfig.suggestAnimatedEmoji || !UserConfig.getInstance(i12).isPremium()) {
                            y5[] y5VarArr = z10 ? (y5[]) ((Spanned) fieldText).getSpans(Math.max(0, selectionEnd), selectionEnd, y5.class) : null;
                            if ((y5VarArr == null || y5VarArr.length == 0) && selectionEnd < 52) {
                                az0Var.s = true;
                                az0Var.c();
                                az0Var.T = null;
                                String substring = fieldText.toString().substring(0, selectionEnd);
                                if (substring != null) {
                                    String str = az0Var.H;
                                    if (str == null || az0Var.G != 1 || !str.equals(substring) || az0Var.x || (arrayList = az0Var.w) == null || arrayList.isEmpty()) {
                                        int i13 = az0Var.I + 1;
                                        az0Var.I = i13;
                                        long currentTimeMillis = System.currentTimeMillis();
                                        if (az0Var.J == null || Math.abs(currentTimeMillis - az0Var.L) > 360) {
                                            az0Var.L = currentTimeMillis;
                                            currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
                                        } else {
                                            az0Var.L = currentTimeMillis;
                                            currentKeyboardLanguage = az0Var.J;
                                        }
                                        String[] strArr = az0Var.J;
                                        if (strArr == null || !Arrays.equals(currentKeyboardLanguage, strArr)) {
                                            MediaDataController.getInstance(i12).fetchNewEmojiKeywords(currentKeyboardLanguage);
                                        }
                                        az0Var.J = currentKeyboardLanguage;
                                        Runnable runnable = az0Var.K;
                                        if (runnable != null) {
                                            AndroidUtilities.cancelRunOnUIThread(runnable);
                                            az0Var.K = null;
                                        }
                                        az0Var.K = new ai.c9(az0Var, currentKeyboardLanguage, substring, i13, 27);
                                        ArrayList arrayList5 = az0Var.w;
                                        if (arrayList5 == null || arrayList5.isEmpty()) {
                                            AndroidUtilities.runOnUIThread(az0Var.K, 600L);
                                        } else {
                                            az0Var.K.run();
                                        }
                                    } else {
                                        az0Var.v = false;
                                        az0Var.c();
                                        az0Var.d.setVisibility(0);
                                        az0Var.U = AndroidUtilities.dp(10.0f);
                                        az0Var.d.invalidate();
                                    }
                                }
                                ai.f0 f0Var2 = az0Var.d;
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
                                    az0Var.s = true;
                                    az0Var.c();
                                    az0Var.T = emojiSpan;
                                    az0Var.W = null;
                                    az0Var.V = null;
                                    if (substring2 != null) {
                                        String str2 = az0Var.H;
                                        if (str2 == null || az0Var.G != 2 || !str2.equals(substring2) || az0Var.x || (arrayList2 = az0Var.w) == null || arrayList2.isEmpty()) {
                                            int i14 = az0Var.I + 1;
                                            az0Var.I = i14;
                                            Runnable runnable2 = az0Var.K;
                                            if (runnable2 != null) {
                                                AndroidUtilities.cancelRunOnUIThread(runnable2);
                                            }
                                            az0Var.K = new wm(az0Var, substring2, i14, 21);
                                            ArrayList arrayList6 = az0Var.w;
                                            if (arrayList6 == null || arrayList6.isEmpty()) {
                                                AndroidUtilities.runOnUIThread(az0Var.K, 600L);
                                            } else {
                                                az0Var.K.run();
                                            }
                                        } else {
                                            az0Var.v = false;
                                            az0Var.c();
                                            ai.f0 f0Var3 = az0Var.d;
                                            if (f0Var3 != null) {
                                                f0Var3.setVisibility(0);
                                                az0Var.d.invalidate();
                                            }
                                        }
                                    }
                                    ai.f0 f0Var4 = az0Var.d;
                                    if (f0Var4 != null) {
                                        f0Var4.invalidate();
                                        break;
                                    }
                                }
                            }
                        }
                        Runnable runnable3 = az0Var.K;
                        if (runnable3 != null) {
                            AndroidUtilities.cancelRunOnUIThread(runnable3);
                            az0Var.K = null;
                        }
                        az0Var.s = false;
                        ai.f0 f0Var5 = az0Var.d;
                        if (f0Var5 != null) {
                            f0Var5.invalidate();
                            break;
                        }
                    }
                } else {
                    az0Var.s = false;
                    az0Var.v = true;
                    ai.f0 f0Var6 = az0Var.d;
                    if (f0Var6 != null) {
                        f0Var6.invalidate();
                        break;
                    }
                }
                break;
            case 13:
                gz0 gz0Var = (gz0) obj;
                gz0Var.G = null;
                gz0Var.b();
                break;
            case 14:
                boolean[] zArr = (boolean[]) obj;
                if (!zArr[0]) {
                    SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
                    globalMainSettings.edit().putInt("showchattagsinfo", globalMainSettings.getInt("showchattagsinfo", 3) - 1).apply();
                    zArr[0] = true;
                    break;
                }
                break;
            case 15:
                ((d11) obj).a();
                break;
            case 16:
                ArrayList arrayList7 = ((k11) obj).a;
                for (int i15 = 0; i15 < arrayList7.size(); i15++) {
                    ((View) arrayList7.get(i15)).setVisibility(8);
                    if (arrayList7.get(i15) instanceof org.telegram.ui.Cells.u1) {
                        ((org.telegram.ui.Cells.u1) arrayList7.get(i15)).J3(false, false);
                        ((org.telegram.ui.Cells.u1) arrayList7.get(i15)).L3(false, false, false);
                    }
                }
                break;
            case 17:
                k21 k21Var = (k21) obj;
                k21Var.J = null;
                k21Var.H.animate().scaleX(1.0f).scaleY(1.0f).setDuration(150L).setInterpolator(qr.f).start();
                break;
            case 18:
                o21 o21Var = (o21) obj;
                ViewPropertyAnimator duration = o21Var.animate().alpha(0.0f).setListener(new gd0(o21Var, 23)).setDuration(300L);
                o21Var.b = duration;
                duration.start();
                break;
            case 19:
                q21 q21Var = (q21) obj;
                Utilities.Callback callback = q21Var.b;
                if (callback != null) {
                    callback.run(Long.valueOf(q21Var.a.s));
                    break;
                }
                break;
            case 20:
                n31 n31Var = ((e31) obj).b;
                if (n31Var.k()) {
                    n31Var.l();
                    break;
                }
                break;
            case 21:
                MessageObject messageObject = (MessageObject) obj;
                NotificationCenter.getInstance(messageObject.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.voiceTranscriptionUpdate, messageObject);
                break;
            case 22:
                ((Utilities.Callback2) obj).run(null, Boolean.FALSE);
                break;
            case 23:
                ((org.telegram.ui.ActionBar.n1) obj).dismiss();
                break;
            case 24:
                ((v41) obj).c.setVisibility(8);
                break;
            case 25:
                ((org.telegram.ui.zk) obj).c.presentFragment(new org.telegram.ui.f41());
                break;
            case 26:
                ((f51) obj).requestLayout();
                break;
            case 27:
                ((w51) obj).f();
                break;
            case 28:
                UndoView undoView = (UndoView) obj;
                int i16 = UndoView.e0;
                undoView.getClass();
                try {
                    undoView.f.performHapticFeedback(3, 2);
                    break;
                } catch (Exception unused) {
                    return;
                }
            default:
                ((x61) obj).invalidateSelf();
                break;
        }
    }
}
