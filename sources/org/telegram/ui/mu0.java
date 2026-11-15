package org.telegram.ui;

import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class mu0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ mu0(Object obj, int i7, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = i7;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i7;
        int i10 = this.a;
        int i11 = this.b;
        Object obj = this.c;
        switch (i10) {
            case 0:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                if (i11 == 0) {
                    uv0 uv0Var = profileActivity.O;
                    if (!uv0Var.F1) {
                        if (org.telegram.ui.Components.ys0.J0(uv0Var.getClosestTab())) {
                            uv0 uv0Var2 = profileActivity.O;
                            profileActivity.O.a1(profileActivity, profileActivity.a(), uv0Var2.w1(uv0Var2.getClosestTab()));
                            break;
                        } else if (profileActivity.getMessagesController().X4()) {
                            profileActivity.getMessagesController().f7.edit().putBoolean("story_keep", true).apply();
                            hi.sa D = hi.sa.D(profileActivity.getParentActivity(), profileActivity.getCurrentAccount());
                            D.y = new tv0(profileActivity);
                            D.Q(null);
                            break;
                        } else {
                            profileActivity.showDialog(new ug.x0((org.telegram.ui.ActionBar.e2) profileActivity, 14, true));
                            break;
                        }
                    }
                }
                if (!org.telegram.ui.Components.ys0.J0(profileActivity.O.getClosestTab())) {
                    long e10 = profileActivity.getUserConfig().e();
                    ai.k2 k2Var = profileActivity.B5;
                    if (k2Var != null) {
                        k2Var.run();
                        profileActivity.B5 = null;
                    }
                    org.telegram.ui.Components.xb.e();
                    boolean z10 = profileActivity.O.getClosestTab() == 9;
                    ArrayList arrayList = new ArrayList();
                    SparseArray<org.telegram.messenger.gj> actionModeSelected = profileActivity.O.getActionModeSelected();
                    if (actionModeSelected != null) {
                        int i12 = 0;
                        for (int i13 = 0; i13 < actionModeSelected.size(); i13++) {
                            TL_stories.StoryItem storyItem = actionModeSelected.valueAt(i13).l;
                            if (storyItem != null) {
                                arrayList.add(storyItem);
                                i12++;
                            }
                        }
                        i7 = i12;
                    } else {
                        i7 = 0;
                    }
                    profileActivity.O.V(false);
                    if (z10) {
                        profileActivity.O.k1(8);
                    }
                    if (!arrayList.isEmpty()) {
                        boolean[] zArr = new boolean[arrayList.size()];
                        for (int i14 = 0; i14 < arrayList.size(); i14++) {
                            TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) arrayList.get(i14);
                            zArr[i14] = storyItem2.pinned;
                            storyItem2.pinned = z10;
                        }
                        profileActivity.getMessagesController().P1().q0(e10, arrayList, false);
                        boolean[] zArr2 = {false};
                        boolean z11 = z10;
                        profileActivity.B5 = new ai.k2(profileActivity, e10, arrayList, z10, 3);
                        bi.r1 r1Var = new bi.r1(profileActivity, zArr2, arrayList, zArr, e10, 16);
                        (z11 ? org.telegram.ui.Components.cc.a0(profileActivity).L(R.raw.contact_check, org.telegram.messenger.hd.G(i7, "StorySavedTitle", new Object[0]), org.telegram.messenger.hd.M0(2131744484, null), org.telegram.messenger.hd.M0(2131743885, null), r1Var).j() : org.telegram.ui.Components.cc.a0(profileActivity).J(R.raw.chats_archived, org.telegram.messenger.hd.G(i7, "StoryArchived", new Object[0]), org.telegram.messenger.hd.M0(2131743885, null), 5000, false, r1Var).j()).v = new mp0(19, profileActivity, zArr2);
                        break;
                    }
                } else {
                    long a10 = profileActivity.a();
                    uv0 uv0Var3 = profileActivity.O;
                    int w12 = uv0Var3.w1(uv0Var3.getClosestTab());
                    String w10 = profileActivity.getMessagesController().P1().w(w12, a10);
                    ai.k2 k2Var2 = profileActivity.B5;
                    if (k2Var2 != null) {
                        k2Var2.run();
                        profileActivity.B5 = null;
                    }
                    org.telegram.ui.Components.xb.e();
                    ArrayList arrayList2 = new ArrayList();
                    SparseArray<org.telegram.messenger.gj> actionModeSelected2 = profileActivity.O.getActionModeSelected();
                    if (actionModeSelected2 != null) {
                        for (int i15 = 0; i15 < actionModeSelected2.size(); i15++) {
                            TL_stories.StoryItem storyItem3 = actionModeSelected2.valueAt(i15).l;
                            if (storyItem3 != null) {
                                arrayList2.add(storyItem3);
                            }
                        }
                    }
                    profileActivity.O.V(false);
                    if (!arrayList2.isEmpty()) {
                        di.x7 x7Var = new di.x7(profileActivity, a10, w12, arrayList2);
                        profileActivity.getMessagesController().P1().f0(w12, a10, arrayList2);
                        org.telegram.ui.Components.cc.a0(profileActivity).K(R.raw.chats_archived, org.telegram.messenger.g0.X2(org.telegram.messenger.hd.G(arrayList2.size(), "StoryRemovedFromAlbumTitle", w10)), org.telegram.messenger.hd.M0(2131743885, null), x7Var).j();
                        break;
                    }
                }
                break;
            case 1:
                z41 z41Var = (z41) obj;
                z41Var.i0.C(i11);
                z41Var.p0(i11, true);
                break;
            default:
                org.telegram.ui.Wallet.pa paVar = (org.telegram.ui.Wallet.pa) obj;
                EditText editText = paVar.a;
                TextView[] textViewArr = paVar.O;
                TextView textView = textViewArr[i11];
                if (textView != null && !TextUtils.isEmpty(textView.getText())) {
                    String charSequence = textViewArr[i11].getText().toString();
                    editText.setText(charSequence);
                    editText.setSelection(charSequence.length());
                    paVar.a();
                    paVar.a();
                    Runnable runnable = paVar.r;
                    if (runnable != null) {
                        editText.post(runnable);
                        break;
                    }
                }
                break;
        }
    }
}
