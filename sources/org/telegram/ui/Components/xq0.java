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

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final /* synthetic */ class xq0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ xq0(Object obj, int i10) {
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
                ((yq0) obj).setVisibility(8);
                break;
            case 1:
                kv0 kv0Var = ((yr0) obj).G;
                if (kv0Var.C1) {
                    kv0Var.b1(false);
                    break;
                }
                break;
            case 2:
                ((it0) obj).f.m1(false);
                break;
            case 3:
                org.telegram.ui.ActionBar.n2 n2Var = ((tt0) obj).f.v1;
                if (n2Var != null) {
                    n2Var.presentFragment(new PremiumPreviewFragment(0, "similar_channels"));
                    break;
                }
                break;
            case 4:
                ((xq0) obj).run();
                break;
            case 5:
                uu0 uu0Var = (uu0) obj;
                ArrayList arrayList3 = uu0Var.f;
                if (uu0Var.h) {
                    uu0Var.h = false;
                    ArrayList<Long> arrayList4 = new ArrayList<>();
                    for (int i11 = 0; i11 < arrayList3.size(); i11++) {
                        if (((SavedMessagesController.SavedDialog) arrayList3.get(i11)).pinned) {
                            arrayList4.add(Long.valueOf(((SavedMessagesController.SavedDialog) arrayList3.get(i11)).dialogId));
                        }
                    }
                    uu0Var.x.v1.getMessagesController().getSavedMessagesController().updatePinnedOrder(arrayList4);
                    break;
                }
                break;
            case 6:
                ((vu0) obj).F();
                break;
            case 7:
                ((bw0) obj).X();
                break;
            case 8:
                ((kw0) obj).getClass();
                break;
            case 9:
                dx0 dx0Var = (dx0) obj;
                if (!dx0Var.w) {
                    dx0Var.y = 0.0f;
                    break;
                }
                break;
            case 10:
                ((py0) obj).b();
                break;
            case 11:
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
                                            zy0Var.K = new wm(zy0Var, substring2, i14, 21);
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
            case 12:
                fz0 fz0Var = (fz0) obj;
                fz0Var.G = null;
                fz0Var.b();
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
                ((c11) obj).a();
                break;
            case 15:
                ArrayList arrayList7 = ((j11) obj).a;
                for (int i15 = 0; i15 < arrayList7.size(); i15++) {
                    ((View) arrayList7.get(i15)).setVisibility(8);
                    if (arrayList7.get(i15) instanceof org.telegram.ui.Cells.u1) {
                        ((org.telegram.ui.Cells.u1) arrayList7.get(i15)).J3(false, false);
                        ((org.telegram.ui.Cells.u1) arrayList7.get(i15)).L3(false, false, false);
                    }
                }
                break;
            case 16:
                j21 j21Var = (j21) obj;
                j21Var.J = null;
                j21Var.H.animate().scaleX(1.0f).scaleY(1.0f).setDuration(150L).setInterpolator(qr.f).start();
                break;
            case 17:
                n21 n21Var = (n21) obj;
                ViewPropertyAnimator duration = n21Var.animate().alpha(0.0f).setListener(new ed0(n21Var, 23)).setDuration(300L);
                n21Var.b = duration;
                duration.start();
                break;
            case 18:
                p21 p21Var = (p21) obj;
                Utilities.Callback callback = p21Var.b;
                if (callback != null) {
                    callback.run(Long.valueOf(p21Var.a.s));
                    break;
                }
                break;
            case 19:
                m31 m31Var = ((d31) obj).b;
                if (m31Var.k()) {
                    m31Var.l();
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
                ((u41) obj).c.setVisibility(8);
                break;
            case 24:
                ((org.telegram.ui.yk) obj).c.presentFragment(new org.telegram.ui.e41());
                break;
            case 25:
                ((e51) obj).requestLayout();
                break;
            case 26:
                ((v51) obj).f();
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
                ((w61) obj).invalidateSelf();
                break;
            default:
                vz vzVar = ((j71) obj).b;
                if (vzVar != null) {
                    vzVar.e(false, true, false);
                    break;
                }
                break;
        }
    }
}
