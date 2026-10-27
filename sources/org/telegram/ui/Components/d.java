package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.CompoundEmoji;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.HashtagSearchController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.TranslateController;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ d(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    private final void a(Object obj, Object obj2) {
        final zo0 zo0Var = (zo0) this.b;
        ArrayList arrayList = (ArrayList) obj;
        ArrayList arrayList2 = zo0Var.R;
        ArrayList arrayList3 = zo0Var.X;
        int i10 = zo0Var.P;
        int i11 = 0;
        if (TextUtils.isEmpty(zo0Var.d0)) {
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                if (arrayList3.size() > 5) {
                    final int i12 = 0;
                    arrayList.add(u61.s(LocaleController.getString(R.string.SearchMyChannels), LocaleController.getString(zo0Var.W ? R.string.ShowLess : R.string.ShowMore), new View.OnClickListener() { // from class: org.telegram.ui.Components.dt
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i12) {
                                case 0:
                                    zo0 zo0Var2 = zo0Var;
                                    zo0Var2.W = !zo0Var2.W;
                                    zo0Var2.O(true);
                                    if (zo0Var2.W) {
                                        AndroidUtilities.hideKeyboard(zo0Var2.f0.getParentActivity().getCurrentFocus());
                                        break;
                                    }
                                    break;
                                default:
                                    zo0 zo0Var3 = zo0Var;
                                    zo0Var3.V = !zo0Var3.V;
                                    zo0Var3.O(true);
                                    if (zo0Var3.V) {
                                        AndroidUtilities.hideKeyboard(zo0Var3.f0.getParentActivity().getCurrentFocus());
                                        break;
                                    }
                                    break;
                            }
                        }
                    }));
                } else {
                    arrayList.add(u61.r(LocaleController.getString(R.string.SearchMyChannels)));
                }
                int size = arrayList3.size();
                if (!zo0Var.W) {
                    size = Math.min(5, size);
                }
                for (int i13 = 0; i13 < size; i13++) {
                    u61 w10 = u61.w((TLObject) arrayList3.get(i13));
                    w10.I = true;
                    arrayList.add(w10);
                }
            }
            MessagesController.ChannelRecommendations cachedChannelRecommendations = MessagesController.getInstance(i10).getCachedChannelRecommendations(0L);
            if (cachedChannelRecommendations == null) {
                arrayList.add(u61.p(30));
                arrayList.add(u61.p(29));
                arrayList.add(u61.p(29));
                arrayList.add(u61.p(29));
                arrayList.add(u61.p(29));
                return;
            }
            ArrayList arrayList4 = new ArrayList();
            ArrayList<TLObject> arrayList5 = cachedChannelRecommendations.chats;
            int size2 = arrayList5.size();
            int i14 = 0;
            while (i14 < size2) {
                TLObject tLObject = arrayList5.get(i14);
                i14++;
                TLObject tLObject2 = tLObject;
                if (tLObject2 instanceof TLRPC.Chat) {
                    TLRPC.Chat chat = (TLRPC.Chat) tLObject2;
                    TLRPC.Chat chat2 = MessagesController.getInstance(i10).getChat(Long.valueOf(chat.id));
                    if (ChatObject.isNotInChat(chat) && (chat2 == null || ChatObject.isNotInChat(chat2))) {
                        arrayList4.add(chat);
                    }
                }
            }
            if (!arrayList4.isEmpty()) {
                arrayList.add(u61.r(LocaleController.getString(R.string.SearchRecommendedChannels)));
            }
            int size3 = arrayList4.size();
            while (i11 < size3) {
                Object obj3 = arrayList4.get(i11);
                i11++;
                arrayList.add(u61.w((TLRPC.Chat) obj3));
            }
            return;
        }
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = zo0Var.S;
        int size4 = arrayList7.size();
        int i15 = 0;
        while (i15 < size4) {
            Object obj4 = arrayList7.get(i15);
            i15++;
            TLRPC.Chat chat3 = (TLRPC.Chat) obj4;
            TLRPC.Chat chat4 = MessagesController.getInstance(i10).getChat(Long.valueOf(chat3.id));
            if (ChatObject.isNotInChat(chat3) && (chat4 == null || ChatObject.isNotInChat(chat4))) {
                arrayList6.add(chat3);
            }
        }
        ArrayList arrayList8 = zo0Var.T;
        int size5 = arrayList8.size();
        int i16 = 0;
        while (i16 < size5) {
            Object obj5 = arrayList8.get(i16);
            i16++;
            TLRPC.Chat chat5 = (TLRPC.Chat) obj5;
            TLRPC.Chat chat6 = MessagesController.getInstance(i10).getChat(Long.valueOf(chat5.id));
            if (ChatObject.isNotInChat(chat5) && (chat6 == null || ChatObject.isNotInChat(chat6))) {
                arrayList6.add(chat5);
            }
        }
        ArrayList arrayList9 = zo0Var.U;
        int size6 = arrayList9.size();
        int i17 = 0;
        while (i17 < size6) {
            Object obj6 = arrayList9.get(i17);
            i17++;
            TLRPC.Chat chat7 = (TLRPC.Chat) obj6;
            TLRPC.Chat chat8 = MessagesController.getInstance(i10).getChat(Long.valueOf(chat7.id));
            if (ChatObject.isNotInChat(chat7) && (chat8 == null || ChatObject.isNotInChat(chat8))) {
                arrayList6.add(chat7);
            }
        }
        if (!arrayList6.isEmpty()) {
            if (arrayList6.size() <= 5 || arrayList2.isEmpty()) {
                arrayList.add(u61.r(LocaleController.getString(R.string.SearchChannels)));
            } else {
                final int i18 = 1;
                arrayList.add(u61.s(LocaleController.getString(R.string.SearchChannels), LocaleController.getString(zo0Var.V ? R.string.ShowLess : R.string.ShowMore), new View.OnClickListener() { // from class: org.telegram.ui.Components.dt
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i18) {
                            case 0:
                                zo0 zo0Var2 = zo0Var;
                                zo0Var2.W = !zo0Var2.W;
                                zo0Var2.O(true);
                                if (zo0Var2.W) {
                                    AndroidUtilities.hideKeyboard(zo0Var2.f0.getParentActivity().getCurrentFocus());
                                    break;
                                }
                                break;
                            default:
                                zo0 zo0Var3 = zo0Var;
                                zo0Var3.V = !zo0Var3.V;
                                zo0Var3.O(true);
                                if (zo0Var3.V) {
                                    AndroidUtilities.hideKeyboard(zo0Var3.f0.getParentActivity().getCurrentFocus());
                                    break;
                                }
                                break;
                        }
                    }
                }));
            }
            int size7 = arrayList6.size();
            if (!zo0Var.V && !arrayList2.isEmpty()) {
                size7 = Math.min(5, size7);
            }
            for (int i19 = 0; i19 < size7; i19++) {
                arrayList.add(u61.w((TLObject) arrayList6.get(i19)));
            }
        }
        if (arrayList2.isEmpty()) {
            return;
        }
        arrayList.add(u61.r(LocaleController.getString(R.string.SearchMessages)));
        int size8 = arrayList2.size();
        while (i11 < size8) {
            Object obj7 = arrayList2.get(i11);
            i11++;
            u61 u61Var = new u61(33);
            u61Var.G = (MessageObject) obj7;
            arrayList.add(u61Var);
        }
        if (zo0Var.a0) {
            arrayList.add(u61.p(1));
        }
    }

    private final void b(Object obj, Object obj2) {
        FragmentContextView fragmentContextView = (FragmentContextView) this.b;
        float[] fArr = FragmentContextView.W0;
        fragmentContextView.A0 = !((Boolean) obj2).booleanValue();
        MediaController mediaController = MediaController.getInstance();
        boolean z10 = fragmentContextView.W;
        org.telegram.ui.ActionBar.c1 c1Var = fragmentContextView.I;
        float floatValue = ((Float) obj).floatValue();
        c1Var.getClass();
        mediaController.setPlaybackSpeed(z10, (floatValue * 2.8f) + 0.2f);
    }

    private final void c(Object obj, Object obj2) {
        o40 o40Var = (o40) this.b;
        ArrayList arrayList = (ArrayList) obj;
        ArrayList arrayList2 = new ArrayList(0);
        o40Var.c = arrayList2;
        arrayList2.addAll(HashtagSearchController.getInstance(o40Var.a).history);
        if (o40Var.c.isEmpty()) {
            return;
        }
        for (int i10 = 0; i10 < o40Var.c.size(); i10++) {
            String str = (String) o40Var.c.get(i10);
            if (str.startsWith("#") || str.startsWith("$")) {
                arrayList.add(u61.c(i10 + 1, str.startsWith("$") ? R.drawable.menu_cashtag : R.drawable.menu_hashtag, str.substring(1)));
            }
        }
        arrayList.add(u61.c(0, R.drawable.msg_clear_recent, LocaleController.getString(R.string.ClearHistory)));
    }

    private final void d(Object obj, Object obj2) {
        di.t6 t6Var;
        p40 p40Var = (p40) this.b;
        ArrayList arrayList = (ArrayList) obj;
        ArrayList arrayList2 = p40Var.Q;
        int i10 = 0;
        boolean z10 = p40Var.R && (t6Var = p40Var.S) != null && t6Var.i.size() > 0;
        if (z10) {
            di.t6 t6Var2 = p40Var.S;
            int i11 = ig.l1.a;
            u61 K = u61.K(ig.l1.class);
            K.G = t6Var2;
            arrayList.add(K);
        }
        p40Var.T = z10;
        while (i10 < arrayList2.size()) {
            int i12 = i10 + 1;
            MessageObject messageObject = (MessageObject) arrayList2.get(i10);
            u61 u61Var = new u61(33);
            u61Var.d = i12;
            u61Var.G = messageObject;
            arrayList.add(u61Var);
            i10 = i12;
        }
        if (p40Var.U || !p40Var.X) {
            arrayList.add(u61.q(-2, 1));
            arrayList.add(u61.q(-3, 1));
            arrayList.add(u61.q(-4, 1));
        }
        if (p40Var.T || !z10) {
            return;
        }
        AndroidUtilities.runOnUIThread(new cp(p40Var, 23));
    }

    private final void e(Object obj, Object obj2) {
        j80 j80Var = (j80) this.b;
        Bitmap bitmap = (Bitmap) obj;
        Bitmap bitmap2 = (Bitmap) obj2;
        l80 l80Var = j80Var.x;
        l80Var.f.setAlpha(1.0f);
        if (l80Var.u) {
            j80Var.c = bitmap;
        }
        hh.b bVar = l80Var.n;
        if (bVar != null) {
            bVar.a(bitmap2);
            ih.d.c(l80Var.n, j80Var);
            ViewGroup viewGroup = l80Var.A;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
    }

    private final void f(Object obj, Object obj2) {
        xh0 xh0Var = (xh0) this.b;
        ArrayList arrayList = (ArrayList) obj;
        ArrayList arrayList2 = xh0Var.e;
        ArrayList arrayList3 = xh0Var.n;
        int i10 = 0;
        if (xh0Var.d == null) {
            arrayList.add(u61.q(-1, 7));
            arrayList.add(u61.q(-2, 7));
            arrayList.add(u61.q(-3, 7));
            xh0Var.Q = false;
            return;
        }
        boolean isEmpty = TextUtils.isEmpty(xh0Var.w);
        if (isEmpty) {
            if (!arrayList2.isEmpty()) {
                arrayList.add(u61.r(LocaleController.getString(R.string.SearchPostsHeaderNews)));
            }
            int size = arrayList2.size();
            while (i10 < size) {
                Object obj3 = arrayList2.get(i10);
                i10++;
                u61 u61Var = new u61(33);
                u61Var.G = (MessageObject) obj3;
                arrayList.add(u61Var);
            }
        } else {
            if (!arrayList3.isEmpty()) {
                arrayList.add(u61.r(LocaleController.getString(R.string.SearchPostsHeaderFound)));
            }
            int size2 = arrayList3.size();
            while (i10 < size2) {
                Object obj4 = arrayList3.get(i10);
                i10++;
                u61 u61Var2 = new u61(33);
                u61Var2.G = (MessageObject) obj4;
                arrayList.add(u61Var2);
            }
        }
        if (xh0Var.v || ((xh0Var.M && !xh0Var.N) || (!isEmpty && !arrayList3.isEmpty() && !xh0Var.s))) {
            arrayList.add(u61.q(xh0Var.L * 3, 7));
            arrayList.add(u61.q((xh0Var.L * 3) + 1, 7));
            arrayList.add(u61.q((xh0Var.L * 3) + 2, 7));
        }
        xh0Var.Q = arrayList.isEmpty();
    }

    private final void g(Object obj, Object obj2) {
        in0 in0Var = (in0) this.b;
        in0Var.c = (Bitmap) obj;
        Paint paint = new Paint(1);
        in0Var.e = paint;
        Bitmap bitmap = in0Var.c;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        in0Var.d = bitmapShader;
        paint.setShader(bitmapShader);
        in0Var.f = new Matrix();
        hh.b bVar = in0Var.h;
        bVar.a((Bitmap) obj2);
        ih.d.c(bVar, in0Var.s);
        ViewGroup viewGroup = in0Var.y;
        if (viewGroup != null) {
            viewGroup.invalidate();
        }
    }

    private final void h(Object obj, Object obj2) {
        dz0 dz0Var = (dz0) this.b;
        CharSequence charSequence = (CharSequence) obj;
        dz0Var.h.setText(charSequence);
        TLRPC.TL_stickers_renameStickerSet tL_stickers_renameStickerSet = new TLRPC.TL_stickers_renameStickerSet();
        tL_stickers_renameStickerSet.stickerset = MediaDataController.getInputStickerSet(dz0Var.S.set);
        tL_stickers_renameStickerSet.title = charSequence.toString();
        ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tL_stickers_renameStickerSet, new b2((Utilities.Callback) obj2, 14));
    }

    private final void i(Object obj, Object obj2) {
        g51.p((g51) this.b, (String) obj, (Boolean) obj2);
    }

    private final void j(Object obj, Object obj2) {
        ((n71) this.b).V((ArrayList) obj, (k71) obj2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:371:0x0757  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x0784  */
    /* JADX WARN: Removed duplicated region for block: B:391:0x07c8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:393:0x0780  */
    @Override // org.telegram.messenger.Utilities.Callback2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run(Object obj, Object obj2) {
        u61 a2;
        TL_iv.RichMessage richMessage;
        u61 a10;
        TL_iv.RichMessage richMessage2;
        String substring;
        String str;
        u61 a11;
        TL_iv.RichMessage richMessage3;
        String substring2;
        String substring3;
        boolean z10;
        String str2;
        MediaController.AudioEntry audioEntry;
        boolean z11;
        int i10 = this.a;
        String str3 = null;
        int i11 = 5;
        int i12 = 1;
        boolean z12 = false;
        Object obj3 = this.b;
        switch (i10) {
            case 0:
                e0 e0Var = (e0) obj3;
                ArrayList arrayList = (ArrayList) obj;
                k71 k71Var = (k71) obj2;
                boolean[] zArr = e0Var.p0;
                boolean[] zArr2 = e0Var.q0;
                d0 d0Var = e0Var.x0;
                arrayList.add(u61.C(null));
                arrayList.add(u61.m(e0Var.v0));
                arrayList.add(u61.C(null));
                k71Var.F = 1;
                k71Var.V();
                d0 d0Var2 = e0Var.w0;
                int selectedTab = d0Var2 != null ? d0Var2.getSelectedTab() : 0;
                int i13 = 6;
                int i14 = 7;
                if (selectedTab == 0) {
                    String str4 = e0Var.r0;
                    if (str4 == null || str4.equalsIgnoreCase(TranslateController.UNKNOWN_LANGUAGE)) {
                        arrayList.add(m51.b(3, LocaleController.getString(R.string.AIEditorOriginalText), null, null, null));
                    } else {
                        String N = g51.N(e0Var.r0, null, zArr2);
                        String string = LocaleController.getString((zArr2 == null || !zArr2[0]) ? R.string.AIEditorFromOther : R.string.AIEditorFrom);
                        int indexOf = string.indexOf("%s");
                        if (indexOf < 0) {
                            substring3 = "";
                            substring2 = substring3;
                        } else {
                            substring2 = string.substring(0, indexOf);
                            substring3 = string.substring(indexOf + 2);
                        }
                        if (TextUtils.isEmpty(substring2)) {
                            N = g51.J(N);
                        }
                        arrayList.add(m51.b(3, substring2, N, substring3, null));
                    }
                    arrayList.add(e0Var.i0() ? e0Var.j0(4, e0Var.Y, false) : q51.a(4, e0Var.X, e0Var.P0, new b(e0Var, 4), null, null));
                    String N2 = g51.N(e0Var.s0, zArr, null);
                    String string2 = LocaleController.getString((zArr == null || !zArr[0]) ? R.string.AIEditorToOther : R.string.AIEditorTo);
                    int indexOf2 = string2.indexOf("%s");
                    if (indexOf2 < 0) {
                        str = "";
                        substring = str;
                    } else {
                        String substring4 = string2.substring(0, indexOf2);
                        substring = string2.substring(indexOf2 + 2);
                        str = substring4;
                    }
                    if (TextUtils.isEmpty(str)) {
                        N2 = g51.J(N2);
                    }
                    arrayList.add(m51.a(5, str, b10.u(N2, ""), substring, new b(e0Var, i11), e0Var.t0, new b(e0Var, i13), null));
                    if (e0Var.i0()) {
                        boolean z13 = e0Var.Z;
                        if (z13 || (richMessage3 = e0Var.b0) == null) {
                            richMessage3 = e0Var.Y;
                        }
                        a11 = e0Var.j0(6, richMessage3, z13);
                    } else {
                        boolean z14 = e0Var.Z;
                        a11 = q51.a(z14 ? 7 : 6, e0Var.a0, false, null, null, !z14 ? new b(e0Var, i14) : null);
                    }
                    arrayList.add(a11);
                } else if (selectedTab == 1) {
                    arrayList.add(u61.k(d0Var));
                    if (d0Var.getSelectedTone() instanceof z) {
                        arrayList.add(u61.j(10, e0Var.z0));
                        k71Var.U();
                        arrayList.add(u61.B(11, null));
                        k71Var.V();
                    }
                    if ((d0Var.getSelectedTab() >= 0 || e0Var.t0) && (!(d0Var.getSelectedTone() instanceof z) || TextUtils.equals(e0Var.A0.getText().toString(), e0Var.I0))) {
                        arrayList.add(m51.a(7, LocaleController.getString(R.string.AIEditorResult), null, null, null, e0Var.t0, new b(e0Var, i13), null));
                        if (e0Var.i0()) {
                            boolean z15 = e0Var.c0;
                            if (z15 || (richMessage2 = e0Var.e0) == null) {
                                richMessage2 = e0Var.Y;
                            }
                            a10 = e0Var.j0(8, richMessage2, z15);
                        } else {
                            boolean z16 = e0Var.c0;
                            a10 = q51.a(z16 ? 7 : 6, e0Var.d0, false, null, null, !z16 ? new b(e0Var, i14) : null);
                        }
                        arrayList.add(a10);
                    } else {
                        arrayList.add(m51.a(5, LocaleController.getString(R.string.AIEditorOriginal), null, null, null, e0Var.t0, new b(e0Var, i13), null));
                        arrayList.add(e0Var.i0() ? e0Var.j0(6, e0Var.Y, false) : q51.a(e0Var.c0 ? 7 : 6, e0Var.X, false, null, null, null));
                    }
                } else if (selectedTab == 2) {
                    arrayList.add(m51.b(3, LocaleController.getString(R.string.AIEditorOriginal), null, null, null));
                    arrayList.add(e0Var.i0() ? e0Var.j0(4, e0Var.Y, false) : q51.a(4, e0Var.X, e0Var.P0, new b(e0Var, 4), null, null));
                    arrayList.add(m51.b(5, LocaleController.getString(R.string.AIEditorResult), null, null, null));
                    if (e0Var.i0()) {
                        boolean z17 = e0Var.f0;
                        if (z17 || (richMessage = e0Var.h0) == null) {
                            richMessage = e0Var.Y;
                        }
                        a2 = e0Var.j0(6, richMessage, z17);
                    } else {
                        boolean z18 = e0Var.f0;
                        a2 = q51.a(z18 ? 7 : 6, e0Var.g0, false, null, null, !z18 ? new b(e0Var, i14) : null);
                    }
                    arrayList.add(a2);
                }
                k71Var.U();
                arrayList.add(u61.C(null));
                break;
            case 1:
                q.R((q) obj3, (ArrayList) obj, (k71) obj2);
                break;
            case 2:
                y yVar = (y) obj3;
                ArrayList arrayList2 = (ArrayList) obj;
                arrayList2.add(u61.C(null));
                arrayList2.add(u61.m(yVar.X));
                arrayList2.add(u61.C(null));
                arrayList2.add(u61.k(yVar.a0));
                arrayList2.add(u61.C(null));
                arrayList2.add(u61.k(yVar.b0));
                arrayList2.add(u61.C(null));
                if (yVar.j0 != null) {
                    u61 e = u61.e(1, LocaleController.getString(R.string.AIEditorDeleteStyle));
                    e.r = true;
                    arrayList2.add(e);
                    arrayList2.add(u61.C(null));
                }
                arrayList2.add(u61.m(yVar.c0));
                break;
            case 3:
                ((g0) obj3).Q((ArrayList) obj, (k71) obj2);
                break;
            case 4:
                ((ChatActivityEnterView) obj3).b0((Canvas) obj, (Utilities.Callback0Return) obj2);
                break;
            case 5:
                fj fjVar = (fj) obj3;
                ArrayList arrayList3 = (ArrayList) obj;
                k71 k71Var2 = (k71) obj2;
                int i15 = fjVar.P;
                ArrayList arrayList4 = fjVar.M;
                MessagesController.SavedMusicList savedMusicList = fjVar.J;
                ArrayList arrayList5 = fjVar.K;
                HashSet hashSet = fjVar.I;
                ArrayList arrayList6 = fjVar.L;
                arrayList3.add(u61.E(-100, AndroidUtilities.dp(1.0f)));
                int size = arrayList3.size();
                if (TextUtils.isEmpty(fjVar.y)) {
                    k71Var2.V();
                    int i16 = 0;
                    while (i16 < fjVar.H.size()) {
                        MediaController.AudioEntry audioEntry2 = (MediaController.AudioEntry) fjVar.H.get(i16);
                        audioEntry2.messageObject.setQuery(str3);
                        u61 a12 = org.telegram.ui.Cells.m7.a(audioEntry2, new vi(fjVar, 0));
                        a12.L(hashSet.contains(audioEntry2));
                        a12.d = -1;
                        arrayList3.add(a12);
                        i16++;
                        str3 = null;
                    }
                    if (fjVar.G) {
                        arrayList3.add(u61.q(11, 4));
                        arrayList3.add(u61.q(12, 4));
                        arrayList3.add(u61.q(13, 4));
                    }
                    k71Var2.U();
                    if (savedMusicList != null) {
                        int size2 = savedMusicList.list.size();
                        if (size2 < arrayList5.size()) {
                            arrayList5.subList(size2, arrayList5.size()).clear();
                        }
                        for (int i17 = 0; i17 < size2; i17++) {
                            if (i17 >= arrayList5.size()) {
                                audioEntry = new MediaController.AudioEntry();
                                arrayList5.add(audioEntry);
                            } else {
                                audioEntry = (MediaController.AudioEntry) arrayList5.get(i17);
                            }
                            if (audioEntry.messageObject != savedMusicList.list.get(i17)) {
                                MessageObject messageObject = savedMusicList.list.get(i17);
                                int i18 = fjVar.l0;
                                fjVar.l0 = i18 - 1;
                                audioEntry.id = i18;
                                audioEntry.messageObject = messageObject;
                            }
                        }
                    }
                    if (savedMusicList != null && arrayList5 != null && !arrayList5.isEmpty()) {
                        if (arrayList3.size() > size) {
                            arrayList3.add(u61.B(-98, null));
                        }
                        k71Var2.V();
                        arrayList3.add(u61.t(45, LocaleController.getString(R.string.AudioSearchProfile)));
                        for (int i19 = 0; i19 < arrayList5.size(); i19++) {
                            MediaController.AudioEntry audioEntry3 = (MediaController.AudioEntry) arrayList5.get(i19);
                            u61 a13 = org.telegram.ui.Cells.m7.a(audioEntry3, new vi(fjVar, 0));
                            a13.L(hashSet.contains(audioEntry3));
                            arrayList3.add(a13);
                        }
                        if (savedMusicList.loading) {
                            arrayList3.add(u61.q(41, 4));
                            arrayList3.add(u61.q(42, 4));
                            arrayList3.add(u61.q(43, 4));
                        }
                        if (!savedMusicList.loading && !savedMusicList.endReached) {
                            u61 c10 = u61.c(fjVar.R, R.drawable.arrow_more, LocaleController.getString(R.string.ShowMore));
                            c10.q = true;
                            arrayList3.add(c10);
                        }
                        k71Var2.U();
                    }
                    if (arrayList6 != null && (!arrayList6.isEmpty() || fjVar.U >= 0 || fjVar.W)) {
                        if (arrayList3.size() > size) {
                            arrayList3.add(u61.B(-98, null));
                        }
                        k71Var2.V();
                        arrayList3.add(u61.t(((fjVar.U >= 0 || fjVar.W) && arrayList6.isEmpty()) ? 25 : 20, LocaleController.getString(R.string.AudioSearchChats)));
                        for (int i20 = 0; i20 < arrayList6.size(); i20++) {
                            MediaController.AudioEntry audioEntry4 = (MediaController.AudioEntry) arrayList6.get(i20);
                            audioEntry4.messageObject.setQuery(fjVar.y);
                            u61 a14 = org.telegram.ui.Cells.m7.a(audioEntry4, new vi(fjVar, 0));
                            a14.L(hashSet.contains(audioEntry4));
                            arrayList3.add(a14);
                        }
                        if (fjVar.U >= 0 || fjVar.W) {
                            arrayList3.add(u61.q(21, 4));
                            arrayList3.add(u61.q(22, 4));
                            arrayList3.add(u61.q(23, 4));
                        }
                        if (fjVar.c0) {
                            u61 c11 = u61.c(i15, R.drawable.arrow_more, LocaleController.getString(R.string.ShowMore));
                            c11.q = true;
                            arrayList3.add(c11);
                        }
                        k71Var2.U();
                    }
                } else {
                    String lowerCase = fjVar.y.toLowerCase();
                    String translitSafe = AndroidUtilities.translitSafe(lowerCase);
                    boolean z19 = false;
                    for (int i21 = 0; i21 < fjVar.H.size(); i21++) {
                        MediaController.AudioEntry audioEntry5 = (MediaController.AudioEntry) fjVar.H.get(i21);
                        String str5 = audioEntry5.author;
                        if (str5 != null) {
                            String lowerCase2 = str5.toLowerCase();
                            String translitSafe2 = AndroidUtilities.translitSafe(lowerCase2);
                            if (lowerCase2.startsWith(lowerCase) || org.telegram.messenger.wh.u(" ", lowerCase, lowerCase2) || translitSafe2.startsWith(translitSafe) || org.telegram.messenger.wh.u(" ", translitSafe, translitSafe2)) {
                                z10 = true;
                                str2 = audioEntry5.title;
                                if (str2 == null) {
                                    String lowerCase3 = str2.toLowerCase();
                                    boolean z20 = z10;
                                    String translitSafe3 = AndroidUtilities.translitSafe(lowerCase3);
                                    z10 = z20 || lowerCase3.startsWith(lowerCase) || org.telegram.messenger.wh.u(" ", lowerCase, lowerCase3) || translitSafe3.startsWith(translitSafe) || org.telegram.messenger.wh.u(" ", translitSafe, translitSafe3);
                                }
                                if (z10) {
                                    if (!z19) {
                                        if (arrayList3.size() > size) {
                                            arrayList3.add(u61.B(-97, null));
                                        }
                                        k71Var2.V();
                                        arrayList3.add(u61.t(10, LocaleController.getString(R.string.AudioSearchLocal)));
                                        z19 = true;
                                    }
                                    audioEntry5.messageObject.setQuery(fjVar.y);
                                    u61 a15 = org.telegram.ui.Cells.m7.a(audioEntry5, new vi(fjVar, 0));
                                    a15.L(hashSet.contains(audioEntry5));
                                    a15.d = 10;
                                    arrayList3.add(a15);
                                }
                            }
                        }
                        z10 = false;
                        str2 = audioEntry5.title;
                        if (str2 == null) {
                        }
                        if (z10) {
                        }
                    }
                    k71Var2.U();
                    if (arrayList6 != null && (!arrayList6.isEmpty() || fjVar.U >= 0 || fjVar.W)) {
                        if (arrayList3.size() > size) {
                            arrayList3.add(u61.B(-98, null));
                        }
                        k71Var2.V();
                        arrayList3.add(u61.t(((fjVar.U >= 0 || fjVar.W) && arrayList6.isEmpty()) ? 25 : 20, LocaleController.getString(R.string.AudioSearchChats)));
                        for (int i22 = 0; i22 < arrayList6.size(); i22++) {
                            MediaController.AudioEntry audioEntry6 = (MediaController.AudioEntry) arrayList6.get(i22);
                            audioEntry6.messageObject.setQuery(fjVar.y);
                            u61 a16 = org.telegram.ui.Cells.m7.a(audioEntry6, new vi(fjVar, 0));
                            a16.L(hashSet.contains(audioEntry6));
                            arrayList3.add(a16);
                        }
                        if (fjVar.U >= 0 || fjVar.W) {
                            arrayList3.add(u61.q(21, 4));
                            arrayList3.add(u61.q(22, 4));
                            arrayList3.add(u61.q(23, 4));
                        }
                        if (fjVar.c0) {
                            u61 c12 = u61.c(i15, R.drawable.arrow_more, LocaleController.getString(R.string.ShowMore));
                            c12.q = true;
                            arrayList3.add(c12);
                        }
                        k71Var2.U();
                    }
                    if (arrayList4 != null && (!arrayList4.isEmpty() || fjVar.d0 >= 0 || fjVar.m0)) {
                        if (arrayList3.size() > size) {
                            arrayList3.add(u61.B(-96, null));
                        }
                        k71Var2.V();
                        arrayList3.add(u61.t(((fjVar.d0 >= 0 || fjVar.m0) && arrayList4.isEmpty()) ? 35 : 30, LocaleController.getString(R.string.AudioSearchGlobal)));
                        int size3 = arrayList4.size();
                        for (int i23 = 0; i23 < size3; i23++) {
                            MediaController.AudioEntry audioEntry7 = (MediaController.AudioEntry) arrayList4.get(i23);
                            audioEntry7.messageObject.setQuery(fjVar.y);
                            u61 a17 = org.telegram.ui.Cells.m7.a(audioEntry7, new vi(fjVar, 0));
                            a17.L(hashSet.contains(audioEntry7));
                            arrayList3.add(a17);
                        }
                        if (fjVar.d0 >= 0 || fjVar.m0) {
                            arrayList3.add(u61.q(31, 4));
                            arrayList3.add(u61.q(32, 4));
                            arrayList3.add(u61.q(33, 4));
                        }
                        if (fjVar.g0) {
                            u61 c13 = u61.c(fjVar.Q, R.drawable.arrow_more, LocaleController.getString(R.string.ShowMore));
                            c13.q = true;
                            arrayList3.add(c13);
                        }
                        k71Var2.U();
                    }
                }
                if (arrayList3.size() <= size && !fjVar.G) {
                    if (TextUtils.isEmpty(fjVar.y)) {
                        String string3 = LocaleController.getString(R.string.NoAudioFiles);
                        String string4 = LocaleController.getString(R.string.NoAudioFilesInfo);
                        int i24 = dj.a;
                        u61 K = u61.K(dj.class);
                        K.l = string3;
                        K.m = string4;
                        arrayList3.add(K);
                    } else {
                        String string5 = LocaleController.getString(R.string.NoAudioFound);
                        SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(fjVar.y.length() >= 3 ? R.string.NoAudioFoundInfo2 : R.string.NoAudioFoundInfo, fjVar.y));
                        int i25 = dj.a;
                        u61 K2 = u61.K(dj.class);
                        K2.l = string5;
                        K2.m = replaceTags;
                        arrayList3.add(K2);
                    }
                }
                arrayList3.add(u61.B(-99, null));
                break;
            case 6:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) obj3;
                boolean z21 = ChatAttachAlertPhotoLayout.q1;
                chatAttachAlertPhotoLayout.getClass();
                ((Runnable) obj2).run();
                chatAttachAlertPhotoLayout.setStarsPrice(((Long) obj).longValue());
                break;
            case 7:
                zr.R((zr) obj3, (ArrayList) obj);
                break;
            case 8:
                final ct ctVar = (ct) obj3;
                ArrayList arrayList7 = (ArrayList) obj;
                int i26 = ctVar.P;
                b3 b3Var = ctVar.j0;
                ArrayList arrayList8 = ctVar.V;
                bt btVar = ctVar.S;
                boolean z22 = ctVar.R;
                HashSet hashSet2 = new HashSet();
                if (TextUtils.isEmpty(ctVar.g0)) {
                    ArrayList<TLRPC.TL_topPeer> arrayList9 = MediaDataController.getInstance(i26).webapps;
                    ArrayList arrayList10 = new ArrayList();
                    if (arrayList9 != null) {
                        for (int i27 = 0; i27 < arrayList9.size(); i27++) {
                            TLRPC.User user = MessagesController.getInstance(i26).getUser(Long.valueOf(DialogObject.getPeerDialogId(arrayList9.get(i27).peer)));
                            if (user != null && user.bot) {
                                arrayList10.add(user);
                            }
                        }
                    }
                    ctVar.Z = arrayList7.size();
                    if (!arrayList10.isEmpty() && !z22) {
                        if (arrayList10.size() > 5) {
                            final int i28 = 1;
                            arrayList7.add(u61.s(LocaleController.getString(R.string.SearchAppsMine), LocaleController.getString(ctVar.W ? R.string.ShowLess : R.string.ShowMore), new View.OnClickListener() { // from class: org.telegram.ui.Components.zs
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    switch (i28) {
                                        case 0:
                                            ct ctVar2 = ctVar;
                                            ctVar2.X = !ctVar2.X;
                                            ctVar2.O(true);
                                            break;
                                        default:
                                            ct ctVar3 = ctVar;
                                            ctVar3.W = !ctVar3.W;
                                            ctVar3.O(true);
                                            break;
                                    }
                                }
                            }));
                        } else {
                            arrayList7.add(u61.r(LocaleController.getString(R.string.SearchAppsMine)));
                        }
                        for (int i29 = 0; i29 < arrayList10.size() && (i29 < 5 || ctVar.W); i29++) {
                            TLRPC.User user2 = (TLRPC.User) arrayList10.get(i29);
                            if (!hashSet2.contains(Long.valueOf(user2.id))) {
                                hashSet2.add(Long.valueOf(user2.id));
                                u61 w10 = u61.w(user2);
                                w10.q = true;
                                w10.t = true;
                                w10.H = b3Var;
                                arrayList7.add(w10);
                            }
                        }
                    }
                    hashSet2.clear();
                    ctVar.a0 = arrayList7.size();
                    ArrayList arrayList11 = btVar.h;
                    if (arrayList11.isEmpty()) {
                        if (btVar.c || !btVar.e) {
                            if (!z22) {
                                arrayList7.add(u61.p(30));
                            }
                            arrayList7.add(u61.p(29));
                            arrayList7.add(u61.p(29));
                            arrayList7.add(u61.p(29));
                            arrayList7.add(u61.p(29));
                        }
                        z11 = false;
                    } else {
                        if (!z22) {
                            arrayList7.add(u61.r(LocaleController.getString(R.string.SearchAppsPopular)));
                        }
                        boolean z23 = false;
                        for (int i30 = 0; i30 < arrayList11.size(); i30++) {
                            TLRPC.User user3 = (TLRPC.User) arrayList11.get(i30);
                            if (!hashSet2.contains(Long.valueOf(user3.id))) {
                                hashSet2.add(Long.valueOf(user3.id));
                                u61 w11 = u61.w(user3);
                                w11.q = true;
                                w11.r = true;
                                w11.t = true;
                                w11.H = b3Var;
                                arrayList7.add(w11);
                                z23 = true;
                            }
                        }
                        if (btVar.c || !btVar.e) {
                            arrayList7.add(u61.p(29));
                            arrayList7.add(u61.p(29));
                            arrayList7.add(u61.p(29));
                        }
                        z11 = z23;
                    }
                    if (z11) {
                        arrayList7.add(u61.C(ctVar.Y));
                        break;
                    }
                } else {
                    ArrayList arrayList12 = new ArrayList();
                    arrayList12.addAll(ctVar.T);
                    arrayList12.addAll(ctVar.U);
                    if (!arrayList12.isEmpty()) {
                        if (arrayList12.size() <= 5 || arrayList8.isEmpty() || z22) {
                            arrayList7.add(u61.r(LocaleController.getString(R.string.SearchApps)));
                        } else {
                            final int i31 = 0;
                            arrayList7.add(u61.s(LocaleController.getString(R.string.SearchApps), LocaleController.getString(ctVar.X ? R.string.ShowLess : R.string.ShowMore), new View.OnClickListener() { // from class: org.telegram.ui.Components.zs
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    switch (i31) {
                                        case 0:
                                            ct ctVar2 = ctVar;
                                            ctVar2.X = !ctVar2.X;
                                            ctVar2.O(true);
                                            break;
                                        default:
                                            ct ctVar3 = ctVar;
                                            ctVar3.W = !ctVar3.W;
                                            ctVar3.O(true);
                                            break;
                                    }
                                }
                            }));
                        }
                        int size4 = arrayList12.size();
                        if (!ctVar.X && !arrayList8.isEmpty() && !z22) {
                            size4 = Math.min(5, size4);
                        }
                        for (int i32 = 0; i32 < size4; i32++) {
                            u61 w12 = u61.w((TLObject) arrayList12.get(i32));
                            w12.t = true;
                            w12.H = b3Var;
                            arrayList7.add(w12);
                        }
                    }
                    if (!arrayList8.isEmpty() && !z22) {
                        arrayList7.add(u61.r(LocaleController.getString(R.string.SearchMessages)));
                        int size5 = arrayList8.size();
                        int i33 = 0;
                        while (i33 < size5) {
                            Object obj4 = arrayList8.get(i33);
                            i33++;
                            u61 u61Var = new u61(33);
                            u61Var.G = (MessageObject) obj4;
                            arrayList7.add(u61Var);
                        }
                        if (ctVar.d0) {
                            arrayList7.add(u61.p(1));
                            break;
                        }
                    }
                }
                break;
            case 9:
                a(obj, obj2);
                break;
            case 10:
                sz szVar = (sz) obj3;
                Integer num = (Integer) obj;
                Integer num2 = (Integer) obj2;
                bz bzVar = szVar.R1;
                if (bzVar != null && (bzVar.getDrawable() instanceof CompoundEmoji.CompoundEmojiDrawable)) {
                    ((CompoundEmoji.CompoundEmojiDrawable) szVar.R1.getDrawable()).update(num.intValue(), num2.intValue());
                    String str6 = (String) szVar.R1.getTag();
                    if (num.intValue() == -1 && num2.intValue() == -1) {
                        Emoji.emojiColor.remove(str6);
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(num.intValue() >= 0 ? CompoundEmoji.skinTones.get(num.intValue()) : "");
                        sb2.append("\u200d");
                        sb2.append(num2.intValue() >= 0 ? CompoundEmoji.skinTones.get(num2.intValue()) : "");
                        Emoji.emojiColor.put(str6, sb2.toString());
                    }
                    Emoji.saveEmojiColors();
                    break;
                }
                break;
            case 11:
                sy syVar = (sy) obj3;
                ArrayList arrayList13 = (ArrayList) obj;
                ArrayList arrayList14 = syVar.s;
                int size6 = arrayList14.size();
                int i34 = 0;
                while (i34 < size6) {
                    Object obj5 = arrayList14.get(i34);
                    i34++;
                    jy jyVar = (jy) obj5;
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = jyVar.b;
                    if (tL_messages_stickerSet != null) {
                        boolean z24 = tL_messages_stickerSet.set.id == syVar.d;
                        int i35 = uy.a;
                        u61 K3 = u61.K(uy.class);
                        long j10 = tL_messages_stickerSet.set.id;
                        K3.d = (int) ((j10 >>> 32) ^ j10);
                        K3.B = j10;
                        K3.G = tL_messages_stickerSet;
                        K3.e = z24;
                        arrayList13.add(K3);
                    } else {
                        TLRPC.StickerSetCovered stickerSetCovered = jyVar.a;
                        if (stickerSetCovered != null) {
                            arrayList13.add(uy.a(stickerSetCovered, jyVar, stickerSetCovered.set.id == syVar.d));
                        }
                    }
                }
                break;
            case 12:
                nz nzVar = (nz) obj3;
                ArrayList arrayList15 = (ArrayList) obj;
                LongSparseIntArray longSparseIntArray = new LongSparseIntArray();
                ArrayList arrayList16 = nzVar.E;
                int size7 = arrayList16.size();
                int i36 = 0;
                while (i36 < size7) {
                    Object obj6 = arrayList16.get(i36);
                    i36++;
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) obj6;
                    if (longSparseIntArray.indexOfKey(tL_messages_stickerSet2.set.id) < 0) {
                        longSparseIntArray.append(tL_messages_stickerSet2.set.id, i12);
                        boolean z25 = tL_messages_stickerSet2.set.id == nzVar.d ? i12 : z12;
                        int i37 = uy.a;
                        u61 K4 = u61.K(uy.class);
                        long j11 = tL_messages_stickerSet2.set.id;
                        K4.d = (int) (j11 ^ (j11 >>> 32));
                        K4.B = j11;
                        K4.G = tL_messages_stickerSet2;
                        K4.e = z25;
                        arrayList15.add(K4);
                    }
                    i12 = 1;
                    z12 = false;
                }
                ArrayList arrayList17 = nzVar.J;
                int size8 = arrayList17.size();
                int i38 = 0;
                while (i38 < size8) {
                    Object obj7 = arrayList17.get(i38);
                    i38++;
                    jy jyVar2 = (jy) obj7;
                    TLRPC.StickerSet stickerSet = jyVar2.c;
                    if (longSparseIntArray.indexOfKey(stickerSet.id) < 0) {
                        longSparseIntArray.append(stickerSet.id, 1);
                        arrayList15.add(uy.a(jyVar2.a, jyVar2, stickerSet.id == nzVar.d));
                    }
                }
                break;
            case 13:
                b(obj, obj2);
                break;
            case 14:
                ((ArrayList) obj).add(u61.j(-1, ((h40) obj3).X));
                break;
            case 15:
                c(obj, obj2);
                break;
            case 16:
                d(obj, obj2);
                break;
            case 17:
                e(obj, obj2);
                break;
            case 18:
                f(obj, obj2);
                break;
            case 19:
                g(obj, obj2);
                break;
            case 20:
                h(obj, obj2);
                break;
            case 21:
                i(obj, obj2);
                break;
            case 22:
                j(obj, obj2);
                break;
            default:
                ib1 ib1Var = (ib1) obj3;
                TLRPC.messages_WidgetPublicData messages_widgetpublicdata = (TLRPC.messages_WidgetPublicData) obj;
                ib1Var.e = 0;
                HashMap hashMap = jb1.k;
                StringBuilder sb3 = new StringBuilder();
                int i39 = ib1Var.a;
                sb3.append(i39);
                sb3.append("/");
                long j12 = ib1Var.b;
                sb3.append(j12);
                if (hashMap.get(sb3.toString()) == ib1Var) {
                    if (messages_widgetpublicdata != null) {
                        int i40 = messages_widgetpublicdata.period;
                        ib1Var.d = i40 <= 0 ? 30 : Math.max(5, Math.min(3600, i40));
                        if (messages_widgetpublicdata instanceof TLRPC.TL_messages_widgetPublicData) {
                            TLRPC.TL_messages_widgetPublicData tL_messages_widgetPublicData = (TLRPC.TL_messages_widgetPublicData) messages_widgetpublicdata;
                            long j13 = tL_messages_widgetPublicData.hash;
                            ib1Var.c = j13;
                            String str7 = tL_messages_widgetPublicData.data;
                            String w13 = jb1.w(str7);
                            for (gb1 gb1Var : jb1.a.values()) {
                                if (gb1Var.b == i39 && gb1Var.l == j12 && !gb1Var.k && (!TextUtils.equals(gb1Var.o, w13) || gb1Var.p != j13)) {
                                    gb1Var.p = j13;
                                    jb1.c(gb1Var, gb1Var.n, w13);
                                    TLRPC.TL_messageMediaWidget tL_messageMediaWidget = gb1Var.q;
                                    if (tL_messageMediaWidget != null) {
                                        tL_messageMediaWidget.public_data_hash = j13;
                                    }
                                    MessagesStorage.getInstance(i39).updateMessageWidgetData(gb1Var.c, gb1Var.d, str7 == null ? "" : str7, j13, null);
                                }
                            }
                        }
                    }
                    AndroidUtilities.runOnUIThread(ib1Var.f, ib1Var.d * 1000);
                    break;
                }
                break;
        }
    }
}
