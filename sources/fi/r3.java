package fi;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import c8.ma;
import di.ga;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.bz;
import org.telegram.messenger.c20;
import org.telegram.messenger.fj;
import org.telegram.messenger.gd;
import org.telegram.messenger.j10;
import org.telegram.messenger.mp;
import org.telegram.messenger.o10;
import org.telegram.messenger.ri;
import org.telegram.messenger.tr;
import org.telegram.messenger.xs;
import org.telegram.messenger.z00;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.if0;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.y21;
import org.telegram.ui.Components.y60;
import org.telegram.ui.NotificationsCustomSettingsActivity;
import org.telegram.ui.uq;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final class r3 extends k.a {
    public boolean c;
    public final /* synthetic */ org.telegram.ui.ActionBar.i6 d;
    public final /* synthetic */ f9 e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ boolean n;
    public final /* synthetic */ Context r;
    public final /* synthetic */ w3 s;
    public final /* synthetic */ boolean[] w;
    public final /* synthetic */ z3 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r3(z3 z3Var, Context context, org.telegram.ui.ActionBar.i6 i6Var, org.telegram.ui.ActionBar.i6 i6Var2, f9 f9Var, boolean z10, boolean z11, boolean z12, Context context2, w3 w3Var, boolean[] zArr) {
        super(context, i6Var, true);
        this.x = z3Var;
        this.d = i6Var2;
        this.e = f9Var;
        this.f = z10;
        this.h = z11;
        this.n = z12;
        this.r = context2;
        this.s = w3Var;
        this.w = zArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:261:0x0163, code lost:
    
        if (r15.stories_hidden != false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x014e, code lost:
    
        if (r14.stories_hidden != false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0150, code lost:
    
        r1 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:414:0x0984, code lost:
    
        if (r2.bot_can_edit == false) goto L339;
     */
    /* JADX WARN: Code restructure failed: missing block: B:428:0x09b2, code lost:
    
        if (r2.delete_stories == false) goto L356;
     */
    /* JADX WARN: Code restructure failed: missing block: B:433:0x09bd, code lost:
    
        if (r0.delete_stories == false) goto L362;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:240:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0389  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0446  */
    @Override // k.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2;
        TL_stories.StoryItem storyItem;
        org.telegram.ui.ActionBar.i6 i6Var;
        TL_stories.StoryItem storyItem2;
        x3 x3Var;
        Context context;
        int i7;
        int i10;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout3;
        r3 r3Var;
        final r3 r3Var2;
        TL_stories.StoryItem storyItem3;
        String M0;
        final f9 f9Var;
        TL_stories.StoryItem storyItem4;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout4;
        String str;
        int i11;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout5;
        int i12;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout6;
        ArrayList arrayList;
        c1 c1Var;
        TLRPC.GroupCall groupCall;
        c1 c1Var2;
        String str2;
        int i13;
        String str3;
        int i14;
        int i15;
        ArrayList arrayList2;
        hi.d7 d7Var;
        TL_stories.MediaArea mediaArea;
        TLRPC.InputStickerSet i16;
        ArrayList<TLRPC.MessageEntity> arrayList3;
        TLRPC.InputStickerSet i17;
        TL_stories.StoryItem storyItem5;
        TLRPC.MessageMedia messageMedia;
        TLRPC.Photo photo;
        TLRPC.User user;
        TLRPC.Chat O0;
        TLObject tLObject;
        final r3 r3Var3;
        String str4;
        f9 f9Var2;
        org.telegram.ui.ActionBar.i6 i6Var2;
        final int i18;
        final f9 f9Var3;
        int i19;
        int i20;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout7;
        int i21;
        TL_stories.StoryItem storyItem6;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout8;
        String str5;
        int i22;
        int i23;
        z3 z3Var = this.x;
        x3 x3Var2 = z3Var.y1;
        boolean z10 = this.h;
        Context context2 = this.r;
        f9 f9Var4 = this.e;
        org.telegram.ui.ActionBar.i6 i6Var3 = this.d;
        if (z10 || x3Var2.b != null) {
            TL_stories.StoryItem storyItem7 = x3Var2.a;
            if (x3Var2.b != null) {
                i6Var = i6Var3;
                storyItem = storyItem7;
                actionBarPopupWindow$ActionBarPopupWindowLayout2 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_cancel, gd.M0(2131752578, null), false, this.d).setOnClickListener(new h3(this, 6));
            } else {
                actionBarPopupWindow$ActionBarPopupWindowLayout2 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                storyItem = storyItem7;
                i6Var = i6Var3;
            }
            if (storyItem == null) {
                return;
            }
            if (!(z3Var.m1 || z3Var.C1.h(z3Var.l1)) || x3Var2.f || (storyItem2 = x3Var2.a) == null) {
                x3Var = x3Var2;
                context = context2;
                i7 = R.id.fit_width_tag;
                i10 = 8;
            } else {
                HashSet hashSet = storyItem2.albums != null ? new HashSet(storyItem2.albums) : new HashSet();
                y60 y60Var = new y60(actionBarPopupWindow$ActionBarPopupWindowLayout2, i6Var);
                y60Var.c(R.drawable.ic_ab_back, gd.M0(2131753754, null), new bi.c7(actionBarPopupWindow$ActionBarPopupWindowLayout2, 1), false);
                y60Var.k();
                x3Var = x3Var2;
                context = context2;
                d6 B = z3Var.getStoriesController().B(z3Var.l1, true);
                d6 B2 = z3Var.C1.B(z3Var.l1, false);
                y60.f(y60Var, B, hashSet, B2 != null && B2.a(), new ga(this, i6Var, storyItem2, 2), new bi.i2(this, hashSet, storyItem2, i6Var, 3));
                int b10 = actionBarPopupWindow$ActionBarPopupWindowLayout2.b(y60Var.B);
                org.telegram.ui.ActionBar.z0 z0Var = new org.telegram.ui.ActionBar.z0(0, z3Var.getContext(), this.d, false, false);
                z3Var.o3 = z0Var;
                z0Var.j(gd.M0(2131744570, null), R.drawable.menu_album_add, null);
                org.telegram.ui.ActionBar.z0 z0Var2 = z3Var.o3;
                z0Var2.Q = new m3(actionBarPopupWindow$ActionBarPopupWindowLayout2, b10, 1);
                z0Var2.setOnClickListener(new h3(this, 12));
                actionBarPopupWindow$ActionBarPopupWindowLayout2.addView(z3Var.o3);
                actionBarPopupWindow$ActionBarPopupWindowLayout2.c = true;
                org.telegram.ui.ActionBar.e1 e1Var = new org.telegram.ui.ActionBar.e1(org.telegram.ui.ActionBar.n6.H8, z3Var.getContext(), i6Var);
                i7 = R.id.fit_width_tag;
                e1Var.setTag(R.id.fit_width_tag, 1);
                i10 = 8;
                actionBarPopupWindow$ActionBarPopupWindowLayout2.a(e1Var, ma.o(-1, 8));
            }
            int i24 = 10;
            if (z3Var.m1) {
                hi.o8 o8Var = storyItem.privacy.isEmpty() ? new hi.o8(3, z3Var.m2, new ArrayList()) : new hi.o8(z3Var.m2, storyItem.privacy);
                actionBarPopupWindow$ActionBarPopupWindowLayout3 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                org.telegram.ui.ActionBar.z0 c10 = org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout3, R.drawable.msg_view_file, gd.M0(2131742620, null), false, this.d);
                c10.setSubtext(o8Var.toString());
                c10.setOnClickListener(new ah.h(this, o8Var, storyItem, i24));
                c10.setItemHeight(56);
            } else {
                actionBarPopupWindow$ActionBarPopupWindowLayout3 = actionBarPopupWindow$ActionBarPopupWindowLayout2;
            }
            t(actionBarPopupWindow$ActionBarPopupWindowLayout3, false);
            if (z3Var.m1 || this.f) {
                org.telegram.ui.ActionBar.e1 e1Var2 = new org.telegram.ui.ActionBar.e1(org.telegram.ui.ActionBar.n6.H8, z3Var.getContext(), i6Var);
                e1Var2.setTag(i7, 1);
                actionBarPopupWindow$ActionBarPopupWindowLayout3.a(e1Var2, ma.o(-1, i10));
            }
            if (z3Var.M2 || x3Var.f || !((z3Var.G0() || mp.u1(z3Var.m2).i5()) && this.n)) {
                r3Var = this;
            } else {
                org.telegram.ui.ActionBar.z0 c11 = org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout3, R.drawable.msg_edit, gd.M0(z3Var.G0() ? 2131751277 : 2131751209, null), false, this.d);
                z3Var.c1 = c11;
                d0 d0Var = new d0(this, this.d, this.r, f9Var4, this.s, 2);
                r3Var = this;
                f9Var4 = f9Var4;
                c11.setOnClickListener(d0Var);
                if (z3Var.C1.M(z3Var.l1) && x3Var.e && !bz.b()) {
                    z3Var.c1.setAlpha(0.5f);
                }
            }
            TL_stories.StoryItem storyItem8 = x3Var.a;
            if (storyItem8 == null || !x3Var.e || x3Var.f || !(storyItem8.pinned || z3Var.H0())) {
                TL_stories.StoryItem storyItem9 = storyItem;
                r3Var2 = r3Var;
                storyItem3 = storyItem9;
            } else {
                r3 r3Var4 = r3Var;
                TL_stories.StoryItem storyItem10 = storyItem;
                r3Var2 = r3Var4;
                storyItem3 = storyItem10;
                org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.menu_cover_stories, gd.M0(2131744439, null), false, r3Var.d).setOnClickListener(new d0(r3Var4, r3Var4.r, storyItem10, f9Var4, r3Var4.s, 3));
            }
            if ((z3Var.m1 || (z3Var.n1 && mp.u1(z3Var.m2).R1().h(storyItem3.dialogId))) && !x3Var.f) {
                boolean z11 = storyItem3.pinned;
                boolean z12 = !z11;
                if (z3Var.m1) {
                    if (z11) {
                        str = null;
                        i11 = 2131754135;
                    } else {
                        i11 = 2131745714;
                        str = null;
                    }
                    M0 = gd.M0(i11, str);
                } else {
                    M0 = gd.M0(!z11 ? 2131745715 : 2131746117, null);
                }
                String str6 = M0;
                f9Var = f9Var4;
                storyItem4 = storyItem3;
                actionBarPopupWindow$ActionBarPopupWindowLayout4 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, !z11 ? R.drawable.msg_save_story : R.drawable.menu_unsave_story, str6, false, r3Var2.d).setOnClickListener(new k3(r3Var2, storyItem4, z12, i6Var, 0));
            } else {
                actionBarPopupWindow$ActionBarPopupWindowLayout4 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                storyItem4 = storyItem3;
                f9Var = f9Var4;
            }
            r3Var2.u(actionBarPopupWindow$ActionBarPopupWindowLayout4, storyItem4);
            if (z3Var.M2 || x3Var.f) {
                actionBarPopupWindow$ActionBarPopupWindowLayout5 = actionBarPopupWindow$ActionBarPopupWindowLayout4;
            } else {
                if (x3Var.e) {
                    i14 = 2131745713;
                    str3 = null;
                } else {
                    str3 = null;
                    i14 = 2131745744;
                }
                actionBarPopupWindow$ActionBarPopupWindowLayout5 = actionBarPopupWindow$ActionBarPopupWindowLayout4;
                org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout5, R.drawable.msg_gallery, gd.M0(i14, str3), false, r3Var2.d).setOnClickListener(new h3(r3Var2, 7));
            }
            if (!mp.u1(z3Var.m2).K3() && !x3Var.f && !z3Var.n1) {
                z3.Z(z3Var, actionBarPopupWindow$ActionBarPopupWindowLayout5);
            }
            if (z3Var.n1 && z3Var.E2) {
                org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout5, R.drawable.msg_link, gd.M0(2131751751, null), false, r3Var2.d).setOnClickListener(new h3(r3Var2, i10));
            }
            if (z3Var.E2) {
                org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_shareout, gd.M0(2131752971, null), false, r3Var2.d).setOnClickListener(new h3(r3Var2, 9));
            }
            TL_stories.StoryItem storyItem11 = x3Var.a;
            if (storyItem11 != null) {
                TLRPC.MessageMedia messageMedia2 = storyItem11.media;
                if ((messageMedia2 instanceof TLRPC.TL_messageMediaVideoStream) && (c1Var2 = c1.X) != null && c1Var2.f(((TLRPC.TL_messageMediaVideoStream) messageMedia2).call)) {
                    c1 c1Var3 = c1.X;
                    boolean z13 = c1Var3 != null && c1Var3.o();
                    int i25 = z13 ? R.drawable.msg_voice_unmuted : R.drawable.msg_voice_muted;
                    if (z13) {
                        i13 = 2131743612;
                        str2 = null;
                    } else {
                        str2 = null;
                        i13 = 2131748122;
                    }
                    org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, i25, gd.M0(i13, str2), false, r3Var2.d).setOnClickListener(new v1(1, r3Var2, z13));
                    org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.menu_camera_retake, gd.M0(2131754752, str2), false, r3Var2.d).setOnClickListener(new h3(r3Var2, i24));
                }
            }
            if (x3Var.f) {
                final int i26 = 1;
                org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.menu_video_pip, gd.M0(2131747029, null), false, r3Var2.d).setOnClickListener(new View.OnClickListener(r3Var2) { // from class: fi.i3
                    public final /* synthetic */ r3 b;

                    {
                        this.b = r3Var2;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i26) {
                            case 0:
                                r3 r3Var5 = this.b.x.d1;
                                if (r3Var5 != null) {
                                    r3Var5.a();
                                }
                                f9Var.T();
                                break;
                            default:
                                r3 r3Var6 = this.b.x.d1;
                                if (r3Var6 != null) {
                                    r3Var6.a();
                                }
                                f9Var.T();
                                break;
                        }
                    }
                });
            }
            if (x3Var.f && (z3Var.l1 == j10.i(z3Var.m2).e() || org.telegram.messenger.v3.w(14, mp.u1(z3Var.m2).O0(Long.valueOf(-z3Var.l1))) || ((c1Var = f9Var.B0) != null && x3Var.k(c1Var.g()) && (groupCall = f9Var.B0.w) != null && groupCall.creator))) {
                i12 = 1;
                org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_settings_old, gd.M0(2131748598, null), false, r3Var2.d).setOnClickListener(new j3(r3Var2, i6Var, f9Var, i12));
            } else {
                i12 = 1;
            }
            if (x3Var.f) {
                org.telegram.ui.ActionBar.z0 c12 = org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_remove, gd.M0(2131748628, null), false, r3Var2.d);
                int i27 = org.telegram.ui.ActionBar.n6.q7;
                c12.h(0.12f, i27);
                c12.d(i6Var.k(i27), i6Var.k(i27));
                c12.setOnClickListener(new j3(r3Var2, i6Var, f9Var, 2));
            }
            if (!x3Var.f) {
                if (!z3Var.m1) {
                    p6 R1 = mp.u1(z3Var.m2).R1();
                    TL_stories.StoryItem storyItem12 = x3Var.a;
                    int i28 = R1.a;
                    if (storyItem12 != null) {
                        if (storyItem12.dialogId != j10.i(i28).e()) {
                            if (storyItem12.dialogId > 0) {
                                TLRPC.User c22 = mp.u1(i28).c2(Long.valueOf(storyItem12.dialogId));
                                if (c22 != null) {
                                    if (c22.bot) {
                                    }
                                }
                            }
                            if (storyItem12.dialogId < 0) {
                                TLRPC.Chat O02 = mp.u1(i28).O0(Long.valueOf(-storyItem12.dialogId));
                                if (O02 != null) {
                                    if (!O02.creator) {
                                        boolean z14 = storyItem12.out;
                                        if (z14) {
                                            TLRPC.TL_chatAdminRights tL_chatAdminRights = O02.admin_rights;
                                            if (tL_chatAdminRights != null) {
                                                if (!tL_chatAdminRights.post_stories) {
                                                }
                                            }
                                        }
                                        if (!z14) {
                                            TLRPC.TL_chatAdminRights tL_chatAdminRights2 = O02.admin_rights;
                                            if (tL_chatAdminRights2 != null) {
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                arrayList = null;
                actionBarPopupWindow$ActionBarPopupWindowLayout6 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                org.telegram.ui.ActionBar.z0 c13 = org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout6, R.drawable.msg_delete, gd.M0(2131751587, null), false, r3Var2.d);
                int i29 = org.telegram.ui.ActionBar.n6.q7;
                c13.h(0.12f, i29);
                c13.d(i6Var.k(i29), i6Var.k(i29));
                c13.setOnClickListener(new h3(r3Var2, 13));
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout6 = actionBarPopupWindow$ActionBarPopupWindowLayout;
            arrayList = null;
        } else {
            t(actionBarPopupWindow$ActionBarPopupWindowLayout, true);
            final String v = xs.v(z3Var.l1, 0L, false);
            boolean h02 = NotificationsCustomSettingsActivity.h0(z3Var.m2, z3Var.l1);
            if (z3Var.l1 > 0) {
                O0 = null;
                TLRPC.User c23 = mp.u1(z3Var.m2).c2(Long.valueOf(z3Var.l1));
                tLObject = c23;
                user = c23;
            } else {
                user = null;
                O0 = mp.u1(z3Var.m2).O0(Long.valueOf(-z3Var.l1));
                tLObject = O0;
            }
            String trim = user == null ? O0 == null ? "" : O0.title : o10.k(user, true).trim();
            int indexOf = trim.indexOf(" ");
            if (indexOf > 0) {
                trim = trim.substring(0, indexOf);
            }
            final String str7 = trim;
            if (o10.B(z3Var.l1) || z3Var.G0()) {
                r3Var3 = this;
                str4 = null;
                f9Var2 = f9Var4;
                i6Var2 = i6Var3;
                i18 = 0;
            } else {
                if (h02) {
                    f9Var2 = f9Var4;
                    i6Var2 = i6Var3;
                    i18 = 0;
                    org.telegram.ui.ActionBar.z0 c14 = org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_mute, gd.M0(2131747670, null), false, this.d);
                    final int i30 = 0;
                    final org.telegram.ui.ActionBar.i6 i6Var4 = this.d;
                    final TLObject tLObject2 = tLObject;
                    r3Var3 = this;
                    c14.setOnClickListener(new View.OnClickListener(this) { // from class: fi.p3
                        public final /* synthetic */ r3 b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            int i31 = i30;
                            String str8 = str7;
                            TLObject tLObject3 = tLObject2;
                            org.telegram.ui.ActionBar.i6 i6Var5 = i6Var4;
                            String str9 = v;
                            r3 r3Var5 = this.b;
                            switch (i31) {
                                case 0:
                                    z3 z3Var2 = r3Var5.x;
                                    mp.u1(z3Var2.m2).g7.edit().putBoolean("stories_" + str9, false).apply();
                                    xs.t(z3Var2.m2).c0(z3Var2.l1, 0L, true);
                                    gc V = new lc(z3Var2.M0, i6Var5).V(Arrays.asList(tLObject3), org.telegram.messenger.g0.W2(gd.a0("NotificationsStoryMutedHint", null, 2131747669, str8)), null, null);
                                    V.a = 2;
                                    V.j();
                                    r3 r3Var6 = z3Var2.d1;
                                    if (r3Var6 != null) {
                                        r3Var6.a();
                                        break;
                                    }
                                    break;
                                default:
                                    z3 z3Var3 = r3Var5.x;
                                    mp.u1(z3Var3.m2).g7.edit().putBoolean("stories_" + str9, true).apply();
                                    xs.t(z3Var3.m2).c0(z3Var3.l1, 0L, true);
                                    gc V2 = new lc(z3Var3.M0, i6Var5).V(Arrays.asList(tLObject3), org.telegram.messenger.g0.W2(gd.a0("NotificationsStoryUnmutedHint", null, 2131747666, str8)), null, null);
                                    V2.a = 2;
                                    V2.j();
                                    r3 r3Var7 = z3Var3.d1;
                                    if (r3Var7 != null) {
                                        r3Var7.a();
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                    c14.setMultiline(false);
                } else {
                    r3Var3 = this;
                    f9Var2 = f9Var4;
                    i6Var2 = i6Var3;
                    final TLObject tLObject3 = tLObject;
                    i18 = 0;
                    org.telegram.ui.ActionBar.z0 c15 = org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_unmute, gd.M0(2131747667, null), false, r3Var3.d);
                    final int i31 = 1;
                    final org.telegram.ui.ActionBar.i6 i6Var5 = r3Var3.d;
                    c15.setOnClickListener(new View.OnClickListener(r3Var3) { // from class: fi.p3
                        public final /* synthetic */ r3 b;

                        {
                            this.b = r3Var3;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            int i312 = i31;
                            String str8 = str7;
                            TLObject tLObject32 = tLObject3;
                            org.telegram.ui.ActionBar.i6 i6Var52 = i6Var5;
                            String str9 = v;
                            r3 r3Var5 = this.b;
                            switch (i312) {
                                case 0:
                                    z3 z3Var2 = r3Var5.x;
                                    mp.u1(z3Var2.m2).g7.edit().putBoolean("stories_" + str9, false).apply();
                                    xs.t(z3Var2.m2).c0(z3Var2.l1, 0L, true);
                                    gc V = new lc(z3Var2.M0, i6Var52).V(Arrays.asList(tLObject32), org.telegram.messenger.g0.W2(gd.a0("NotificationsStoryMutedHint", null, 2131747669, str8)), null, null);
                                    V.a = 2;
                                    V.j();
                                    r3 r3Var6 = z3Var2.d1;
                                    if (r3Var6 != null) {
                                        r3Var6.a();
                                        break;
                                    }
                                    break;
                                default:
                                    z3 z3Var3 = r3Var5.x;
                                    mp.u1(z3Var3.m2).g7.edit().putBoolean("stories_" + str9, true).apply();
                                    xs.t(z3Var3.m2).c0(z3Var3.l1, 0L, true);
                                    gc V2 = new lc(z3Var3.M0, i6Var52).V(Arrays.asList(tLObject32), org.telegram.messenger.g0.W2(gd.a0("NotificationsStoryUnmutedHint", null, 2131747666, str8)), null, null);
                                    V2.a = 2;
                                    V2.j();
                                    r3 r3Var7 = z3Var3.d1;
                                    if (r3Var7 != null) {
                                        r3Var7.a();
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                    c15.setMultiline(false);
                }
                ri.d0(z3Var.m2).P0(true);
                int i32 = (user == null || user.contact || !ri.d0(z3Var.m2).I(z3Var.l1)) ? i18 : 1;
                if (z3Var.l1 > 0) {
                    i22 = (user == null || !user.contact) ? i18 : 1;
                    if (user != null) {
                    }
                    i23 = i18;
                } else {
                    i22 = (O0 == null || org.telegram.messenger.v3.r0(O0)) ? i18 : 1;
                    if (O0 != null) {
                    }
                    i23 = i18;
                }
                if (i32 != 0) {
                    str4 = null;
                    org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_delete, gd.M0(2131744513, null), false, r3Var3.d).setOnClickListener(new h3(r3Var3, 14));
                } else {
                    str4 = null;
                    if (i22 != 0) {
                        if (i23 == 0) {
                            org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_archive, gd.M0(2131754151, null), false, r3Var3.d).setOnClickListener(new h3(r3Var3, 15));
                        } else {
                            org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_unarchive, gd.M0(2131743677, null), false, r3Var3.d).setOnClickListener(new h3(r3Var3, i18));
                        }
                    }
                }
            }
            if (x3Var2.f) {
                f9Var3 = f9Var2;
                org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.menu_video_pip, gd.M0(2131747029, str4), false, r3Var3.d).setOnClickListener(new View.OnClickListener(r3Var3) { // from class: fi.i3
                    public final /* synthetic */ r3 b;

                    {
                        this.b = r3Var3;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i18) {
                            case 0:
                                r3 r3Var5 = this.b.x.d1;
                                if (r3Var5 != null) {
                                    r3Var5.a();
                                }
                                f9Var3.T();
                                break;
                            default:
                                r3 r3Var6 = this.b.x.d1;
                                if (r3Var6 != null) {
                                    r3Var6.a();
                                }
                                f9Var3.T();
                                break;
                        }
                    }
                });
            } else {
                f9Var3 = f9Var2;
            }
            if (mp.u1(z3Var.m2).K3() || !x3Var2.e) {
                i19 = R.drawable.msg_gallery_locked2;
            } else {
                boolean z15 = mp.u1(z3Var.m2).s6;
                if (j10.i(z3Var.m2).q()) {
                    int i33 = z15 ? R.drawable.menu_quality_sd : R.drawable.menu_quality_hd;
                    String M02 = gd.M0(z15 ? 2131744277 : 2131744274, str4);
                    org.telegram.ui.ActionBar.i6 i6Var6 = z3Var.l0;
                    i19 = R.drawable.msg_gallery_locked2;
                    org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, i33, M02, false, i6Var6).setOnClickListener(new v1(i18, z3Var, z15));
                } else {
                    i19 = R.drawable.msg_gallery_locked2;
                    Drawable drawable = z3Var.getContext().getDrawable(i19);
                    i20 = -1;
                    drawable.setColorFilter(new PorterDuffColorFilter(i0.a.f(0.5f, -1, -16777216), PorterDuff.Mode.MULTIPLY));
                    c2 c2Var = new c2(z3Var.getContext().getDrawable(R.drawable.menu_quality_hd2), drawable, 1);
                    int L = org.telegram.messenger.g0.L(24.0f);
                    int L2 = org.telegram.messenger.g0.L(24.0f);
                    c2Var.e = L;
                    c2Var.f = L2;
                    int L3 = org.telegram.messenger.g0.L(1.0f);
                    int i34 = -org.telegram.messenger.g0.L(2.0f);
                    c2Var.s = L3;
                    c2Var.w = i34;
                    org.telegram.ui.ActionBar.z0 c16 = org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.menu_quality_hd, gd.M0(2131744274, null), false, z3Var.l0);
                    c16.setOnClickListener(new t1(z3Var, 7));
                    c16.setIcon(c2Var);
                    if (!z3Var.M2 && z3Var.C2 && !x3Var2.f) {
                        if (!j10.i(z3Var.m2).q()) {
                            actionBarPopupWindow$ActionBarPopupWindowLayout7 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                            org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout7, R.drawable.msg_gallery, gd.M0(2131745734, null), false, r3Var3.d).setOnClickListener(new h3(r3Var3, 1));
                            i21 = 2;
                            if (!mp.u1(z3Var.m2).K3() && !z3Var.n1) {
                                z3.Z(z3Var, actionBarPopupWindow$ActionBarPopupWindowLayout7);
                            }
                            if (z3Var.E2) {
                                org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout7, R.drawable.msg_link2, gd.M0(2131751751, null), false, r3Var3.d).setOnClickListener(new h3(r3Var3, i21));
                            }
                            if (z3Var.E2) {
                                org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_shareout, gd.M0(2131752971, null), false, r3Var3.d).setOnClickListener(new h3(r3Var3, 3));
                            }
                            storyItem6 = x3Var2.a;
                            if (storyItem6 != null) {
                                if (storyItem6.translated && TextUtils.equals(storyItem6.translatedLng, y21.N0())) {
                                    org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_translate, gd.M0(2131749112, null), false, r3Var3.d).setOnClickListener(new h3(r3Var3, 4));
                                } else {
                                    z00 z00Var = mp.u1(z3Var.m2).v7;
                                    TL_stories.StoryItem storyItem13 = x3Var2.a;
                                    z00Var.getClass();
                                    if (storyItem13 != null && !TextUtils.isEmpty(storyItem13.caption) && !org.telegram.messenger.j6.d(storyItem13.caption) && ((storyItem13.detectedLng == null && storyItem13.translatedText != null && TextUtils.equals(storyItem13.translatedLng, y21.N0())) || ((str5 = storyItem13.detectedLng) != null && !z00Var.w(str5)))) {
                                        actionBarPopupWindow$ActionBarPopupWindowLayout8 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                                        org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout8, R.drawable.msg_translate, gd.M0(2131743719, null), false, r3Var3.d).setOnClickListener(new h3(r3Var3, 5));
                                        r3Var3.u(actionBarPopupWindow$ActionBarPopupWindowLayout8, x3Var2.a);
                                        if (!z3Var.M2 || o10.B(z3Var.l1) || z3Var.G0()) {
                                            actionBarPopupWindow$ActionBarPopupWindowLayout6 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                                            r3Var2 = r3Var3;
                                            x3Var = x3Var2;
                                            context = context2;
                                            i6Var = i6Var2;
                                            i12 = 1;
                                            arrayList = null;
                                        } else {
                                            org.telegram.ui.ActionBar.z0 c17 = org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout8, R.drawable.msg_report, gd.M0(2131746035, null), false, r3Var3.d);
                                            org.telegram.ui.ActionBar.i6 i6Var7 = i6Var2;
                                            c17.setOnClickListener(new j3(r3Var3, f9Var3, i6Var7));
                                            i6Var = i6Var7;
                                            r3Var2 = r3Var3;
                                            x3Var = x3Var2;
                                            context = context2;
                                            i12 = 1;
                                            arrayList = null;
                                            actionBarPopupWindow$ActionBarPopupWindowLayout6 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                                        }
                                    }
                                }
                            }
                            actionBarPopupWindow$ActionBarPopupWindowLayout8 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                            r3Var3.u(actionBarPopupWindow$ActionBarPopupWindowLayout8, x3Var2.a);
                            if (z3Var.M2) {
                            }
                            actionBarPopupWindow$ActionBarPopupWindowLayout6 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                            r3Var2 = r3Var3;
                            x3Var = x3Var2;
                            context = context2;
                            i6Var = i6Var2;
                            i12 = 1;
                            arrayList = null;
                        } else if (!mp.u1(z3Var.m2).K3()) {
                            Drawable drawable2 = context2.getDrawable(i19);
                            drawable2.setColorFilter(new PorterDuffColorFilter(i0.a.f(0.5f, i20, -16777216), PorterDuff.Mode.MULTIPLY));
                            i21 = 2;
                            c2 c2Var2 = new c2(context2.getDrawable(R.drawable.msg_gallery_locked1), drawable2, 2);
                            actionBarPopupWindow$ActionBarPopupWindowLayout7 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                            org.telegram.ui.ActionBar.z0 c18 = org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout7, R.drawable.msg_gallery, gd.M0(2131745734, null), false, r3Var3.d);
                            c18.setIcon(c2Var2);
                            c18.setOnClickListener(new ah.h(r3Var3, c18, f9Var3, 11));
                            if (!mp.u1(z3Var.m2).K3()) {
                                z3.Z(z3Var, actionBarPopupWindow$ActionBarPopupWindowLayout7);
                            }
                            if (z3Var.E2) {
                            }
                            if (z3Var.E2) {
                            }
                            storyItem6 = x3Var2.a;
                            if (storyItem6 != null) {
                            }
                            actionBarPopupWindow$ActionBarPopupWindowLayout8 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                            r3Var3.u(actionBarPopupWindow$ActionBarPopupWindowLayout8, x3Var2.a);
                            if (z3Var.M2) {
                            }
                            actionBarPopupWindow$ActionBarPopupWindowLayout6 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                            r3Var2 = r3Var3;
                            x3Var = x3Var2;
                            context = context2;
                            i6Var = i6Var2;
                            i12 = 1;
                            arrayList = null;
                        }
                    }
                    actionBarPopupWindow$ActionBarPopupWindowLayout7 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                    i21 = 2;
                    if (!mp.u1(z3Var.m2).K3()) {
                    }
                    if (z3Var.E2) {
                    }
                    if (z3Var.E2) {
                    }
                    storyItem6 = x3Var2.a;
                    if (storyItem6 != null) {
                    }
                    actionBarPopupWindow$ActionBarPopupWindowLayout8 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                    r3Var3.u(actionBarPopupWindow$ActionBarPopupWindowLayout8, x3Var2.a);
                    if (z3Var.M2) {
                    }
                    actionBarPopupWindow$ActionBarPopupWindowLayout6 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                    r3Var2 = r3Var3;
                    x3Var = x3Var2;
                    context = context2;
                    i6Var = i6Var2;
                    i12 = 1;
                    arrayList = null;
                }
            }
            i20 = -1;
            if (!z3Var.M2) {
                if (!j10.i(z3Var.m2).q()) {
                }
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout7 = actionBarPopupWindow$ActionBarPopupWindowLayout;
            i21 = 2;
            if (!mp.u1(z3Var.m2).K3()) {
            }
            if (z3Var.E2) {
            }
            if (z3Var.E2) {
            }
            storyItem6 = x3Var2.a;
            if (storyItem6 != null) {
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout8 = actionBarPopupWindow$ActionBarPopupWindowLayout;
            r3Var3.u(actionBarPopupWindow$ActionBarPopupWindowLayout8, x3Var2.a);
            if (z3Var.M2) {
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout6 = actionBarPopupWindow$ActionBarPopupWindowLayout;
            r3Var2 = r3Var3;
            x3Var = x3Var2;
            context = context2;
            i6Var = i6Var2;
            i12 = 1;
            arrayList = null;
        }
        boolean z16 = (x3Var == null || (storyItem5 = x3Var.a) == null || (messageMedia = storyItem5.media) == null || (!fj.V2(messageMedia.document) && ((photo = x3Var.a.media.photo) == null || !photo.has_stickers))) ? 0 : i12;
        if (x3Var != null) {
            HashSet hashSet2 = new HashSet();
            ArrayList arrayList4 = new ArrayList();
            TL_stories.StoryItem storyItem14 = x3Var.a;
            if (storyItem14 != null && storyItem14.media_areas != null) {
                for (int i35 = 0; i35 < x3Var.a.media_areas.size(); i35++) {
                    TL_stories.MediaArea mediaArea2 = x3Var.a.media_areas.get(i35);
                    if (mediaArea2 instanceof TL_stories.TL_mediaAreaSuggestedReaction) {
                        TLRPC.Reaction reaction = mediaArea2.reaction;
                        if (reaction instanceof TLRPC.TL_reactionCustomEmoji) {
                            TLRPC.Document e10 = org.telegram.ui.Components.o5.e(z3Var.m2, ((TLRPC.TL_reactionCustomEmoji) reaction).document_id);
                            if (e10 != null && (i17 = fj.i1(e10)) != null && !hashSet2.contains(Long.valueOf(i17.id))) {
                                hashSet2.add(Long.valueOf(i17.id));
                                arrayList4.add(i17);
                            }
                        }
                    }
                }
            }
            TL_stories.StoryItem storyItem15 = x3Var.a;
            if (storyItem15 == null || (arrayList3 = storyItem15.entities) == null || arrayList3.isEmpty()) {
                o6 o6Var = x3Var.b;
                if (o6Var != null && (d7Var = o6Var.c) != null) {
                    if (d7Var.T0 != null) {
                        for (int i36 = 0; i36 < x3Var.b.c.T0.size(); i36++) {
                            c20 c20Var = (c20) x3Var.b.c.T0.get(i36);
                            if (c20Var.a == 4 && (mediaArea = c20Var.M) != null) {
                                TLRPC.Reaction reaction2 = mediaArea.reaction;
                                if (reaction2 instanceof TLRPC.TL_reactionCustomEmoji) {
                                    TLRPC.Document e11 = org.telegram.ui.Components.o5.e(z3Var.m2, ((TLRPC.TL_reactionCustomEmoji) reaction2).document_id);
                                    if (e11 != null && (i16 = fj.i1(e11)) != null && !hashSet2.contains(Long.valueOf(i16.id))) {
                                        hashSet2.add(Long.valueOf(i16.id));
                                        arrayList4.add(i16);
                                    }
                                }
                            }
                        }
                    }
                    CharSequence charSequence = x3Var.b.c.C0;
                    if (charSequence instanceof Spanned) {
                        i15 = 0;
                        org.telegram.ui.Components.x5[] x5VarArr = (org.telegram.ui.Components.x5[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), org.telegram.ui.Components.x5.class);
                        if (x5VarArr != null) {
                            for (org.telegram.ui.Components.x5 x5Var : x5VarArr) {
                                TLRPC.Document document = x5Var.document;
                                if (document == null) {
                                    document = org.telegram.ui.Components.o5.e(z3Var.m2, x5Var.documentId);
                                }
                                if (document != null) {
                                    TLRPC.InputStickerSet i110 = fj.i1(document);
                                    if (!hashSet2.contains(Long.valueOf(i110.id))) {
                                        hashSet2.add(Long.valueOf(i110.id));
                                        arrayList4.add(i110);
                                    }
                                }
                            }
                        }
                        arrayList2 = arrayList4;
                    }
                }
            } else {
                for (int i37 = 0; i37 < x3Var.a.entities.size(); i37++) {
                    TLRPC.MessageEntity messageEntity = x3Var.a.entities.get(i37);
                    if (messageEntity instanceof TLRPC.TL_messageEntityCustomEmoji) {
                        TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = (TLRPC.TL_messageEntityCustomEmoji) messageEntity;
                        TLRPC.Document document2 = tL_messageEntityCustomEmoji.document;
                        if (document2 == null) {
                            document2 = org.telegram.ui.Components.o5.e(z3Var.m2, tL_messageEntityCustomEmoji.document_id);
                        }
                        if (document2 != null) {
                            TLRPC.InputStickerSet i111 = fj.i1(document2);
                            if (!hashSet2.contains(Long.valueOf(i111.id))) {
                                hashSet2.add(Long.valueOf(i111.id));
                                arrayList4.add(i111);
                            }
                        }
                    }
                }
            }
            i15 = 0;
            arrayList2 = arrayList4;
        } else {
            i15 = 0;
            arrayList2 = arrayList;
        }
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            i15 = i12;
        }
        if (z16 == 0 && i15 == 0) {
            return;
        }
        org.telegram.ui.ActionBar.e1 e1Var3 = new org.telegram.ui.ActionBar.e1(org.telegram.ui.ActionBar.n6.H8, context, i6Var);
        e1Var3.setTag(R.id.fit_width_tag, 1);
        actionBarPopupWindow$ActionBarPopupWindowLayout6.a(e1Var3, ma.o(-1, 8));
        TLRPC.MessageMedia messageMedia3 = x3Var.a.media;
        TLObject tLObject4 = messageMedia3.document;
        if (tLObject4 == null) {
            tLObject4 = messageMedia3.photo;
        }
        a8 a8Var = new a8(r3Var2.r, z3Var.m2, tLObject4, x3Var.a, z16, arrayList2, r3Var2.d);
        a8Var.setOnClickListener(new ai.v2(21, r3Var2, a8Var));
        a8Var.setTag(R.id.fit_width_tag, 1);
        actionBarPopupWindow$ActionBarPopupWindowLayout6.a(a8Var, ma.o(-1, -2));
    }

    @Override // k.a
    public final void m() {
        if (!this.c && !this.w[0]) {
            org.telegram.messenger.g0.g3(new l3(this, 0));
        }
        z3 z3Var = this.x;
        z3Var.d1 = null;
        z3Var.c1 = null;
    }

    public final void t(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, boolean z10) {
        x3 x3Var;
        boolean z11 = this.f;
        z3 z3Var = this.x;
        if (!z11 || ((x3Var = z3Var.y1) != null && x3Var.b != null)) {
            z3Var.m3 = null;
            z3Var.n3 = null;
            return;
        }
        Context context = z3Var.getContext();
        if0 swipeBack = actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack();
        boolean z12 = false;
        final wf.b bVar = new wf.b(this, actionBarPopupWindow$ActionBarPopupWindowLayout, z12, 20);
        h6.m mVar = new h6.m(25, z12);
        org.telegram.ui.ActionBar.z0[] z0VarArr = new org.telegram.ui.ActionBar.z0[5];
        mVar.d = z0VarArr;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = new ActionBarPopupWindow$ActionBarPopupWindowLayout(0, 0, context, null);
        mVar.b = actionBarPopupWindow$ActionBarPopupWindowLayout2;
        actionBarPopupWindow$ActionBarPopupWindowLayout2.setFitItems(true);
        org.telegram.ui.ActionBar.z0 c10 = org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, R.drawable.msg_arrow_back, gd.M0(2131753754, null), false, null);
        c10.setOnClickListener(new uq(swipeBack, 1));
        c10.d(-328966, -328966);
        c10.setSelectorColor(268435455);
        View p2Var = new bi.p2(context, 13);
        p2Var.setMinimumWidth(org.telegram.messenger.g0.L(196.0f));
        p2Var.setBackgroundColor(-15198184);
        actionBarPopupWindow$ActionBarPopupWindowLayout2.addView(p2Var);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) p2Var.getLayoutParams();
        if (gd.a0) {
            layoutParams.gravity = 5;
        }
        layoutParams.width = -1;
        layoutParams.height = org.telegram.messenger.g0.L(8.0f);
        p2Var.setLayoutParams(layoutParams);
        org.telegram.ui.ActionBar.v0 v0Var = new org.telegram.ui.ActionBar.v0(context, null);
        mVar.c = v0Var;
        v0Var.setMinimumWidth(org.telegram.messenger.g0.L(196.0f));
        v0Var.setDrawShadow(false);
        v0Var.setBackgroundColor(-14540254);
        v0Var.setTextColor(-1);
        v0Var.setOnValueChange(new org.telegram.ui.a5(bVar, 6));
        actionBarPopupWindow$ActionBarPopupWindowLayout2.a(v0Var, ma.o(-1, 44));
        View p2Var2 = new bi.p2(context, 14);
        p2Var2.setMinimumWidth(org.telegram.messenger.g0.L(196.0f));
        p2Var2.setBackgroundColor(-15198184);
        actionBarPopupWindow$ActionBarPopupWindowLayout2.addView(p2Var2);
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) p2Var2.getLayoutParams();
        if (gd.a0) {
            layoutParams2.gravity = 5;
        }
        layoutParams2.width = -1;
        layoutParams2.height = org.telegram.messenger.g0.L(8.0f);
        p2Var2.setLayoutParams(layoutParams2);
        org.telegram.ui.ActionBar.z0 c11 = org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, R.drawable.msg_speed_0_2, gd.M0(2131745028, null), false, null);
        c11.d(-328966, -328966);
        final int i7 = 0;
        c11.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.yq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i7) {
                    case 0:
                        bVar.N(true, true, 0.2f);
                        break;
                    case 1:
                        bVar.N(true, true, 0.5f);
                        break;
                    case 2:
                        bVar.N(true, true, 1.0f);
                        break;
                    case 3:
                        bVar.N(true, true, 1.5f);
                        break;
                    default:
                        bVar.N(true, true, 2.0f);
                        break;
                }
            }
        });
        c11.setSelectorColor(268435455);
        z0VarArr[0] = c11;
        org.telegram.ui.ActionBar.z0 c12 = org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, R.drawable.msg_speed_slow, gd.M0(2131745031, null), false, null);
        c12.d(-328966, -328966);
        final int i10 = 1;
        c12.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.yq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        bVar.N(true, true, 0.2f);
                        break;
                    case 1:
                        bVar.N(true, true, 0.5f);
                        break;
                    case 2:
                        bVar.N(true, true, 1.0f);
                        break;
                    case 3:
                        bVar.N(true, true, 1.5f);
                        break;
                    default:
                        bVar.N(true, true, 2.0f);
                        break;
                }
            }
        });
        c12.setSelectorColor(268435455);
        z0VarArr[1] = c12;
        org.telegram.ui.ActionBar.z0 c13 = org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, R.drawable.msg_speed_normal, gd.M0(2131745032, null), false, null);
        c13.d(-328966, -328966);
        final int i11 = 2;
        c13.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.yq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        bVar.N(true, true, 0.2f);
                        break;
                    case 1:
                        bVar.N(true, true, 0.5f);
                        break;
                    case 2:
                        bVar.N(true, true, 1.0f);
                        break;
                    case 3:
                        bVar.N(true, true, 1.5f);
                        break;
                    default:
                        bVar.N(true, true, 2.0f);
                        break;
                }
            }
        });
        c13.setSelectorColor(268435455);
        z0VarArr[2] = c13;
        org.telegram.ui.ActionBar.z0 c14 = org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, R.drawable.msg_speed_fast, gd.M0(2131745035, null), false, null);
        c14.d(-328966, -328966);
        final int i12 = 3;
        c14.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.yq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        bVar.N(true, true, 0.2f);
                        break;
                    case 1:
                        bVar.N(true, true, 0.5f);
                        break;
                    case 2:
                        bVar.N(true, true, 1.0f);
                        break;
                    case 3:
                        bVar.N(true, true, 1.5f);
                        break;
                    default:
                        bVar.N(true, true, 2.0f);
                        break;
                }
            }
        });
        c14.setSelectorColor(268435455);
        z0VarArr[3] = c14;
        org.telegram.ui.ActionBar.z0 c15 = org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, R.drawable.msg_speed_superfast, gd.M0(2131745029, null), false, null);
        c15.d(-328966, -328966);
        final int i13 = 4;
        c15.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.yq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i13) {
                    case 0:
                        bVar.N(true, true, 0.2f);
                        break;
                    case 1:
                        bVar.N(true, true, 0.5f);
                        break;
                    case 2:
                        bVar.N(true, true, 1.0f);
                        break;
                    case 3:
                        bVar.N(true, true, 1.5f);
                        break;
                    default:
                        bVar.N(true, true, 2.0f);
                        break;
                }
            }
        });
        c15.setSelectorColor(268435455);
        z0VarArr[4] = c15;
        z3Var.m3 = mVar;
        mVar.K(true, f9.B1);
        org.telegram.ui.ActionBar.z0 z0Var = new org.telegram.ui.ActionBar.z0(0, z3Var.getContext(), this.d, false, false);
        z3Var.n3 = z0Var;
        z0Var.j(gd.M0(2131745036, null), R.drawable.msg_speed, null);
        z3.Y(z3Var, true);
        z3Var.n3.setMinimumWidth(org.telegram.messenger.g0.L(196.0f));
        z3Var.n3.setRightIcon(R.drawable.msg_arrowright);
        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(z3Var.n3);
        LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) z3Var.n3.getLayoutParams();
        if (gd.a0) {
            layoutParams3.gravity = 5;
        }
        layoutParams3.width = -1;
        layoutParams3.height = org.telegram.messenger.g0.L(48.0f);
        z3Var.n3.setLayoutParams(layoutParams3);
        int b10 = actionBarPopupWindow$ActionBarPopupWindowLayout.b((ActionBarPopupWindow$ActionBarPopupWindowLayout) z3Var.m3.b);
        org.telegram.ui.ActionBar.z0 z0Var2 = z3Var.n3;
        z0Var2.Q = new m3(actionBarPopupWindow$ActionBarPopupWindowLayout, b10, 0);
        z0Var2.setOnClickListener(new h3(this, 11));
        actionBarPopupWindow$ActionBarPopupWindowLayout.c = true;
        if (z10) {
            org.telegram.ui.ActionBar.e1 e1Var = new org.telegram.ui.ActionBar.e1(org.telegram.ui.ActionBar.n6.H8, z3Var.getContext(), this.d);
            e1Var.setTag(R.id.fit_width_tag, 1);
            actionBarPopupWindow$ActionBarPopupWindowLayout.a(e1Var, ma.o(-1, 8));
        }
    }

    public final void u(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, TL_stories.StoryItem storyItem) {
        TLRPC.Chat O0;
        z3 z3Var = this.x;
        if (!z3Var.n1 || storyItem == null || (storyItem.media instanceof TLRPC.TL_messageMediaVideoStream) || (O0 = mp.u1(z3Var.m2).O0(Long.valueOf(-z3Var.l1))) == null) {
            return;
        }
        TLRPC.ChatFull P0 = mp.u1(z3Var.m2).P0(O0.id);
        if (P0 == null) {
            P0 = tr.a0(z3Var.m2).F0(O0.id, true, new CountDownLatch(1), false, false, 0);
        }
        if (P0 == null || !P0.can_view_stats) {
            return;
        }
        org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_stats, gd.M0(2131743305, null), false, this.d).setOnClickListener(new bi.m6(this, storyItem, this.e, O0, 1));
    }
}
