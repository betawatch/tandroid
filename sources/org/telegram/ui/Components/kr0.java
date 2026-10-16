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

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class kr0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ kr0(Object obj, int i10) {
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
                nr0 nr0Var = (nr0) obj;
                lr0[] lr0VarArr = nr0Var.a;
                if (nr0Var.b != 1) {
                    for (lr0 lr0Var : lr0VarArr) {
                        org.telegram.ui.ActionBar.h5 h5Var = lr0Var.d;
                        h5Var.setAlpha(1.0f);
                        h5Var.setScaleX(1.0f);
                        h5Var.setScaleY(1.0f);
                        lr0Var.e.setAlpha(0.0f);
                    }
                    nr0Var.E = false;
                    AndroidUtilities.runOnUIThread(nr0Var.G, 4000L);
                    break;
                } else {
                    nr0Var.E = !nr0Var.E;
                    int length = lr0VarArr.length;
                    while (i11 < length) {
                        lr0 lr0Var2 = lr0VarArr[i11];
                        org.telegram.ui.ActionBar.h5 h5Var2 = lr0Var2.d;
                        org.telegram.ui.ActionBar.h5 h5Var3 = lr0Var2.e;
                        h5Var2.setPivotX(0.0f);
                        h5Var3.setPivotX(0.0f);
                        if (nr0Var.E) {
                            h5Var2.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                            h5Var3.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                        } else {
                            h5Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                            h5Var3.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                        }
                        i11++;
                    }
                    AndroidUtilities.runOnUIThread(nr0Var.G, 4000L);
                    break;
                }
            case 1:
                ((lr0) obj).setVisibility(8);
                break;
            case 2:
                xv0 xv0Var = ((ms0) obj).G;
                if (xv0Var.C1) {
                    xv0Var.c1(false);
                    break;
                }
                break;
            case 3:
                ((vt0) obj).f.n1(false);
                break;
            case 4:
                org.telegram.ui.ActionBar.m2 m2Var = ((gu0) obj).f.v1;
                if (m2Var != null) {
                    m2Var.presentFragment(new PremiumPreviewFragment(0, "similar_channels"));
                    break;
                }
                break;
            case 5:
                ((kr0) obj).run();
                break;
            case 6:
                hv0 hv0Var = (hv0) obj;
                ArrayList arrayList3 = hv0Var.f;
                if (hv0Var.h) {
                    hv0Var.h = false;
                    ArrayList<Long> arrayList4 = new ArrayList<>();
                    while (i11 < arrayList3.size()) {
                        if (((SavedMessagesController.SavedDialog) arrayList3.get(i11)).pinned) {
                            arrayList4.add(Long.valueOf(((SavedMessagesController.SavedDialog) arrayList3.get(i11)).dialogId));
                        }
                        i11++;
                    }
                    hv0Var.x.v1.getMessagesController().getSavedMessagesController().updatePinnedOrder(arrayList4);
                    break;
                }
                break;
            case 7:
                ((iv0) obj).F();
                break;
            case 8:
                ((ow0) obj).X();
                break;
            case 9:
                ((xw0) obj).getClass();
                break;
            case 10:
                px0 px0Var = (px0) obj;
                if (!px0Var.w) {
                    px0Var.y = 0.0f;
                    break;
                }
                break;
            case 11:
                ((bz0) obj).b();
                break;
            case 12:
                lz0 lz0Var = (lz0) obj;
                int i12 = lz0Var.a;
                lz0Var.F = null;
                jz0 jz0Var = lz0Var.c;
                if (jz0Var != null && jz0Var.getEditField() != null && lz0Var.c.getFieldText() != null) {
                    int selectionStart = lz0Var.c.getEditField().getSelectionStart();
                    int selectionEnd = lz0Var.c.getEditField().getSelectionEnd();
                    if (selectionStart != selectionEnd) {
                        lz0Var.s = false;
                        ah.x xVar = lz0Var.d;
                        if (xVar != null) {
                            xVar.invalidate();
                            break;
                        }
                    } else {
                        CharSequence fieldText = lz0Var.c.getFieldText();
                        boolean z10 = fieldText instanceof Spanned;
                        Emoji.EmojiSpan[] emojiSpanArr = z10 ? (Emoji.EmojiSpan[]) ((Spanned) fieldText).getSpans(Math.max(0, selectionEnd - 24), selectionEnd, Emoji.EmojiSpan.class) : null;
                        if (emojiSpanArr == null || emojiSpanArr.length <= 0 || !SharedConfig.suggestAnimatedEmoji || !UserConfig.getInstance(i12).isPremium()) {
                            b6[] b6VarArr = z10 ? (b6[]) ((Spanned) fieldText).getSpans(Math.max(0, selectionEnd), selectionEnd, b6.class) : null;
                            if ((b6VarArr == null || b6VarArr.length == 0) && selectionEnd < 52) {
                                lz0Var.s = true;
                                lz0Var.c();
                                lz0Var.T = null;
                                String substring = fieldText.toString().substring(0, selectionEnd);
                                if (substring != null) {
                                    String str = lz0Var.H;
                                    if (str == null || lz0Var.G != 1 || !str.equals(substring) || lz0Var.x || (arrayList = lz0Var.w) == null || arrayList.isEmpty()) {
                                        int i13 = lz0Var.I + 1;
                                        lz0Var.I = i13;
                                        long currentTimeMillis = System.currentTimeMillis();
                                        if (lz0Var.J == null || Math.abs(currentTimeMillis - lz0Var.L) > 360) {
                                            lz0Var.L = currentTimeMillis;
                                            currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
                                        } else {
                                            lz0Var.L = currentTimeMillis;
                                            currentKeyboardLanguage = lz0Var.J;
                                        }
                                        String[] strArr = lz0Var.J;
                                        if (strArr == null || !Arrays.equals(currentKeyboardLanguage, strArr)) {
                                            MediaDataController.getInstance(i12).fetchNewEmojiKeywords(currentKeyboardLanguage);
                                        }
                                        lz0Var.J = currentKeyboardLanguage;
                                        Runnable runnable = lz0Var.K;
                                        if (runnable != null) {
                                            AndroidUtilities.cancelRunOnUIThread(runnable);
                                            lz0Var.K = null;
                                        }
                                        lz0Var.K = new bi.n8(lz0Var, currentKeyboardLanguage, substring, i13, 28);
                                        ArrayList arrayList5 = lz0Var.w;
                                        if (arrayList5 == null || arrayList5.isEmpty()) {
                                            AndroidUtilities.runOnUIThread(lz0Var.K, 600L);
                                        } else {
                                            lz0Var.K.run();
                                        }
                                    } else {
                                        lz0Var.v = false;
                                        lz0Var.c();
                                        lz0Var.d.setVisibility(0);
                                        lz0Var.U = AndroidUtilities.dp(10.0f);
                                        lz0Var.d.invalidate();
                                    }
                                }
                                ah.x xVar2 = lz0Var.d;
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
                                    lz0Var.s = true;
                                    lz0Var.c();
                                    lz0Var.T = emojiSpan;
                                    lz0Var.W = null;
                                    lz0Var.V = null;
                                    if (substring2 != null) {
                                        String str2 = lz0Var.H;
                                        if (str2 == null || lz0Var.G != 2 || !str2.equals(substring2) || lz0Var.x || (arrayList2 = lz0Var.w) == null || arrayList2.isEmpty()) {
                                            int i14 = lz0Var.I + 1;
                                            lz0Var.I = i14;
                                            Runnable runnable2 = lz0Var.K;
                                            if (runnable2 != null) {
                                                AndroidUtilities.cancelRunOnUIThread(runnable2);
                                            }
                                            lz0Var.K = new org.telegram.ui.gm(lz0Var, substring2, i14, 23);
                                            ArrayList arrayList6 = lz0Var.w;
                                            if (arrayList6 == null || arrayList6.isEmpty()) {
                                                AndroidUtilities.runOnUIThread(lz0Var.K, 600L);
                                            } else {
                                                lz0Var.K.run();
                                            }
                                        } else {
                                            lz0Var.v = false;
                                            lz0Var.c();
                                            ah.x xVar3 = lz0Var.d;
                                            if (xVar3 != null) {
                                                xVar3.setVisibility(0);
                                                lz0Var.d.invalidate();
                                            }
                                        }
                                    }
                                    ah.x xVar4 = lz0Var.d;
                                    if (xVar4 != null) {
                                        xVar4.invalidate();
                                        break;
                                    }
                                }
                            }
                        }
                        Runnable runnable3 = lz0Var.K;
                        if (runnable3 != null) {
                            AndroidUtilities.cancelRunOnUIThread(runnable3);
                            lz0Var.K = null;
                        }
                        lz0Var.s = false;
                        ah.x xVar5 = lz0Var.d;
                        if (xVar5 != null) {
                            xVar5.invalidate();
                            break;
                        }
                    }
                } else {
                    lz0Var.s = false;
                    lz0Var.v = true;
                    ah.x xVar6 = lz0Var.d;
                    if (xVar6 != null) {
                        xVar6.invalidate();
                        break;
                    }
                }
                break;
            case 13:
                rz0 rz0Var = (rz0) obj;
                rz0Var.G = null;
                rz0Var.b();
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
                ((p11) obj).a();
                break;
            case 16:
                ArrayList arrayList7 = ((w11) obj).a;
                for (int i15 = 0; i15 < arrayList7.size(); i15++) {
                    ((View) arrayList7.get(i15)).setVisibility(8);
                    if (arrayList7.get(i15) instanceof org.telegram.ui.Cells.u1) {
                        ((org.telegram.ui.Cells.u1) arrayList7.get(i15)).J3(false, false);
                        ((org.telegram.ui.Cells.u1) arrayList7.get(i15)).L3(false, false, false);
                    }
                }
                break;
            case 17:
                w21 w21Var = (w21) obj;
                w21Var.J = null;
                w21Var.H.animate().scaleX(1.0f).scaleY(1.0f).setDuration(150L).setInterpolator(es.f).start();
                break;
            case 18:
                a31 a31Var = (a31) obj;
                ViewPropertyAnimator duration = a31Var.animate().alpha(0.0f).setListener(new k90(a31Var, 26)).setDuration(300L);
                a31Var.b = duration;
                duration.start();
                break;
            case 19:
                c31 c31Var = (c31) obj;
                Utilities.Callback callback = c31Var.b;
                if (callback != null) {
                    callback.run(Long.valueOf(c31Var.a.s));
                    break;
                }
                break;
            case 20:
                y31 y31Var = ((p31) obj).b;
                if (y31Var.k()) {
                    y31Var.l();
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
                ((h51) obj).c.setVisibility(8);
                break;
            case 25:
                ((org.telegram.ui.el) obj).c.presentFragment(new org.telegram.ui.l41());
                break;
            case 26:
                ((t51) obj).requestLayout();
                break;
            case 27:
                ((k61) obj).f();
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
                ((k71) obj).invalidateSelf();
                break;
        }
    }
}
