package org.telegram.ui;

import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ou0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ou0(Object obj, int i7, int i10) {
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
                    vv0 vv0Var = profileActivity.N;
                    if (!vv0Var.E1) {
                        if (org.telegram.ui.Components.xs0.I0(vv0Var.getClosestTab())) {
                            vv0 vv0Var2 = profileActivity.N;
                            profileActivity.N.Y0(profileActivity, profileActivity.a(), vv0Var2.u1(vv0Var2.getClosestTab()));
                            break;
                        } else if (profileActivity.getMessagesController().W4()) {
                            profileActivity.getMessagesController().e7.edit().putBoolean("story_keep", true).apply();
                            fi.va D = fi.va.D(profileActivity.getParentActivity(), profileActivity.getCurrentAccount());
                            D.y = new uv0(profileActivity);
                            D.Q(null);
                            break;
                        } else {
                            profileActivity.showDialog(new ug.w0((org.telegram.ui.ActionBar.f2) profileActivity, 14, true));
                            break;
                        }
                    }
                }
                if (!org.telegram.ui.Components.xs0.I0(profileActivity.N.getClosestTab())) {
                    long e10 = profileActivity.getUserConfig().e();
                    org.telegram.messenger.video.n nVar = profileActivity.x5;
                    if (nVar != null) {
                        nVar.run();
                        profileActivity.x5 = null;
                    }
                    org.telegram.ui.Components.cc.e();
                    boolean z9 = profileActivity.N.getClosestTab() == 9;
                    ArrayList arrayList = new ArrayList();
                    SparseArray<org.telegram.messenger.ij> actionModeSelected = profileActivity.N.getActionModeSelected();
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
                    profileActivity.N.V(false);
                    if (z9) {
                        profileActivity.N.i1(8);
                    }
                    if (!arrayList.isEmpty()) {
                        boolean[] zArr = new boolean[arrayList.size()];
                        for (int i14 = 0; i14 < arrayList.size(); i14++) {
                            TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) arrayList.get(i14);
                            zArr[i14] = storyItem2.pinned;
                            storyItem2.pinned = z9;
                        }
                        profileActivity.getMessagesController().P1().q0(e10, arrayList, false);
                        boolean[] zArr2 = {false};
                        boolean z10 = z9;
                        profileActivity.x5 = new org.telegram.messenger.video.n(profileActivity, e10, arrayList, z9);
                        bi.i0 i0Var = new bi.i0(profileActivity, zArr2, arrayList, zArr, e10, 15);
                        (z10 ? org.telegram.ui.Components.hc.a0(profileActivity).L(R.raw.contact_check, org.telegram.messenger.id.G(i7, "StorySavedTitle", new Object[0]), org.telegram.messenger.id.M0(2131744487, null), org.telegram.messenger.id.M0(2131743888, null), i0Var).j() : org.telegram.ui.Components.hc.a0(profileActivity).J(R.raw.chats_archived, org.telegram.messenger.id.G(i7, "StoryArchived", new Object[0]), org.telegram.messenger.id.M0(2131743888, null), 5000, false, i0Var).j()).v = new qn0(22, profileActivity, zArr2);
                        break;
                    }
                } else {
                    long a10 = profileActivity.a();
                    vv0 vv0Var3 = profileActivity.N;
                    int u12 = vv0Var3.u1(vv0Var3.getClosestTab());
                    String w10 = profileActivity.getMessagesController().P1().w(u12, a10);
                    org.telegram.messenger.video.n nVar2 = profileActivity.x5;
                    if (nVar2 != null) {
                        nVar2.run();
                        profileActivity.x5 = null;
                    }
                    org.telegram.ui.Components.cc.e();
                    ArrayList arrayList2 = new ArrayList();
                    SparseArray<org.telegram.messenger.ij> actionModeSelected2 = profileActivity.N.getActionModeSelected();
                    if (actionModeSelected2 != null) {
                        for (int i15 = 0; i15 < actionModeSelected2.size(); i15++) {
                            TL_stories.StoryItem storyItem3 = actionModeSelected2.valueAt(i15).l;
                            if (storyItem3 != null) {
                                arrayList2.add(storyItem3);
                            }
                        }
                    }
                    profileActivity.N.V(false);
                    if (!arrayList2.isEmpty()) {
                        bi.f9 f9Var = new bi.f9(profileActivity, a10, u12, arrayList2);
                        profileActivity.getMessagesController().P1().f0(u12, a10, arrayList2);
                        org.telegram.ui.Components.hc.a0(profileActivity).K(R.raw.chats_archived, org.telegram.messenger.g0.X2(org.telegram.messenger.id.G(arrayList2.size(), "StoryRemovedFromAlbumTitle", w10)), org.telegram.messenger.id.M0(2131743888, null), f9Var).j();
                        break;
                    }
                }
                break;
            case 1:
                c51 c51Var = (c51) obj;
                c51Var.h0.E(i11);
                c51Var.p0(i11, true);
                break;
            default:
                org.telegram.ui.Wallet.na naVar = (org.telegram.ui.Wallet.na) obj;
                EditText editText = naVar.a;
                TextView[] textViewArr = naVar.N;
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
