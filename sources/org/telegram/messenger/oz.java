package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class oz {
    public int A;
    public int B;
    public int C;
    public Object D;
    public fj E;
    public boolean F;
    public boolean G;
    public TL_stories.StoryItem H;
    public TL_stories.StoryItem I;
    public org.telegram.ui.kn J;
    public sw K;
    public boolean L;
    public String M;
    public int N;
    public long O;
    public long P;
    public long Q;
    public long R;
    public boolean S;
    public oj T;
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
    public x20 e;
    public TLRPC.User f;
    public TLRPC.TL_document g;
    public TLRPC.TL_game h;
    public TLRPC.TL_messageMediaPoll i;
    public ih.i j;
    public int k;
    public TLRPC.TL_messageMediaToDo l;
    public TLRPC.TL_messageMediaInvoice m;
    public TLRPC.TL_messageMediaWebPage n;
    public TLRPC.PhotoSize o;
    public long p;
    public String q;
    public jj r;
    public jj s;
    public TLRPC.WebPage t;
    public boolean u;
    public jj v;
    public ArrayList w;
    public TLRPC.ReplyMarkup x;
    public HashMap y;
    public boolean z;

    public static oz a(long j10, String str) {
        return c(str, null, null, null, null, null, null, null, null, null, j10, null, null, null, null, true, null, null, null, null, false, 0, 0, 0, null, null, false, false);
    }

    public static oz b(String str, long j10, jj jjVar, jj jjVar2, TLRPC.WebPage webPage, boolean z10, ArrayList arrayList, TLRPC.ReplyMarkup replyMarkup, HashMap hashMap, boolean z11, int i10, int i11, fj fjVar, boolean z12) {
        return c(str, null, null, null, null, null, null, null, null, null, j10, null, jjVar, jjVar2, webPage, z10, null, arrayList, replyMarkup, hashMap, z11, i10, i11, 0, null, fjVar, z12, false);
    }

    public static oz c(String str, String str2, TLRPC.MessageMedia messageMedia, TLRPC.TL_photo tL_photo, x20 x20Var, TLRPC.User user, TLRPC.TL_document tL_document, TLRPC.TL_game tL_game, TLRPC.TL_messageMediaPoll tL_messageMediaPoll, TLRPC.TL_messageMediaInvoice tL_messageMediaInvoice, long j10, String str3, jj jjVar, jj jjVar2, TLRPC.WebPage webPage, boolean z10, jj jjVar3, ArrayList arrayList, TLRPC.ReplyMarkup replyMarkup, HashMap hashMap, boolean z11, int i10, int i11, int i12, Object obj, fj fjVar, boolean z12, boolean z13) {
        oz ozVar = new oz();
        ozVar.a = str;
        ozVar.b = str2;
        ozVar.c = messageMedia;
        ozVar.d = tL_photo;
        ozVar.e = x20Var;
        ozVar.f = user;
        ozVar.g = tL_document;
        ozVar.h = tL_game;
        ozVar.i = tL_messageMediaPoll;
        ozVar.m = tL_messageMediaInvoice;
        ozVar.p = j10;
        ozVar.q = str3;
        ozVar.r = jjVar;
        ozVar.s = jjVar2;
        ozVar.t = webPage;
        ozVar.u = z10;
        ozVar.v = jjVar3;
        ozVar.w = arrayList;
        ozVar.x = replyMarkup;
        ozVar.y = hashMap;
        ozVar.z = z11;
        ozVar.A = i10;
        ozVar.B = i11;
        ozVar.C = i12;
        ozVar.D = obj;
        ozVar.E = fjVar;
        ozVar.F = z12;
        ozVar.G = z13;
        return ozVar;
    }

    public static oz d(TLRPC.MessageMedia messageMedia, long j10, jj jjVar, jj jjVar2, TLRPC.ReplyMarkup replyMarkup, HashMap hashMap, boolean z10, int i10) {
        return c(null, null, messageMedia, null, null, null, null, null, null, null, j10, null, jjVar, jjVar2, null, true, null, null, replyMarkup, hashMap, z10, i10, 0, 0, null, null, false, false);
    }

    public static oz e(TLRPC.TL_document tL_document, x20 x20Var, String str, long j10, jj jjVar, jj jjVar2, String str2, ArrayList arrayList, HashMap hashMap, boolean z10, int i10, int i11, int i12, Object obj, boolean z11) {
        return c(null, str2, null, null, x20Var, null, tL_document, null, null, null, j10, str, jjVar, jjVar2, null, true, null, arrayList, null, hashMap, z10, i10, i11, i12, obj, null, false, z11);
    }

    public static oz f(TLRPC.TL_document tL_document, x20 x20Var, String str, long j10, jj jjVar, jj jjVar2, String str2, ArrayList arrayList, TLRPC.ReplyMarkup replyMarkup, HashMap hashMap, boolean z10, int i10, int i11, int i12, Object obj, fj fjVar, boolean z11) {
        return c(null, str2, null, null, x20Var, null, tL_document, null, null, null, j10, str, jjVar, jjVar2, null, true, null, arrayList, replyMarkup, hashMap, z10, i10, i11, i12, obj, fjVar, z11, false);
    }

    public static oz g(TLRPC.User user, long j10, jj jjVar, jj jjVar2, TLRPC.ReplyMarkup replyMarkup, HashMap hashMap, boolean z10, int i10, int i11) {
        return c(null, null, null, null, null, user, null, null, null, null, j10, null, jjVar, jjVar2, null, true, null, null, replyMarkup, hashMap, z10, i10, i11, 0, null, null, false, false);
    }
}
