// default package

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.Locale;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class je2 extends q59 {
    public final Context c;
    public boolean d;
    public final /* synthetic */ ke2 e;

    public je2(ke2 ke2Var, Context context) {
        this.e = ke2Var;
        if (ke2Var.E == 2) {
            C(true);
        }
        this.c = context;
    }

    @Override // q59
    public final boolean D(u69 u69Var) {
        TLRPC.Chat chat;
        int i = u69Var.f;
        ke2 ke2Var = this.e;
        TLRPC.TL_chatBannedRights tL_chatBannedRights = ke2Var.Q;
        int i2 = ke2Var.E;
        TLRPC.TL_chatAdminRights tL_chatAdminRights = ke2Var.O;
        if (!ke2Var.x.creator || ((i2 != 0 && (i2 != 2 || !ke2Var.L)) || i != 4 || u69Var.b() != ke2Var.f0)) {
            if (!ke2Var.J) {
                return false;
            }
            if ((i2 == 0 || i2 == 2) && i == 4) {
                int b = u69Var.b();
                if (b == ke2Var.X) {
                    if (!tL_chatAdminRights.add_admins && ((chat = ke2Var.x) == null || !chat.creator)) {
                        return false;
                    }
                } else {
                    if (i2 == 2 && !ke2Var.L) {
                        return false;
                    }
                    if (b == ke2Var.Y) {
                        if (!tL_chatAdminRights.change_info) {
                            return false;
                        }
                        if (tL_chatBannedRights != null && !tL_chatBannedRights.change_info && !ke2Var.F) {
                            return false;
                        }
                    } else {
                        if (b == ke2Var.Z) {
                            return tL_chatAdminRights.post_messages;
                        }
                        if (b == ke2Var.a0) {
                            return tL_chatAdminRights.manage_direct_messages;
                        }
                        if (b == ke2Var.b0) {
                            return tL_chatAdminRights.manage_welcome_messages;
                        }
                        if (b == ke2Var.c0) {
                            return tL_chatAdminRights.edit_messages;
                        }
                        if (b == ke2Var.d0) {
                            return tL_chatAdminRights.delete_messages;
                        }
                        if (b == ke2Var.L0) {
                            return tL_chatAdminRights.manage_call;
                        }
                        if (b == ke2Var.e0) {
                            return tL_chatAdminRights.add_admins;
                        }
                        if (b == ke2Var.f0) {
                            return tL_chatAdminRights.anonymous;
                        }
                        if (b == ke2Var.g0) {
                            return tL_chatAdminRights.ban_users;
                        }
                        if (b == ke2Var.h0) {
                            return tL_chatAdminRights.invite_users;
                        }
                        if (b == ke2Var.i0) {
                            if (!tL_chatAdminRights.pin_messages) {
                                return false;
                            }
                            if (tL_chatBannedRights != null && !tL_chatBannedRights.pin_messages) {
                                return false;
                            }
                        } else {
                            if (b == ke2Var.j0) {
                                return tL_chatAdminRights.manage_ranks;
                            }
                            if (b == ke2Var.n0) {
                                return tL_chatAdminRights.manage_topics;
                            }
                            if (b == ke2Var.V0) {
                                return tL_chatAdminRights.post_stories;
                            }
                            if (b == ke2Var.W0) {
                                return tL_chatAdminRights.edit_stories;
                            }
                            if (b == ke2Var.X0) {
                                return tL_chatAdminRights.delete_stories;
                            }
                            if (b == ke2Var.o0) {
                                return tL_chatAdminRights.manage_linked_peers;
                            }
                        }
                    }
                }
            }
            if (i == 3 || i == 1 || i == 5 || i == 8 || i == 11) {
                return false;
            }
        }
        return true;
    }

    @Override // y59
    public final int b() {
        return this.e.W;
    }

    @Override // y59
    public final long c(int i) {
        ke2 ke2Var = this.e;
        if (ke2Var.E != 2) {
            return -1L;
        }
        if (i == ke2Var.X) {
            return 1L;
        }
        if (i == ke2Var.Y) {
            return 2L;
        }
        if (i == ke2Var.Z) {
            return 3L;
        }
        if (i == ke2Var.c0) {
            return 4L;
        }
        if (i == ke2Var.d0) {
            return 5L;
        }
        if (i == ke2Var.e0) {
            return 6L;
        }
        if (i == ke2Var.f0) {
            return 7L;
        }
        if (i == ke2Var.g0) {
            return 8L;
        }
        if (i == ke2Var.h0) {
            return 9L;
        }
        if (i == ke2Var.i0) {
            return 10L;
        }
        if (i == ke2Var.p0) {
            return 11L;
        }
        if (i == ke2Var.q0) {
            return 12L;
        }
        if (i == ke2Var.r0) {
            return 13L;
        }
        if (i == ke2Var.s0) {
            return 14L;
        }
        if (i == ke2Var.t0) {
            return 15L;
        }
        if (i == ke2Var.u0) {
            return 16L;
        }
        if (i == ke2Var.v0) {
            return 17L;
        }
        if (i == ke2Var.w0) {
            return 18L;
        }
        if (i == ke2Var.x0) {
            return 19L;
        }
        if (i == ke2Var.z0) {
            return 20L;
        }
        if (i == ke2Var.C0) {
            return 21L;
        }
        if (i == ke2Var.I0) {
            return 22L;
        }
        if (i == ke2Var.J0) {
            return 23L;
        }
        if (i == ke2Var.K0) {
            return 24L;
        }
        if (i == ke2Var.L0) {
            return 25L;
        }
        if (i == ke2Var.M0) {
            return 26L;
        }
        if (i == ke2Var.N0) {
            return 27L;
        }
        if (i == ke2Var.y0) {
            return 28L;
        }
        if (i == ke2Var.n0) {
            return 29L;
        }
        if (i == ke2Var.D0) {
            return 30L;
        }
        if (i == ke2Var.F0) {
            return 31L;
        }
        if (i == ke2Var.E0) {
            return 32L;
        }
        if (i == ke2Var.G0) {
            return 33L;
        }
        if (i == ke2Var.H0) {
            return 34L;
        }
        if (i == ke2Var.A0) {
            return 35L;
        }
        if (i == ke2Var.O0) {
            return 36L;
        }
        if (i == ke2Var.Q0) {
            return 37L;
        }
        if (i == ke2Var.R0) {
            return 38L;
        }
        if (i == ke2Var.S0) {
            return 39L;
        }
        if (i == ke2Var.T0) {
            return 40L;
        }
        if (i == ke2Var.V0) {
            return 41L;
        }
        if (i == ke2Var.W0) {
            return 42L;
        }
        if (i == ke2Var.X0) {
            return 43L;
        }
        if (i == ke2Var.a0) {
            return 44L;
        }
        if (i == ke2Var.j0) {
            return 45L;
        }
        if (i == ke2Var.k0) {
            return 46L;
        }
        if (i == ke2Var.l0) {
            return 47L;
        }
        if (i == ke2Var.m0) {
            return 48L;
        }
        if (i == ke2Var.o0) {
            return 49L;
        }
        return i == ke2Var.b0 ? 50L : 0L;
    }

    @Override // y59
    public final int d(int i) {
        ke2 ke2Var = this.e;
        if (i == ke2Var.I0 || i == ke2Var.K0 || i == ke2Var.J0 || i == ke2Var.C0 || i == ke2Var.D0 || i == ke2Var.F0 || i == ke2Var.E0 || i == ke2Var.H0 || i == ke2Var.G0 || i == ke2Var.k0 || i == ke2Var.Q0 || i == ke2Var.R0 || i == ke2Var.S0 || i == ke2Var.V0 || i == ke2Var.W0 || i == ke2Var.X0) {
            return 10;
        }
        if (i == ke2Var.A0 || i == ke2Var.O0 || i == ke2Var.T0) {
            return 9;
        }
        if (i == 0) {
            return 0;
        }
        if (i == 1 || i == ke2Var.p0 || i == ke2Var.r0 || i == ke2Var.M0 || i == ke2Var.t0) {
            return 5;
        }
        if (i == 2 || i == ke2Var.v0) {
            return 3;
        }
        if (i == ke2Var.Y || i == ke2Var.Z || i == ke2Var.a0 || i == ke2Var.c0 || i == ke2Var.d0 || i == ke2Var.e0 || i == ke2Var.g0 || i == ke2Var.h0 || i == ke2Var.i0 || i == ke2Var.j0 || i == ke2Var.z0 || i == ke2Var.f0 || i == ke2Var.L0 || i == ke2Var.X || i == ke2Var.n0 || i == ke2Var.l0 || i == ke2Var.o0 || i == ke2Var.b0) {
            return 4;
        }
        if (i == ke2Var.s0 || i == ke2Var.x0 || i == ke2Var.m0) {
            return 1;
        }
        if (i == ke2Var.N0) {
            return 6;
        }
        if (i == ke2Var.w0) {
            return 11;
        }
        return i == ke2Var.y0 ? 8 : 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:286:0x08ff  */
    /* JADX WARN: Removed duplicated region for block: B:563:0x06b2  */
    /* JADX WARN: Type inference failed for: r4v118, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v124, types: [boolean, int] */
    @Override // y59
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(u69 u69Var, int i) {
        int i2;
        boolean z;
        ke2 ke2Var = this.e;
        boolean z2 = ke2Var.V;
        boolean z3 = ke2Var.G;
        boolean z4 = ke2Var.F;
        TLRPC.User user = ke2Var.w;
        TLRPC.TL_chatAdminRights tL_chatAdminRights = ke2Var.O;
        int i3 = ke2Var.E;
        TLRPC.TL_chatAdminRights tL_chatAdminRights2 = ke2Var.N;
        TLRPC.TL_chatBannedRights tL_chatBannedRights = ke2Var.Q;
        int i4 = u69Var.f;
        View view = u69Var.a;
        switch (i4) {
            case 0:
                ((v8c) view).a(i3 == 2 ? jb6.L0(2131753121) : null, user);
                break;
            case 1:
                njb njbVar = (njb) view;
                if (i != ke2Var.m0) {
                    if (i != ke2Var.s0) {
                        if (i == ke2Var.x0) {
                            njbVar.setText(i3 == 0 ? jb6.Z(2131751243, (m9c.D(user) && ke2Var.x.creator) ? jb6.L0(2131752369) : jb6.L0(2131752467)) : jb6.Z(2131751213, m9c.r(user)));
                            break;
                        }
                    } else {
                        njbVar.setText(jb6.L0(2131751262));
                        break;
                    }
                } else {
                    njbVar.setText(jb6.L0(2131751246));
                    break;
                }
                break;
            case 2:
                vkb vkbVar = (vkb) view;
                if (i != ke2Var.q0) {
                    if (i == ke2Var.u0) {
                        TextView textView = vkbVar.getTextView();
                        int i5 = cmb.F6;
                        anb.X(textView, i5, null);
                        vkbVar.setTag(Integer.valueOf(i5));
                        if (!z4) {
                            vkbVar.b(jb6.L0(2131751252), false);
                            break;
                        } else {
                            vkbVar.b(jb6.L0(2131751259), false);
                            break;
                        }
                    }
                } else {
                    TextView textView2 = vkbVar.getTextView();
                    int i6 = cmb.o7;
                    anb.X(textView2, i6, null);
                    vkbVar.setTag(Integer.valueOf(i6));
                    if (i3 != 0) {
                        if (i3 == 1) {
                            vkbVar.b(jb6.L0(2131743411), false);
                            break;
                        }
                    } else {
                        vkbVar.b(jb6.L0(2131751242), false);
                        break;
                    }
                }
                break;
            case 3:
                jf5 jf5Var = (jf5) view;
                if (i != 2) {
                    if (i == ke2Var.v0) {
                        jf5Var.setText(jb6.L0(2131751244));
                        break;
                    }
                } else if (i3 != 2 && (user == null || !user.bot)) {
                    if (i3 != 0) {
                        if (i3 == 1) {
                            jf5Var.setText(jb6.L0(2131743410));
                            break;
                        }
                    } else {
                        jf5Var.setText(jb6.L0(2131751226));
                        break;
                    }
                } else {
                    jf5Var.setText(jb6.L0(2131752942));
                    break;
                }
                break;
            case 4:
            case 9:
                final ajb ajbVar = (ajb) view;
                boolean z5 = i3 != 2 || ke2Var.L;
                TLRPC.Chat chat = ke2Var.x;
                boolean z6 = chat != null && chat.creator;
                if (i == ke2Var.A0) {
                    TLRPC.TL_chatBannedRights tL_chatBannedRights2 = ke2Var.P;
                    int i7 = (tL_chatBannedRights2.send_photos || tL_chatBannedRights.send_photos) ? 0 : 1;
                    if (!tL_chatBannedRights2.send_videos && !tL_chatBannedRights.send_videos) {
                        i7++;
                    }
                    if (!tL_chatBannedRights2.send_stickers && !tL_chatBannedRights.send_stickers) {
                        i7++;
                    }
                    if (!tL_chatBannedRights2.send_audios && !tL_chatBannedRights.send_audios) {
                        i7++;
                    }
                    if (!tL_chatBannedRights2.send_docs && !tL_chatBannedRights.send_docs) {
                        i7++;
                    }
                    if (!tL_chatBannedRights2.send_voices && !tL_chatBannedRights.send_voices) {
                        i7++;
                    }
                    if (!tL_chatBannedRights2.send_roundvideos && !tL_chatBannedRights.send_roundvideos) {
                        i7++;
                    }
                    if (!tL_chatBannedRights2.embed_links && !tL_chatBannedRights.embed_links && !tL_chatBannedRights2.send_plain && !tL_chatBannedRights.send_plain) {
                        i7++;
                    }
                    if (!tL_chatBannedRights2.send_polls && !tL_chatBannedRights.send_polls) {
                        i7++;
                    }
                    if (!tL_chatBannedRights2.send_reactions && !tL_chatBannedRights.send_reactions) {
                        i7++;
                    }
                    ajbVar.d(jb6.M0(2131743377, null), i7 > 0, true, true);
                    Locale locale = Locale.US;
                    final byte b = 0;
                    ajbVar.a(new Runnable(this) { // from class: ie2
                        public final /* synthetic */ je2 b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            byte b2 = b;
                            ajb ajbVar2 = ajbVar;
                            je2 je2Var = this.b;
                            switch (b2) {
                                case 0:
                                    ke2 ke2Var2 = je2Var.e;
                                    if (ajbVar2.isEnabled()) {
                                        if (!ke2Var2.b0()) {
                                            boolean z7 = ajbVar2.d.h;
                                            ajbVar2.setChecked(!z7);
                                            TLRPC.TL_chatBannedRights tL_chatBannedRights3 = ke2Var2.P;
                                            tL_chatBannedRights3.send_media = z7;
                                            tL_chatBannedRights3.send_photos = z7;
                                            tL_chatBannedRights3.send_videos = z7;
                                            tL_chatBannedRights3.send_stickers = z7;
                                            tL_chatBannedRights3.send_gifs = z7;
                                            tL_chatBannedRights3.send_games = z7;
                                            tL_chatBannedRights3.send_inline = z7;
                                            tL_chatBannedRights3.send_audios = z7;
                                            tL_chatBannedRights3.send_docs = z7;
                                            tL_chatBannedRights3.send_voices = z7;
                                            tL_chatBannedRights3.send_roundvideos = z7;
                                            tL_chatBannedRights3.embed_links = z7;
                                            tL_chatBannedRights3.send_polls = z7;
                                            tL_chatBannedRights3.send_reactions = z7;
                                            gm.V3(ke2Var2.b);
                                            break;
                                        } else {
                                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ke2Var2.getParentActivity());
                                            String M0 = jb6.M0(2131743406, null);
                                            he heVar = alertDialog$Builder.a;
                                            heVar.S = M0;
                                            heVar.U = jb6.M0(2131743404, null);
                                            alertDialog$Builder.j(jb6.M0(2131747564, null), null);
                                            heVar.show();
                                            break;
                                        }
                                    }
                                    break;
                                case 1:
                                    if (ajbVar2.isEnabled()) {
                                        boolean z8 = ajbVar2.d.h;
                                        ajbVar2.setChecked(z8);
                                        ke2 ke2Var3 = je2Var.e;
                                        TLRPC.TL_chatAdminRights tL_chatAdminRights3 = ke2Var3.N;
                                        boolean z9 = !z8;
                                        tL_chatAdminRights3.post_messages = z9;
                                        tL_chatAdminRights3.edit_messages = z9;
                                        tL_chatAdminRights3.delete_messages = z9;
                                        gm.V3(ke2Var3.b);
                                        break;
                                    }
                                    break;
                                default:
                                    if (ajbVar2.isEnabled()) {
                                        boolean z10 = ajbVar2.d.h;
                                        ajbVar2.setChecked(z10);
                                        ke2 ke2Var4 = je2Var.e;
                                        TLRPC.TL_chatAdminRights tL_chatAdminRights4 = ke2Var4.N;
                                        boolean z11 = !z10;
                                        tL_chatAdminRights4.post_stories = z11;
                                        tL_chatAdminRights4.edit_stories = z11;
                                        tL_chatAdminRights4.delete_stories = z11;
                                        gm.V3(ke2Var4.b);
                                        break;
                                    }
                                    break;
                            }
                        }
                    }, aq1.n(i7, "/10"), !ke2Var.B0);
                    ajbVar.setIcon(ke2Var.b0() ? R.drawable.permission_locked : 0);
                } else if (i == ke2Var.O0) {
                    ?? r4 = tL_chatAdminRights2.post_messages;
                    int i8 = r4;
                    if (tL_chatAdminRights2.edit_messages) {
                        i8 = r4 + 1;
                    }
                    int i9 = i8;
                    if (tL_chatAdminRights2.delete_messages) {
                        i9 = i8 + 1;
                    }
                    ajbVar.d(jb6.M0(2131752326, null), i9 > 0, true, true);
                    Locale locale2 = Locale.US;
                    final byte b2 = 1;
                    ajbVar.a(new Runnable(this) { // from class: ie2
                        public final /* synthetic */ je2 b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            byte b22 = b2;
                            ajb ajbVar2 = ajbVar;
                            je2 je2Var = this.b;
                            switch (b22) {
                                case 0:
                                    ke2 ke2Var2 = je2Var.e;
                                    if (ajbVar2.isEnabled()) {
                                        if (!ke2Var2.b0()) {
                                            boolean z7 = ajbVar2.d.h;
                                            ajbVar2.setChecked(!z7);
                                            TLRPC.TL_chatBannedRights tL_chatBannedRights3 = ke2Var2.P;
                                            tL_chatBannedRights3.send_media = z7;
                                            tL_chatBannedRights3.send_photos = z7;
                                            tL_chatBannedRights3.send_videos = z7;
                                            tL_chatBannedRights3.send_stickers = z7;
                                            tL_chatBannedRights3.send_gifs = z7;
                                            tL_chatBannedRights3.send_games = z7;
                                            tL_chatBannedRights3.send_inline = z7;
                                            tL_chatBannedRights3.send_audios = z7;
                                            tL_chatBannedRights3.send_docs = z7;
                                            tL_chatBannedRights3.send_voices = z7;
                                            tL_chatBannedRights3.send_roundvideos = z7;
                                            tL_chatBannedRights3.embed_links = z7;
                                            tL_chatBannedRights3.send_polls = z7;
                                            tL_chatBannedRights3.send_reactions = z7;
                                            gm.V3(ke2Var2.b);
                                            break;
                                        } else {
                                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ke2Var2.getParentActivity());
                                            String M0 = jb6.M0(2131743406, null);
                                            he heVar = alertDialog$Builder.a;
                                            heVar.S = M0;
                                            heVar.U = jb6.M0(2131743404, null);
                                            alertDialog$Builder.j(jb6.M0(2131747564, null), null);
                                            heVar.show();
                                            break;
                                        }
                                    }
                                    break;
                                case 1:
                                    if (ajbVar2.isEnabled()) {
                                        boolean z8 = ajbVar2.d.h;
                                        ajbVar2.setChecked(z8);
                                        ke2 ke2Var3 = je2Var.e;
                                        TLRPC.TL_chatAdminRights tL_chatAdminRights3 = ke2Var3.N;
                                        boolean z9 = !z8;
                                        tL_chatAdminRights3.post_messages = z9;
                                        tL_chatAdminRights3.edit_messages = z9;
                                        tL_chatAdminRights3.delete_messages = z9;
                                        gm.V3(ke2Var3.b);
                                        break;
                                    }
                                    break;
                                default:
                                    if (ajbVar2.isEnabled()) {
                                        boolean z10 = ajbVar2.d.h;
                                        ajbVar2.setChecked(z10);
                                        ke2 ke2Var4 = je2Var.e;
                                        TLRPC.TL_chatAdminRights tL_chatAdminRights4 = ke2Var4.N;
                                        boolean z11 = !z10;
                                        tL_chatAdminRights4.post_stories = z11;
                                        tL_chatAdminRights4.edit_stories = z11;
                                        tL_chatAdminRights4.delete_stories = z11;
                                        gm.V3(ke2Var4.b);
                                        break;
                                    }
                                    break;
                            }
                        }
                    }, aq1.n(i9, "/3"), !ke2Var.P0);
                } else if (i == ke2Var.T0) {
                    ?? r42 = tL_chatAdminRights2.post_stories;
                    int i10 = r42;
                    if (tL_chatAdminRights2.edit_stories) {
                        i10 = r42 + 1;
                    }
                    int i11 = i10;
                    if (tL_chatAdminRights2.delete_stories) {
                        i11 = i10 + 1;
                    }
                    ajbVar.d(jb6.L0(2131752325), i11 > 0, true, true);
                    Locale locale3 = Locale.US;
                    final byte b3 = 2;
                    ajbVar.a(new Runnable(this) { // from class: ie2
                        public final /* synthetic */ je2 b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            byte b22 = b3;
                            ajb ajbVar2 = ajbVar;
                            je2 je2Var = this.b;
                            switch (b22) {
                                case 0:
                                    ke2 ke2Var2 = je2Var.e;
                                    if (ajbVar2.isEnabled()) {
                                        if (!ke2Var2.b0()) {
                                            boolean z7 = ajbVar2.d.h;
                                            ajbVar2.setChecked(!z7);
                                            TLRPC.TL_chatBannedRights tL_chatBannedRights3 = ke2Var2.P;
                                            tL_chatBannedRights3.send_media = z7;
                                            tL_chatBannedRights3.send_photos = z7;
                                            tL_chatBannedRights3.send_videos = z7;
                                            tL_chatBannedRights3.send_stickers = z7;
                                            tL_chatBannedRights3.send_gifs = z7;
                                            tL_chatBannedRights3.send_games = z7;
                                            tL_chatBannedRights3.send_inline = z7;
                                            tL_chatBannedRights3.send_audios = z7;
                                            tL_chatBannedRights3.send_docs = z7;
                                            tL_chatBannedRights3.send_voices = z7;
                                            tL_chatBannedRights3.send_roundvideos = z7;
                                            tL_chatBannedRights3.embed_links = z7;
                                            tL_chatBannedRights3.send_polls = z7;
                                            tL_chatBannedRights3.send_reactions = z7;
                                            gm.V3(ke2Var2.b);
                                            break;
                                        } else {
                                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ke2Var2.getParentActivity());
                                            String M0 = jb6.M0(2131743406, null);
                                            he heVar = alertDialog$Builder.a;
                                            heVar.S = M0;
                                            heVar.U = jb6.M0(2131743404, null);
                                            alertDialog$Builder.j(jb6.M0(2131747564, null), null);
                                            heVar.show();
                                            break;
                                        }
                                    }
                                    break;
                                case 1:
                                    if (ajbVar2.isEnabled()) {
                                        boolean z8 = ajbVar2.d.h;
                                        ajbVar2.setChecked(z8);
                                        ke2 ke2Var3 = je2Var.e;
                                        TLRPC.TL_chatAdminRights tL_chatAdminRights3 = ke2Var3.N;
                                        boolean z9 = !z8;
                                        tL_chatAdminRights3.post_messages = z9;
                                        tL_chatAdminRights3.edit_messages = z9;
                                        tL_chatAdminRights3.delete_messages = z9;
                                        gm.V3(ke2Var3.b);
                                        break;
                                    }
                                    break;
                                default:
                                    if (ajbVar2.isEnabled()) {
                                        boolean z10 = ajbVar2.d.h;
                                        ajbVar2.setChecked(z10);
                                        ke2 ke2Var4 = je2Var.e;
                                        TLRPC.TL_chatAdminRights tL_chatAdminRights4 = ke2Var4.N;
                                        boolean z11 = !z10;
                                        tL_chatAdminRights4.post_stories = z11;
                                        tL_chatAdminRights4.edit_stories = z11;
                                        tL_chatAdminRights4.delete_stories = z11;
                                        gm.V3(ke2Var4.b);
                                        break;
                                    }
                                    break;
                            }
                        }
                    }, aq1.n(i11, "/3"), !ke2Var.U0);
                } else if (i == ke2Var.X) {
                    ajbVar.c(jb6.L0(2131748453), ke2Var.L, true);
                    ajbVar.setIcon((tL_chatAdminRights.add_admins || z6) ? 0 : R.drawable.permission_locked);
                } else if (i == ke2Var.Y) {
                    if (i3 == 0 || i3 == 2) {
                        if (z3) {
                            ajbVar.c(jb6.L0(2131751904), z5 && tL_chatAdminRights2.change_info, true);
                        } else if (z4) {
                            ajbVar.c(jb6.L0(2131751261), z5 && tL_chatAdminRights2.change_info, true);
                        } else {
                            ajbVar.c(jb6.L0(2131751260), (z5 && tL_chatAdminRights2.change_info) || !tL_chatBannedRights.change_info, true);
                        }
                        i2 = 2;
                        if (i3 == 2) {
                            ajbVar.setIcon((tL_chatAdminRights.change_info || z6) ? 0 : R.drawable.permission_locked);
                        }
                        if (i3 == i2 && i == ke2Var.z0) {
                            ajbVar.setEnabled((ke2Var.P.view_messages || tL_chatBannedRights.view_messages) ? false : true);
                            break;
                        }
                    } else if (i3 == 1) {
                        ajbVar.c(jb6.L0(z3 ? 2131751904 : 2131743403), (ke2Var.P.change_info || tL_chatBannedRights.change_info) ? false : true, ke2Var.n0 != -1);
                        ajbVar.setIcon(tL_chatBannedRights.change_info ? R.drawable.permission_locked : 0);
                    }
                } else if (i == ke2Var.Z) {
                    ajbVar.c(jb6.L0(2131751249), z5 && tL_chatAdminRights2.post_messages, true);
                    i2 = 2;
                    if (i3 == 2) {
                        ajbVar.setIcon((tL_chatAdminRights.post_messages || z6) ? 0 : R.drawable.permission_locked);
                    }
                    if (i3 == i2) {
                    }
                } else if (i == ke2Var.b0) {
                    if (m9c.v(user)) {
                        ajbVar.c(jb6.L0(z4 ? 2131751264 : 2131751263), z5 && tL_chatAdminRights2.manage_welcome_messages, true);
                    } else {
                        ajbVar.c(jb6.L0(2131751227), z5 && tL_chatAdminRights2.manage_welcome_messages, true);
                    }
                    i2 = 2;
                    if (i3 == 2) {
                        ajbVar.setIcon((tL_chatAdminRights.manage_welcome_messages || z6) ? 0 : R.drawable.permission_locked);
                    }
                    if (i3 == i2) {
                    }
                } else if (i == ke2Var.a0) {
                    ajbVar.c(jb6.L0(2131751251), z5 && tL_chatAdminRights2.manage_direct_messages, true);
                    i2 = 2;
                    if (i3 == 2) {
                        ajbVar.setIcon((tL_chatAdminRights.manage_direct_messages || z6) ? 0 : R.drawable.permission_locked);
                    }
                    if (i3 == i2) {
                    }
                } else if (i == ke2Var.c0) {
                    ajbVar.c(jb6.L0(2131751256), z5 && tL_chatAdminRights2.edit_messages, true);
                    i2 = 2;
                    if (i3 == 2) {
                        ajbVar.setIcon((tL_chatAdminRights.edit_messages || z6) ? 0 : R.drawable.permission_locked);
                    }
                    if (i3 == i2) {
                    }
                } else if (i == ke2Var.d0) {
                    if (z4) {
                        ajbVar.c(jb6.L0(2131751258), z5 && tL_chatAdminRights2.delete_messages, true);
                    } else {
                        ajbVar.c(jb6.L0(2131751253), z5 && tL_chatAdminRights2.delete_messages, true);
                    }
                    i2 = 2;
                    if (i3 == 2) {
                        ajbVar.setIcon((tL_chatAdminRights.delete_messages || z6) ? 0 : R.drawable.permission_locked);
                    }
                    if (i3 == i2) {
                    }
                } else if (i == ke2Var.e0) {
                    ajbVar.c(jb6.L0(2131751268), z5 && tL_chatAdminRights2.add_admins, (ke2Var.g0 != -1 && z4) || ke2Var.f0 != -1);
                    i2 = 2;
                    if (i3 == 2) {
                        ajbVar.setIcon((tL_chatAdminRights.add_admins || z6) ? 0 : R.drawable.permission_locked);
                    }
                    if (i3 == i2) {
                    }
                } else if (i == ke2Var.f0) {
                    ajbVar.c(jb6.L0(2131751240), z5 && tL_chatAdminRights2.anonymous, ke2Var.n0 != -1 || z2);
                    i2 = 2;
                    if (i3 == 2) {
                        ajbVar.setIcon((tL_chatAdminRights.anonymous || z6) ? 0 : R.drawable.permission_locked);
                    }
                    if (i3 == i2) {
                    }
                } else if (i == ke2Var.l0) {
                    String L0 = jb6.L0(2131751247);
                    TLRPC.ChatFull chatFull = ke2Var.y;
                    if (chatFull != null && user != null) {
                        if ((ke2Var.r ? ke2Var.n : chatFull.guard_bot_id) == user.id) {
                            z = true;
                            ajbVar.c(L0, z, false);
                            i2 = 2;
                            if (i3 == 2) {
                                ajbVar.setIcon(0);
                            }
                            if (i3 == i2) {
                            }
                        }
                    }
                    z = false;
                    ajbVar.c(L0, z, false);
                    i2 = 2;
                    if (i3 == 2) {
                    }
                    if (i3 == i2) {
                    }
                } else if (i == ke2Var.g0) {
                    ajbVar.c(jb6.L0(z3 ? 2131751905 : 2131751265), z5 && tL_chatAdminRights2.ban_users, !z3);
                    i2 = 2;
                    if (i3 == 2) {
                        ajbVar.setIcon((tL_chatAdminRights.ban_users || z6) ? 0 : R.drawable.permission_locked);
                    }
                    if (i3 == i2) {
                    }
                } else if (i == ke2Var.o0) {
                    ajbVar.c(jb6.L0(2131751903), z5 && tL_chatAdminRights2.manage_linked_peers, true);
                    i2 = 2;
                    if (i3 == 2) {
                        ajbVar.setIcon((tL_chatAdminRights.manage_linked_peers || z6) ? 0 : R.drawable.permission_locked);
                    }
                    if (i3 == i2) {
                    }
                } else if (i == ke2Var.L0) {
                    ajbVar.c(jb6.L0(2131744590), z5 && tL_chatAdminRights2.manage_call, true);
                    i2 = 2;
                    if (i3 == 2) {
                        ajbVar.setIcon((tL_chatAdminRights.manage_call || z6) ? 0 : R.drawable.permission_locked);
                    }
                    if (i3 == i2) {
                    }
                } else if (i == ke2Var.n0) {
                    if (i3 == 0) {
                        ajbVar.c(jb6.L0(2131748449), z5 && tL_chatAdminRights2.manage_topics, z2);
                    } else if (i3 == 1) {
                        ajbVar.c(jb6.L0(2131751637), (ke2Var.P.manage_topics || tL_chatBannedRights.manage_topics) ? false : true, z2);
                        ajbVar.setIcon(tL_chatBannedRights.manage_topics ? R.drawable.permission_locked : 0);
                    } else {
                        i2 = 2;
                        if (i3 == 2) {
                            ajbVar.c(jb6.L0(2131748449), z5 && tL_chatAdminRights2.manage_topics, z2);
                            ajbVar.setIcon((tL_chatAdminRights.manage_topics || z6) ? 0 : R.drawable.permission_locked);
                        }
                        if (i3 == i2) {
                        }
                    }
                } else if (i == ke2Var.h0) {
                    if (i3 == 0) {
                        if (sd2.P(3, chat)) {
                            ajbVar.c(jb6.L0(2131751267), tL_chatAdminRights2.invite_users, true);
                        } else {
                            ajbVar.c(jb6.L0(2131751266), tL_chatAdminRights2.invite_users, true);
                        }
                    } else if (i3 == 1) {
                        ajbVar.c(jb6.L0(2131743398), (ke2Var.P.invite_users || tL_chatBannedRights.invite_users) ? false : true, true);
                        ajbVar.setIcon(tL_chatBannedRights.invite_users ? R.drawable.permission_locked : 0);
                    } else {
                        i2 = 2;
                        if (i3 == 2) {
                            ajbVar.c(jb6.L0(2131751266), z5 && tL_chatAdminRights2.invite_users, true);
                            ajbVar.setIcon((tL_chatAdminRights.invite_users || z6) ? 0 : R.drawable.permission_locked);
                        }
                        if (i3 == i2) {
                        }
                    }
                } else if (i == ke2Var.i0) {
                    if (i3 == 0 || i3 == 2) {
                        ajbVar.c(jb6.L0(2131751250), (z5 && tL_chatAdminRights2.pin_messages) || !tL_chatBannedRights.pin_messages, true);
                        i2 = 2;
                        if (i3 == 2) {
                            ajbVar.setIcon((tL_chatAdminRights.pin_messages || z6) ? 0 : R.drawable.permission_locked);
                        }
                        if (i3 == i2) {
                        }
                    } else if (i3 == 1) {
                        ajbVar.c(jb6.L0(2131743379), (ke2Var.P.pin_messages || tL_chatBannedRights.pin_messages) ? false : true, true);
                        ajbVar.setIcon(tL_chatBannedRights.pin_messages ? R.drawable.permission_locked : 0);
                    }
                } else if (i == ke2Var.j0) {
                    if (i3 == 0 || i3 == 2) {
                        ajbVar.c(jb6.L0(2131751254), z5 && tL_chatAdminRights2.manage_ranks, true);
                        i2 = 2;
                        if (i3 == 2) {
                            ajbVar.setIcon((tL_chatAdminRights.manage_ranks || z6) ? 0 : R.drawable.permission_locked);
                        }
                        if (i3 == i2) {
                        }
                    } else if (i3 == 1) {
                        ajbVar.c(jb6.L0(2131743400), (ke2Var.P.edit_rank || tL_chatBannedRights.edit_rank) ? false : true, true);
                        ajbVar.setIcon(tL_chatBannedRights.edit_rank ? R.drawable.permission_locked : 0);
                    }
                } else if (i == ke2Var.z0) {
                    ajbVar.c(jb6.L0(2131743378), (ke2Var.P.send_plain || tL_chatBannedRights.send_plain) ? false : true, true);
                    ajbVar.setIcon(tL_chatBannedRights.send_plain ? R.drawable.permission_locked : 0);
                }
                i2 = 2;
                if (i3 == i2) {
                }
                break;
            case 5:
                bba bbaVar = (bba) view;
                if (i3 != 2 || (i != ke2Var.p0 && i != ke2Var.x0)) {
                    bbaVar.setAlpha(1.0f);
                    break;
                } else {
                    bbaVar.setAlpha(ke2Var.K);
                    break;
                }
                break;
            case 6:
                hjb hjbVar = (hjb) view;
                if (i == ke2Var.N0) {
                    int i12 = ke2Var.P.until_date;
                    hjbVar.c(jb6.M0(2131743401, null), (i12 == 0 || Math.abs(((long) i12) - (System.currentTimeMillis() / 1000)) > 315360000) ? jb6.M0(2131743371, null) : jb6.v(ke2Var.P.until_date), false);
                    break;
                }
                break;
            case 7:
                ng8 ng8Var = (ng8) view;
                String M0 = (m9c.D(user) && ke2Var.x.creator) ? jb6.M0(2131752369, null) : jb6.M0(2131752467, null);
                this.d = true;
                ng8Var.getTextView().setEnabled(ke2Var.J || ke2Var.x.creator);
                ng8Var.getTextView().setSingleLine(true);
                ng8Var.getTextView().setImeOptions(6);
                ng8Var.o(ke2Var.T, M0, false);
                this.d = false;
                break;
            case 10:
                oh2 oh2Var = (oh2) view;
                boolean z7 = oh2Var.getTag() != null && ((Integer) oh2Var.getTag()).intValue() == i;
                oh2Var.setTag(Integer.valueOf(i));
                if (i != ke2Var.I0) {
                    if (i != ke2Var.K0) {
                        if (i != ke2Var.J0) {
                            if (i != ke2Var.C0) {
                                if (i != ke2Var.D0) {
                                    if (i != ke2Var.k0) {
                                        if (i != ke2Var.E0) {
                                            if (i != ke2Var.F0) {
                                                if (i != ke2Var.G0) {
                                                    if (i != ke2Var.H0) {
                                                        if (i != ke2Var.Q0) {
                                                            if (i != ke2Var.R0) {
                                                                if (i != ke2Var.S0) {
                                                                    if (i != ke2Var.V0) {
                                                                        if (i != ke2Var.W0) {
                                                                            if (i == ke2Var.X0) {
                                                                                oh2Var.e(jb6.M0(2131751257, null), "", tL_chatAdminRights2.delete_stories, true, z7);
                                                                                break;
                                                                            }
                                                                        } else {
                                                                            oh2Var.e(jb6.M0(2131751255, null), "", tL_chatAdminRights2.edit_stories, true, z7);
                                                                            break;
                                                                        }
                                                                    } else {
                                                                        oh2Var.e(jb6.M0(2131751248, null), "", tL_chatAdminRights2.post_stories, true, z7);
                                                                        break;
                                                                    }
                                                                } else {
                                                                    oh2Var.e(jb6.M0(2131751258, null), "", tL_chatAdminRights2.delete_messages, true, z7);
                                                                    break;
                                                                }
                                                            } else {
                                                                oh2Var.e(jb6.M0(2131751256, null), "", tL_chatAdminRights2.edit_messages, true, z7);
                                                                break;
                                                            }
                                                        } else {
                                                            oh2Var.e(jb6.M0(2131751249, null), "", tL_chatAdminRights2.post_messages, true, z7);
                                                            break;
                                                        }
                                                    } else {
                                                        oh2Var.e(jb6.M0(2131745340, null), "", (ke2Var.P.send_roundvideos || tL_chatBannedRights.send_roundvideos) ? false : true, true, z7);
                                                        oh2Var.setIcon(tL_chatBannedRights.send_roundvideos ? R.drawable.permission_locked : 0);
                                                        break;
                                                    }
                                                } else {
                                                    oh2Var.e(jb6.M0(2131745337, null), "", (ke2Var.P.send_voices || tL_chatBannedRights.send_voices) ? false : true, true, z7);
                                                    oh2Var.setIcon(tL_chatBannedRights.send_voices ? R.drawable.permission_locked : 0);
                                                    break;
                                                }
                                            } else {
                                                oh2Var.e(jb6.M0(2131745343, null), "", (ke2Var.P.send_docs || tL_chatBannedRights.send_docs) ? false : true, true, z7);
                                                oh2Var.setIcon(tL_chatBannedRights.send_docs ? R.drawable.permission_locked : 0);
                                                break;
                                            }
                                        } else {
                                            oh2Var.e(jb6.M0(2131745342, null), "", (ke2Var.P.send_audios || tL_chatBannedRights.send_audios) ? false : true, true, z7);
                                            oh2Var.setIcon(tL_chatBannedRights.send_audios ? R.drawable.permission_locked : 0);
                                            break;
                                        }
                                    } else {
                                        oh2Var.e(jb6.M0(2131743374, null), "", (ke2Var.P.send_reactions || tL_chatBannedRights.send_reactions) ? false : true, true, false);
                                        oh2Var.setIcon(tL_chatBannedRights.send_reactions ? R.drawable.permission_locked : 0);
                                        break;
                                    }
                                } else {
                                    oh2Var.e(jb6.M0(2131745338, null), "", (ke2Var.P.send_videos || tL_chatBannedRights.send_videos) ? false : true, true, z7);
                                    oh2Var.setIcon(tL_chatBannedRights.send_videos ? R.drawable.permission_locked : 0);
                                    break;
                                }
                            } else {
                                oh2Var.e(jb6.M0(2131745341, null), "", (ke2Var.P.send_photos || tL_chatBannedRights.send_photos) ? false : true, true, z7);
                                oh2Var.setIcon(tL_chatBannedRights.send_photos ? R.drawable.permission_locked : 0);
                                break;
                            }
                        } else {
                            oh2Var.e(jb6.M0(2131745336, null), "", (ke2Var.P.send_polls || tL_chatBannedRights.send_polls) ? false : true, true, z7);
                            oh2Var.setIcon(tL_chatBannedRights.send_polls ? R.drawable.permission_locked : 0);
                            break;
                        }
                    } else {
                        String M02 = jb6.M0(2131743399, null);
                        TLRPC.TL_chatBannedRights tL_chatBannedRights3 = ke2Var.P;
                        oh2Var.e(M02, "", (tL_chatBannedRights3.embed_links || tL_chatBannedRights.embed_links || tL_chatBannedRights3.send_plain || tL_chatBannedRights.send_plain) ? false : true, true, z7);
                        oh2Var.setIcon(tL_chatBannedRights.embed_links ? R.drawable.permission_locked : 0);
                        break;
                    }
                } else {
                    oh2Var.e(jb6.M0(2131745339, null), "", (ke2Var.P.send_stickers || tL_chatBannedRights.send_stickers) ? false : true, true, z7);
                    oh2Var.setIcon(tL_chatBannedRights.send_stickers ? R.drawable.permission_locked : 0);
                    break;
                }
                break;
            case 11:
                ((xhb) view).a(ke2Var.w, ke2Var.T, i3 == 0, false, new mf2(this, (byte) 22));
                break;
        }
    }

    @Override // y59
    public final u69 x(ViewGroup viewGroup, int i) {
        View v8cVar;
        View jf5Var;
        int i2;
        ylb ylbVar;
        Context context = this.c;
        ke2 ke2Var = this.e;
        switch (i) {
            case 0:
                v8cVar = new v8c(context, null);
                anb.h(cmb.c6, null, v8cVar);
                break;
            case 1:
                v8cVar = new njb(context);
                break;
            case 2:
            default:
                v8cVar = new vkb(context);
                anb.h(cmb.c6, null, v8cVar);
                break;
            case 3:
                jf5Var = new jf5(this.c, cmb.K6, 21, 15, true, null);
                anb.h(cmb.c6, null, jf5Var);
                v8cVar = jf5Var;
                break;
            case 4:
            case 9:
                v8cVar = new ajb(context);
                anb.h(cmb.c6, null, v8cVar);
                break;
            case 5:
                v8cVar = new bba(context, (hg9) null);
                break;
            case 6:
                v8cVar = new hjb(null, context, false);
                anb.h(cmb.c6, null, v8cVar);
                break;
            case 7:
                ng8 ng8Var = new ng8(context, 0, null, null);
                anb.h(cmb.c6, null, ng8Var);
                ng8Var.c(new b7(this, (byte) 13));
                v8cVar = ng8Var;
                break;
            case 8:
                FrameLayout frameLayout = new FrameLayout(context);
                ke2Var.d = frameLayout;
                int i3 = cmb.Z6;
                anb.h(i3, null, frameLayout);
                ke2Var.e = new FrameLayout(context);
                io ioVar = new io(context, true, false, false);
                ke2Var.f = ioVar;
                ioVar.setTypeface(gm.o());
                ke2Var.f.setTextColor(-1);
                ke2Var.f.setTextSize(gm.L(14.0f));
                ke2Var.f.setGravity(17);
                io ioVar2 = ke2Var.f;
                StringBuilder sb = new StringBuilder(jb6.M0(2131754456, null));
                sb.append(" ");
                sb.append(jb6.M0(ke2Var.L ? 2131754455 : 2131754454, null));
                ioVar2.setText(sb.toString());
                ke2Var.e.addView(ke2Var.f, qoe.e(-2, -2, 17));
                ke2Var.e.setBackground(ulb.f(cmb.Ei, 4.0f));
                ke2Var.e.setOnClickListener(new k81(this, (byte) 15));
                ke2Var.d.addView(ke2Var.e, qoe.d(-1, 48.0f, nm7.D1, 14.0f, 28.0f, 14.0f, 14.0f));
                ke2Var.d.setLayoutParams(new g69(-1, -2));
                View view = new View(context);
                anb.h(i3, null, view);
                ke2Var.d.setClipChildren(false);
                ke2Var.d.setClipToPadding(false);
                ke2Var.d.addView(view, qoe.d(-1, 800.0f, 87, 0.0f, 0.0f, 0.0f, -800.0f));
                v8cVar = ke2Var.d;
                break;
            case 10:
                oh2 oh2Var = new oh2(this.c, 4, 21, false, ke2Var.getResourceProvider());
                oh2Var.setPad(1);
                oh2Var.getCheckBoxRound().setDrawBackgroundAsArc(14);
                oh2Var.getCheckBoxRound().b(cmb.U6, cmb.f7, cmb.j7);
                oh2Var.setEnabled(true);
                anb.h(cmb.c6, null, oh2Var);
                v8cVar = oh2Var;
                break;
            case 11:
                i2 = ((d) ke2Var).currentAccount;
                long j = -ke2Var.s;
                ylbVar = ((d) ke2Var).resourceProvider;
                jf5Var = new xhb(i2, j, ylbVar, this.c);
                v8cVar = jf5Var;
                break;
        }
        return new b59(v8cVar);
    }

    @Override // y59
    public final void y(u69 u69Var) {
        int b = u69Var.b();
        ke2 ke2Var = this.e;
        if (b == ke2Var.v0) {
            ke2Var.r0(u69Var.a);
        }
    }

    @Override // y59
    public final void z(u69 u69Var) {
        int b = u69Var.b();
        ke2 ke2Var = this.e;
        if (b != ke2Var.w0 || ke2Var.getParentActivity() == null) {
            return;
        }
        gm.t1(ke2Var.getParentActivity().getCurrentFocus());
    }
}
