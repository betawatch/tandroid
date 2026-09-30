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

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
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
                        org.telegram.ui.ActionBar.h5 h5Var = zq0Var.d;
                        h5Var.setAlpha(1.0f);
                        h5Var.setScaleX(1.0f);
                        h5Var.setScaleY(1.0f);
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
                        org.telegram.ui.ActionBar.h5 h5Var2 = zq0Var2.d;
                        org.telegram.ui.ActionBar.h5 h5Var3 = zq0Var2.e;
                        h5Var2.setPivotX(0.0f);
                        h5Var3.setPivotX(0.0f);
                        if (br0Var.E) {
                            h5Var2.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                            h5Var3.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                        } else {
                            h5Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                            h5Var3.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
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
                org.telegram.ui.ActionBar.m2 m2Var = ((ut0) obj).f.v1;
                if (m2Var != null) {
                    m2Var.presentFragment(new PremiumPreviewFragment(0, "similar_channels"));
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
                dx0 dx0Var = (dx0) obj;
                if (!dx0Var.w) {
                    dx0Var.y = 0.0f;
                    break;
                }
                break;
            case 11:
                ((py0) obj).b();
                break;
            case 12:
                zy0 zy0Var = (zy0) obj;
                int i12 = zy0Var.a;
                zy0Var.F = null;
                xy0 xy0Var = zy0Var.c;
                if (xy0Var != null && xy0Var.getEditField() != null && zy0Var.c.getFieldText() != null) {
                    int selectionStart = zy0Var.c.getEditField().getSelectionStart();
                    int selectionEnd = zy0Var.c.getEditField().getSelectionEnd();
                    if (selectionStart != selectionEnd) {
                        zy0Var.s = false;
                        ai.f0 f0Var = zy0Var.d;
                        if (f0Var != null) {
                            f0Var.invalidate();
                            break;
                        }
                    } else {
                        CharSequence fieldText = zy0Var.c.getFieldText();
                        boolean z10 = fieldText instanceof Spanned;
                        Emoji.EmojiSpan[] emojiSpanArr = z10 ? (Emoji.EmojiSpan[]) ((Spanned) fieldText).getSpans(Math.max(0, selectionEnd - 24), selectionEnd, Emoji.EmojiSpan.class) : null;
                        if (emojiSpanArr == null || emojiSpanArr.length <= 0 || !SharedConfig.suggestAnimatedEmoji || !UserConfig.getInstance(i12).isPremium()) {
                            z5[] z5VarArr = z10 ? (z5[]) ((Spanned) fieldText).getSpans(Math.max(0, selectionEnd), selectionEnd, z5.class) : null;
                            if ((z5VarArr == null || z5VarArr.length == 0) && selectionEnd < 52) {
                                zy0Var.s = true;
                                zy0Var.c();
                                zy0Var.T = null;
                                String substring = fieldText.toString().substring(0, selectionEnd);
                                if (substring != null) {
                                    String str = zy0Var.H;
                                    if (str == null || zy0Var.G != 1 || !str.equals(substring) || zy0Var.x || (arrayList = zy0Var.w) == null || arrayList.isEmpty()) {
                                        int i13 = zy0Var.I + 1;
                                        zy0Var.I = i13;
                                        long currentTimeMillis = System.currentTimeMillis();
                                        if (zy0Var.J == null || Math.abs(currentTimeMillis - zy0Var.L) > 360) {
                                            zy0Var.L = currentTimeMillis;
                                            currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
                                        } else {
                                            zy0Var.L = currentTimeMillis;
                                            currentKeyboardLanguage = zy0Var.J;
                                        }
                                        String[] strArr = zy0Var.J;
                                        if (strArr == null || !Arrays.equals(currentKeyboardLanguage, strArr)) {
                                            MediaDataController.getInstance(i12).fetchNewEmojiKeywords(currentKeyboardLanguage);
                                        }
                                        zy0Var.J = currentKeyboardLanguage;
                                        Runnable runnable = zy0Var.K;
                                        if (runnable != null) {
                                            AndroidUtilities.cancelRunOnUIThread(runnable);
                                            zy0Var.K = null;
                                        }
                                        zy0Var.K = new ai.c9(zy0Var, currentKeyboardLanguage, substring, i13, 27);
                                        ArrayList arrayList5 = zy0Var.w;
                                        if (arrayList5 == null || arrayList5.isEmpty()) {
                                            AndroidUtilities.runOnUIThread(zy0Var.K, 600L);
                                        } else {
                                            zy0Var.K.run();
                                        }
                                    } else {
                                        zy0Var.v = false;
                                        zy0Var.c();
                                        zy0Var.d.setVisibility(0);
                                        zy0Var.U = AndroidUtilities.dp(10.0f);
                                        zy0Var.d.invalidate();
                                    }
                                }
                                ai.f0 f0Var2 = zy0Var.d;
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
                                    zy0Var.s = true;
                                    zy0Var.c();
                                    zy0Var.T = emojiSpan;
                                    zy0Var.W = null;
                                    zy0Var.V = null;
                                    if (substring2 != null) {
                                        String str2 = zy0Var.H;
                                        if (str2 == null || zy0Var.G != 2 || !str2.equals(substring2) || zy0Var.x || (arrayList2 = zy0Var.w) == null || arrayList2.isEmpty()) {
                                            int i14 = zy0Var.I + 1;
                                            zy0Var.I = i14;
                                            Runnable runnable2 = zy0Var.K;
                                            if (runnable2 != null) {
                                                AndroidUtilities.cancelRunOnUIThread(runnable2);
                                            }
                                            zy0Var.K = new ym(zy0Var, substring2, i14, 21);
                                            ArrayList arrayList6 = zy0Var.w;
                                            if (arrayList6 == null || arrayList6.isEmpty()) {
                                                AndroidUtilities.runOnUIThread(zy0Var.K, 600L);
                                            } else {
                                                zy0Var.K.run();
                                            }
                                        } else {
                                            zy0Var.v = false;
                                            zy0Var.c();
                                            ai.f0 f0Var3 = zy0Var.d;
                                            if (f0Var3 != null) {
                                                f0Var3.setVisibility(0);
                                                zy0Var.d.invalidate();
                                            }
                                        }
                                    }
                                    ai.f0 f0Var4 = zy0Var.d;
                                    if (f0Var4 != null) {
                                        f0Var4.invalidate();
                                        break;
                                    }
                                }
                            }
                        }
                        Runnable runnable3 = zy0Var.K;
                        if (runnable3 != null) {
                            AndroidUtilities.cancelRunOnUIThread(runnable3);
                            zy0Var.K = null;
                        }
                        zy0Var.s = false;
                        ai.f0 f0Var5 = zy0Var.d;
                        if (f0Var5 != null) {
                            f0Var5.invalidate();
                            break;
                        }
                    }
                } else {
                    zy0Var.s = false;
                    zy0Var.v = true;
                    ai.f0 f0Var6 = zy0Var.d;
                    if (f0Var6 != null) {
                        f0Var6.invalidate();
                        break;
                    }
                }
                break;
            case 13:
                fz0 fz0Var = (fz0) obj;
                fz0Var.G = null;
                fz0Var.b();
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
                ((c11) obj).a();
                break;
            case 16:
                ArrayList arrayList7 = ((j11) obj).a;
                for (int i15 = 0; i15 < arrayList7.size(); i15++) {
                    ((View) arrayList7.get(i15)).setVisibility(8);
                    if (arrayList7.get(i15) instanceof org.telegram.ui.Cells.u1) {
                        ((org.telegram.ui.Cells.u1) arrayList7.get(i15)).J3(false, false);
                        ((org.telegram.ui.Cells.u1) arrayList7.get(i15)).L3(false, false, false);
                    }
                }
                break;
            case 17:
                j21 j21Var = (j21) obj;
                j21Var.J = null;
                j21Var.H.animate().scaleX(1.0f).scaleY(1.0f).setDuration(150L).setInterpolator(sr.f).start();
                break;
            case 18:
                n21 n21Var = (n21) obj;
                ViewPropertyAnimator duration = n21Var.animate().alpha(0.0f).setListener(new hd0(n21Var, 23)).setDuration(300L);
                n21Var.b = duration;
                duration.start();
                break;
            case 19:
                p21 p21Var = (p21) obj;
                Utilities.Callback callback = p21Var.b;
                if (callback != null) {
                    callback.run(Long.valueOf(p21Var.a.s));
                    break;
                }
                break;
            case 20:
                m31 m31Var = ((d31) obj).b;
                if (m31Var.k()) {
                    m31Var.l();
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
                ((u41) obj).c.setVisibility(8);
                break;
            case 25:
                ((org.telegram.ui.wk) obj).c.presentFragment(new org.telegram.ui.w31());
                break;
            case 26:
                ((e51) obj).requestLayout();
                break;
            case 27:
                ((v51) obj).f();
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
                ((w61) obj).invalidateSelf();
                break;
        }
    }
}
