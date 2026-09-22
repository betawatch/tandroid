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

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
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
                yu0 yu0Var = ((mr0) obj).G;
                if (yu0Var.C1) {
                    yu0Var.b1(false);
                    break;
                }
                break;
            case 2:
                ((ws0) obj).f.m1(false);
                break;
            case 3:
                org.telegram.ui.ActionBar.n2 n2Var = ((ht0) obj).f.v1;
                if (n2Var != null) {
                    n2Var.presentFragment(new PremiumPreviewFragment(0, "similar_channels"));
                    break;
                }
                break;
            case 4:
                ((jq0) obj).run();
                break;
            case 5:
                iu0 iu0Var = (iu0) obj;
                ArrayList arrayList3 = iu0Var.f;
                if (iu0Var.h) {
                    iu0Var.h = false;
                    ArrayList<Long> arrayList4 = new ArrayList<>();
                    for (int i11 = 0; i11 < arrayList3.size(); i11++) {
                        if (((SavedMessagesController.SavedDialog) arrayList3.get(i11)).pinned) {
                            arrayList4.add(Long.valueOf(((SavedMessagesController.SavedDialog) arrayList3.get(i11)).dialogId));
                        }
                    }
                    iu0Var.x.v1.getMessagesController().getSavedMessagesController().updatePinnedOrder(arrayList4);
                    break;
                }
                break;
            case 6:
                ((ju0) obj).F();
                break;
            case 7:
                ((pv0) obj).X();
                break;
            case 8:
                ((yv0) obj).getClass();
                break;
            case 9:
                rw0 rw0Var = (rw0) obj;
                if (!rw0Var.w) {
                    rw0Var.y = 0.0f;
                    break;
                }
                break;
            case 10:
                ((dy0) obj).b();
                break;
            case 11:
                ny0 ny0Var = (ny0) obj;
                int i12 = ny0Var.a;
                ny0Var.F = null;
                ly0 ly0Var = ny0Var.c;
                if (ly0Var != null && ly0Var.getEditField() != null && ny0Var.c.getFieldText() != null) {
                    int selectionStart = ny0Var.c.getEditField().getSelectionStart();
                    int selectionEnd = ny0Var.c.getEditField().getSelectionEnd();
                    if (selectionStart != selectionEnd) {
                        ny0Var.s = false;
                        ai.f0 f0Var = ny0Var.d;
                        if (f0Var != null) {
                            f0Var.invalidate();
                            break;
                        }
                    } else {
                        CharSequence fieldText = ny0Var.c.getFieldText();
                        boolean z10 = fieldText instanceof Spanned;
                        Emoji.EmojiSpan[] emojiSpanArr = z10 ? (Emoji.EmojiSpan[]) ((Spanned) fieldText).getSpans(Math.max(0, selectionEnd - 24), selectionEnd, Emoji.EmojiSpan.class) : null;
                        if (emojiSpanArr == null || emojiSpanArr.length <= 0 || !SharedConfig.suggestAnimatedEmoji || !UserConfig.getInstance(i12).isPremium()) {
                            x5[] x5VarArr = z10 ? (x5[]) ((Spanned) fieldText).getSpans(Math.max(0, selectionEnd), selectionEnd, x5.class) : null;
                            if ((x5VarArr == null || x5VarArr.length == 0) && selectionEnd < 52) {
                                ny0Var.s = true;
                                ny0Var.c();
                                ny0Var.T = null;
                                String substring = fieldText.toString().substring(0, selectionEnd);
                                if (substring != null) {
                                    String str = ny0Var.H;
                                    if (str == null || ny0Var.G != 1 || !str.equals(substring) || ny0Var.x || (arrayList = ny0Var.w) == null || arrayList.isEmpty()) {
                                        int i13 = ny0Var.I + 1;
                                        ny0Var.I = i13;
                                        long currentTimeMillis = System.currentTimeMillis();
                                        if (ny0Var.J == null || Math.abs(currentTimeMillis - ny0Var.L) > 360) {
                                            ny0Var.L = currentTimeMillis;
                                            currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
                                        } else {
                                            ny0Var.L = currentTimeMillis;
                                            currentKeyboardLanguage = ny0Var.J;
                                        }
                                        String[] strArr = ny0Var.J;
                                        if (strArr == null || !Arrays.equals(currentKeyboardLanguage, strArr)) {
                                            MediaDataController.getInstance(i12).fetchNewEmojiKeywords(currentKeyboardLanguage);
                                        }
                                        ny0Var.J = currentKeyboardLanguage;
                                        Runnable runnable = ny0Var.K;
                                        if (runnable != null) {
                                            AndroidUtilities.cancelRunOnUIThread(runnable);
                                            ny0Var.K = null;
                                        }
                                        ny0Var.K = new ai.c9(ny0Var, currentKeyboardLanguage, substring, i13, 27);
                                        ArrayList arrayList5 = ny0Var.w;
                                        if (arrayList5 == null || arrayList5.isEmpty()) {
                                            AndroidUtilities.runOnUIThread(ny0Var.K, 600L);
                                        } else {
                                            ny0Var.K.run();
                                        }
                                    } else {
                                        ny0Var.v = false;
                                        ny0Var.c();
                                        ny0Var.d.setVisibility(0);
                                        ny0Var.U = AndroidUtilities.dp(10.0f);
                                        ny0Var.d.invalidate();
                                    }
                                }
                                ai.f0 f0Var2 = ny0Var.d;
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
                                    ny0Var.s = true;
                                    ny0Var.c();
                                    ny0Var.T = emojiSpan;
                                    ny0Var.W = null;
                                    ny0Var.V = null;
                                    if (substring2 != null) {
                                        String str2 = ny0Var.H;
                                        if (str2 == null || ny0Var.G != 2 || !str2.equals(substring2) || ny0Var.x || (arrayList2 = ny0Var.w) == null || arrayList2.isEmpty()) {
                                            int i14 = ny0Var.I + 1;
                                            ny0Var.I = i14;
                                            Runnable runnable2 = ny0Var.K;
                                            if (runnable2 != null) {
                                                AndroidUtilities.cancelRunOnUIThread(runnable2);
                                            }
                                            ny0Var.K = new wm(ny0Var, substring2, i14, 21);
                                            ArrayList arrayList6 = ny0Var.w;
                                            if (arrayList6 == null || arrayList6.isEmpty()) {
                                                AndroidUtilities.runOnUIThread(ny0Var.K, 600L);
                                            } else {
                                                ny0Var.K.run();
                                            }
                                        } else {
                                            ny0Var.v = false;
                                            ny0Var.c();
                                            ai.f0 f0Var3 = ny0Var.d;
                                            if (f0Var3 != null) {
                                                f0Var3.setVisibility(0);
                                                ny0Var.d.invalidate();
                                            }
                                        }
                                    }
                                    ai.f0 f0Var4 = ny0Var.d;
                                    if (f0Var4 != null) {
                                        f0Var4.invalidate();
                                        break;
                                    }
                                }
                            }
                        }
                        Runnable runnable3 = ny0Var.K;
                        if (runnable3 != null) {
                            AndroidUtilities.cancelRunOnUIThread(runnable3);
                            ny0Var.K = null;
                        }
                        ny0Var.s = false;
                        ai.f0 f0Var5 = ny0Var.d;
                        if (f0Var5 != null) {
                            f0Var5.invalidate();
                            break;
                        }
                    }
                } else {
                    ny0Var.s = false;
                    ny0Var.v = true;
                    ai.f0 f0Var6 = ny0Var.d;
                    if (f0Var6 != null) {
                        f0Var6.invalidate();
                        break;
                    }
                }
                break;
            case 12:
                ty0 ty0Var = (ty0) obj;
                ty0Var.G = null;
                ty0Var.b();
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
                ((n01) obj).a();
                break;
            case 15:
                ArrayList arrayList7 = ((u01) obj).a;
                for (int i15 = 0; i15 < arrayList7.size(); i15++) {
                    ((View) arrayList7.get(i15)).setVisibility(8);
                    if (arrayList7.get(i15) instanceof org.telegram.ui.Cells.t1) {
                        ((org.telegram.ui.Cells.t1) arrayList7.get(i15)).J3(false, false);
                        ((org.telegram.ui.Cells.t1) arrayList7.get(i15)).L3(false, false, false);
                    }
                }
                break;
            case 16:
                u11 u11Var = (u11) obj;
                u11Var.J = null;
                u11Var.H.animate().scaleX(1.0f).scaleY(1.0f).setDuration(150L).setInterpolator(qr.f).start();
                break;
            case 17:
                y11 y11Var = (y11) obj;
                ViewPropertyAnimator duration = y11Var.animate().alpha(0.0f).setListener(new jd0(y11Var, 22)).setDuration(300L);
                y11Var.b = duration;
                duration.start();
                break;
            case 18:
                a21 a21Var = (a21) obj;
                Utilities.Callback callback = a21Var.b;
                if (callback != null) {
                    callback.run(Long.valueOf(a21Var.a.s));
                    break;
                }
                break;
            case 19:
                x21 x21Var = ((o21) obj).b;
                if (x21Var.k()) {
                    x21Var.l();
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
                ((f41) obj).c.setVisibility(8);
                break;
            case 24:
                ((org.telegram.ui.zk) obj).c.presentFragment(new org.telegram.ui.f41());
                break;
            case 25:
                ((p41) obj).requestLayout();
                break;
            case 26:
                ((g51) obj).f();
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
                ((h61) obj).invalidateSelf();
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
