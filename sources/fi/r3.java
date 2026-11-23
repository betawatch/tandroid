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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.a10;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cz;
import org.telegram.messenger.d20;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.k10;
import org.telegram.messenger.np;
import org.telegram.messenger.p10;
import org.telegram.messenger.si;
import org.telegram.messenger.ur;
import org.telegram.messenger.ys;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.a70;
import org.telegram.ui.Components.b31;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.kf0;
import org.telegram.ui.Components.lc;
import org.telegram.ui.NotificationsCustomSettingsActivity;
import org.telegram.ui.uq;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes4.dex */
public final class r3 extends k.a {
    public boolean c;
    public final /* synthetic */ org.telegram.ui.ActionBar.h6 d;
    public final /* synthetic */ f9 e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ boolean n;
    public final /* synthetic */ Context r;
    public final /* synthetic */ w3 s;
    public final /* synthetic */ boolean[] w;
    public final /* synthetic */ z3 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r3(z3 z3Var, Context context, org.telegram.ui.ActionBar.h6 h6Var, org.telegram.ui.ActionBar.h6 h6Var2, f9 f9Var, boolean z10, boolean z11, boolean z12, Context context2, w3 w3Var, boolean[] zArr) {
        super(context, h6Var, true);
        this.x = z3Var;
        this.d = h6Var2;
        this.e = f9Var;
        this.f = z10;
        this.h = z11;
        this.n = z12;
        this.r = context2;
        this.s = w3Var;
        this.w = zArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:264:0x0164, code lost:
    
        if (r15.stories_hidden != false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x014f, code lost:
    
        if (r14.stories_hidden != false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0151, code lost:
    
        r1 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:416:0x0985, code lost:
    
        if (r2.bot_can_edit == false) goto L342;
     */
    /* JADX WARN: Code restructure failed: missing block: B:430:0x09b3, code lost:
    
        if (r2.delete_stories == false) goto L359;
     */
    /* JADX WARN: Code restructure failed: missing block: B:435:0x09be, code lost:
    
        if (r0.delete_stories == false) goto L365;
     */
    /* JADX WARN: Removed duplicated region for block: B:243:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x03ae  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0447  */
    @Override // k.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2;
        TL_stories.StoryItem storyItem;
        org.telegram.ui.ActionBar.h6 h6Var;
        TL_stories.StoryItem storyItem2;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout3;
        char c10;
        int i7;
        int i10;
        f9 f9Var;
        r3 r3Var;
        f9 f9Var2;
        String N0;
        f9 f9Var3;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout4;
        final r3 r3Var2;
        org.telegram.ui.ActionBar.h6 h6Var2;
        String str;
        int i11;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout5;
        final f9 f9Var4;
        float f10;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout6;
        ArrayList arrayList;
        c1 c1Var;
        TLRPC.GroupCall groupCall;
        c1 c1Var2;
        String str2;
        int i12;
        String str3;
        int i13;
        Integer num;
        boolean z10;
        ArrayList arrayList2;
        hi.c7 c7Var;
        Integer num2;
        TL_stories.MediaArea mediaArea;
        TLRPC.InputStickerSet i14;
        ArrayList<TLRPC.MessageEntity> arrayList3;
        TLRPC.InputStickerSet i15;
        TL_stories.StoryItem storyItem3;
        TLRPC.MessageMedia messageMedia;
        TLRPC.Photo photo;
        TLRPC.User user;
        TLRPC.Chat O0;
        TLObject tLObject;
        String str4;
        f9 f9Var5;
        org.telegram.ui.ActionBar.h6 h6Var3;
        final int i16;
        final f9 f9Var6;
        int i17;
        int i18;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout7;
        int i19;
        TL_stories.StoryItem storyItem4;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout8;
        String str5;
        int i20;
        int i21;
        Integer num3 = 1;
        z3 z3Var = this.x;
        x3 x3Var = z3Var.y1;
        boolean z11 = this.h;
        Context context = this.r;
        f9 f9Var7 = this.e;
        org.telegram.ui.ActionBar.h6 h6Var4 = this.d;
        if (z11 || x3Var.b != null) {
            TL_stories.StoryItem storyItem5 = x3Var.a;
            if (x3Var.b != null) {
                storyItem = storyItem5;
                h6Var = h6Var4;
                actionBarPopupWindow$ActionBarPopupWindowLayout2 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_cancel, hd.N0(2131752577, null), false, this.d).setOnClickListener(new h3(this, 6));
            } else {
                actionBarPopupWindow$ActionBarPopupWindowLayout2 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                storyItem = storyItem5;
                h6Var = h6Var4;
            }
            if (storyItem == null) {
                return;
            }
            if (!(z3Var.m1 || z3Var.C1.h(z3Var.l1)) || x3Var.f || (storyItem2 = x3Var.a) == null) {
                actionBarPopupWindow$ActionBarPopupWindowLayout3 = actionBarPopupWindow$ActionBarPopupWindowLayout2;
                c10 = '\b';
            } else {
                HashSet hashSet = storyItem2.albums != null ? new HashSet(storyItem2.albums) : new HashSet();
                a70 a70Var = new a70(actionBarPopupWindow$ActionBarPopupWindowLayout2, h6Var);
                a70Var.c(R.drawable.ic_ab_back, hd.N0(2131753753, null), new bi.f7(actionBarPopupWindow$ActionBarPopupWindowLayout2, 1), false);
                a70Var.k();
                d6 B = z3Var.getStoriesController().B(z3Var.l1, true);
                d6 B2 = z3Var.C1.B(z3Var.l1, false);
                a70.f(a70Var, B, hashSet, B2 != null && B2.a(), new di.a8(this, h6Var, storyItem2, 3), new bi.m2(this, hashSet, storyItem2, h6Var, 3));
                actionBarPopupWindow$ActionBarPopupWindowLayout3 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                int b10 = actionBarPopupWindow$ActionBarPopupWindowLayout3.b(a70Var.B);
                org.telegram.ui.ActionBar.y0 y0Var = new org.telegram.ui.ActionBar.y0(0, z3Var.getContext(), this.d, false, false);
                z3Var.o3 = y0Var;
                y0Var.j(hd.N0(2131744562, null), R.drawable.menu_album_add, null);
                org.telegram.ui.ActionBar.y0 y0Var2 = z3Var.o3;
                y0Var2.Q = new m3(actionBarPopupWindow$ActionBarPopupWindowLayout3, b10, 1);
                y0Var2.setOnClickListener(new h3(this, 12));
                actionBarPopupWindow$ActionBarPopupWindowLayout3.addView(z3Var.o3);
                actionBarPopupWindow$ActionBarPopupWindowLayout3.c = true;
                org.telegram.ui.ActionBar.d1 d1Var = new org.telegram.ui.ActionBar.d1(org.telegram.ui.ActionBar.m6.H8, z3Var.getContext(), h6Var);
                d1Var.setTag(R.id.fit_width_tag, num3);
                c10 = '\b';
                actionBarPopupWindow$ActionBarPopupWindowLayout3.a(d1Var, ma.o(-1, 8));
            }
            int i22 = 10;
            if (z3Var.m1) {
                hi.n8 n8Var = storyItem.privacy.isEmpty() ? new hi.n8(3, z3Var.m2, new ArrayList()) : new hi.n8(z3Var.m2, storyItem.privacy);
                org.telegram.ui.ActionBar.y0 c11 = org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout3, R.drawable.msg_view_file, hd.N0(2131742612, null), false, this.d);
                c11.setSubtext(n8Var.toString());
                c11.setOnClickListener(new ah.h(this, n8Var, storyItem, i22));
                c11.setItemHeight(56);
            }
            t(actionBarPopupWindow$ActionBarPopupWindowLayout3, false);
            if (z3Var.m1 || this.f) {
                org.telegram.ui.ActionBar.d1 d1Var2 = new org.telegram.ui.ActionBar.d1(org.telegram.ui.ActionBar.m6.H8, z3Var.getContext(), h6Var);
                d1Var2.setTag(R.id.fit_width_tag, num3);
                i7 = 8;
                actionBarPopupWindow$ActionBarPopupWindowLayout3.a(d1Var2, ma.o(-1, 8));
            } else {
                i7 = 8;
            }
            if (z3Var.M2 || x3Var.f || !((z3Var.G0() || np.u1(z3Var.m2).i5()) && this.n)) {
                i10 = i7;
                f9Var = f9Var7;
                r3Var = this;
            } else {
                i10 = i7;
                org.telegram.ui.ActionBar.y0 c12 = org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout3, R.drawable.msg_edit, hd.N0(z3Var.G0() ? 2131751276 : 2131751208, null), false, this.d);
                z3Var.c1 = c12;
                r3Var = this;
                f9Var = f9Var7;
                c12.setOnClickListener(new d0(this, this.d, this.r, f9Var7, this.s, 2));
                if (z3Var.C1.M(z3Var.l1) && x3Var.e && !cz.b()) {
                    z3Var.c1.setAlpha(0.5f);
                }
            }
            TL_stories.StoryItem storyItem6 = x3Var.a;
            if (storyItem6 == null || !x3Var.e || x3Var.f || !(storyItem6.pinned || z3Var.H0())) {
                f9Var2 = f9Var;
            } else {
                f9Var2 = f9Var;
                org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.menu_cover_stories, hd.N0(2131744431, null), false, r3Var.d).setOnClickListener(new d0(r3Var, r3Var.r, storyItem, f9Var2, r3Var.s, 3));
            }
            if ((z3Var.m1 || (z3Var.n1 && np.u1(z3Var.m2).R1().h(storyItem.dialogId))) && !x3Var.f) {
                boolean z12 = storyItem.pinned;
                boolean z13 = !z12;
                if (z3Var.m1) {
                    if (z12) {
                        str = null;
                        i11 = 2131754134;
                    } else {
                        i11 = 2131745713;
                        str = null;
                    }
                    N0 = hd.N0(i11, str);
                } else {
                    N0 = hd.N0(!z12 ? 2131745714 : 2131746116, null);
                }
                f9Var3 = f9Var2;
                org.telegram.ui.ActionBar.y0 c13 = org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, !z12 ? R.drawable.msg_save_story : R.drawable.menu_unsave_story, N0, false, r3Var.d);
                org.telegram.ui.ActionBar.h6 h6Var5 = h6Var;
                r3 r3Var3 = r3Var;
                actionBarPopupWindow$ActionBarPopupWindowLayout4 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                k3 k3Var = new k3(r3Var3, storyItem, z13, h6Var5, 0);
                r3Var2 = r3Var3;
                h6Var2 = h6Var5;
                c13.setOnClickListener(k3Var);
            } else {
                f9Var3 = f9Var2;
                r3Var2 = r3Var;
                h6Var2 = h6Var;
                actionBarPopupWindow$ActionBarPopupWindowLayout4 = actionBarPopupWindow$ActionBarPopupWindowLayout;
            }
            r3Var2.u(actionBarPopupWindow$ActionBarPopupWindowLayout4, storyItem);
            if (z3Var.M2 || x3Var.f) {
                actionBarPopupWindow$ActionBarPopupWindowLayout5 = actionBarPopupWindow$ActionBarPopupWindowLayout4;
            } else {
                if (x3Var.e) {
                    i13 = 2131745712;
                    str3 = null;
                } else {
                    str3 = null;
                    i13 = 2131745743;
                }
                actionBarPopupWindow$ActionBarPopupWindowLayout5 = actionBarPopupWindow$ActionBarPopupWindowLayout4;
                org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout5, R.drawable.msg_gallery, hd.N0(i13, str3), false, r3Var2.d).setOnClickListener(new h3(r3Var2, 7));
            }
            if (!np.u1(z3Var.m2).K3() && !x3Var.f && !z3Var.n1) {
                z3.Z(z3Var, actionBarPopupWindow$ActionBarPopupWindowLayout5);
            }
            if (z3Var.n1 && z3Var.E2) {
                org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout5, R.drawable.msg_link, hd.N0(2131751750, null), false, r3Var2.d).setOnClickListener(new h3(r3Var2, i10));
            }
            if (z3Var.E2) {
                org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_shareout, hd.N0(2131752970, null), false, r3Var2.d).setOnClickListener(new h3(r3Var2, 9));
            }
            TL_stories.StoryItem storyItem7 = x3Var.a;
            if (storyItem7 != null) {
                TLRPC.MessageMedia messageMedia2 = storyItem7.media;
                if ((messageMedia2 instanceof TLRPC.TL_messageMediaVideoStream) && (c1Var2 = c1.X) != null && c1Var2.f(((TLRPC.TL_messageMediaVideoStream) messageMedia2).call)) {
                    c1 c1Var3 = c1.X;
                    boolean z14 = c1Var3 != null && c1Var3.o();
                    int i23 = z14 ? R.drawable.msg_voice_unmuted : R.drawable.msg_voice_muted;
                    if (z14) {
                        i12 = 2131743604;
                        str2 = null;
                    } else {
                        str2 = null;
                        i12 = 2131748121;
                    }
                    org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, i23, hd.N0(i12, str2), false, r3Var2.d).setOnClickListener(new v1(1, r3Var2, z14));
                    org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.menu_camera_retake, hd.N0(2131754751, str2), false, r3Var2.d).setOnClickListener(new h3(r3Var2, 10));
                }
            }
            if (x3Var.f) {
                f9Var4 = f9Var3;
                final int i24 = 1;
                org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.menu_video_pip, hd.N0(2131747028, null), false, r3Var2.d).setOnClickListener(new View.OnClickListener(r3Var2) { // from class: fi.i3
                    public final /* synthetic */ r3 b;

                    {
                        this.b = r3Var2;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i24) {
                            case 0:
                                r3 r3Var4 = this.b.x.d1;
                                if (r3Var4 != null) {
                                    r3Var4.a();
                                }
                                f9Var4.T();
                                break;
                            default:
                                r3 r3Var5 = this.b.x.d1;
                                if (r3Var5 != null) {
                                    r3Var5.a();
                                }
                                f9Var4.T();
                                break;
                        }
                    }
                });
            } else {
                f9Var4 = f9Var3;
            }
            if (x3Var.f && (z3Var.l1 == k10.i(z3Var.m2).e() || org.telegram.messenger.v3.w(14, np.u1(z3Var.m2).O0(Long.valueOf(-z3Var.l1))) || ((c1Var = f9Var4.B0) != null && x3Var.k(c1Var.g()) && (groupCall = f9Var4.B0.w) != null && groupCall.creator))) {
                org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_settings_old, hd.N0(2131748597, null), false, r3Var2.d).setOnClickListener(new j3(r3Var2, h6Var2, f9Var4, 1));
            }
            if (x3Var.f) {
                f10 = 0.12f;
                org.telegram.ui.ActionBar.y0 c14 = org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_remove, hd.N0(2131748627, null), false, r3Var2.d);
                int i25 = org.telegram.ui.ActionBar.m6.q7;
                c14.h(0.12f, i25);
                c14.d(h6Var2.k(i25), h6Var2.k(i25));
                c14.setOnClickListener(new j3(r3Var2, h6Var2, f9Var4, 2));
            } else {
                f10 = 0.12f;
            }
            if (!x3Var.f) {
                if (!z3Var.m1) {
                    p6 R1 = np.u1(z3Var.m2).R1();
                    TL_stories.StoryItem storyItem8 = x3Var.a;
                    int i26 = R1.a;
                    if (storyItem8 != null) {
                        if (storyItem8.dialogId != k10.i(i26).e()) {
                            if (storyItem8.dialogId > 0) {
                                TLRPC.User c22 = np.u1(i26).c2(Long.valueOf(storyItem8.dialogId));
                                if (c22 != null) {
                                    if (c22.bot) {
                                    }
                                }
                            }
                            if (storyItem8.dialogId < 0) {
                                TLRPC.Chat O02 = np.u1(i26).O0(Long.valueOf(-storyItem8.dialogId));
                                if (O02 != null) {
                                    if (!O02.creator) {
                                        boolean z15 = storyItem8.out;
                                        if (z15) {
                                            TLRPC.TL_chatAdminRights tL_chatAdminRights = O02.admin_rights;
                                            if (tL_chatAdminRights != null) {
                                                if (!tL_chatAdminRights.post_stories) {
                                                }
                                            }
                                        }
                                        if (!z15) {
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
                org.telegram.ui.ActionBar.y0 c15 = org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout6, R.drawable.msg_delete, hd.N0(2131751586, null), false, r3Var2.d);
                int i27 = org.telegram.ui.ActionBar.m6.q7;
                c15.h(f10, i27);
                c15.d(h6Var2.k(i27), h6Var2.k(i27));
                c15.setOnClickListener(new h3(r3Var2, 13));
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout6 = actionBarPopupWindow$ActionBarPopupWindowLayout;
            arrayList = null;
        } else {
            t(actionBarPopupWindow$ActionBarPopupWindowLayout, true);
            final String v = ys.v(z3Var.l1, 0L, false);
            boolean h02 = NotificationsCustomSettingsActivity.h0(z3Var.m2, z3Var.l1);
            if (z3Var.l1 > 0) {
                O0 = null;
                TLRPC.User c23 = np.u1(z3Var.m2).c2(Long.valueOf(z3Var.l1));
                tLObject = c23;
                user = c23;
            } else {
                user = null;
                O0 = np.u1(z3Var.m2).O0(Long.valueOf(-z3Var.l1));
                tLObject = O0;
            }
            String trim = user == null ? O0 == null ? "" : O0.title : p10.k(user, true).trim();
            int indexOf = trim.indexOf(" ");
            if (indexOf > 0) {
                trim = trim.substring(0, indexOf);
            }
            final String str6 = trim;
            if (p10.B(z3Var.l1) || z3Var.G0()) {
                r3Var2 = this;
                str4 = null;
                f9Var5 = f9Var7;
                h6Var3 = h6Var4;
                i16 = 0;
            } else {
                if (h02) {
                    f9Var5 = f9Var7;
                    h6Var3 = h6Var4;
                    i16 = 0;
                    org.telegram.ui.ActionBar.y0 c16 = org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_mute, hd.N0(2131747669, null), false, this.d);
                    final int i28 = 0;
                    final org.telegram.ui.ActionBar.h6 h6Var6 = this.d;
                    final TLObject tLObject2 = tLObject;
                    r3Var2 = this;
                    c16.setOnClickListener(new View.OnClickListener(this) { // from class: fi.p3
                        public final /* synthetic */ r3 b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            int i29 = i28;
                            String str7 = str6;
                            TLObject tLObject3 = tLObject2;
                            org.telegram.ui.ActionBar.h6 h6Var7 = h6Var6;
                            String str8 = v;
                            r3 r3Var4 = this.b;
                            switch (i29) {
                                case 0:
                                    z3 z3Var2 = r3Var4.x;
                                    np.u1(z3Var2.m2).g7.edit().putBoolean("stories_" + str8, false).apply();
                                    ys.t(z3Var2.m2).c0(z3Var2.l1, 0L, true);
                                    gc V = new lc(z3Var2.M0, h6Var7).V(Arrays.asList(tLObject3), org.telegram.messenger.g0.W2(hd.a0("NotificationsStoryMutedHint", null, 2131747668, str7)), null, null);
                                    V.a = 2;
                                    V.j();
                                    r3 r3Var5 = z3Var2.d1;
                                    if (r3Var5 != null) {
                                        r3Var5.a();
                                        break;
                                    }
                                    break;
                                default:
                                    z3 z3Var3 = r3Var4.x;
                                    np.u1(z3Var3.m2).g7.edit().putBoolean("stories_" + str8, true).apply();
                                    ys.t(z3Var3.m2).c0(z3Var3.l1, 0L, true);
                                    gc V2 = new lc(z3Var3.M0, h6Var7).V(Arrays.asList(tLObject3), org.telegram.messenger.g0.W2(hd.a0("NotificationsStoryUnmutedHint", null, 2131747665, str7)), null, null);
                                    V2.a = 2;
                                    V2.j();
                                    r3 r3Var6 = z3Var3.d1;
                                    if (r3Var6 != null) {
                                        r3Var6.a();
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                    c16.setMultiline(false);
                } else {
                    r3Var2 = this;
                    f9Var5 = f9Var7;
                    h6Var3 = h6Var4;
                    final TLObject tLObject3 = tLObject;
                    i16 = 0;
                    org.telegram.ui.ActionBar.y0 c17 = org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_unmute, hd.N0(2131747666, null), false, r3Var2.d);
                    final int i29 = 1;
                    final org.telegram.ui.ActionBar.h6 h6Var7 = r3Var2.d;
                    c17.setOnClickListener(new View.OnClickListener(r3Var2) { // from class: fi.p3
                        public final /* synthetic */ r3 b;

                        {
                            this.b = r3Var2;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            int i292 = i29;
                            String str7 = str6;
                            TLObject tLObject32 = tLObject3;
                            org.telegram.ui.ActionBar.h6 h6Var72 = h6Var7;
                            String str8 = v;
                            r3 r3Var4 = this.b;
                            switch (i292) {
                                case 0:
                                    z3 z3Var2 = r3Var4.x;
                                    np.u1(z3Var2.m2).g7.edit().putBoolean("stories_" + str8, false).apply();
                                    ys.t(z3Var2.m2).c0(z3Var2.l1, 0L, true);
                                    gc V = new lc(z3Var2.M0, h6Var72).V(Arrays.asList(tLObject32), org.telegram.messenger.g0.W2(hd.a0("NotificationsStoryMutedHint", null, 2131747668, str7)), null, null);
                                    V.a = 2;
                                    V.j();
                                    r3 r3Var5 = z3Var2.d1;
                                    if (r3Var5 != null) {
                                        r3Var5.a();
                                        break;
                                    }
                                    break;
                                default:
                                    z3 z3Var3 = r3Var4.x;
                                    np.u1(z3Var3.m2).g7.edit().putBoolean("stories_" + str8, true).apply();
                                    ys.t(z3Var3.m2).c0(z3Var3.l1, 0L, true);
                                    gc V2 = new lc(z3Var3.M0, h6Var72).V(Arrays.asList(tLObject32), org.telegram.messenger.g0.W2(hd.a0("NotificationsStoryUnmutedHint", null, 2131747665, str7)), null, null);
                                    V2.a = 2;
                                    V2.j();
                                    r3 r3Var6 = z3Var3.d1;
                                    if (r3Var6 != null) {
                                        r3Var6.a();
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                    c17.setMultiline(false);
                }
                si.d0(z3Var.m2).P0(true);
                int i30 = (user == null || user.contact || !si.d0(z3Var.m2).I(z3Var.l1)) ? i16 : 1;
                if (z3Var.l1 > 0) {
                    i20 = (user == null || !user.contact) ? i16 : 1;
                    if (user != null) {
                    }
                    i21 = i16;
                } else {
                    i20 = (O0 == null || org.telegram.messenger.v3.r0(O0)) ? i16 : 1;
                    if (O0 != null) {
                    }
                    i21 = i16;
                }
                if (i30 != 0) {
                    str4 = null;
                    org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_delete, hd.N0(2131744505, null), false, r3Var2.d).setOnClickListener(new h3(r3Var2, 14));
                } else {
                    str4 = null;
                    if (i20 != 0) {
                        if (i21 == 0) {
                            org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_archive, hd.N0(2131754150, null), false, r3Var2.d).setOnClickListener(new h3(r3Var2, 15));
                        } else {
                            org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_unarchive, hd.N0(2131743669, null), false, r3Var2.d).setOnClickListener(new h3(r3Var2, i16));
                        }
                    }
                }
            }
            if (x3Var.f) {
                f9Var6 = f9Var5;
                org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.menu_video_pip, hd.N0(2131747028, str4), false, r3Var2.d).setOnClickListener(new View.OnClickListener(r3Var2) { // from class: fi.i3
                    public final /* synthetic */ r3 b;

                    {
                        this.b = r3Var2;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i16) {
                            case 0:
                                r3 r3Var4 = this.b.x.d1;
                                if (r3Var4 != null) {
                                    r3Var4.a();
                                }
                                f9Var6.T();
                                break;
                            default:
                                r3 r3Var5 = this.b.x.d1;
                                if (r3Var5 != null) {
                                    r3Var5.a();
                                }
                                f9Var6.T();
                                break;
                        }
                    }
                });
            } else {
                f9Var6 = f9Var5;
            }
            if (np.u1(z3Var.m2).K3() || !x3Var.e) {
                i17 = R.drawable.msg_gallery_locked2;
            } else {
                boolean z16 = np.u1(z3Var.m2).s6;
                if (k10.i(z3Var.m2).q()) {
                    int i31 = z16 ? R.drawable.menu_quality_sd : R.drawable.menu_quality_hd;
                    String N02 = hd.N0(z16 ? 2131744269 : 2131744266, str4);
                    org.telegram.ui.ActionBar.h6 h6Var8 = z3Var.l0;
                    i17 = R.drawable.msg_gallery_locked2;
                    org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, i31, N02, false, h6Var8).setOnClickListener(new v1(i16, z3Var, z16));
                } else {
                    i17 = R.drawable.msg_gallery_locked2;
                    Drawable drawable = z3Var.getContext().getDrawable(i17);
                    i18 = -1;
                    drawable.setColorFilter(new PorterDuffColorFilter(i0.a.f(0.5f, -1, -16777216), PorterDuff.Mode.MULTIPLY));
                    c2 c2Var = new c2(z3Var.getContext().getDrawable(R.drawable.menu_quality_hd2), drawable, 1);
                    int L = org.telegram.messenger.g0.L(24.0f);
                    int L2 = org.telegram.messenger.g0.L(24.0f);
                    c2Var.e = L;
                    c2Var.f = L2;
                    int L3 = org.telegram.messenger.g0.L(1.0f);
                    int i32 = -org.telegram.messenger.g0.L(2.0f);
                    c2Var.s = L3;
                    c2Var.w = i32;
                    org.telegram.ui.ActionBar.y0 c18 = org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.menu_quality_hd, hd.N0(2131744266, null), false, z3Var.l0);
                    c18.setOnClickListener(new t1(z3Var, 7));
                    c18.setIcon(c2Var);
                    if (!z3Var.M2 && z3Var.C2 && !x3Var.f) {
                        if (!k10.i(z3Var.m2).q()) {
                            actionBarPopupWindow$ActionBarPopupWindowLayout7 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                            org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout7, R.drawable.msg_gallery, hd.N0(2131745733, null), false, r3Var2.d).setOnClickListener(new h3(r3Var2, 1));
                            i19 = 2;
                            if (!np.u1(z3Var.m2).K3() && !z3Var.n1) {
                                z3.Z(z3Var, actionBarPopupWindow$ActionBarPopupWindowLayout7);
                            }
                            if (z3Var.E2) {
                                org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout7, R.drawable.msg_link2, hd.N0(2131751750, null), false, r3Var2.d).setOnClickListener(new h3(r3Var2, i19));
                            }
                            if (z3Var.E2) {
                                org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_shareout, hd.N0(2131752970, null), false, r3Var2.d).setOnClickListener(new h3(r3Var2, 3));
                            }
                            storyItem4 = x3Var.a;
                            if (storyItem4 != null) {
                                if (storyItem4.translated && TextUtils.equals(storyItem4.translatedLng, b31.N0())) {
                                    org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_translate, hd.N0(2131749111, null), false, r3Var2.d).setOnClickListener(new h3(r3Var2, 4));
                                } else {
                                    a10 a10Var = np.u1(z3Var.m2).v7;
                                    TL_stories.StoryItem storyItem9 = x3Var.a;
                                    a10Var.getClass();
                                    if (storyItem9 != null && !TextUtils.isEmpty(storyItem9.caption) && !org.telegram.messenger.j6.d(storyItem9.caption) && ((storyItem9.detectedLng == null && storyItem9.translatedText != null && TextUtils.equals(storyItem9.translatedLng, b31.N0())) || ((str5 = storyItem9.detectedLng) != null && !a10Var.w(str5)))) {
                                        actionBarPopupWindow$ActionBarPopupWindowLayout8 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                                        org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout8, R.drawable.msg_translate, hd.N0(2131743711, null), false, r3Var2.d).setOnClickListener(new h3(r3Var2, 5));
                                        r3Var2.u(actionBarPopupWindow$ActionBarPopupWindowLayout8, x3Var.a);
                                        if (!z3Var.M2 || p10.B(z3Var.l1) || z3Var.G0()) {
                                            actionBarPopupWindow$ActionBarPopupWindowLayout6 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                                            h6Var2 = h6Var3;
                                        } else {
                                            org.telegram.ui.ActionBar.h6 h6Var9 = h6Var3;
                                            org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout8, R.drawable.msg_report, hd.N0(2131746034, null), false, r3Var2.d).setOnClickListener(new j3(r3Var2, f9Var6, h6Var9));
                                            actionBarPopupWindow$ActionBarPopupWindowLayout6 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                                            h6Var2 = h6Var9;
                                        }
                                        arrayList = null;
                                    }
                                }
                            }
                            actionBarPopupWindow$ActionBarPopupWindowLayout8 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                            r3Var2.u(actionBarPopupWindow$ActionBarPopupWindowLayout8, x3Var.a);
                            if (z3Var.M2) {
                            }
                            actionBarPopupWindow$ActionBarPopupWindowLayout6 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                            h6Var2 = h6Var3;
                            arrayList = null;
                        } else if (!np.u1(z3Var.m2).K3()) {
                            Drawable drawable2 = context.getDrawable(i17);
                            drawable2.setColorFilter(new PorterDuffColorFilter(i0.a.f(0.5f, i18, -16777216), PorterDuff.Mode.MULTIPLY));
                            i19 = 2;
                            c2 c2Var2 = new c2(context.getDrawable(R.drawable.msg_gallery_locked1), drawable2, 2);
                            actionBarPopupWindow$ActionBarPopupWindowLayout7 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                            org.telegram.ui.ActionBar.y0 c19 = org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout7, R.drawable.msg_gallery, hd.N0(2131745733, null), false, r3Var2.d);
                            c19.setIcon(c2Var2);
                            c19.setOnClickListener(new ah.h(r3Var2, c19, f9Var6, 11));
                            if (!np.u1(z3Var.m2).K3()) {
                                z3.Z(z3Var, actionBarPopupWindow$ActionBarPopupWindowLayout7);
                            }
                            if (z3Var.E2) {
                            }
                            if (z3Var.E2) {
                            }
                            storyItem4 = x3Var.a;
                            if (storyItem4 != null) {
                            }
                            actionBarPopupWindow$ActionBarPopupWindowLayout8 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                            r3Var2.u(actionBarPopupWindow$ActionBarPopupWindowLayout8, x3Var.a);
                            if (z3Var.M2) {
                            }
                            actionBarPopupWindow$ActionBarPopupWindowLayout6 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                            h6Var2 = h6Var3;
                            arrayList = null;
                        }
                    }
                    actionBarPopupWindow$ActionBarPopupWindowLayout7 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                    i19 = 2;
                    if (!np.u1(z3Var.m2).K3()) {
                    }
                    if (z3Var.E2) {
                    }
                    if (z3Var.E2) {
                    }
                    storyItem4 = x3Var.a;
                    if (storyItem4 != null) {
                    }
                    actionBarPopupWindow$ActionBarPopupWindowLayout8 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                    r3Var2.u(actionBarPopupWindow$ActionBarPopupWindowLayout8, x3Var.a);
                    if (z3Var.M2) {
                    }
                    actionBarPopupWindow$ActionBarPopupWindowLayout6 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                    h6Var2 = h6Var3;
                    arrayList = null;
                }
            }
            i18 = -1;
            if (!z3Var.M2) {
                if (!k10.i(z3Var.m2).q()) {
                }
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout7 = actionBarPopupWindow$ActionBarPopupWindowLayout;
            i19 = 2;
            if (!np.u1(z3Var.m2).K3()) {
            }
            if (z3Var.E2) {
            }
            if (z3Var.E2) {
            }
            storyItem4 = x3Var.a;
            if (storyItem4 != null) {
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout8 = actionBarPopupWindow$ActionBarPopupWindowLayout;
            r3Var2.u(actionBarPopupWindow$ActionBarPopupWindowLayout8, x3Var.a);
            if (z3Var.M2) {
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout6 = actionBarPopupWindow$ActionBarPopupWindowLayout;
            h6Var2 = h6Var3;
            arrayList = null;
        }
        boolean z17 = (x3Var == null || (storyItem3 = x3Var.a) == null || (messageMedia = storyItem3.media) == null || (!gj.V2(messageMedia.document) && ((photo = x3Var.a.media.photo) == null || !photo.has_stickers))) ? false : true;
        if (x3Var != null) {
            HashSet hashSet2 = new HashSet();
            ArrayList arrayList4 = new ArrayList();
            TL_stories.StoryItem storyItem10 = x3Var.a;
            if (storyItem10 != null && storyItem10.media_areas != null) {
                for (int i33 = 0; i33 < x3Var.a.media_areas.size(); i33++) {
                    TL_stories.MediaArea mediaArea2 = x3Var.a.media_areas.get(i33);
                    if (mediaArea2 instanceof TL_stories.TL_mediaAreaSuggestedReaction) {
                        TLRPC.Reaction reaction = mediaArea2.reaction;
                        if (reaction instanceof TLRPC.TL_reactionCustomEmoji) {
                            TLRPC.Document e10 = org.telegram.ui.Components.p5.e(z3Var.m2, ((TLRPC.TL_reactionCustomEmoji) reaction).document_id);
                            if (e10 != null && (i15 = gj.i1(e10)) != null && !hashSet2.contains(Long.valueOf(i15.id))) {
                                hashSet2.add(Long.valueOf(i15.id));
                                arrayList4.add(i15);
                            }
                        }
                    }
                }
            }
            TL_stories.StoryItem storyItem11 = x3Var.a;
            if (storyItem11 == null || (arrayList3 = storyItem11.entities) == null || arrayList3.isEmpty()) {
                o6 o6Var = x3Var.b;
                if (o6Var != null && (c7Var = o6Var.c) != null) {
                    if (c7Var.T0 != null) {
                        for (int i34 = 0; i34 < x3Var.b.c.T0.size(); i34++) {
                            d20 d20Var = (d20) x3Var.b.c.T0.get(i34);
                            if (d20Var.a == 4 && (mediaArea = d20Var.M) != null) {
                                TLRPC.Reaction reaction2 = mediaArea.reaction;
                                if (reaction2 instanceof TLRPC.TL_reactionCustomEmoji) {
                                    TLRPC.Document e11 = org.telegram.ui.Components.p5.e(z3Var.m2, ((TLRPC.TL_reactionCustomEmoji) reaction2).document_id);
                                    if (e11 != null && (i14 = gj.i1(e11)) != null && !hashSet2.contains(Long.valueOf(i14.id))) {
                                        hashSet2.add(Long.valueOf(i14.id));
                                        arrayList4.add(i14);
                                    }
                                }
                            }
                        }
                    }
                    CharSequence charSequence = x3Var.b.c.C0;
                    if (charSequence instanceof Spanned) {
                        z10 = false;
                        org.telegram.ui.Components.y5[] y5VarArr = (org.telegram.ui.Components.y5[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), org.telegram.ui.Components.y5.class);
                        if (y5VarArr != null) {
                            int i35 = 0;
                            while (i35 < y5VarArr.length) {
                                org.telegram.ui.Components.y5 y5Var = y5VarArr[i35];
                                TLRPC.Document document = y5Var.document;
                                if (document == null) {
                                    num2 = num3;
                                    document = org.telegram.ui.Components.p5.e(z3Var.m2, y5Var.documentId);
                                } else {
                                    num2 = num3;
                                }
                                if (document != null) {
                                    TLRPC.InputStickerSet i110 = gj.i1(document);
                                    if (!hashSet2.contains(Long.valueOf(i110.id))) {
                                        hashSet2.add(Long.valueOf(i110.id));
                                        arrayList4.add(i110);
                                    }
                                }
                                i35++;
                                num3 = num2;
                            }
                        }
                        num = num3;
                        arrayList2 = arrayList4;
                    }
                }
            } else {
                for (int i36 = 0; i36 < x3Var.a.entities.size(); i36++) {
                    TLRPC.MessageEntity messageEntity = x3Var.a.entities.get(i36);
                    if (messageEntity instanceof TLRPC.TL_messageEntityCustomEmoji) {
                        TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = (TLRPC.TL_messageEntityCustomEmoji) messageEntity;
                        TLRPC.Document document2 = tL_messageEntityCustomEmoji.document;
                        if (document2 == null) {
                            document2 = org.telegram.ui.Components.p5.e(z3Var.m2, tL_messageEntityCustomEmoji.document_id);
                        }
                        if (document2 != null) {
                            TLRPC.InputStickerSet i111 = gj.i1(document2);
                            if (!hashSet2.contains(Long.valueOf(i111.id))) {
                                hashSet2.add(Long.valueOf(i111.id));
                                arrayList4.add(i111);
                            }
                        }
                    }
                }
            }
            num = num3;
            z10 = false;
            arrayList2 = arrayList4;
        } else {
            num = num3;
            z10 = false;
            arrayList2 = arrayList;
        }
        boolean z18 = (arrayList2 == null || arrayList2.isEmpty()) ? z10 : true;
        if (z17 || z18) {
            org.telegram.ui.ActionBar.d1 d1Var3 = new org.telegram.ui.ActionBar.d1(org.telegram.ui.ActionBar.m6.H8, context, h6Var2);
            d1Var3.setTag(R.id.fit_width_tag, num);
            actionBarPopupWindow$ActionBarPopupWindowLayout6.a(d1Var3, ma.o(-1, 8));
            TLRPC.MessageMedia messageMedia3 = x3Var.a.media;
            TLObject tLObject4 = messageMedia3.document;
            if (tLObject4 == null) {
                tLObject4 = messageMedia3.photo;
            }
            a8 a8Var = new a8(r3Var2.r, z3Var.m2, tLObject4, x3Var.a, z17, arrayList2, r3Var2.d);
            a8Var.setOnClickListener(new ai.y2(20, r3Var2, a8Var));
            a8Var.setTag(R.id.fit_width_tag, num);
            actionBarPopupWindow$ActionBarPopupWindowLayout6.a(a8Var, ma.o(-1, -2));
        }
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
        kf0 swipeBack = actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack();
        boolean z12 = false;
        final wf.b bVar = new wf.b(this, actionBarPopupWindow$ActionBarPopupWindowLayout, z12, 20);
        h6.m mVar = new h6.m(25, z12);
        org.telegram.ui.ActionBar.y0[] y0VarArr = new org.telegram.ui.ActionBar.y0[5];
        mVar.d = y0VarArr;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = new ActionBarPopupWindow$ActionBarPopupWindowLayout(0, 0, context, null);
        mVar.b = actionBarPopupWindow$ActionBarPopupWindowLayout2;
        actionBarPopupWindow$ActionBarPopupWindowLayout2.setFitItems(true);
        org.telegram.ui.ActionBar.y0 c10 = org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, R.drawable.msg_arrow_back, hd.N0(2131753753, null), false, null);
        c10.setOnClickListener(new uq(swipeBack, 1));
        c10.d(-328966, -328966);
        c10.setSelectorColor(268435455);
        View t2Var = new bi.t2(context, 13);
        t2Var.setMinimumWidth(org.telegram.messenger.g0.L(196.0f));
        t2Var.setBackgroundColor(-15198184);
        actionBarPopupWindow$ActionBarPopupWindowLayout2.addView(t2Var);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) t2Var.getLayoutParams();
        if (hd.a0) {
            layoutParams.gravity = 5;
        }
        layoutParams.width = -1;
        layoutParams.height = org.telegram.messenger.g0.L(8.0f);
        t2Var.setLayoutParams(layoutParams);
        org.telegram.ui.ActionBar.u0 u0Var = new org.telegram.ui.ActionBar.u0(context, null);
        mVar.c = u0Var;
        u0Var.setMinimumWidth(org.telegram.messenger.g0.L(196.0f));
        u0Var.setDrawShadow(false);
        u0Var.setBackgroundColor(-14540254);
        u0Var.setTextColor(-1);
        u0Var.setOnValueChange(new org.telegram.ui.a5(bVar, 6));
        actionBarPopupWindow$ActionBarPopupWindowLayout2.a(u0Var, ma.o(-1, 44));
        View t2Var2 = new bi.t2(context, 14);
        t2Var2.setMinimumWidth(org.telegram.messenger.g0.L(196.0f));
        t2Var2.setBackgroundColor(-15198184);
        actionBarPopupWindow$ActionBarPopupWindowLayout2.addView(t2Var2);
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) t2Var2.getLayoutParams();
        if (hd.a0) {
            layoutParams2.gravity = 5;
        }
        layoutParams2.width = -1;
        layoutParams2.height = org.telegram.messenger.g0.L(8.0f);
        t2Var2.setLayoutParams(layoutParams2);
        org.telegram.ui.ActionBar.y0 c11 = org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, R.drawable.msg_speed_0_2, hd.N0(2131745020, null), false, null);
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
        y0VarArr[0] = c11;
        org.telegram.ui.ActionBar.y0 c12 = org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, R.drawable.msg_speed_slow, hd.N0(2131745023, null), false, null);
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
        y0VarArr[1] = c12;
        org.telegram.ui.ActionBar.y0 c13 = org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, R.drawable.msg_speed_normal, hd.N0(2131745024, null), false, null);
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
        y0VarArr[2] = c13;
        org.telegram.ui.ActionBar.y0 c14 = org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, R.drawable.msg_speed_fast, hd.N0(2131745027, null), false, null);
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
        y0VarArr[3] = c14;
        org.telegram.ui.ActionBar.y0 c15 = org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, R.drawable.msg_speed_superfast, hd.N0(2131745021, null), false, null);
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
        y0VarArr[4] = c15;
        z3Var.m3 = mVar;
        mVar.K(true, f9.B1);
        org.telegram.ui.ActionBar.y0 y0Var = new org.telegram.ui.ActionBar.y0(0, z3Var.getContext(), this.d, false, false);
        z3Var.n3 = y0Var;
        y0Var.j(hd.N0(2131745028, null), R.drawable.msg_speed, null);
        z3.Y(z3Var, true);
        z3Var.n3.setMinimumWidth(org.telegram.messenger.g0.L(196.0f));
        z3Var.n3.setRightIcon(R.drawable.msg_arrowright);
        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(z3Var.n3);
        LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) z3Var.n3.getLayoutParams();
        if (hd.a0) {
            layoutParams3.gravity = 5;
        }
        layoutParams3.width = -1;
        layoutParams3.height = org.telegram.messenger.g0.L(48.0f);
        z3Var.n3.setLayoutParams(layoutParams3);
        int b10 = actionBarPopupWindow$ActionBarPopupWindowLayout.b((ActionBarPopupWindow$ActionBarPopupWindowLayout) z3Var.m3.b);
        org.telegram.ui.ActionBar.y0 y0Var2 = z3Var.n3;
        y0Var2.Q = new m3(actionBarPopupWindow$ActionBarPopupWindowLayout, b10, 0);
        y0Var2.setOnClickListener(new h3(this, 11));
        actionBarPopupWindow$ActionBarPopupWindowLayout.c = true;
        if (z10) {
            org.telegram.ui.ActionBar.d1 d1Var = new org.telegram.ui.ActionBar.d1(org.telegram.ui.ActionBar.m6.H8, z3Var.getContext(), this.d);
            d1Var.setTag(R.id.fit_width_tag, 1);
            actionBarPopupWindow$ActionBarPopupWindowLayout.a(d1Var, ma.o(-1, 8));
        }
    }

    public final void u(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, TL_stories.StoryItem storyItem) {
        TLRPC.Chat O0;
        z3 z3Var = this.x;
        if (!z3Var.n1 || storyItem == null || (storyItem.media instanceof TLRPC.TL_messageMediaVideoStream) || (O0 = np.u1(z3Var.m2).O0(Long.valueOf(-z3Var.l1))) == null) {
            return;
        }
        TLRPC.ChatFull P0 = np.u1(z3Var.m2).P0(O0.id);
        if (P0 == null) {
            P0 = ur.a0(z3Var.m2).F0(O0.id, true, new CountDownLatch(1), false, false, 0);
        }
        if (P0 == null || !P0.can_view_stats) {
            return;
        }
        org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_stats, hd.N0(2131743297, null), false, this.d).setOnClickListener(new bi.p6(this, storyItem, this.e, O0, 1));
    }
}
