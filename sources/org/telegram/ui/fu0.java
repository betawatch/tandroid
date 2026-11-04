package org.telegram.ui;

import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class fu0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ fu0(Object obj, int i3, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = i3;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i3;
        int i10 = this.a;
        int i11 = this.b;
        Object obj = this.c;
        switch (i10) {
            case 0:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                if (i11 == 0) {
                    mv0 mv0Var = profileActivity.O;
                    if (!mv0Var.F1) {
                        if (org.telegram.ui.Components.ws0.I0(mv0Var.getClosestTab())) {
                            mv0 mv0Var2 = profileActivity.O;
                            profileActivity.O.Y0(profileActivity, profileActivity.a(), mv0Var2.u1(mv0Var2.getClosestTab()));
                            break;
                        } else if (profileActivity.getMessagesController().W4()) {
                            profileActivity.getMessagesController().e7.edit().putBoolean("story_keep", true).apply();
                            gi.va D = gi.va.D(profileActivity.getParentActivity(), profileActivity.getCurrentAccount());
                            D.y = new lv0(profileActivity);
                            D.Q(null);
                            break;
                        } else {
                            profileActivity.showDialog(new vg.v0((org.telegram.ui.ActionBar.d2) profileActivity, 14, true));
                            break;
                        }
                    }
                }
                if (!org.telegram.ui.Components.ws0.I0(profileActivity.O.getClosestTab())) {
                    long e10 = profileActivity.getUserConfig().e();
                    org.telegram.messenger.video.o oVar = profileActivity.y5;
                    if (oVar != null) {
                        oVar.run();
                        profileActivity.y5 = null;
                    }
                    org.telegram.ui.Components.ac.e();
                    boolean z10 = profileActivity.O.getClosestTab() == 9;
                    ArrayList arrayList = new ArrayList();
                    SparseArray<org.telegram.messenger.zi> actionModeSelected = profileActivity.O.getActionModeSelected();
                    if (actionModeSelected != null) {
                        int i12 = 0;
                        for (int i13 = 0; i13 < actionModeSelected.size(); i13++) {
                            TL_stories.StoryItem storyItem = actionModeSelected.valueAt(i13).l;
                            if (storyItem != null) {
                                arrayList.add(storyItem);
                                i12++;
                            }
                        }
                        i3 = i12;
                    } else {
                        i3 = 0;
                    }
                    profileActivity.O.V(false);
                    if (z10) {
                        profileActivity.O.i1(8);
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
                        profileActivity.y5 = new org.telegram.messenger.video.o(profileActivity, e10, arrayList, z10);
                        ai.z1 z1Var = new ai.z1(profileActivity, zArr2, arrayList, zArr, e10, 16);
                        (z11 ? org.telegram.ui.Components.fc.a0(profileActivity).L(R.raw.contact_check, org.telegram.messenger.bd.G(i3, "StorySavedTitle", new Object[0]), org.telegram.messenger.bd.M0(2131744494, null), org.telegram.messenger.bd.M0(2131743895, null), z1Var).j() : org.telegram.ui.Components.fc.a0(profileActivity).J(R.raw.chats_archived, org.telegram.messenger.bd.G(i3, "StoryArchived", new Object[0]), org.telegram.messenger.bd.M0(2131743895, null), 5000, false, z1Var).j()).v = new hk0(27, profileActivity, zArr2);
                        break;
                    }
                } else {
                    long a10 = profileActivity.a();
                    mv0 mv0Var3 = profileActivity.O;
                    int u12 = mv0Var3.u1(mv0Var3.getClosestTab());
                    String w10 = profileActivity.getMessagesController().P1().w(u12, a10);
                    org.telegram.messenger.video.o oVar2 = profileActivity.y5;
                    if (oVar2 != null) {
                        oVar2.run();
                        profileActivity.y5 = null;
                    }
                    org.telegram.ui.Components.ac.e();
                    ArrayList arrayList2 = new ArrayList();
                    SparseArray<org.telegram.messenger.zi> actionModeSelected2 = profileActivity.O.getActionModeSelected();
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
                        ci.f8 f8Var = new ci.f8(profileActivity, a10, u12, arrayList2);
                        profileActivity.getMessagesController().P1().f0(u12, a10, arrayList2);
                        org.telegram.ui.Components.fc.a0(profileActivity).K(R.raw.chats_archived, org.telegram.messenger.g0.X2(org.telegram.messenger.bd.G(arrayList2.size(), "StoryRemovedFromAlbumTitle", w10)), org.telegram.messenger.bd.M0(2131743895, null), f8Var).j();
                        break;
                    }
                }
                break;
            case 1:
                r41 r41Var = (r41) obj;
                r41Var.i0.D(i11);
                r41Var.p0(i11, true);
                break;
            default:
                org.telegram.ui.Wallet.na naVar = (org.telegram.ui.Wallet.na) obj;
                EditText editText = naVar.a;
                TextView[] textViewArr = naVar.O;
                TextView textView = textViewArr[i11];
                if (textView != null && !TextUtils.isEmpty(textView.getText())) {
                    String charSequence = textViewArr[i11].getText().toString();
                    editText.setText(charSequence);
                    editText.setSelection(charSequence.length());
                    naVar.a();
                    naVar.a();
                    Runnable runnable = naVar.r;
                    if (runnable != null) {
                        editText.post(runnable);
                        break;
                    }
                }
                break;
        }
    }
}
