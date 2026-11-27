// default package

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.NotificationsCustomSettingsActivity;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes3.dex */
public final class j68 extends g9 {
    public boolean c;
    public final /* synthetic */ x53 d;
    public final /* synthetic */ lcb e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ boolean n;
    public final /* synthetic */ Context r;
    public final /* synthetic */ m68 s;
    public final /* synthetic */ boolean[] w;
    public final /* synthetic */ o68 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j68(o68 o68Var, Context context, x53 x53Var, x53 x53Var2, lcb lcbVar, boolean z, boolean z2, boolean z3, Context context2, m68 m68Var, boolean[] zArr) {
        super(context, x53Var, true);
        this.x = o68Var;
        this.d = x53Var2;
        this.e = lcbVar;
        this.f = z;
        this.h = z2;
        this.n = z3;
        this.r = context2;
        this.s = m68Var;
        this.w = zArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:263:0x0148, code lost:
    
        if (r1.stories_hidden != false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0134, code lost:
    
        if (r8.stories_hidden != false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x014a, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:411:0x08fe, code lost:
    
        if (r2.bot_can_edit != false) goto L342;
     */
    /* JADX WARN: Code restructure failed: missing block: B:425:0x0929, code lost:
    
        if (r2.delete_stories != false) goto L342;
     */
    /* JADX WARN: Code restructure failed: missing block: B:430:0x0933, code lost:
    
        if (r0.delete_stories != false) goto L342;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:116:0x098c  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0b3a  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0b01  */
    /* JADX WARN: Type inference failed for: r1v145, types: [org.telegram.tgnet.TLRPC$User] */
    /* JADX WARN: Type inference failed for: r22v2 */
    /* JADX WARN: Type inference failed for: r22v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r22v4 */
    @Override // g9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        TL_stories.StoryItem storyItem;
        x53 x53Var;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2;
        TL_stories.StoryItem storyItem2;
        n68 n68Var;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout3;
        x53 x53Var2;
        x53 x53Var3;
        String M0;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout4;
        final j68 j68Var;
        x53 x53Var4;
        String str;
        int i;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout5;
        x53 x53Var5;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout6;
        ArrayList arrayList;
        byte b;
        w96 w96Var;
        TLRPC.GroupCall groupCall;
        w96 w96Var2;
        String str2;
        String M02;
        int i2;
        String str3;
        int i3;
        ?? r22;
        x53 x53Var6;
        Context context;
        ArrayList arrayList2;
        TLObject tLObject;
        c8b c8bVar;
        hm[] hmVarArr;
        x53 x53Var7;
        Context context2;
        TL_stories.MediaArea mediaArea;
        TLRPC.InputStickerSet i1;
        ArrayList<TLRPC.MessageEntity> arrayList3;
        TLRPC.InputStickerSet i12;
        TL_stories.StoryItem storyItem3;
        TLRPC.MessageMedia messageMedia;
        TLRPC.Photo photo;
        TLRPC.Chat M03;
        TLRPC.Chat chat;
        TLRPC.User user;
        byte b2;
        x53 x53Var8;
        x53 x53Var9;
        int i4;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout7;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout8;
        String str4;
        int i5;
        TLRPC.Chat chat2;
        long j;
        boolean z;
        TLRPC.User user2;
        boolean z2;
        boolean z3;
        o68 o68Var = this.x;
        x53 x53Var10 = o68Var.l0;
        n68 n68Var2 = o68Var.y1;
        boolean z4 = this.h;
        Context context3 = this.r;
        final lcb lcbVar = this.e;
        final x53 x53Var11 = this.d;
        if (z4 || n68Var2.b != null) {
            TL_stories.StoryItem storyItem4 = n68Var2.a;
            if (n68Var2.b != null) {
                storyItem = storyItem4;
                x53Var = x53Var11;
                actionBarPopupWindow$ActionBarPopupWindowLayout2 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                s7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_cancel, ob6.M0(2131752570, null), false, x53Var11).setOnClickListener(new d68(this, (byte) 0));
            } else {
                storyItem = storyItem4;
                x53Var = x53Var11;
                actionBarPopupWindow$ActionBarPopupWindowLayout2 = actionBarPopupWindow$ActionBarPopupWindowLayout;
            }
            if (storyItem == null) {
                return;
            }
            if (!(o68Var.m1 || o68Var.C1.g(o68Var.l1)) || n68Var2.f || (storyItem2 = n68Var2.a) == null) {
                n68Var = n68Var2;
            } else {
                HashSet hashSet = storyItem2.albums != null ? new HashSet(storyItem2.albums) : new HashSet();
                fu5 fu5Var = new fu5(actionBarPopupWindow$ActionBarPopupWindowLayout2, x53Var);
                fu5Var.b(R.drawable.ic_ab_back, ob6.M0(2131753749, null), new fw2(actionBarPopupWindow$ActionBarPopupWindowLayout2, (byte) 1), false);
                fu5Var.j();
                n68Var = n68Var2;
                q5b A = o68Var.getStoriesController().A(o68Var.l1, true);
                q5b A2 = o68Var.C1.A(o68Var.l1, false);
                boolean z5 = A2 != null && A2.a();
                fd7 fd7Var = new fd7((Object) this, (Object) x53Var, (Object) storyItem2, (byte) 26);
                x53 x53Var12 = x53Var;
                x53Var = x53Var12;
                fu5.e(fu5Var, A, hashSet, z5, fd7Var, new ku0((Object) this, (Object) hashSet, (Object) storyItem2, (Object) x53Var12, (byte) 15));
                int b3 = actionBarPopupWindow$ActionBarPopupWindowLayout2.b(fu5Var.B);
                b8 b8Var = new b8(0, x53Var, o68Var.getContext(), false, false);
                o68Var.o3 = b8Var;
                b8Var.j(ob6.M0(2131744462, null), R.drawable.menu_album_add, null);
                b8 b8Var2 = o68Var.o3;
                b8Var2.Q = new c68(actionBarPopupWindow$ActionBarPopupWindowLayout2, b3, (byte) 1);
                b8Var2.setOnClickListener(new d68(this, (byte) 15));
                actionBarPopupWindow$ActionBarPopupWindowLayout2.addView(o68Var.o3);
                actionBarPopupWindow$ActionBarPopupWindowLayout2.c = true;
                k8 k8Var = new k8(aob.H8, x53Var, o68Var.getContext());
                k8Var.setTag(R.id.fit_width_tag, 1);
                actionBarPopupWindow$ActionBarPopupWindowLayout2.a(k8Var, tre.o(-1, 8));
            }
            byte b4 = 13;
            if (o68Var.m1) {
                boolean isEmpty = storyItem.privacy.isEmpty();
                int i6 = o68Var.m2;
                u9b u9bVar = isEmpty ? new u9b(3, i6, new ArrayList()) : new u9b(i6, storyItem.privacy);
                actionBarPopupWindow$ActionBarPopupWindowLayout3 = actionBarPopupWindow$ActionBarPopupWindowLayout2;
                x53Var2 = x53Var;
                b8 c = s7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout3, R.drawable.msg_view_file, ob6.M0(2131742509, null), false, x53Var2);
                c.setSubtext(u9bVar.toString());
                c.setOnClickListener(new lw4(this, u9bVar, storyItem, b4));
                c.setItemHeight(56);
            } else {
                actionBarPopupWindow$ActionBarPopupWindowLayout3 = actionBarPopupWindow$ActionBarPopupWindowLayout2;
                x53Var2 = x53Var;
            }
            r(actionBarPopupWindow$ActionBarPopupWindowLayout3, false);
            if (o68Var.m1 || this.f) {
                k8 k8Var2 = new k8(aob.H8, x53Var2, o68Var.getContext());
                k8Var2.setTag(R.id.fit_width_tag, 1);
                actionBarPopupWindow$ActionBarPopupWindowLayout3.a(k8Var2, tre.o(-1, 8));
            }
            if (!o68Var.M2 && !n68Var.f && ((o68Var.A0() || uc7.s1(o68Var.m2).k5()) && this.n)) {
                b8 c2 = s7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout3, R.drawable.msg_edit, ob6.M0(o68Var.A0() ? 2131751253 : 2131751185, null), false, x53Var2);
                o68Var.c1 = c2;
                x53 x53Var13 = x53Var2;
                x53Var2 = x53Var13;
                c2.setOnClickListener(new nh(this, x53Var13, this.r, lcbVar, this.s, (byte) 12));
                if (o68Var.C1.L(o68Var.l1) && n68Var.e && !xea.b()) {
                    o68Var.c1.setAlpha(0.5f);
                }
            }
            TL_stories.StoryItem storyItem5 = n68Var.a;
            if (storyItem5 == null || !n68Var.e || n68Var.f || !(storyItem5.pinned || o68Var.B0())) {
                x53Var3 = x53Var2;
            } else {
                x53Var3 = x53Var2;
                s7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.menu_cover_stories, ob6.M0(2131744328, null), false, x53Var2).setOnClickListener(new nh(this, this.r, storyItem, lcbVar, this.s, (byte) 13));
            }
            if ((o68Var.m1 || (o68Var.n1 && uc7.s1(o68Var.m2).O1().g(storyItem.dialogId))) && !n68Var.f) {
                boolean z6 = storyItem.pinned;
                boolean z7 = !z6;
                if (o68Var.m1) {
                    if (z6) {
                        str = null;
                        i = 2131754130;
                    } else {
                        i = 2131745637;
                        str = null;
                    }
                    M0 = ob6.M0(i, str);
                } else {
                    M0 = ob6.M0(!z6 ? 2131745638 : 2131746039, null);
                }
                x53 x53Var14 = x53Var3;
                b8 c3 = s7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, !z6 ? R.drawable.msg_save_story : R.drawable.menu_unsave_story, M0, false, x53Var14);
                actionBarPopupWindow$ActionBarPopupWindowLayout4 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                e73 e73Var = new e73(this, storyItem, z7, x53Var14, (byte) 4);
                j68Var = this;
                x53Var4 = x53Var14;
                c3.setOnClickListener(e73Var);
            } else {
                j68Var = this;
                actionBarPopupWindow$ActionBarPopupWindowLayout4 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                x53Var4 = x53Var3;
            }
            j68Var.s(actionBarPopupWindow$ActionBarPopupWindowLayout4, storyItem);
            if (o68Var.M2 || n68Var.f) {
                actionBarPopupWindow$ActionBarPopupWindowLayout5 = actionBarPopupWindow$ActionBarPopupWindowLayout4;
                x53Var5 = x53Var4;
            } else {
                if (n68Var.e) {
                    i3 = 2131745636;
                    str3 = null;
                } else {
                    str3 = null;
                    i3 = 2131745667;
                }
                actionBarPopupWindow$ActionBarPopupWindowLayout5 = actionBarPopupWindow$ActionBarPopupWindowLayout4;
                x53Var5 = x53Var4;
                s7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout5, R.drawable.msg_gallery, ob6.M0(i3, str3), false, x53Var5).setOnClickListener(new d68(j68Var, (byte) 11));
            }
            if (!uc7.s1(o68Var.m2).M3() && !n68Var.f && !o68Var.n1) {
                o68Var.s0(actionBarPopupWindow$ActionBarPopupWindowLayout5);
            }
            if (o68Var.n1 && o68Var.E2) {
                s7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout5, R.drawable.msg_link, ob6.M0(2131751727, null), false, x53Var5).setOnClickListener(new d68(j68Var, (byte) 12));
            }
            if (o68Var.E2) {
                s7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_shareout, ob6.M0(2131752963, null), false, x53Var5).setOnClickListener(new d68(j68Var, b4));
            }
            TL_stories.StoryItem storyItem6 = n68Var.a;
            if (storyItem6 != null) {
                TLRPC.MessageMedia messageMedia2 = storyItem6.media;
                if ((messageMedia2 instanceof TLRPC.TL_messageMediaVideoStream) && (w96Var2 = w96.N) != null && w96Var2.i(((TLRPC.TL_messageMediaVideoStream) messageMedia2).call)) {
                    w96 w96Var3 = w96.N;
                    boolean z8 = w96Var3 != null && w96Var3.r();
                    if (z8) {
                        str2 = null;
                        M02 = ob6.M0(2131743504, null);
                        i2 = R.drawable.msg_voice_unmuted;
                    } else {
                        str2 = null;
                        M02 = ob6.M0(2131748068, null);
                        i2 = R.drawable.msg_voice_muted;
                    }
                    s7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, i2, M02, false, x53Var5).setOnClickListener(new w6((byte) 6, j68Var, z8));
                    s7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.menu_camera_retake, ob6.M0(2131754747, str2), false, x53Var5).setOnClickListener(new d68(j68Var, (byte) 14));
                }
            }
            if (n68Var.f) {
                final byte b5 = 0;
                s7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.menu_video_pip, ob6.M0(2131746949, null), false, x53Var5).setOnClickListener(new View.OnClickListener(j68Var) { // from class: e68
                    public final /* synthetic */ j68 b;

                    {
                        this.b = j68Var;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        byte b6 = b5;
                        lcb lcbVar2 = lcbVar;
                        j68 j68Var2 = this.b;
                        switch (b6) {
                            case 0:
                                j68 j68Var3 = j68Var2.x.d1;
                                if (j68Var3 != null) {
                                    j68Var3.a();
                                }
                                lcbVar2.S();
                                break;
                            default:
                                j68 j68Var4 = j68Var2.x.d1;
                                if (j68Var4 != null) {
                                    j68Var4.a();
                                }
                                lcbVar2.S();
                                break;
                        }
                    }
                });
            }
            if (n68Var.f && (o68Var.l1 == yac.h(o68Var.m2).e() || xc2.w(14, uc7.s1(o68Var.m2).M0(Long.valueOf(-o68Var.l1))) || ((w96Var = lcbVar.B0) != null && n68Var.i(w96Var.j()) && (groupCall = lcbVar.B0.s) != null && groupCall.creator))) {
                s7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_settings_old, ob6.M0(2131748544, null), false, x53Var5).setOnClickListener(new f68(j68Var, x53Var5, lcbVar, (byte) 0));
            }
            if (n68Var.f) {
                b8 c4 = s7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_remove, ob6.M0(2131748574, null), false, x53Var5);
                int i7 = aob.q7;
                c4.h(0.12f, i7);
                c4.d(x53Var5.h(i7), x53Var5.h(i7));
                c4.setOnClickListener(new f68(j68Var, x53Var5, lcbVar, (byte) 1));
            }
            if (!n68Var.f) {
                if (!o68Var.m1) {
                    c6b O1 = uc7.s1(o68Var.m2).O1();
                    TL_stories.StoryItem storyItem7 = n68Var.a;
                    int i8 = O1.a;
                    if (storyItem7 != null) {
                        if (storyItem7.dialogId != yac.h(i8).e()) {
                            if (storyItem7.dialogId > 0) {
                                TLRPC.User X1 = uc7.s1(i8).X1(Long.valueOf(storyItem7.dialogId));
                                if (X1 != null) {
                                    if (X1.bot) {
                                    }
                                }
                            }
                            if (storyItem7.dialogId < 0) {
                                TLRPC.Chat M04 = uc7.s1(i8).M0(Long.valueOf(-storyItem7.dialogId));
                                if (M04 != null) {
                                    if (!M04.creator) {
                                        boolean z9 = storyItem7.out;
                                        if (z9) {
                                            TLRPC.TL_chatAdminRights tL_chatAdminRights = M04.admin_rights;
                                            if (tL_chatAdminRights != null) {
                                                if (!tL_chatAdminRights.post_stories) {
                                                }
                                            }
                                        }
                                        if (!z9) {
                                            TLRPC.TL_chatAdminRights tL_chatAdminRights2 = M04.admin_rights;
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
                b8 c5 = s7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout6, R.drawable.msg_delete, ob6.M0(2131751563, null), false, x53Var5);
                int i9 = aob.q7;
                c5.h(0.12f, i9);
                c5.d(x53Var5.h(i9), x53Var5.h(i9));
                b = 1;
                c5.setOnClickListener(new d68(j68Var, b));
                r22 = (n68Var != null || (storyItem3 = n68Var.a) == null || (messageMedia = storyItem3.media) == null || (!r47.V2(messageMedia.document) && ((photo = n68Var.a.media.photo) == null || !photo.has_stickers))) ? 0 : b;
                if (n68Var == null) {
                    HashSet hashSet2 = new HashSet();
                    ArrayList arrayList4 = new ArrayList();
                    TL_stories.StoryItem storyItem8 = n68Var.a;
                    if (storyItem8 != null && storyItem8.media_areas != null) {
                        for (int i10 = 0; i10 < n68Var.a.media_areas.size(); i10++) {
                            TL_stories.MediaArea mediaArea2 = n68Var.a.media_areas.get(i10);
                            if (mediaArea2 instanceof TL_stories.TL_mediaAreaSuggestedReaction) {
                                TLRPC.Reaction reaction = mediaArea2.reaction;
                                if (reaction instanceof TLRPC.TL_reactionCustomEmoji) {
                                    TLRPC.Document e = wl.e(o68Var.m2, ((TLRPC.TL_reactionCustomEmoji) reaction).document_id);
                                    if (e != null && (i12 = r47.i1(e)) != null && !hashSet2.contains(Long.valueOf(i12.id))) {
                                        hashSet2.add(Long.valueOf(i12.id));
                                        arrayList4.add(i12);
                                    }
                                }
                            }
                        }
                    }
                    TL_stories.StoryItem storyItem9 = n68Var.a;
                    if (storyItem9 == null || (arrayList3 = storyItem9.entities) == null || arrayList3.isEmpty()) {
                        b6b b6bVar = n68Var.b;
                        if (b6bVar != null && (c8bVar = b6bVar.c) != null) {
                            if (c8bVar.T0 != null) {
                                for (int i11 = 0; i11 < n68Var.b.c.T0.size(); i11++) {
                                    mec mecVar = (mec) n68Var.b.c.T0.get(i11);
                                    if (mecVar.a == 4 && (mediaArea = mecVar.N) != null) {
                                        TLRPC.Reaction reaction2 = mediaArea.reaction;
                                        if (reaction2 instanceof TLRPC.TL_reactionCustomEmoji) {
                                            TLRPC.Document e2 = wl.e(o68Var.m2, ((TLRPC.TL_reactionCustomEmoji) reaction2).document_id);
                                            if (e2 != null && (i1 = r47.i1(e2)) != null && !hashSet2.contains(Long.valueOf(i1.id))) {
                                                hashSet2.add(Long.valueOf(i1.id));
                                                arrayList4.add(i1);
                                            }
                                        }
                                    }
                                }
                            }
                            CharSequence charSequence = n68Var.b.c.C0;
                            if ((charSequence instanceof Spanned) && (hmVarArr = (hm[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), hm.class)) != null) {
                                int i13 = 0;
                                while (i13 < hmVarArr.length) {
                                    hm hmVar = hmVarArr[i13];
                                    TLRPC.Document document = hmVar.document;
                                    if (document == null) {
                                        x53Var7 = x53Var5;
                                        document = wl.e(o68Var.m2, hmVar.documentId);
                                    } else {
                                        x53Var7 = x53Var5;
                                    }
                                    if (document == null) {
                                        context2 = context3;
                                    } else {
                                        TLRPC.InputStickerSet i14 = r47.i1(document);
                                        context2 = context3;
                                        if (!hashSet2.contains(Long.valueOf(i14.id))) {
                                            hashSet2.add(Long.valueOf(i14.id));
                                            arrayList4.add(i14);
                                        }
                                    }
                                    i13++;
                                    context3 = context2;
                                    x53Var5 = x53Var7;
                                }
                            }
                        }
                    } else {
                        for (int i15 = 0; i15 < n68Var.a.entities.size(); i15++) {
                            TLRPC.MessageEntity messageEntity = n68Var.a.entities.get(i15);
                            if (messageEntity instanceof TLRPC.TL_messageEntityCustomEmoji) {
                                TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = (TLRPC.TL_messageEntityCustomEmoji) messageEntity;
                                TLRPC.Document document2 = tL_messageEntityCustomEmoji.document;
                                if (document2 == null) {
                                    document2 = wl.e(o68Var.m2, tL_messageEntityCustomEmoji.document_id);
                                }
                                if (document2 != null) {
                                    TLRPC.InputStickerSet i16 = r47.i1(document2);
                                    if (!hashSet2.contains(Long.valueOf(i16.id))) {
                                        hashSet2.add(Long.valueOf(i16.id));
                                        arrayList4.add(i16);
                                    }
                                }
                            }
                        }
                    }
                    x53Var6 = x53Var5;
                    context = context3;
                    arrayList2 = arrayList4;
                } else {
                    x53Var6 = x53Var5;
                    context = context3;
                    arrayList2 = arrayList;
                }
                boolean z10 = arrayList2 == null && !arrayList2.isEmpty();
                if (r22 == 0 || z10) {
                    x53 x53Var15 = x53Var6;
                    k8 k8Var3 = new k8(aob.H8, x53Var15, context);
                    k8Var3.setTag(R.id.fit_width_tag, 1);
                    actionBarPopupWindow$ActionBarPopupWindowLayout6.a(k8Var3, tre.o(-1, 8));
                    TLRPC.MessageMedia messageMedia3 = n68Var.a.media;
                    tLObject = messageMedia3.document;
                    if (tLObject == null) {
                        tLObject = messageMedia3.photo;
                    }
                    u7b u7bVar = new u7b(j68Var.r, o68Var.m2, tLObject, n68Var.a, r22, arrayList2, x53Var15);
                    u7bVar.setOnClickListener(new uv5(j68Var, u7bVar, (byte) 18));
                    u7bVar.setTag(R.id.fit_width_tag, 1);
                    actionBarPopupWindow$ActionBarPopupWindowLayout6.a(u7bVar, tre.o(-1, -2));
                }
                return;
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout6 = actionBarPopupWindow$ActionBarPopupWindowLayout;
        } else {
            r(actionBarPopupWindow$ActionBarPopupWindowLayout, true);
            final String p = ip7.p(o68Var.l1, 0L, false);
            boolean c0 = NotificationsCustomSettingsActivity.c0(o68Var.m2, o68Var.l1);
            long j2 = o68Var.l1;
            int i17 = o68Var.m2;
            if (j2 > 0) {
                ?? X12 = uc7.s1(i17).X1(Long.valueOf(o68Var.l1));
                chat = X12;
                M03 = null;
                user = X12;
            } else {
                M03 = uc7.s1(i17).M0(Long.valueOf(-o68Var.l1));
                chat = M03;
                user = null;
            }
            String trim = user == null ? M03 == null ? "" : M03.title : lbc.k(user, true).trim();
            int indexOf = trim.indexOf(" ");
            if (indexOf > 0) {
                trim = trim.substring(0, indexOf);
            }
            final String str5 = trim;
            if (lbc.C(o68Var.l1) || o68Var.A0()) {
                b2 = 5;
                x53Var8 = x53Var11;
                j68Var = this;
            } else {
                if (c0) {
                    chat2 = M03;
                    j = 0;
                    b8 c6 = s7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_mute, ob6.M0(2131747590, null), false, x53Var11);
                    final byte b6 = 0;
                    user2 = user;
                    z = false;
                    final TLRPC.Chat chat3 = chat;
                    View.OnClickListener onClickListener = new View.OnClickListener(this) { // from class: g68
                        public final /* synthetic */ j68 b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            byte b7 = b6;
                            String str6 = str5;
                            TLObject tLObject2 = chat3;
                            x53 x53Var16 = x53Var11;
                            String str7 = p;
                            j68 j68Var2 = this.b;
                            switch (b7) {
                                case 0:
                                    o68 o68Var2 = j68Var2.x;
                                    uc7.s1(o68Var2.m2).W3.edit().putBoolean("stories_" + str7, false).apply();
                                    ip7.n(o68Var2.m2).c0(o68Var2.l1, 0L, true);
                                    v21 V = new d31(o68Var2.M0, x53Var16).V(Arrays.asList(tLObject2), hl.S2(ob6.a0("NotificationsStoryMutedHint", null, 2131747589, str6)), null, null);
                                    V.a = 2;
                                    V.j();
                                    j68 j68Var3 = o68Var2.d1;
                                    if (j68Var3 != null) {
                                        j68Var3.a();
                                        break;
                                    }
                                    break;
                                default:
                                    o68 o68Var3 = j68Var2.x;
                                    uc7.s1(o68Var3.m2).W3.edit().putBoolean("stories_" + str7, true).apply();
                                    ip7.n(o68Var3.m2).c0(o68Var3.l1, 0L, true);
                                    v21 V2 = new d31(o68Var3.M0, x53Var16).V(Arrays.asList(tLObject2), hl.S2(ob6.a0("NotificationsStoryUnmutedHint", null, 2131747586, str6)), null, null);
                                    V2.a = 2;
                                    V2.j();
                                    j68 j68Var4 = o68Var3.d1;
                                    if (j68Var4 != null) {
                                        j68Var4.a();
                                        break;
                                    }
                                    break;
                            }
                        }
                    };
                    x53Var8 = x53Var11;
                    c6.setOnClickListener(onClickListener);
                    c6.setMultiline(false);
                } else {
                    chat2 = M03;
                    j = 0;
                    final TLRPC.Chat chat4 = chat;
                    z = false;
                    user2 = user;
                    b8 c7 = s7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_unmute, ob6.M0(2131747587, null), false, x53Var11);
                    final byte b7 = 1;
                    View.OnClickListener onClickListener2 = new View.OnClickListener(this) { // from class: g68
                        public final /* synthetic */ j68 b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            byte b72 = b7;
                            String str6 = str5;
                            TLObject tLObject2 = chat4;
                            x53 x53Var16 = x53Var11;
                            String str7 = p;
                            j68 j68Var2 = this.b;
                            switch (b72) {
                                case 0:
                                    o68 o68Var2 = j68Var2.x;
                                    uc7.s1(o68Var2.m2).W3.edit().putBoolean("stories_" + str7, false).apply();
                                    ip7.n(o68Var2.m2).c0(o68Var2.l1, 0L, true);
                                    v21 V = new d31(o68Var2.M0, x53Var16).V(Arrays.asList(tLObject2), hl.S2(ob6.a0("NotificationsStoryMutedHint", null, 2131747589, str6)), null, null);
                                    V.a = 2;
                                    V.j();
                                    j68 j68Var3 = o68Var2.d1;
                                    if (j68Var3 != null) {
                                        j68Var3.a();
                                        break;
                                    }
                                    break;
                                default:
                                    o68 o68Var3 = j68Var2.x;
                                    uc7.s1(o68Var3.m2).W3.edit().putBoolean("stories_" + str7, true).apply();
                                    ip7.n(o68Var3.m2).c0(o68Var3.l1, 0L, true);
                                    v21 V2 = new d31(o68Var3.M0, x53Var16).V(Arrays.asList(tLObject2), hl.S2(ob6.a0("NotificationsStoryUnmutedHint", null, 2131747586, str6)), null, null);
                                    V2.a = 2;
                                    V2.j();
                                    j68 j68Var4 = o68Var3.d1;
                                    if (j68Var4 != null) {
                                        j68Var4.a();
                                        break;
                                    }
                                    break;
                            }
                        }
                    };
                    x53Var8 = x53Var11;
                    c7.setOnClickListener(onClickListener2);
                    c7.setMultiline(false);
                }
                ls6.d0(o68Var.m2).O0(true);
                boolean z11 = (user2 == null || user2.contact || !ls6.d0(o68Var.m2).I(o68Var.l1)) ? z : true;
                if (o68Var.l1 > j) {
                    z2 = (user2 == null || !user2.contact) ? z : true;
                    if (user2 != null) {
                    }
                    z3 = z;
                } else {
                    TLRPC.Chat chat5 = chat2;
                    z2 = (chat5 == null || xc2.r0(chat5)) ? z : true;
                    if (chat5 != null) {
                    }
                    z3 = z;
                }
                if (z11) {
                    j68Var = this;
                    s7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_delete, ob6.M0(2131744405, null), false, x53Var8).setOnClickListener(new d68(j68Var, (byte) 3));
                } else {
                    j68Var = this;
                    if (z2) {
                        if (z3) {
                            b2 = 5;
                            s7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_unarchive, ob6.M0(2131743569, null), false, x53Var8).setOnClickListener(new d68(j68Var, b2));
                        } else {
                            s7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_archive, ob6.M0(2131754146, null), false, x53Var8).setOnClickListener(new d68(j68Var, (byte) 4));
                        }
                    }
                }
                b2 = 5;
            }
            if (n68Var2.f) {
                x53Var9 = x53Var8;
                final byte b8 = 1;
                s7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.menu_video_pip, ob6.M0(2131746949, null), false, x53Var8).setOnClickListener(new View.OnClickListener(j68Var) { // from class: e68
                    public final /* synthetic */ j68 b;

                    {
                        this.b = j68Var;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        byte b62 = b8;
                        lcb lcbVar2 = lcbVar;
                        j68 j68Var2 = this.b;
                        switch (b62) {
                            case 0:
                                j68 j68Var3 = j68Var2.x.d1;
                                if (j68Var3 != null) {
                                    j68Var3.a();
                                }
                                lcbVar2.S();
                                break;
                            default:
                                j68 j68Var4 = j68Var2.x.d1;
                                if (j68Var4 != null) {
                                    j68Var4.a();
                                }
                                lcbVar2.S();
                                break;
                        }
                    }
                });
            } else {
                x53Var9 = x53Var8;
            }
            if (uc7.s1(o68Var.m2).M3() || !n68Var2.e) {
                i4 = R.drawable.msg_gallery_locked2;
            } else {
                boolean z12 = uc7.s1(o68Var.m2).Q3;
                int i18 = 2131744163;
                if (yac.h(o68Var.m2).p()) {
                    if (z12) {
                        i5 = R.drawable.menu_quality_sd;
                        i18 = 2131744166;
                    } else {
                        i5 = R.drawable.menu_quality_hd;
                    }
                    String M05 = ob6.M0(i18, null);
                    i4 = R.drawable.msg_gallery_locked2;
                    s7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, i5, M05, false, x53Var10).setOnClickListener(new w6(b2, o68Var, z12));
                } else {
                    i4 = R.drawable.msg_gallery_locked2;
                    Drawable drawable = o68Var.getContext().getDrawable(i4);
                    drawable.setColorFilter(new PorterDuffColorFilter(vm2.f(0.5f, -1, -16777216), PorterDuff.Mode.MULTIPLY));
                    c58 c58Var = new c58(o68Var.getContext().getDrawable(R.drawable.menu_quality_hd2), drawable, (byte) 1);
                    int L = hl.L(24.0f);
                    int L2 = hl.L(24.0f);
                    c58Var.e = L;
                    c58Var.f = L2;
                    int L3 = hl.L(1.0f);
                    int i19 = -hl.L(2.0f);
                    c58Var.s = L3;
                    c58Var.w = i19;
                    b8 c8 = s7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.menu_quality_hd, ob6.M0(2131744163, null), false, x53Var10);
                    c8.setOnClickListener(new v48(o68Var, (byte) 11));
                    c8.setIcon(c58Var);
                }
            }
            if (o68Var.M2 || !o68Var.C2 || n68Var2.f) {
                actionBarPopupWindow$ActionBarPopupWindowLayout7 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                x53Var5 = x53Var9;
            } else {
                if (yac.h(o68Var.m2).p()) {
                    x53Var5 = x53Var9;
                    s7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_gallery, ob6.M0(2131745657, null), false, x53Var5).setOnClickListener(new d68(j68Var, (byte) 6));
                } else {
                    x53Var5 = x53Var9;
                    if (!uc7.s1(o68Var.m2).M3()) {
                        Drawable drawable2 = context3.getDrawable(i4);
                        drawable2.setColorFilter(new PorterDuffColorFilter(vm2.f(0.5f, -1, -16777216), PorterDuff.Mode.MULTIPLY));
                        c58 c58Var2 = new c58(context3.getDrawable(R.drawable.msg_gallery_locked1), drawable2, (byte) 2);
                        actionBarPopupWindow$ActionBarPopupWindowLayout7 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                        b8 c9 = s7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout7, R.drawable.msg_gallery, ob6.M0(2131745657, null), false, x53Var5);
                        c9.setIcon(c58Var2);
                        c9.setOnClickListener(new lw4(j68Var, c9, lcbVar, (byte) 14));
                    }
                }
                actionBarPopupWindow$ActionBarPopupWindowLayout7 = actionBarPopupWindow$ActionBarPopupWindowLayout;
            }
            if (!uc7.s1(o68Var.m2).M3() && !o68Var.n1) {
                o68Var.s0(actionBarPopupWindow$ActionBarPopupWindowLayout7);
            }
            if (o68Var.E2) {
                s7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout7, R.drawable.msg_link2, ob6.M0(2131751727, null), false, x53Var5).setOnClickListener(new d68(j68Var, (byte) 7));
            }
            if (o68Var.E2) {
                s7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_shareout, ob6.M0(2131752963, null), false, x53Var5).setOnClickListener(new d68(j68Var, (byte) 8));
            }
            TL_stories.StoryItem storyItem10 = n68Var2.a;
            if (storyItem10 != null) {
                if (storyItem10.translated && TextUtils.equals(storyItem10.translatedLng, r3c.H0())) {
                    s7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_translate, ob6.M0(2131749058, null), false, x53Var5).setOnClickListener(new d68(j68Var, (byte) 9));
                } else {
                    a5c a5cVar = uc7.s1(o68Var.m2).i4;
                    TL_stories.StoryItem storyItem11 = n68Var2.a;
                    a5cVar.getClass();
                    if (storyItem11 != null && !TextUtils.isEmpty(storyItem11.caption) && !pv3.d(storyItem11.caption) && ((storyItem11.detectedLng == null && storyItem11.translatedText != null && TextUtils.equals(storyItem11.translatedLng, r3c.H0())) || ((str4 = storyItem11.detectedLng) != null && !a5cVar.v(str4)))) {
                        actionBarPopupWindow$ActionBarPopupWindowLayout8 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                        s7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout8, R.drawable.msg_translate, ob6.M0(2131743611, null), false, x53Var5).setOnClickListener(new d68(j68Var, (byte) 10));
                        j68Var.s(actionBarPopupWindow$ActionBarPopupWindowLayout8, n68Var2.a);
                        if (!o68Var.M2 && !lbc.C(o68Var.l1) && !o68Var.A0()) {
                            s7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout8, R.drawable.msg_report, ob6.M0(2131745957, null), false, x53Var5).setOnClickListener(new f68(j68Var, lcbVar, x53Var5));
                        }
                        actionBarPopupWindow$ActionBarPopupWindowLayout6 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                        n68Var = n68Var2;
                    }
                }
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout8 = actionBarPopupWindow$ActionBarPopupWindowLayout;
            j68Var.s(actionBarPopupWindow$ActionBarPopupWindowLayout8, n68Var2.a);
            if (!o68Var.M2) {
                s7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout8, R.drawable.msg_report, ob6.M0(2131745957, null), false, x53Var5).setOnClickListener(new f68(j68Var, lcbVar, x53Var5));
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout6 = actionBarPopupWindow$ActionBarPopupWindowLayout;
            n68Var = n68Var2;
        }
        b = 1;
        arrayList = null;
        if (n68Var != null) {
        }
        if (n68Var == null) {
        }
        if (arrayList2 == null) {
        }
        if (r22 == 0) {
        }
        x53 x53Var152 = x53Var6;
        k8 k8Var32 = new k8(aob.H8, x53Var152, context);
        k8Var32.setTag(R.id.fit_width_tag, 1);
        actionBarPopupWindow$ActionBarPopupWindowLayout6.a(k8Var32, tre.o(-1, 8));
        TLRPC.MessageMedia messageMedia32 = n68Var.a.media;
        tLObject = messageMedia32.document;
        if (tLObject == null) {
        }
        u7b u7bVar2 = new u7b(j68Var.r, o68Var.m2, tLObject, n68Var.a, r22, arrayList2, x53Var152);
        u7bVar2.setOnClickListener(new uv5(j68Var, u7bVar2, (byte) 18));
        u7bVar2.setTag(R.id.fit_width_tag, 1);
        actionBarPopupWindow$ActionBarPopupWindowLayout6.a(u7bVar2, tre.o(-1, -2));
    }

    @Override // g9
    public final void k() {
        if (!this.c && !this.w[0]) {
            hl.c3(new z58(this, (byte) 3));
        }
        o68 o68Var = this.x;
        o68Var.d1 = null;
        o68Var.c1 = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void r(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, boolean z) {
        n68 n68Var;
        boolean z2 = this.f;
        o68 o68Var = this.x;
        if (!z2 || ((n68Var = o68Var.y1) != null && n68Var.b != null)) {
            o68Var.m3 = null;
            o68Var.n3 = null;
            return;
        }
        Context context = o68Var.getContext();
        fj8 swipeBack = actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack();
        final um4 um4Var = new um4(this, actionBarPopupWindow$ActionBarPopupWindowLayout, false, (byte) 18);
        rx6 rx6Var = new rx6((byte) 22);
        b8[] b8VarArr = new b8[5];
        rx6Var.d = b8VarArr;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = new ActionBarPopupWindow$ActionBarPopupWindowLayout(0, 0, null, context);
        rx6Var.b = actionBarPopupWindow$ActionBarPopupWindowLayout2;
        actionBarPopupWindow$ActionBarPopupWindowLayout2.setFitItems(true);
        b8 c = s7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, R.drawable.msg_arrow_back, ob6.M0(2131753749, null), false, null);
        c.setOnClickListener(new y60(swipeBack, (byte) 3));
        c.d(-328966, -328966);
        c.setSelectorColor(268435455);
        b6 b6Var = new b6(context, (byte) 8);
        b6Var.setMinimumWidth(hl.L(196.0f));
        b6Var.setBackgroundColor(-15198184);
        actionBarPopupWindow$ActionBarPopupWindowLayout2.addView(b6Var);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) b6Var.getLayoutParams();
        if (ob6.a0) {
            layoutParams.gravity = 5;
        }
        layoutParams.width = -1;
        layoutParams.height = hl.L(8.0f);
        b6Var.setLayoutParams(layoutParams);
        w7 w7Var = new w7(context, null);
        rx6Var.c = w7Var;
        w7Var.setMinimumWidth(hl.L(196.0f));
        w7Var.setDrawShadow(false);
        w7Var.setBackgroundColor(-14540254);
        w7Var.setTextColor(-1);
        w7Var.setOnValueChange(new n82(um4Var, (byte) 6));
        actionBarPopupWindow$ActionBarPopupWindowLayout2.a(w7Var, tre.o(-1, 44));
        b6 b6Var2 = new b6(context, (byte) 9);
        b6Var2.setMinimumWidth(hl.L(196.0f));
        b6Var2.setBackgroundColor(-15198184);
        actionBarPopupWindow$ActionBarPopupWindowLayout2.addView(b6Var2);
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) b6Var2.getLayoutParams();
        if (ob6.a0) {
            layoutParams2.gravity = 5;
        }
        layoutParams2.width = -1;
        layoutParams2.height = hl.L(8.0f);
        b6Var2.setLayoutParams(layoutParams2);
        final byte b = 3;
        b8 c2 = s7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, R.drawable.msg_speed_0_2, ob6.M0(2131744920, null), false, null);
        c2.d(-328966, -328966);
        final Object[] objArr = null == true ? 1 : 0;
        c2.setOnClickListener(new View.OnClickListener() { // from class: fh2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b2 = objArr;
                um4 um4Var2 = um4Var;
                switch (b2) {
                    case 0:
                        um4Var2.a0(true, true, 0.2f);
                        break;
                    case 1:
                        um4Var2.a0(true, true, 0.5f);
                        break;
                    case 2:
                        um4Var2.a0(true, true, 1.0f);
                        break;
                    case 3:
                        um4Var2.a0(true, true, 1.5f);
                        break;
                    default:
                        um4Var2.a0(true, true, 2.0f);
                        break;
                }
            }
        });
        c2.setSelectorColor(268435455);
        b8VarArr[0] = c2;
        b8 c3 = s7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, R.drawable.msg_speed_slow, ob6.M0(2131744923, null), false, null);
        c3.d(-328966, -328966);
        final byte b2 = 1;
        c3.setOnClickListener(new View.OnClickListener() { // from class: fh2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b22 = b2;
                um4 um4Var2 = um4Var;
                switch (b22) {
                    case 0:
                        um4Var2.a0(true, true, 0.2f);
                        break;
                    case 1:
                        um4Var2.a0(true, true, 0.5f);
                        break;
                    case 2:
                        um4Var2.a0(true, true, 1.0f);
                        break;
                    case 3:
                        um4Var2.a0(true, true, 1.5f);
                        break;
                    default:
                        um4Var2.a0(true, true, 2.0f);
                        break;
                }
            }
        });
        c3.setSelectorColor(268435455);
        b8VarArr[1] = c3;
        b8 c4 = s7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, R.drawable.msg_speed_normal, ob6.M0(2131744924, null), false, null);
        c4.d(-328966, -328966);
        final byte b3 = 2;
        c4.setOnClickListener(new View.OnClickListener() { // from class: fh2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b22 = b3;
                um4 um4Var2 = um4Var;
                switch (b22) {
                    case 0:
                        um4Var2.a0(true, true, 0.2f);
                        break;
                    case 1:
                        um4Var2.a0(true, true, 0.5f);
                        break;
                    case 2:
                        um4Var2.a0(true, true, 1.0f);
                        break;
                    case 3:
                        um4Var2.a0(true, true, 1.5f);
                        break;
                    default:
                        um4Var2.a0(true, true, 2.0f);
                        break;
                }
            }
        });
        c4.setSelectorColor(268435455);
        b8VarArr[2] = c4;
        b8 c5 = s7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, R.drawable.msg_speed_fast, ob6.M0(2131744927, null), false, null);
        c5.d(-328966, -328966);
        c5.setOnClickListener(new View.OnClickListener() { // from class: fh2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b22 = b;
                um4 um4Var2 = um4Var;
                switch (b22) {
                    case 0:
                        um4Var2.a0(true, true, 0.2f);
                        break;
                    case 1:
                        um4Var2.a0(true, true, 0.5f);
                        break;
                    case 2:
                        um4Var2.a0(true, true, 1.0f);
                        break;
                    case 3:
                        um4Var2.a0(true, true, 1.5f);
                        break;
                    default:
                        um4Var2.a0(true, true, 2.0f);
                        break;
                }
            }
        });
        c5.setSelectorColor(268435455);
        b8VarArr[3] = c5;
        b8 c6 = s7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, R.drawable.msg_speed_superfast, ob6.M0(2131744921, null), false, null);
        c6.d(-328966, -328966);
        final byte b4 = 4;
        c6.setOnClickListener(new View.OnClickListener() { // from class: fh2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b22 = b4;
                um4 um4Var2 = um4Var;
                switch (b22) {
                    case 0:
                        um4Var2.a0(true, true, 0.2f);
                        break;
                    case 1:
                        um4Var2.a0(true, true, 0.5f);
                        break;
                    case 2:
                        um4Var2.a0(true, true, 1.0f);
                        break;
                    case 3:
                        um4Var2.a0(true, true, 1.5f);
                        break;
                    default:
                        um4Var2.a0(true, true, 2.0f);
                        break;
                }
            }
        });
        c6.setSelectorColor(268435455);
        b8VarArr[4] = c6;
        o68Var.m3 = rx6Var;
        rx6Var.C0(true, lcb.B1);
        Context context2 = o68Var.getContext();
        x53 x53Var = this.d;
        b8 b8Var = new b8(0, x53Var, context2, false, false);
        o68Var.n3 = b8Var;
        b8Var.j(ob6.M0(2131744928, null), R.drawable.msg_speed, null);
        o68Var.g1(true);
        o68Var.n3.setMinimumWidth(hl.L(196.0f));
        o68Var.n3.setRightIcon(R.drawable.msg_arrowright);
        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(o68Var.n3);
        LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) o68Var.n3.getLayoutParams();
        if (ob6.a0) {
            layoutParams3.gravity = 5;
        }
        layoutParams3.width = -1;
        layoutParams3.height = hl.L(48.0f);
        o68Var.n3.setLayoutParams(layoutParams3);
        int b5 = actionBarPopupWindow$ActionBarPopupWindowLayout.b((ActionBarPopupWindow$ActionBarPopupWindowLayout) o68Var.m3.b);
        b8 b8Var2 = o68Var.n3;
        b8Var2.Q = new c68(actionBarPopupWindow$ActionBarPopupWindowLayout, b5, (byte) 0);
        b8Var2.setOnClickListener(new d68(this, (byte) 2));
        actionBarPopupWindow$ActionBarPopupWindowLayout.c = true;
        if (z) {
            k8 k8Var = new k8(aob.H8, x53Var, o68Var.getContext());
            k8Var.setTag(R.id.fit_width_tag, 1);
            actionBarPopupWindow$ActionBarPopupWindowLayout.a(k8Var, tre.o(-1, 8));
        }
    }

    public final void s(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, TL_stories.StoryItem storyItem) {
        TLRPC.Chat M0;
        o68 o68Var = this.x;
        if (!o68Var.n1 || storyItem == null || (storyItem.media instanceof TLRPC.TL_messageMediaVideoStream) || (M0 = uc7.s1(o68Var.m2).M0(Long.valueOf(-o68Var.l1))) == null) {
            return;
        }
        TLRPC.ChatFull N0 = uc7.s1(o68Var.m2).N0(M0.id);
        if (N0 == null) {
            N0 = jf7.Y(o68Var.m2).C0(M0.id, true, new CountDownLatch(1), false, false, 0);
        }
        if (N0 == null || !N0.can_view_stats) {
            return;
        }
        s7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_stats, ob6.M0(2131743194, null), false, this.d).setOnClickListener(new cg((Object) this, (Object) storyItem, (Object) this.e, (Object) M0, (byte) 13));
    }
}
