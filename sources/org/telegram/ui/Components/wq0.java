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

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wq0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ wq0(Object obj, int i10) {
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
                zq0 zq0Var = (zq0) obj;
                xq0[] xq0VarArr = zq0Var.a;
                if (zq0Var.b != 1) {
                    for (xq0 xq0Var : xq0VarArr) {
                        org.telegram.ui.ActionBar.h5 h5Var = xq0Var.d;
                        h5Var.setAlpha(1.0f);
                        h5Var.setScaleX(1.0f);
                        h5Var.setScaleY(1.0f);
                        xq0Var.e.setAlpha(0.0f);
                    }
                    zq0Var.E = false;
                    AndroidUtilities.runOnUIThread(zq0Var.G, 4000L);
                    break;
                } else {
                    zq0Var.E = !zq0Var.E;
                    int length = xq0VarArr.length;
                    while (i11 < length) {
                        xq0 xq0Var2 = xq0VarArr[i11];
                        org.telegram.ui.ActionBar.h5 h5Var2 = xq0Var2.d;
                        org.telegram.ui.ActionBar.h5 h5Var3 = xq0Var2.e;
                        h5Var2.setPivotX(0.0f);
                        h5Var3.setPivotX(0.0f);
                        if (zq0Var.E) {
                            h5Var2.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                            h5Var3.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                        } else {
                            h5Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                            h5Var3.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                        }
                        i11++;
                    }
                    AndroidUtilities.runOnUIThread(zq0Var.G, 4000L);
                    break;
                }
            case 1:
                ((xq0) obj).setVisibility(8);
                break;
            case 2:
                jv0 jv0Var = ((xr0) obj).G;
                if (jv0Var.C1) {
                    jv0Var.b1(false);
                    break;
                }
                break;
            case 3:
                ((ht0) obj).f.m1(false);
                break;
            case 4:
                org.telegram.ui.ActionBar.m2 m2Var = ((st0) obj).f.v1;
                if (m2Var != null) {
                    m2Var.presentFragment(new PremiumPreviewFragment(0, "similar_channels"));
                    break;
                }
                break;
            case 5:
                ((wq0) obj).run();
                break;
            case 6:
                tu0 tu0Var = (tu0) obj;
                ArrayList arrayList3 = tu0Var.f;
                if (tu0Var.h) {
                    tu0Var.h = false;
                    ArrayList<Long> arrayList4 = new ArrayList<>();
                    while (i11 < arrayList3.size()) {
                        if (((SavedMessagesController.SavedDialog) arrayList3.get(i11)).pinned) {
                            arrayList4.add(Long.valueOf(((SavedMessagesController.SavedDialog) arrayList3.get(i11)).dialogId));
                        }
                        i11++;
                    }
                    tu0Var.x.v1.getMessagesController().getSavedMessagesController().updatePinnedOrder(arrayList4);
                    break;
                }
                break;
            case 7:
                ((uu0) obj).F();
                break;
            case 8:
                ((aw0) obj).X();
                break;
            case 9:
                ((jw0) obj).getClass();
                break;
            case 10:
                bx0 bx0Var = (bx0) obj;
                if (!bx0Var.w) {
                    bx0Var.y = 0.0f;
                    break;
                }
                break;
            case 11:
                ((ny0) obj).b();
                break;
            case 12:
                xy0 xy0Var = (xy0) obj;
                int i12 = xy0Var.a;
                xy0Var.F = null;
                vy0 vy0Var = xy0Var.c;
                if (vy0Var != null && vy0Var.getEditField() != null && xy0Var.c.getFieldText() != null) {
                    int selectionStart = xy0Var.c.getEditField().getSelectionStart();
                    int selectionEnd = xy0Var.c.getEditField().getSelectionEnd();
                    if (selectionStart != selectionEnd) {
                        xy0Var.s = false;
                        ai.f0 f0Var = xy0Var.d;
                        if (f0Var != null) {
                            f0Var.invalidate();
                            break;
                        }
                    } else {
                        CharSequence fieldText = xy0Var.c.getFieldText();
                        boolean z10 = fieldText instanceof Spanned;
                        Emoji.EmojiSpan[] emojiSpanArr = z10 ? (Emoji.EmojiSpan[]) ((Spanned) fieldText).getSpans(Math.max(0, selectionEnd - 24), selectionEnd, Emoji.EmojiSpan.class) : null;
                        if (emojiSpanArr == null || emojiSpanArr.length <= 0 || !SharedConfig.suggestAnimatedEmoji || !UserConfig.getInstance(i12).isPremium()) {
                            z5[] z5VarArr = z10 ? (z5[]) ((Spanned) fieldText).getSpans(Math.max(0, selectionEnd), selectionEnd, z5.class) : null;
                            if ((z5VarArr == null || z5VarArr.length == 0) && selectionEnd < 52) {
                                xy0Var.s = true;
                                xy0Var.c();
                                xy0Var.T = null;
                                String substring = fieldText.toString().substring(0, selectionEnd);
                                if (substring != null) {
                                    String str = xy0Var.H;
                                    if (str == null || xy0Var.G != 1 || !str.equals(substring) || xy0Var.x || (arrayList = xy0Var.w) == null || arrayList.isEmpty()) {
                                        int i13 = xy0Var.I + 1;
                                        xy0Var.I = i13;
                                        long currentTimeMillis = System.currentTimeMillis();
                                        if (xy0Var.J == null || Math.abs(currentTimeMillis - xy0Var.L) > 360) {
                                            xy0Var.L = currentTimeMillis;
                                            currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
                                        } else {
                                            xy0Var.L = currentTimeMillis;
                                            currentKeyboardLanguage = xy0Var.J;
                                        }
                                        String[] strArr = xy0Var.J;
                                        if (strArr == null || !Arrays.equals(currentKeyboardLanguage, strArr)) {
                                            MediaDataController.getInstance(i12).fetchNewEmojiKeywords(currentKeyboardLanguage);
                                        }
                                        xy0Var.J = currentKeyboardLanguage;
                                        Runnable runnable = xy0Var.K;
                                        if (runnable != null) {
                                            AndroidUtilities.cancelRunOnUIThread(runnable);
                                            xy0Var.K = null;
                                        }
                                        xy0Var.K = new ai.c9(xy0Var, currentKeyboardLanguage, substring, i13, 27);
                                        ArrayList arrayList5 = xy0Var.w;
                                        if (arrayList5 == null || arrayList5.isEmpty()) {
                                            AndroidUtilities.runOnUIThread(xy0Var.K, 600L);
                                        } else {
                                            xy0Var.K.run();
                                        }
                                    } else {
                                        xy0Var.v = false;
                                        xy0Var.c();
                                        xy0Var.d.setVisibility(0);
                                        xy0Var.U = AndroidUtilities.dp(10.0f);
                                        xy0Var.d.invalidate();
                                    }
                                }
                                ai.f0 f0Var2 = xy0Var.d;
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
                                    xy0Var.s = true;
                                    xy0Var.c();
                                    xy0Var.T = emojiSpan;
                                    xy0Var.W = null;
                                    xy0Var.V = null;
                                    if (substring2 != null) {
                                        String str2 = xy0Var.H;
                                        if (str2 == null || xy0Var.G != 2 || !str2.equals(substring2) || xy0Var.x || (arrayList2 = xy0Var.w) == null || arrayList2.isEmpty()) {
                                            int i14 = xy0Var.I + 1;
                                            xy0Var.I = i14;
                                            Runnable runnable2 = xy0Var.K;
                                            if (runnable2 != null) {
                                                AndroidUtilities.cancelRunOnUIThread(runnable2);
                                            }
                                            xy0Var.K = new xm(xy0Var, substring2, i14, 21);
                                            ArrayList arrayList6 = xy0Var.w;
                                            if (arrayList6 == null || arrayList6.isEmpty()) {
                                                AndroidUtilities.runOnUIThread(xy0Var.K, 600L);
                                            } else {
                                                xy0Var.K.run();
                                            }
                                        } else {
                                            xy0Var.v = false;
                                            xy0Var.c();
                                            ai.f0 f0Var3 = xy0Var.d;
                                            if (f0Var3 != null) {
                                                f0Var3.setVisibility(0);
                                                xy0Var.d.invalidate();
                                            }
                                        }
                                    }
                                    ai.f0 f0Var4 = xy0Var.d;
                                    if (f0Var4 != null) {
                                        f0Var4.invalidate();
                                        break;
                                    }
                                }
                            }
                        }
                        Runnable runnable3 = xy0Var.K;
                        if (runnable3 != null) {
                            AndroidUtilities.cancelRunOnUIThread(runnable3);
                            xy0Var.K = null;
                        }
                        xy0Var.s = false;
                        ai.f0 f0Var5 = xy0Var.d;
                        if (f0Var5 != null) {
                            f0Var5.invalidate();
                            break;
                        }
                    }
                } else {
                    xy0Var.s = false;
                    xy0Var.v = true;
                    ai.f0 f0Var6 = xy0Var.d;
                    if (f0Var6 != null) {
                        f0Var6.invalidate();
                        break;
                    }
                }
                break;
            case 13:
                dz0 dz0Var = (dz0) obj;
                dz0Var.G = null;
                dz0Var.b();
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
                ((a11) obj).a();
                break;
            case 16:
                ArrayList arrayList7 = ((h11) obj).a;
                for (int i15 = 0; i15 < arrayList7.size(); i15++) {
                    ((View) arrayList7.get(i15)).setVisibility(8);
                    if (arrayList7.get(i15) instanceof org.telegram.ui.Cells.u1) {
                        ((org.telegram.ui.Cells.u1) arrayList7.get(i15)).J3(false, false);
                        ((org.telegram.ui.Cells.u1) arrayList7.get(i15)).L3(false, false, false);
                    }
                }
                break;
            case 17:
                h21 h21Var = (h21) obj;
                h21Var.J = null;
                h21Var.H.animate().scaleX(1.0f).scaleY(1.0f).setDuration(150L).setInterpolator(rr.f).start();
                break;
            case 18:
                l21 l21Var = (l21) obj;
                ViewPropertyAnimator duration = l21Var.animate().alpha(0.0f).setListener(new fd0(l21Var, 23)).setDuration(300L);
                l21Var.b = duration;
                duration.start();
                break;
            case 19:
                n21 n21Var = (n21) obj;
                Utilities.Callback callback = n21Var.b;
                if (callback != null) {
                    callback.run(Long.valueOf(n21Var.a.s));
                    break;
                }
                break;
            case 20:
                k31 k31Var = ((b31) obj).b;
                if (k31Var.k()) {
                    k31Var.l();
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
                ((org.telegram.ui.ActionBar.m1) obj).dismiss();
                break;
            case 24:
                ((s41) obj).c.setVisibility(8);
                break;
            case 25:
                ((org.telegram.ui.wk) obj).c.presentFragment(new org.telegram.ui.w31());
                break;
            case 26:
                ((c51) obj).requestLayout();
                break;
            case 27:
                ((t51) obj).f();
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
                ((u61) obj).invalidateSelf();
                break;
        }
    }
}
