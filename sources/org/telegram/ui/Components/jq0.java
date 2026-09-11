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

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final /* synthetic */ class jq0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ jq0(Object obj, int i10) {
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
                ((kq0) obj).setVisibility(8);
                break;
            case 1:
                xu0 xu0Var = ((lr0) obj).G;
                if (xu0Var.C1) {
                    xu0Var.b1(false);
                    break;
                }
                break;
            case 2:
                ((vs0) obj).f.m1(false);
                break;
            case 3:
                org.telegram.ui.ActionBar.n2 n2Var = ((gt0) obj).f.v1;
                if (n2Var != null) {
                    n2Var.presentFragment(new PremiumPreviewFragment(0, "similar_channels"));
                    break;
                }
                break;
            case 4:
                ((jq0) obj).run();
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
                    hu0Var.x.v1.getMessagesController().getSavedMessagesController().updatePinnedOrder(arrayList4);
                    break;
                }
                break;
            case 6:
                ((iu0) obj).F();
                break;
            case 7:
                ((ov0) obj).X();
                break;
            case 8:
                ((xv0) obj).getClass();
                break;
            case 9:
                qw0 qw0Var = (qw0) obj;
                if (!qw0Var.w) {
                    qw0Var.y = 0.0f;
                    break;
                }
                break;
            case 10:
                ((cy0) obj).b();
                break;
            case 11:
                my0 my0Var = (my0) obj;
                int i12 = my0Var.a;
                my0Var.F = null;
                ky0 ky0Var = my0Var.c;
                if (ky0Var != null && ky0Var.getEditField() != null && my0Var.c.getFieldText() != null) {
                    int selectionStart = my0Var.c.getEditField().getSelectionStart();
                    int selectionEnd = my0Var.c.getEditField().getSelectionEnd();
                    if (selectionStart != selectionEnd) {
                        my0Var.s = false;
                        ah.y yVar = my0Var.d;
                        if (yVar != null) {
                            yVar.invalidate();
                            break;
                        }
                    } else {
                        CharSequence fieldText = my0Var.c.getFieldText();
                        boolean z10 = fieldText instanceof Spanned;
                        Emoji.EmojiSpan[] emojiSpanArr = z10 ? (Emoji.EmojiSpan[]) ((Spanned) fieldText).getSpans(Math.max(0, selectionEnd - 24), selectionEnd, Emoji.EmojiSpan.class) : null;
                        if (emojiSpanArr == null || emojiSpanArr.length <= 0 || !SharedConfig.suggestAnimatedEmoji || !UserConfig.getInstance(i12).isPremium()) {
                            z5[] z5VarArr = z10 ? (z5[]) ((Spanned) fieldText).getSpans(Math.max(0, selectionEnd), selectionEnd, z5.class) : null;
                            if ((z5VarArr == null || z5VarArr.length == 0) && selectionEnd < 52) {
                                my0Var.s = true;
                                my0Var.c();
                                my0Var.T = null;
                                String substring = fieldText.toString().substring(0, selectionEnd);
                                if (substring != null) {
                                    String str = my0Var.H;
                                    if (str == null || my0Var.G != 1 || !str.equals(substring) || my0Var.x || (arrayList = my0Var.w) == null || arrayList.isEmpty()) {
                                        int i13 = my0Var.I + 1;
                                        my0Var.I = i13;
                                        long currentTimeMillis = System.currentTimeMillis();
                                        if (my0Var.J == null || Math.abs(currentTimeMillis - my0Var.L) > 360) {
                                            my0Var.L = currentTimeMillis;
                                            currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
                                        } else {
                                            my0Var.L = currentTimeMillis;
                                            currentKeyboardLanguage = my0Var.J;
                                        }
                                        String[] strArr = my0Var.J;
                                        if (strArr == null || !Arrays.equals(currentKeyboardLanguage, strArr)) {
                                            MediaDataController.getInstance(i12).fetchNewEmojiKeywords(currentKeyboardLanguage);
                                        }
                                        my0Var.J = currentKeyboardLanguage;
                                        Runnable runnable = my0Var.K;
                                        if (runnable != null) {
                                            AndroidUtilities.cancelRunOnUIThread(runnable);
                                            my0Var.K = null;
                                        }
                                        my0Var.K = new bi.k8(my0Var, currentKeyboardLanguage, substring, i13, 27);
                                        ArrayList arrayList5 = my0Var.w;
                                        if (arrayList5 == null || arrayList5.isEmpty()) {
                                            AndroidUtilities.runOnUIThread(my0Var.K, 600L);
                                        } else {
                                            my0Var.K.run();
                                        }
                                    } else {
                                        my0Var.v = false;
                                        my0Var.c();
                                        my0Var.d.setVisibility(0);
                                        my0Var.U = AndroidUtilities.dp(10.0f);
                                        my0Var.d.invalidate();
                                    }
                                }
                                ah.y yVar2 = my0Var.d;
                                if (yVar2 != null) {
                                    yVar2.invalidate();
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
                                    my0Var.s = true;
                                    my0Var.c();
                                    my0Var.T = emojiSpan;
                                    my0Var.W = null;
                                    my0Var.V = null;
                                    if (substring2 != null) {
                                        String str2 = my0Var.H;
                                        if (str2 == null || my0Var.G != 2 || !str2.equals(substring2) || my0Var.x || (arrayList2 = my0Var.w) == null || arrayList2.isEmpty()) {
                                            int i14 = my0Var.I + 1;
                                            my0Var.I = i14;
                                            Runnable runnable2 = my0Var.K;
                                            if (runnable2 != null) {
                                                AndroidUtilities.cancelRunOnUIThread(runnable2);
                                            }
                                            my0Var.K = new org.telegram.ui.dm(my0Var, substring2, i14, 22);
                                            ArrayList arrayList6 = my0Var.w;
                                            if (arrayList6 == null || arrayList6.isEmpty()) {
                                                AndroidUtilities.runOnUIThread(my0Var.K, 600L);
                                            } else {
                                                my0Var.K.run();
                                            }
                                        } else {
                                            my0Var.v = false;
                                            my0Var.c();
                                            ah.y yVar3 = my0Var.d;
                                            if (yVar3 != null) {
                                                yVar3.setVisibility(0);
                                                my0Var.d.invalidate();
                                            }
                                        }
                                    }
                                    ah.y yVar4 = my0Var.d;
                                    if (yVar4 != null) {
                                        yVar4.invalidate();
                                        break;
                                    }
                                }
                            }
                        }
                        Runnable runnable3 = my0Var.K;
                        if (runnable3 != null) {
                            AndroidUtilities.cancelRunOnUIThread(runnable3);
                            my0Var.K = null;
                        }
                        my0Var.s = false;
                        ah.y yVar5 = my0Var.d;
                        if (yVar5 != null) {
                            yVar5.invalidate();
                            break;
                        }
                    }
                } else {
                    my0Var.s = false;
                    my0Var.v = true;
                    ah.y yVar6 = my0Var.d;
                    if (yVar6 != null) {
                        yVar6.invalidate();
                        break;
                    }
                }
                break;
            case 12:
                sy0 sy0Var = (sy0) obj;
                sy0Var.G = null;
                sy0Var.b();
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
                ((m01) obj).a();
                break;
            case 15:
                ArrayList arrayList7 = ((t01) obj).a;
                for (int i15 = 0; i15 < arrayList7.size(); i15++) {
                    ((View) arrayList7.get(i15)).setVisibility(8);
                    if (arrayList7.get(i15) instanceof org.telegram.ui.Cells.t1) {
                        ((org.telegram.ui.Cells.t1) arrayList7.get(i15)).J3(false, false);
                        ((org.telegram.ui.Cells.t1) arrayList7.get(i15)).L3(false, false, false);
                    }
                }
                break;
            case 16:
                t11 t11Var = (t11) obj;
                t11Var.J = null;
                t11Var.H.animate().scaleX(1.0f).scaleY(1.0f).setDuration(150L).setInterpolator(pr.f).start();
                break;
            case 17:
                x11 x11Var = (x11) obj;
                ViewPropertyAnimator duration = x11Var.animate().alpha(0.0f).setListener(new r80(x11Var, 25)).setDuration(300L);
                x11Var.b = duration;
                duration.start();
                break;
            case 18:
                z11 z11Var = (z11) obj;
                Utilities.Callback callback = z11Var.b;
                if (callback != null) {
                    callback.run(Long.valueOf(z11Var.a.s));
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
                ((org.telegram.ui.ActionBar.n1) obj).dismiss();
                break;
            case 23:
                ((e41) obj).c.setVisibility(8);
                break;
            case 24:
                ((org.telegram.ui.zk) obj).c.presentFragment(new org.telegram.ui.h41());
                break;
            case 25:
                ((o41) obj).requestLayout();
                break;
            case 26:
                ((f51) obj).f();
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
                ((g61) obj).invalidateSelf();
                break;
            default:
                vz vzVar = ((u61) obj).b;
                if (vzVar != null) {
                    vzVar.e(false, true, false);
                    break;
                }
                break;
        }
    }
}
