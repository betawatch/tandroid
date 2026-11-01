package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final class pz {
    public int A;
    public int B;
    public int C;
    public Object D;
    public gj E;
    public boolean F;
    public boolean G;
    public TL_stories.StoryItem H;
    public TL_stories.StoryItem I;
    public org.telegram.ui.kn J;
    public tw K;
    public boolean L;
    public String M;
    public int N;
    public long O;
    public long P;
    public long Q;
    public long R;
    public boolean S;
    public pj T;
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
    public y20 e;
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
    public kj r;
    public kj s;
    public TLRPC.WebPage t;
    public boolean u;
    public kj v;
    public ArrayList w;
    public TLRPC.ReplyMarkup x;
    public HashMap y;
    public boolean z;

    public static pz a(long j10, String str) {
        return c(str, null, null, null, null, null, null, null, null, null, j10, null, null, null, null, true, null, null, null, null, false, 0, 0, 0, null, null, false, false);
    }

    public static pz b(String str, long j10, kj kjVar, kj kjVar2, TLRPC.WebPage webPage, boolean z10, ArrayList arrayList, TLRPC.ReplyMarkup replyMarkup, HashMap hashMap, boolean z11, int i10, int i11, gj gjVar, boolean z12) {
        return c(str, null, null, null, null, null, null, null, null, null, j10, null, kjVar, kjVar2, webPage, z10, null, arrayList, replyMarkup, hashMap, z11, i10, i11, 0, null, gjVar, z12, false);
    }

    public static pz c(String str, String str2, TLRPC.MessageMedia messageMedia, TLRPC.TL_photo tL_photo, y20 y20Var, TLRPC.User user, TLRPC.TL_document tL_document, TLRPC.TL_game tL_game, TLRPC.TL_messageMediaPoll tL_messageMediaPoll, TLRPC.TL_messageMediaInvoice tL_messageMediaInvoice, long j10, String str3, kj kjVar, kj kjVar2, TLRPC.WebPage webPage, boolean z10, kj kjVar3, ArrayList arrayList, TLRPC.ReplyMarkup replyMarkup, HashMap hashMap, boolean z11, int i10, int i11, int i12, Object obj, gj gjVar, boolean z12, boolean z13) {
        pz pzVar = new pz();
        pzVar.a = str;
        pzVar.b = str2;
        pzVar.c = messageMedia;
        pzVar.d = tL_photo;
        pzVar.e = y20Var;
        pzVar.f = user;
        pzVar.g = tL_document;
        pzVar.h = tL_game;
        pzVar.i = tL_messageMediaPoll;
        pzVar.m = tL_messageMediaInvoice;
        pzVar.p = j10;
        pzVar.q = str3;
        pzVar.r = kjVar;
        pzVar.s = kjVar2;
        pzVar.t = webPage;
        pzVar.u = z10;
        pzVar.v = kjVar3;
        pzVar.w = arrayList;
        pzVar.x = replyMarkup;
        pzVar.y = hashMap;
        pzVar.z = z11;
        pzVar.A = i10;
        pzVar.B = i11;
        pzVar.C = i12;
        pzVar.D = obj;
        pzVar.E = gjVar;
        pzVar.F = z12;
        pzVar.G = z13;
        return pzVar;
    }

    public static pz d(TLRPC.MessageMedia messageMedia, long j10, kj kjVar, kj kjVar2, TLRPC.ReplyMarkup replyMarkup, HashMap hashMap, boolean z10, int i10) {
        return c(null, null, messageMedia, null, null, null, null, null, null, null, j10, null, kjVar, kjVar2, null, true, null, null, replyMarkup, hashMap, z10, i10, 0, 0, null, null, false, false);
    }

    public static pz e(TLRPC.TL_document tL_document, y20 y20Var, String str, long j10, kj kjVar, kj kjVar2, String str2, ArrayList arrayList, HashMap hashMap, boolean z10, int i10, int i11, int i12, Object obj, boolean z11) {
        return c(null, str2, null, null, y20Var, null, tL_document, null, null, null, j10, str, kjVar, kjVar2, null, true, null, arrayList, null, hashMap, z10, i10, i11, i12, obj, null, false, z11);
    }

    public static pz f(TLRPC.TL_document tL_document, y20 y20Var, String str, long j10, kj kjVar, kj kjVar2, String str2, ArrayList arrayList, TLRPC.ReplyMarkup replyMarkup, HashMap hashMap, boolean z10, int i10, int i11, int i12, Object obj, gj gjVar, boolean z11) {
        return c(null, str2, null, null, y20Var, null, tL_document, null, null, null, j10, str, kjVar, kjVar2, null, true, null, arrayList, replyMarkup, hashMap, z10, i10, i11, i12, obj, gjVar, z11, false);
    }

    public static pz g(TLRPC.User user, long j10, kj kjVar, kj kjVar2, TLRPC.ReplyMarkup replyMarkup, HashMap hashMap, boolean z10, int i10, int i11) {
        return c(null, null, null, null, null, user, null, null, null, null, j10, null, kjVar, kjVar2, null, true, null, null, replyMarkup, hashMap, z10, i10, i11, 0, null, null, false, false);
    }
}
