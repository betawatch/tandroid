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

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
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
        Object obj = this.b;
        switch (i10) {
            case 0:
                ((xq0) obj).setVisibility(8);
                break;
            case 1:
                jv0 jv0Var = ((xr0) obj).G;
                if (jv0Var.C1) {
                    jv0Var.b1(false);
                    break;
                }
                break;
            case 2:
                ((ht0) obj).f.m1(false);
                break;
            case 3:
                org.telegram.ui.ActionBar.n2 n2Var = ((st0) obj).f.v1;
                if (n2Var != null) {
                    n2Var.presentFragment(new PremiumPreviewFragment(0, "similar_channels"));
                    break;
                }
                break;
            case 4:
                ((wq0) obj).run();
                break;
            case 5:
                tu0 tu0Var = (tu0) obj;
                ArrayList arrayList3 = tu0Var.f;
                if (tu0Var.h) {
                    tu0Var.h = false;
                    ArrayList<Long> arrayList4 = new ArrayList<>();
                    for (int i11 = 0; i11 < arrayList3.size(); i11++) {
                        if (((SavedMessagesController.SavedDialog) arrayList3.get(i11)).pinned) {
                            arrayList4.add(Long.valueOf(((SavedMessagesController.SavedDialog) arrayList3.get(i11)).dialogId));
                        }
                    }
                    tu0Var.x.v1.getMessagesController().getSavedMessagesController().updatePinnedOrder(arrayList4);
                    break;
                }
                break;
            case 6:
                ((uu0) obj).F();
                break;
            case 7:
                ((aw0) obj).X();
                break;
            case 8:
                ((jw0) obj).getClass();
                break;
            case 9:
                cx0 cx0Var = (cx0) obj;
                if (!cx0Var.w) {
                    cx0Var.y = 0.0f;
                    break;
                }
                break;
            case 10:
                ((oy0) obj).b();
                break;
            case 11:
                yy0 yy0Var = (yy0) obj;
                int i12 = yy0Var.a;
                yy0Var.F = null;
                wy0 wy0Var = yy0Var.c;
                if (wy0Var != null && wy0Var.getEditField() != null && yy0Var.c.getFieldText() != null) {
                    int selectionStart = yy0Var.c.getEditField().getSelectionStart();
                    int selectionEnd = yy0Var.c.getEditField().getSelectionEnd();
                    if (selectionStart != selectionEnd) {
                        yy0Var.s = false;
                        ai.f0 f0Var = yy0Var.d;
                        if (f0Var != null) {
                            f0Var.invalidate();
                            break;
                        }
                    } else {
                        CharSequence fieldText = yy0Var.c.getFieldText();
                        boolean z10 = fieldText instanceof Spanned;
                        Emoji.EmojiSpan[] emojiSpanArr = z10 ? (Emoji.EmojiSpan[]) ((Spanned) fieldText).getSpans(Math.max(0, selectionEnd - 24), selectionEnd, Emoji.EmojiSpan.class) : null;
                        if (emojiSpanArr == null || emojiSpanArr.length <= 0 || !SharedConfig.suggestAnimatedEmoji || !UserConfig.getInstance(i12).isPremium()) {
                            y5[] y5VarArr = z10 ? (y5[]) ((Spanned) fieldText).getSpans(Math.max(0, selectionEnd), selectionEnd, y5.class) : null;
                            if ((y5VarArr == null || y5VarArr.length == 0) && selectionEnd < 52) {
                                yy0Var.s = true;
                                yy0Var.c();
                                yy0Var.T = null;
                                String substring = fieldText.toString().substring(0, selectionEnd);
                                if (substring != null) {
                                    String str = yy0Var.H;
                                    if (str == null || yy0Var.G != 1 || !str.equals(substring) || yy0Var.x || (arrayList = yy0Var.w) == null || arrayList.isEmpty()) {
                                        int i13 = yy0Var.I + 1;
                                        yy0Var.I = i13;
                                        long currentTimeMillis = System.currentTimeMillis();
                                        if (yy0Var.J == null || Math.abs(currentTimeMillis - yy0Var.L) > 360) {
                                            yy0Var.L = currentTimeMillis;
                                            currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
                                        } else {
                                            yy0Var.L = currentTimeMillis;
                                            currentKeyboardLanguage = yy0Var.J;
                                        }
                                        String[] strArr = yy0Var.J;
                                        if (strArr == null || !Arrays.equals(currentKeyboardLanguage, strArr)) {
                                            MediaDataController.getInstance(i12).fetchNewEmojiKeywords(currentKeyboardLanguage);
                                        }
                                        yy0Var.J = currentKeyboardLanguage;
                                        Runnable runnable = yy0Var.K;
                                        if (runnable != null) {
                                            AndroidUtilities.cancelRunOnUIThread(runnable);
                                            yy0Var.K = null;
                                        }
                                        yy0Var.K = new ai.c9(yy0Var, currentKeyboardLanguage, substring, i13, 27);
                                        ArrayList arrayList5 = yy0Var.w;
                                        if (arrayList5 == null || arrayList5.isEmpty()) {
                                            AndroidUtilities.runOnUIThread(yy0Var.K, 600L);
                                        } else {
                                            yy0Var.K.run();
                                        }
                                    } else {
                                        yy0Var.v = false;
                                        yy0Var.c();
                                        yy0Var.d.setVisibility(0);
                                        yy0Var.U = AndroidUtilities.dp(10.0f);
                                        yy0Var.d.invalidate();
                                    }
                                }
                                ai.f0 f0Var2 = yy0Var.d;
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
                                    yy0Var.s = true;
                                    yy0Var.c();
                                    yy0Var.T = emojiSpan;
                                    yy0Var.W = null;
                                    yy0Var.V = null;
                                    if (substring2 != null) {
                                        String str2 = yy0Var.H;
                                        if (str2 == null || yy0Var.G != 2 || !str2.equals(substring2) || yy0Var.x || (arrayList2 = yy0Var.w) == null || arrayList2.isEmpty()) {
                                            int i14 = yy0Var.I + 1;
                                            yy0Var.I = i14;
                                            Runnable runnable2 = yy0Var.K;
                                            if (runnable2 != null) {
                                                AndroidUtilities.cancelRunOnUIThread(runnable2);
                                            }
                                            yy0Var.K = new wm(yy0Var, substring2, i14, 21);
                                            ArrayList arrayList6 = yy0Var.w;
                                            if (arrayList6 == null || arrayList6.isEmpty()) {
                                                AndroidUtilities.runOnUIThread(yy0Var.K, 600L);
                                            } else {
                                                yy0Var.K.run();
                                            }
                                        } else {
                                            yy0Var.v = false;
                                            yy0Var.c();
                                            ai.f0 f0Var3 = yy0Var.d;
                                            if (f0Var3 != null) {
                                                f0Var3.setVisibility(0);
                                                yy0Var.d.invalidate();
                                            }
                                        }
                                    }
                                    ai.f0 f0Var4 = yy0Var.d;
                                    if (f0Var4 != null) {
                                        f0Var4.invalidate();
                                        break;
                                    }
                                }
                            }
                        }
                        Runnable runnable3 = yy0Var.K;
                        if (runnable3 != null) {
                            AndroidUtilities.cancelRunOnUIThread(runnable3);
                            yy0Var.K = null;
                        }
                        yy0Var.s = false;
                        ai.f0 f0Var5 = yy0Var.d;
                        if (f0Var5 != null) {
                            f0Var5.invalidate();
                            break;
                        }
                    }
                } else {
                    yy0Var.s = false;
                    yy0Var.v = true;
                    ai.f0 f0Var6 = yy0Var.d;
                    if (f0Var6 != null) {
                        f0Var6.invalidate();
                        break;
                    }
                }
                break;
            case 12:
                ez0 ez0Var = (ez0) obj;
                ez0Var.G = null;
                ez0Var.b();
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
                ((b11) obj).a();
                break;
            case 15:
                ArrayList arrayList7 = ((i11) obj).a;
                for (int i15 = 0; i15 < arrayList7.size(); i15++) {
                    ((View) arrayList7.get(i15)).setVisibility(8);
                    if (arrayList7.get(i15) instanceof org.telegram.ui.Cells.u1) {
                        ((org.telegram.ui.Cells.u1) arrayList7.get(i15)).J3(false, false);
                        ((org.telegram.ui.Cells.u1) arrayList7.get(i15)).L3(false, false, false);
                    }
                }
                break;
            case 16:
                i21 i21Var = (i21) obj;
                i21Var.J = null;
                i21Var.H.animate().scaleX(1.0f).scaleY(1.0f).setDuration(150L).setInterpolator(qr.f).start();
                break;
            case 17:
                m21 m21Var = (m21) obj;
                ViewPropertyAnimator duration = m21Var.animate().alpha(0.0f).setListener(new dd0(m21Var, 23)).setDuration(300L);
                m21Var.b = duration;
                duration.start();
                break;
            case 18:
                o21 o21Var = (o21) obj;
                Utilities.Callback callback = o21Var.b;
                if (callback != null) {
                    callback.run(Long.valueOf(o21Var.a.s));
                    break;
                }
                break;
            case 19:
                l31 l31Var = ((c31) obj).b;
                if (l31Var.k()) {
                    l31Var.l();
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
                ((t41) obj).c.setVisibility(8);
                break;
            case 24:
                ((org.telegram.ui.yk) obj).c.presentFragment(new org.telegram.ui.f41());
                break;
            case 25:
                ((d51) obj).requestLayout();
                break;
            case 26:
                ((u51) obj).f();
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
                ((v61) obj).invalidateSelf();
                break;
            default:
                vz vzVar = ((i71) obj).b;
                if (vzVar != null) {
                    vzVar.e(false, true, false);
                    break;
                }
                break;
        }
    }
}
