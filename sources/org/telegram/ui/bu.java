package org.telegram.ui;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_update;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class bu extends org.telegram.ui.Components.eb {
    public final FrameLayout X;
    public final ci.d Y;
    public final ci.d Z;
    public final ArrayList a0;
    public final HashSet b0;
    public boolean c0;
    public org.telegram.ui.Components.c71 d0;

    public bu(Activity activity, HashSet hashSet) {
        super(activity, null, false, false, new ai.d());
        ArrayList arrayList = new ArrayList();
        this.a0 = arrayList;
        HashSet hashSet2 = new HashSet();
        this.b0 = hashSet2;
        arrayList.addAll(hashSet);
        hashSet2.addAll(hashSet);
        fixNavigationBar(getThemedColor(org.telegram.ui.ActionBar.i6.h5));
        this.drawDoubleNavigationBar = false;
        FrameLayout frameLayout = new FrameLayout(activity);
        this.X = frameLayout;
        LinearLayout e7 = org.telegram.messenger.q.e(activity, 1);
        frameLayout.addView(e7, w7.x5.e(-1, -1, 119));
        ImageView imageView = new ImageView(activity);
        imageView.setImageResource(R.drawable.ic_close_white);
        imageView.setColorFilter(new PorterDuffColorFilter(-8090220, PorterDuff.Mode.SRC_IN));
        frameLayout.addView(imageView, w7.x5.a(24.0f, 0.0f, 14.0f, 14.0f, 0.0f, 24, 53));
        w7.z5.a(imageView);
        final int i10 = 0;
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.au
            public final /* synthetic */ bu b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        this.b.dismiss();
                        break;
                    case 1:
                        this.b.T(false);
                        break;
                    default:
                        this.b.T(true);
                        break;
                }
            }
        });
        FrameLayout frameLayout2 = new FrameLayout(activity);
        frameLayout2.setBackground(org.telegram.ui.ActionBar.i6.K(AndroidUtilities.dp(80.0f), org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.Oh, this.resourcesProvider)));
        ImageView imageView2 = new ImageView(activity);
        imageView2.setImageResource(R.drawable.filled_calls_users);
        frameLayout2.addView(imageView2, w7.x5.e(56, 56, 17));
        e7.addView(frameLayout2, w7.x5.t(80, 80, 1, 2, 21, 2, 13));
        int i11 = org.telegram.ui.ActionBar.i6.G6;
        org.telegram.ui.Components.ea0 a2 = w7.b6.a(activity, 20.0f, i11, true, this.resourcesProvider);
        a2.setText(LocaleController.getString(R.string.GroupCallCreateTitle));
        a2.setGravity(17);
        e7.addView(a2, w7.x5.t(-1, -2, 1, 2, 0, 2, 4));
        org.telegram.ui.Components.ea0 a10 = w7.b6.a(activity, 14.0f, i11, false, this.resourcesProvider);
        a10.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.GroupCallCreateText)));
        a10.setGravity(17);
        a10.setMaxWidth(ci.d4.a(a10.getText(), a10.getPaint()));
        e7.addView(a10, w7.x5.t(-1, -2, 1, 2, 0, 2, 23));
        org.telegram.ui.Components.c71 c71Var = this.d0;
        if (c71Var != null) {
            c71Var.N(false);
        }
        s4.j jVar = new s4.j();
        jVar.m = false;
        jVar.C = false;
        jVar.o(org.telegram.ui.Components.hs.h);
        jVar.n(350L);
        this.d.setItemAnimator(jVar);
        this.d.setOnItemClickListener(new z0(this, 28));
        FrameLayout frameLayout3 = new FrameLayout(activity);
        LinearLayout e10 = org.telegram.messenger.q.e(activity, 0);
        e10.setPadding(AndroidUtilities.dp(14.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(14.0f));
        frameLayout3.addView(e10, w7.x5.e(-1, -2, 87));
        ci.d dVar = new ci.d(activity, this.resourcesProvider, true);
        this.Y = dVar;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "x  ");
        spannableStringBuilder.setSpan(new org.telegram.ui.Components.er(R.drawable.profile_phone, 0), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.GroupCallCreateVoice));
        dVar.g(spannableStringBuilder, false, true);
        e10.addView(dVar, w7.x5.p(-1, 48, 1.0f, 119, 0, 0, 6, 0));
        final int i12 = 1;
        dVar.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.au
            public final /* synthetic */ bu b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        this.b.dismiss();
                        break;
                    case 1:
                        this.b.T(false);
                        break;
                    default:
                        this.b.T(true);
                        break;
                }
            }
        });
        ci.d dVar2 = new ci.d(activity, this.resourcesProvider, true);
        this.Z = dVar2;
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
        spannableStringBuilder2.append((CharSequence) "x  ");
        spannableStringBuilder2.setSpan(new org.telegram.ui.Components.er(R.drawable.profile_video, 0), 0, 1, 33);
        spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.GroupCallCreateVideo));
        dVar2.g(spannableStringBuilder2, false, true);
        e10.addView(dVar2, w7.x5.p(-1, 48, 1.0f, 119, 6, 0, 0, 0));
        final int i13 = 2;
        dVar2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.au
            public final /* synthetic */ bu b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i13) {
                    case 0:
                        this.b.dismiss();
                        break;
                    case 1:
                        this.b.T(false);
                        break;
                    default:
                        this.b.T(true);
                        break;
                }
            }
        });
        this.containerView.addView(frameLayout3, w7.x5.e(-1, -2, 87));
        org.telegram.ui.Components.qm0 qm0Var = this.d;
        int i14 = this.backgroundPaddingLeft;
        qm0Var.setPadding(i14, 0, i14, AndroidUtilities.dp(76.0f));
    }

    public static void R(bu buVar, TLObject tLObject, ci.d dVar, boolean z10, HashSet hashSet, TLRPC.TL_error tL_error) {
        if (!(tLObject instanceof TLRPC.Updates)) {
            if (!(tLObject instanceof TL_phone.groupCall)) {
                if (tL_error != null) {
                    org.telegram.ui.Cells.c1.p(buVar.topBulletinContainer, buVar.resourcesProvider, tL_error, false);
                    return;
                }
                return;
            }
            TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject;
            MessagesController.getInstance(buVar.currentAccount).putUsers(groupcall.users, false);
            MessagesController.getInstance(buVar.currentAccount).putChats(groupcall.chats, false);
            if (LaunchActivity.G1 == null) {
                buVar.c0 = false;
                dVar.setLoading(false);
                return;
            }
            TLRPC.TL_inputGroupCall tL_inputGroupCall = new TLRPC.TL_inputGroupCall();
            TLRPC.GroupCall groupCall = groupcall.call;
            tL_inputGroupCall.id = groupCall.id;
            tL_inputGroupCall.access_hash = groupCall.access_hash;
            buVar.dismiss();
            org.telegram.ui.Components.voip.f2.g(LaunchActivity.G1, buVar.currentAccount, tL_inputGroupCall, z10, groupcall.call, hashSet);
            return;
        }
        TLRPC.Updates updates = (TLRPC.Updates) tLObject;
        MessagesController.getInstance(buVar.currentAccount).putUsers(updates.users, false);
        MessagesController.getInstance(buVar.currentAccount).putChats(updates.chats, false);
        ArrayList findUpdates = MessagesController.findUpdates(updates, TL_update.TL_updateGroupCall.class);
        int size = findUpdates.size();
        TLRPC.GroupCall groupCall2 = null;
        int i10 = 0;
        while (i10 < size) {
            Object obj = findUpdates.get(i10);
            i10++;
            groupCall2 = ((TL_update.TL_updateGroupCall) obj).call;
        }
        Utilities.stageQueue.postRunnable(new org.telegram.ui.Components.ea1(7, buVar, updates));
        if (groupCall2 == null || LaunchActivity.G1 == null) {
            buVar.c0 = false;
            dVar.setLoading(false);
            return;
        }
        TLRPC.TL_inputGroupCall tL_inputGroupCall2 = new TLRPC.TL_inputGroupCall();
        tL_inputGroupCall2.id = groupCall2.id;
        tL_inputGroupCall2.access_hash = groupCall2.access_hash;
        buVar.dismiss();
        org.telegram.ui.Components.voip.f2.g(LaunchActivity.G1, buVar.currentAccount, tL_inputGroupCall2, z10, groupCall2, hashSet);
    }

    public static void S(bu buVar, ArrayList arrayList) {
        arrayList.add(org.telegram.ui.Components.p61.k(buVar.X));
        arrayList.add(org.telegram.ui.Components.p61.B(null));
        ArrayList arrayList2 = buVar.a0;
        if (arrayList2 == null || arrayList2.isEmpty()) {
            return;
        }
        com.google.android.gms.internal.vision.e2.n(R.string.GroupCallCreateAddMembers, arrayList);
        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
            Long l4 = (Long) arrayList2.get(i10);
            l4.getClass();
            TLRPC.User user = MessagesController.getInstance(buVar.currentAccount).getUser(l4);
            if (user == null) {
                return;
            }
            int i11 = xg.k.a;
            org.telegram.ui.Components.p61 J = org.telegram.ui.Components.p61.J(xg.k.class);
            J.G = user;
            J.K(buVar.b0.contains(l4));
            arrayList.add(J);
        }
    }

    @Override // org.telegram.ui.Components.eb
    public final CharSequence B() {
        return LocaleController.getString(R.string.GroupCallCreateTitle);
    }

    public final void T(boolean z10) {
        if (this.c0) {
            return;
        }
        this.c0 = true;
        ci.d dVar = z10 ? this.Z : this.Y;
        dVar.setLoading(true);
        HashSet hashSet = new HashSet();
        hashSet.addAll(this.b0);
        TL_phone.createConferenceCall createconferencecall = new TL_phone.createConferenceCall();
        createconferencecall.random_id = Utilities.random.nextInt();
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(createconferencecall, new ci.s1(this, dVar, z10, hashSet));
    }

    @Override // org.telegram.ui.Components.eb
    public final org.telegram.ui.Components.pm0 x(org.telegram.ui.Components.qm0 qm0Var) {
        org.telegram.ui.Components.c71 c71Var = new org.telegram.ui.Components.c71(qm0Var, getContext(), this.currentAccount, 0, true, new b5(this, 10), this.resourcesProvider);
        this.d0 = c71Var;
        return c71Var;
    }
}
