package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class wy {
    public int A;
    public int B;
    public int C;
    public Object D;
    public vi E;
    public boolean F;
    public boolean G;
    public TL_stories.StoryItem H;
    public TL_stories.StoryItem I;
    public org.telegram.ui.mm J;
    public zv K;
    public boolean L;
    public String M;
    public int N;
    public long O;
    public long P;
    public long Q;
    public long R;
    public boolean S;
    public ej T;
    public boolean U;
    public long V;
    public long W;
    public long X;
    public TL_iv.RichMessage Y;
    public ArrayList Z;
    public String a;
    public String b;
    public TLRPC.MessageMedia c;
    public TLRPC.TL_photo d;
    public b20 e;
    public TLRPC.User f;
    public TLRPC.TL_document g;
    public TLRPC.TL_game h;
    public TLRPC.TL_messageMediaPoll i;
    public th.f j;
    public int k;
    public TLRPC.TL_messageMediaToDo l;
    public TLRPC.TL_messageMediaInvoice m;
    public TLRPC.TL_messageMediaWebPage n;
    public TLRPC.PhotoSize o;
    public long p;
    public String q;
    public zi r;
    public zi s;
    public TLRPC.WebPage t;
    public boolean u;
    public zi v;
    public ArrayList w;
    public TLRPC.ReplyMarkup x;
    public HashMap y;
    public boolean z;

    public static wy a(long j10, String str) {
        return c(str, null, null, null, null, null, null, null, null, null, j10, null, null, null, null, true, null, null, null, null, false, 0, 0, 0, null, null, false, false);
    }

    public static wy b(String str, long j10, zi ziVar, zi ziVar2, TLRPC.WebPage webPage, boolean z10, ArrayList arrayList, TLRPC.ReplyMarkup replyMarkup, HashMap hashMap, boolean z11, int i3, int i10, vi viVar, boolean z12) {
        return c(str, null, null, null, null, null, null, null, null, null, j10, null, ziVar, ziVar2, webPage, z10, null, arrayList, replyMarkup, hashMap, z11, i3, i10, 0, null, viVar, z12, false);
    }

    public static wy c(String str, String str2, TLRPC.MessageMedia messageMedia, TLRPC.TL_photo tL_photo, b20 b20Var, TLRPC.User user, TLRPC.TL_document tL_document, TLRPC.TL_game tL_game, TLRPC.TL_messageMediaPoll tL_messageMediaPoll, TLRPC.TL_messageMediaInvoice tL_messageMediaInvoice, long j10, String str3, zi ziVar, zi ziVar2, TLRPC.WebPage webPage, boolean z10, zi ziVar3, ArrayList arrayList, TLRPC.ReplyMarkup replyMarkup, HashMap hashMap, boolean z11, int i3, int i10, int i11, Object obj, vi viVar, boolean z12, boolean z13) {
        wy wyVar = new wy();
        wyVar.a = str;
        wyVar.b = str2;
        wyVar.c = messageMedia;
        wyVar.d = tL_photo;
        wyVar.e = b20Var;
        wyVar.f = user;
        wyVar.g = tL_document;
        wyVar.h = tL_game;
        wyVar.i = tL_messageMediaPoll;
        wyVar.m = tL_messageMediaInvoice;
        wyVar.p = j10;
        wyVar.q = str3;
        wyVar.r = ziVar;
        wyVar.s = ziVar2;
        wyVar.t = webPage;
        wyVar.u = z10;
        wyVar.v = ziVar3;
        wyVar.w = arrayList;
        wyVar.x = replyMarkup;
        wyVar.y = hashMap;
        wyVar.z = z11;
        wyVar.A = i3;
        wyVar.B = i10;
        wyVar.C = i11;
        wyVar.D = obj;
        wyVar.E = viVar;
        wyVar.F = z12;
        wyVar.G = z13;
        return wyVar;
    }

    public static wy d(TLRPC.MessageMedia messageMedia, long j10, zi ziVar, zi ziVar2, TLRPC.ReplyMarkup replyMarkup, HashMap hashMap, boolean z10, int i3) {
        return c(null, null, messageMedia, null, null, null, null, null, null, null, j10, null, ziVar, ziVar2, null, true, null, null, replyMarkup, hashMap, z10, i3, 0, 0, null, null, false, false);
    }

    public static wy e(TLRPC.TL_document tL_document, b20 b20Var, String str, long j10, zi ziVar, zi ziVar2, String str2, ArrayList arrayList, HashMap hashMap, boolean z10, int i3, int i10, int i11, Object obj, boolean z11) {
        return c(null, str2, null, null, b20Var, null, tL_document, null, null, null, j10, str, ziVar, ziVar2, null, true, null, arrayList, null, hashMap, z10, i3, i10, i11, obj, null, false, z11);
    }

    public static wy f(TLRPC.TL_document tL_document, b20 b20Var, String str, long j10, zi ziVar, zi ziVar2, String str2, ArrayList arrayList, TLRPC.ReplyMarkup replyMarkup, HashMap hashMap, boolean z10, int i3, int i10, int i11, Object obj, vi viVar, boolean z11) {
        return c(null, str2, null, null, b20Var, null, tL_document, null, null, null, j10, str, ziVar, ziVar2, null, true, null, arrayList, replyMarkup, hashMap, z10, i3, i10, i11, obj, viVar, z11, false);
    }

    public static wy g(TLRPC.User user, long j10, zi ziVar, zi ziVar2, TLRPC.ReplyMarkup replyMarkup, HashMap hashMap, boolean z10, int i3, int i10) {
        return c(null, null, null, null, null, user, null, null, null, null, j10, null, ziVar, ziVar2, null, true, null, null, replyMarkup, hashMap, z10, i3, i10, 0, null, null, false, false);
    }
}
