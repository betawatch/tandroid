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

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
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
                        org.telegram.ui.ActionBar.n5 n5Var = lr0Var.d;
                        n5Var.setAlpha(1.0f);
                        n5Var.setScaleX(1.0f);
                        n5Var.setScaleY(1.0f);
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
                        org.telegram.ui.ActionBar.n5 n5Var2 = lr0Var2.d;
                        org.telegram.ui.ActionBar.n5 n5Var3 = lr0Var2.e;
                        n5Var2.setPivotX(0.0f);
                        n5Var3.setPivotX(0.0f);
                        if (nr0Var.E) {
                            n5Var2.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                            n5Var3.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                        } else {
                            n5Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                            n5Var3.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
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
                    xv0Var.e1(false);
                    break;
                }
                break;
            case 3:
                ((vt0) obj).r.p1(false);
                break;
            case 4:
                org.telegram.ui.ActionBar.o2 o2Var = ((gu0) obj).f.v1;
                if (o2Var != null) {
                    o2Var.presentFragment(new PremiumPreviewFragment(0, "similar_channels"));
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
                ((ow0) obj).W();
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
                ((az0) obj).b();
                break;
            case 12:
                lz0 lz0Var = (lz0) obj;
                int i12 = lz0Var.a;
                lz0Var.H = null;
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
                            a6[] a6VarArr = z10 ? (a6[]) ((Spanned) fieldText).getSpans(Math.max(0, selectionEnd), selectionEnd, a6.class) : null;
                            if ((a6VarArr == null || a6VarArr.length == 0) && selectionEnd < 52) {
                                lz0Var.s = true;
                                lz0Var.c();
                                lz0Var.V = null;
                                String substring = fieldText.toString().substring(0, selectionEnd);
                                if (substring != null) {
                                    String str = lz0Var.J;
                                    if (str == null || lz0Var.I != 1 || !str.equals(substring) || lz0Var.x || (arrayList = lz0Var.w) == null || arrayList.isEmpty()) {
                                        int i13 = lz0Var.K + 1;
                                        lz0Var.K = i13;
                                        long currentTimeMillis = System.currentTimeMillis();
                                        if (lz0Var.L == null || Math.abs(currentTimeMillis - lz0Var.N) > 360) {
                                            lz0Var.N = currentTimeMillis;
                                            currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
                                        } else {
                                            lz0Var.N = currentTimeMillis;
                                            currentKeyboardLanguage = lz0Var.L;
                                        }
                                        String[] strArr = lz0Var.L;
                                        if (strArr == null || !Arrays.equals(currentKeyboardLanguage, strArr)) {
                                            MediaDataController.getInstance(i12).fetchNewEmojiKeywords(currentKeyboardLanguage);
                                        }
                                        lz0Var.L = currentKeyboardLanguage;
                                        Runnable runnable = lz0Var.M;
                                        if (runnable != null) {
                                            AndroidUtilities.cancelRunOnUIThread(runnable);
                                            lz0Var.M = null;
                                        }
                                        lz0Var.M = new fz0(lz0Var, currentKeyboardLanguage, substring, i13, 0);
                                        ArrayList arrayList5 = lz0Var.w;
                                        if (arrayList5 == null || arrayList5.isEmpty()) {
                                            AndroidUtilities.runOnUIThread(lz0Var.M, 600L);
                                        } else {
                                            lz0Var.M.run();
                                        }
                                    } else {
                                        lz0Var.v = false;
                                        lz0Var.c();
                                        lz0Var.d.setVisibility(0);
                                        lz0Var.W = AndroidUtilities.dp(10.0f);
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
                                    lz0Var.V = emojiSpan;
                                    lz0Var.b0 = null;
                                    lz0Var.a0 = null;
                                    if (substring2 != null) {
                                        String str2 = lz0Var.J;
                                        if (str2 == null || lz0Var.I != 2 || !str2.equals(substring2) || lz0Var.x || (arrayList2 = lz0Var.w) == null || arrayList2.isEmpty()) {
                                            int i14 = lz0Var.K + 1;
                                            lz0Var.K = i14;
                                            Runnable runnable2 = lz0Var.M;
                                            if (runnable2 != null) {
                                                AndroidUtilities.cancelRunOnUIThread(runnable2);
                                            }
                                            lz0Var.M = new org.telegram.ui.h4(lz0Var, substring2, i14, 27);
                                            ArrayList arrayList6 = lz0Var.w;
                                            if (arrayList6 == null || arrayList6.isEmpty()) {
                                                AndroidUtilities.runOnUIThread(lz0Var.M, 600L);
                                            } else {
                                                lz0Var.M.run();
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
                        Runnable runnable3 = lz0Var.M;
                        if (runnable3 != null) {
                            AndroidUtilities.cancelRunOnUIThread(runnable3);
                            lz0Var.M = null;
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
                rz0Var.K = null;
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
                ArrayList arrayList7 = ((v11) obj).a;
                for (int i15 = 0; i15 < arrayList7.size(); i15++) {
                    ((View) arrayList7.get(i15)).setVisibility(8);
                    if (arrayList7.get(i15) instanceof org.telegram.ui.Cells.t1) {
                        ((org.telegram.ui.Cells.t1) arrayList7.get(i15)).I3(false, false);
                        ((org.telegram.ui.Cells.t1) arrayList7.get(i15)).K3(false, false, false);
                    }
                }
                break;
            case 17:
                v21 v21Var = (v21) obj;
                v21Var.J = null;
                v21Var.H.animate().scaleX(1.0f).scaleY(1.0f).setDuration(150L).setInterpolator(bs.f).start();
                break;
            case 18:
                z21 z21Var = (z21) obj;
                ViewPropertyAnimator duration = z21Var.animate().alpha(0.0f).setListener(new i60(z21Var, 29)).setDuration(300L);
                z21Var.b = duration;
                duration.start();
                break;
            case 19:
                b31 b31Var = (b31) obj;
                Utilities.Callback callback = b31Var.b;
                if (callback != null) {
                    callback.run(Long.valueOf(b31Var.a.t));
                    break;
                }
                break;
            case 20:
                w31 w31Var = ((m31) obj).b;
                if (w31Var.l()) {
                    w31Var.m();
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
                ((j51) obj).c.setVisibility(8);
                break;
            case 25:
                ((org.telegram.ui.sk) obj).c.presentFragment(new org.telegram.ui.v21());
                break;
            case 26:
                ((t51) obj).requestLayout();
                break;
            case 27:
                ((k61) obj).f();
                break;
            case 28:
                UndoView undoView = (UndoView) obj;
                int i16 = UndoView.i0;
                undoView.getClass();
                try {
                    undoView.f.performHapticFeedback(3, 2);
                    break;
                } catch (Exception unused) {
                    return;
                }
            default:
                ((l71) obj).invalidateSelf();
                break;
        }
    }
}
