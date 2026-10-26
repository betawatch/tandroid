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

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class mp0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ mp0(fi.e2 e2Var, int i10) {
        this.a = 14;
        this.b = e2Var;
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
                org.telegram.ui.Cells.s1 s1Var = ((pp0) obj).n;
                if (s1Var != null) {
                    s1Var.invalidate();
                    break;
                }
                break;
            case 1:
                qp0 qp0Var = (qp0) obj;
                qp0Var.q = false;
                qp0Var.b.run();
                break;
            case 2:
                ((mr0) ((bi.u) obj).b).d1(1);
                break;
            case 3:
                qr0 qr0Var = (qr0) obj;
                or0[] or0VarArr = qr0Var.a;
                if (qr0Var.b != 1) {
                    for (or0 or0Var : or0VarArr) {
                        org.telegram.ui.ActionBar.b6 b6Var = or0Var.d;
                        b6Var.setAlpha(1.0f);
                        b6Var.setScaleX(1.0f);
                        b6Var.setScaleY(1.0f);
                        or0Var.e.setAlpha(0.0f);
                    }
                    qr0Var.E = false;
                    AndroidUtilities.runOnUIThread(qr0Var.G, 4000L);
                    break;
                } else {
                    qr0Var.E = !qr0Var.E;
                    int length = or0VarArr.length;
                    while (i11 < length) {
                        or0 or0Var2 = or0VarArr[i11];
                        org.telegram.ui.ActionBar.b6 b6Var2 = or0Var2.d;
                        org.telegram.ui.ActionBar.b6 b6Var3 = or0Var2.e;
                        b6Var2.setPivotX(0.0f);
                        b6Var3.setPivotX(0.0f);
                        if (qr0Var.E) {
                            b6Var2.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                            b6Var3.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                        } else {
                            b6Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                            b6Var3.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                        }
                        i11++;
                    }
                    AndroidUtilities.runOnUIThread(qr0Var.G, 4000L);
                    break;
                }
            case 4:
                ((or0) obj).setVisibility(8);
                break;
            case 5:
                aw0 aw0Var = ((us0) obj).G;
                if (aw0Var.E1) {
                    aw0Var.k1(false);
                    break;
                }
                break;
            case 6:
                ((du0) obj).a.v1(false);
                break;
            case 7:
                org.telegram.ui.ActionBar.r2 r2Var = ((ju0) obj).f.x1;
                if (r2Var != null) {
                    r2Var.presentFragment(new PremiumPreviewFragment(0, "similar_channels"));
                    break;
                }
                break;
            case 8:
                ((mp0) obj).run();
                break;
            case 9:
                lv0 lv0Var = (lv0) obj;
                ArrayList arrayList3 = lv0Var.f;
                if (lv0Var.h) {
                    lv0Var.h = false;
                    ArrayList<Long> arrayList4 = new ArrayList<>();
                    while (i11 < arrayList3.size()) {
                        if (((SavedMessagesController.SavedDialog) arrayList3.get(i11)).pinned) {
                            arrayList4.add(Long.valueOf(((SavedMessagesController.SavedDialog) arrayList3.get(i11)).dialogId));
                        }
                        i11++;
                    }
                    lv0Var.x.x1.getMessagesController().getSavedMessagesController().updatePinnedOrder(arrayList4);
                    break;
                }
                break;
            case 10:
                ((mv0) obj).F();
                break;
            case 11:
                ((vw0) obj).V();
                break;
            case 12:
                break;
            case 13:
                ((ex0) obj).getClass();
                break;
            case 14:
                ((by0) obj).l0(0);
                break;
            case 15:
                wx0 wx0Var = (wx0) obj;
                if (!wx0Var.w) {
                    wx0Var.y = 0.0f;
                    break;
                }
                break;
            case 16:
                ((jz0) obj).b();
                break;
            case 17:
                tz0 tz0Var = (tz0) obj;
                int i12 = tz0Var.a;
                tz0Var.H = null;
                rz0 rz0Var = tz0Var.c;
                if (rz0Var != null && rz0Var.getEditField() != null && tz0Var.c.getFieldText() != null) {
                    int selectionStart = tz0Var.c.getEditField().getSelectionStart();
                    int selectionEnd = tz0Var.c.getEditField().getSelectionEnd();
                    if (selectionStart != selectionEnd) {
                        tz0Var.s = false;
                        bh.r rVar = tz0Var.d;
                        if (rVar != null) {
                            rVar.invalidate();
                            break;
                        }
                    } else {
                        CharSequence fieldText = tz0Var.c.getFieldText();
                        boolean z10 = fieldText instanceof Spanned;
                        Emoji.EmojiSpan[] emojiSpanArr = z10 ? (Emoji.EmojiSpan[]) ((Spanned) fieldText).getSpans(Math.max(0, selectionEnd - 24), selectionEnd, Emoji.EmojiSpan.class) : null;
                        if (emojiSpanArr == null || emojiSpanArr.length <= 0 || !SharedConfig.suggestAnimatedEmoji || !UserConfig.getInstance(i12).isPremium()) {
                            c6[] c6VarArr = z10 ? (c6[]) ((Spanned) fieldText).getSpans(Math.max(0, selectionEnd), selectionEnd, c6.class) : null;
                            if ((c6VarArr == null || c6VarArr.length == 0) && selectionEnd < 52) {
                                tz0Var.s = true;
                                tz0Var.c();
                                tz0Var.V = null;
                                String substring = fieldText.toString().substring(0, selectionEnd);
                                if (substring != null) {
                                    String str = tz0Var.J;
                                    if (str == null || tz0Var.I != 1 || !str.equals(substring) || tz0Var.x || (arrayList = tz0Var.w) == null || arrayList.isEmpty()) {
                                        int i13 = tz0Var.K + 1;
                                        tz0Var.K = i13;
                                        long currentTimeMillis = System.currentTimeMillis();
                                        if (tz0Var.L == null || Math.abs(currentTimeMillis - tz0Var.N) > 360) {
                                            tz0Var.N = currentTimeMillis;
                                            currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
                                        } else {
                                            tz0Var.N = currentTimeMillis;
                                            currentKeyboardLanguage = tz0Var.L;
                                        }
                                        String[] strArr = tz0Var.L;
                                        if (strArr == null || !Arrays.equals(currentKeyboardLanguage, strArr)) {
                                            MediaDataController.getInstance(i12).fetchNewEmojiKeywords(currentKeyboardLanguage);
                                        }
                                        tz0Var.L = currentKeyboardLanguage;
                                        Runnable runnable = tz0Var.M;
                                        if (runnable != null) {
                                            AndroidUtilities.cancelRunOnUIThread(runnable);
                                            tz0Var.M = null;
                                        }
                                        tz0Var.M = new zr0(tz0Var, currentKeyboardLanguage, substring, i13, 2);
                                        ArrayList arrayList5 = tz0Var.w;
                                        if (arrayList5 == null || arrayList5.isEmpty()) {
                                            AndroidUtilities.runOnUIThread(tz0Var.M, 600L);
                                        } else {
                                            tz0Var.M.run();
                                        }
                                    } else {
                                        tz0Var.v = false;
                                        tz0Var.c();
                                        tz0Var.d.setVisibility(0);
                                        tz0Var.W = AndroidUtilities.dp(10.0f);
                                        tz0Var.d.invalidate();
                                    }
                                }
                                bh.r rVar2 = tz0Var.d;
                                if (rVar2 != null) {
                                    rVar2.invalidate();
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
                                    tz0Var.s = true;
                                    tz0Var.c();
                                    tz0Var.V = emojiSpan;
                                    tz0Var.b0 = null;
                                    tz0Var.a0 = null;
                                    if (substring2 != null) {
                                        String str2 = tz0Var.J;
                                        if (str2 == null || tz0Var.I != 2 || !str2.equals(substring2) || tz0Var.x || (arrayList2 = tz0Var.w) == null || arrayList2.isEmpty()) {
                                            int i14 = tz0Var.K + 1;
                                            tz0Var.K = i14;
                                            Runnable runnable2 = tz0Var.M;
                                            if (runnable2 != null) {
                                                AndroidUtilities.cancelRunOnUIThread(runnable2);
                                            }
                                            tz0Var.M = new org.telegram.ui.g4(tz0Var, substring2, i14, 25);
                                            ArrayList arrayList6 = tz0Var.w;
                                            if (arrayList6 == null || arrayList6.isEmpty()) {
                                                AndroidUtilities.runOnUIThread(tz0Var.M, 600L);
                                            } else {
                                                tz0Var.M.run();
                                            }
                                        } else {
                                            tz0Var.v = false;
                                            tz0Var.c();
                                            bh.r rVar3 = tz0Var.d;
                                            if (rVar3 != null) {
                                                rVar3.setVisibility(0);
                                                tz0Var.d.invalidate();
                                            }
                                        }
                                    }
                                    bh.r rVar4 = tz0Var.d;
                                    if (rVar4 != null) {
                                        rVar4.invalidate();
                                        break;
                                    }
                                }
                            }
                        }
                        Runnable runnable3 = tz0Var.M;
                        if (runnable3 != null) {
                            AndroidUtilities.cancelRunOnUIThread(runnable3);
                            tz0Var.M = null;
                        }
                        tz0Var.s = false;
                        bh.r rVar5 = tz0Var.d;
                        if (rVar5 != null) {
                            rVar5.invalidate();
                            break;
                        }
                    }
                } else {
                    tz0Var.s = false;
                    tz0Var.v = true;
                    bh.r rVar6 = tz0Var.d;
                    if (rVar6 != null) {
                        rVar6.invalidate();
                        break;
                    }
                }
                break;
            case 18:
                zz0 zz0Var = (zz0) obj;
                zz0Var.K = null;
                zz0Var.b();
                break;
            case 19:
                boolean[] zArr = (boolean[]) obj;
                if (!zArr[0]) {
                    SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
                    globalMainSettings.edit().putInt("showchattagsinfo", globalMainSettings.getInt("showchattagsinfo", 3) - 1).apply();
                    zArr[0] = true;
                    break;
                }
                break;
            case 20:
                ((x11) obj).a();
                break;
            case 21:
                ArrayList arrayList7 = ((d21) obj).a;
                for (int i15 = 0; i15 < arrayList7.size(); i15++) {
                    ((View) arrayList7.get(i15)).setVisibility(8);
                    if (arrayList7.get(i15) instanceof org.telegram.ui.Cells.s1) {
                        ((org.telegram.ui.Cells.s1) arrayList7.get(i15)).L3(false, false);
                        ((org.telegram.ui.Cells.s1) arrayList7.get(i15)).N3(false, false, false);
                    }
                }
                break;
            case 22:
                d31 d31Var = (d31) obj;
                d31Var.J = null;
                d31Var.H.animate().scaleX(1.0f).scaleY(1.0f).setDuration(150L).setInterpolator(ds.f).start();
                break;
            case 23:
                i31 i31Var = (i31) obj;
                ViewPropertyAnimator duration = i31Var.animate().alpha(0.0f).setListener(new h31(i31Var, i11)).setDuration(300L);
                i31Var.b = duration;
                duration.start();
                break;
            case 24:
                k31 k31Var = (k31) obj;
                Utilities.Callback callback = k31Var.b;
                if (callback != null) {
                    callback.run(Long.valueOf(k31Var.a.t));
                    break;
                }
                break;
            case 25:
                e41 e41Var = ((v31) obj).b;
                if (e41Var.l()) {
                    e41Var.m();
                    break;
                }
                break;
            case 26:
                MessageObject messageObject = (MessageObject) obj;
                NotificationCenter.getInstance(messageObject.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.voiceTranscriptionUpdate, messageObject);
                break;
            case 27:
                ((Utilities.Callback2) obj).run(null, Boolean.FALSE);
                break;
            case 28:
                ((org.telegram.ui.ActionBar.o1) obj).dismiss();
                break;
            default:
                ((q51) obj).c.setVisibility(8);
                break;
        }
    }

    public /* synthetic */ mp0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }
}
