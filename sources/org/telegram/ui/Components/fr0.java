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

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final /* synthetic */ class fr0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ fr0(Object obj, int i10) {
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
                ((gr0) obj).setVisibility(8);
                break;
            case 1:
                sv0 sv0Var = ((hs0) obj).G;
                if (sv0Var.C1) {
                    sv0Var.d1(false);
                    break;
                }
                break;
            case 2:
                ((qt0) obj).r.o1(false);
                break;
            case 3:
                org.telegram.ui.ActionBar.n2 n2Var = ((bu0) obj).f.v1;
                if (n2Var != null) {
                    n2Var.presentFragment(new PremiumPreviewFragment(0, "similar_channels"));
                    break;
                }
                break;
            case 4:
                ((fr0) obj).run();
                break;
            case 5:
                cv0 cv0Var = (cv0) obj;
                ArrayList arrayList3 = cv0Var.f;
                if (cv0Var.h) {
                    cv0Var.h = false;
                    ArrayList<Long> arrayList4 = new ArrayList<>();
                    for (int i11 = 0; i11 < arrayList3.size(); i11++) {
                        if (((SavedMessagesController.SavedDialog) arrayList3.get(i11)).pinned) {
                            arrayList4.add(Long.valueOf(((SavedMessagesController.SavedDialog) arrayList3.get(i11)).dialogId));
                        }
                    }
                    cv0Var.x.v1.getMessagesController().getSavedMessagesController().updatePinnedOrder(arrayList4);
                    break;
                }
                break;
            case 6:
                ((dv0) obj).F();
                break;
            case 7:
                ((jw0) obj).X();
                break;
            case 8:
                ((sw0) obj).getClass();
                break;
            case 9:
                kx0 kx0Var = (kx0) obj;
                if (!kx0Var.w) {
                    kx0Var.y = 0.0f;
                    break;
                }
                break;
            case 10:
                ((vy0) obj).b();
                break;
            case 11:
                gz0 gz0Var = (gz0) obj;
                int i12 = gz0Var.a;
                gz0Var.F = null;
                ez0 ez0Var = gz0Var.c;
                if (ez0Var != null && ez0Var.getEditField() != null && gz0Var.c.getFieldText() != null) {
                    int selectionStart = gz0Var.c.getEditField().getSelectionStart();
                    int selectionEnd = gz0Var.c.getEditField().getSelectionEnd();
                    if (selectionStart != selectionEnd) {
                        gz0Var.s = false;
                        ah.x xVar = gz0Var.d;
                        if (xVar != null) {
                            xVar.invalidate();
                            break;
                        }
                    } else {
                        CharSequence fieldText = gz0Var.c.getFieldText();
                        boolean z10 = fieldText instanceof Spanned;
                        Emoji.EmojiSpan[] emojiSpanArr = z10 ? (Emoji.EmojiSpan[]) ((Spanned) fieldText).getSpans(Math.max(0, selectionEnd - 24), selectionEnd, Emoji.EmojiSpan.class) : null;
                        if (emojiSpanArr == null || emojiSpanArr.length <= 0 || !SharedConfig.suggestAnimatedEmoji || !UserConfig.getInstance(i12).isPremium()) {
                            a6[] a6VarArr = z10 ? (a6[]) ((Spanned) fieldText).getSpans(Math.max(0, selectionEnd), selectionEnd, a6.class) : null;
                            if ((a6VarArr == null || a6VarArr.length == 0) && selectionEnd < 52) {
                                gz0Var.s = true;
                                gz0Var.c();
                                gz0Var.T = null;
                                String substring = fieldText.toString().substring(0, selectionEnd);
                                if (substring != null) {
                                    String str = gz0Var.H;
                                    if (str == null || gz0Var.G != 1 || !str.equals(substring) || gz0Var.x || (arrayList = gz0Var.w) == null || arrayList.isEmpty()) {
                                        int i13 = gz0Var.I + 1;
                                        gz0Var.I = i13;
                                        long currentTimeMillis = System.currentTimeMillis();
                                        if (gz0Var.J == null || Math.abs(currentTimeMillis - gz0Var.L) > 360) {
                                            gz0Var.L = currentTimeMillis;
                                            currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
                                        } else {
                                            gz0Var.L = currentTimeMillis;
                                            currentKeyboardLanguage = gz0Var.J;
                                        }
                                        String[] strArr = gz0Var.J;
                                        if (strArr == null || !Arrays.equals(currentKeyboardLanguage, strArr)) {
                                            MediaDataController.getInstance(i12).fetchNewEmojiKeywords(currentKeyboardLanguage);
                                        }
                                        gz0Var.J = currentKeyboardLanguage;
                                        Runnable runnable = gz0Var.K;
                                        if (runnable != null) {
                                            AndroidUtilities.cancelRunOnUIThread(runnable);
                                            gz0Var.K = null;
                                        }
                                        gz0Var.K = new ai.bb(gz0Var, currentKeyboardLanguage, substring, i13, 29);
                                        ArrayList arrayList5 = gz0Var.w;
                                        if (arrayList5 == null || arrayList5.isEmpty()) {
                                            AndroidUtilities.runOnUIThread(gz0Var.K, 600L);
                                        } else {
                                            gz0Var.K.run();
                                        }
                                    } else {
                                        gz0Var.v = false;
                                        gz0Var.c();
                                        gz0Var.d.setVisibility(0);
                                        gz0Var.U = AndroidUtilities.dp(10.0f);
                                        gz0Var.d.invalidate();
                                    }
                                }
                                ah.x xVar2 = gz0Var.d;
                                if (xVar2 != null) {
                                    xVar2.invalidate();
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
                                    gz0Var.s = true;
                                    gz0Var.c();
                                    gz0Var.T = emojiSpan;
                                    gz0Var.W = null;
                                    gz0Var.V = null;
                                    if (substring2 != null) {
                                        String str2 = gz0Var.H;
                                        if (str2 == null || gz0Var.G != 2 || !str2.equals(substring2) || gz0Var.x || (arrayList2 = gz0Var.w) == null || arrayList2.isEmpty()) {
                                            int i14 = gz0Var.I + 1;
                                            gz0Var.I = i14;
                                            Runnable runnable2 = gz0Var.K;
                                            if (runnable2 != null) {
                                                AndroidUtilities.cancelRunOnUIThread(runnable2);
                                            }
                                            gz0Var.K = new org.telegram.ui.i4(gz0Var, substring2, i14, 27);
                                            ArrayList arrayList6 = gz0Var.w;
                                            if (arrayList6 == null || arrayList6.isEmpty()) {
                                                AndroidUtilities.runOnUIThread(gz0Var.K, 600L);
                                            } else {
                                                gz0Var.K.run();
                                            }
                                        } else {
                                            gz0Var.v = false;
                                            gz0Var.c();
                                            ah.x xVar3 = gz0Var.d;
                                            if (xVar3 != null) {
                                                xVar3.setVisibility(0);
                                                gz0Var.d.invalidate();
                                            }
                                        }
                                    }
                                    ah.x xVar4 = gz0Var.d;
                                    if (xVar4 != null) {
                                        xVar4.invalidate();
                                        break;
                                    }
                                }
                            }
                        }
                        Runnable runnable3 = gz0Var.K;
                        if (runnable3 != null) {
                            AndroidUtilities.cancelRunOnUIThread(runnable3);
                            gz0Var.K = null;
                        }
                        gz0Var.s = false;
                        ah.x xVar5 = gz0Var.d;
                        if (xVar5 != null) {
                            xVar5.invalidate();
                            break;
                        }
                    }
                } else {
                    gz0Var.s = false;
                    gz0Var.v = true;
                    ah.x xVar6 = gz0Var.d;
                    if (xVar6 != null) {
                        xVar6.invalidate();
                        break;
                    }
                }
                break;
            case 12:
                mz0 mz0Var = (mz0) obj;
                mz0Var.G = null;
                mz0Var.b();
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
                ((k11) obj).a();
                break;
            case 15:
                ArrayList arrayList7 = ((q11) obj).a;
                for (int i15 = 0; i15 < arrayList7.size(); i15++) {
                    ((View) arrayList7.get(i15)).setVisibility(8);
                    if (arrayList7.get(i15) instanceof org.telegram.ui.Cells.u1) {
                        ((org.telegram.ui.Cells.u1) arrayList7.get(i15)).J3(false, false);
                        ((org.telegram.ui.Cells.u1) arrayList7.get(i15)).L3(false, false, false);
                    }
                }
                break;
            case 16:
                p21 p21Var = (p21) obj;
                p21Var.J = null;
                p21Var.H.animate().scaleX(1.0f).scaleY(1.0f).setDuration(150L).setInterpolator(bs.f).start();
                break;
            case 17:
                t21 t21Var = (t21) obj;
                ViewPropertyAnimator duration = t21Var.animate().alpha(0.0f).setListener(new c80(t21Var, 28)).setDuration(300L);
                t21Var.b = duration;
                duration.start();
                break;
            case 18:
                v21 v21Var = (v21) obj;
                Utilities.Callback callback = v21Var.b;
                if (callback != null) {
                    callback.run(Long.valueOf(v21Var.a.s));
                    break;
                }
                break;
            case 19:
                q31 q31Var = ((g31) obj).b;
                if (q31Var.k()) {
                    q31Var.l();
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
                ((org.telegram.ui.ActionBar.m1) obj).dismiss();
                break;
            case 23:
                ((b51) obj).c.setVisibility(8);
                break;
            case 24:
                ((org.telegram.ui.tk) obj).c.presentFragment(new org.telegram.ui.t21());
                break;
            case 25:
                ((m51) obj).requestLayout();
                break;
            case 26:
                ((d61) obj).f();
                break;
            case 27:
                UndoView undoView = (UndoView) obj;
                int i16 = UndoView.e0;
                undoView.getClass();
                try {
                    undoView.f.performHapticFeedback(3, 2);
                    break;
                } catch (Exception unused) {
                    return;
                }
            case 28:
                ((c71) obj).invalidateSelf();
                break;
            default:
                e00 e00Var = ((p71) obj).b;
                if (e00Var != null) {
                    e00Var.d(false, true, false);
                    break;
                }
                break;
        }
    }
}
