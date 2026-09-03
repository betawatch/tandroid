package df;

import android.graphics.Bitmap;
import android.util.Log;
import android.view.View;
import c2.p;
import c5.j;
import j$.util.Objects;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final /* synthetic */ class b {
    public final /* synthetic */ int a;
    public final /* synthetic */ e b;

    public /* synthetic */ b(e eVar, int i10) {
        this.a = i10;
        this.b = eVar;
    }

    public final void a(boolean z4) {
        Bitmap bitmap;
        switch (this.a) {
            case 0:
                final int i10 = 2;
                final e eVar = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: df.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        Bitmap bitmap2;
                        switch (i10) {
                            case 0:
                                e eVar2 = eVar;
                                if (eVar2.a == 4) {
                                    eVar2.j.a.b().removeView(eVar2.f);
                                    eVar2.i = null;
                                    eVar2.f = null;
                                    eVar2.g = null;
                                    g gVar = eVar2.e;
                                    if (gVar != null) {
                                        gVar.b();
                                        eVar2.e = null;
                                    }
                                    g gVar2 = eVar2.d;
                                    if (gVar2 != null) {
                                        gVar2.b();
                                        eVar2.d = null;
                                    }
                                    j jVar = eVar2.h;
                                    if (((f) jVar.e) != null) {
                                        ((View) jVar.a).setBackground(null);
                                        jVar.e = null;
                                    }
                                    if (((f) jVar.d) == null && ((f) jVar.e) == null && (bitmap2 = (Bitmap) jVar.c) != null) {
                                        bitmap2.recycle();
                                        jVar.c = null;
                                    }
                                    eVar2.a = 0;
                                    Log.i("PIP_DEBUG", "[HANDLER] detach");
                                    if (eVar2.n) {
                                        eVar2.g();
                                        break;
                                    }
                                } else {
                                    FileLog.e("[PIP_DEBUG] wrong pip state STATE_PRE_DETACHED_2: " + eVar2.a);
                                    break;
                                }
                                break;
                            case 1:
                                e eVar3 = eVar;
                                if (eVar3.a == 1) {
                                    Log.i("PIP_DEBUG", "[HANDLER] attach");
                                    eVar3.h.A();
                                    eVar3.j.g.e(new p(ApplicationLoader.applicationHandler, new b(eVar3, 2), 400L));
                                    eVar3.a = 2;
                                    if (!eVar3.n) {
                                        eVar3.h();
                                        break;
                                    }
                                } else {
                                    FileLog.e("[PIP_DEBUG] wrong pip state STATE_PRE_ATTACHED: " + eVar3.a);
                                    break;
                                }
                                break;
                            default:
                                e eVar4 = eVar;
                                bf.f fVar = eVar4.j;
                                if (eVar4.a == 3) {
                                    fVar.g.a(new p(ApplicationLoader.applicationHandler, new b(eVar4, 3), 400L));
                                    eVar4.f.invalidate();
                                    eVar4.a = 4;
                                    AndroidUtilities.doOnPreDraw(fVar.j, new p(ApplicationLoader.applicationHandler, new b(eVar4, 4), 300L));
                                    Log.i("PIP_DEBUG", "[HANDLER] pre detach 2");
                                    break;
                                } else {
                                    FileLog.e("[PIP_DEBUG] wrong pip state STATE_PRE_DETACHED_1: " + eVar4.a);
                                    break;
                                }
                        }
                    }
                });
                break;
            case 1:
                final int i11 = 1;
                final e eVar2 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: df.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        Bitmap bitmap2;
                        switch (i11) {
                            case 0:
                                e eVar22 = eVar2;
                                if (eVar22.a == 4) {
                                    eVar22.j.a.b().removeView(eVar22.f);
                                    eVar22.i = null;
                                    eVar22.f = null;
                                    eVar22.g = null;
                                    g gVar = eVar22.e;
                                    if (gVar != null) {
                                        gVar.b();
                                        eVar22.e = null;
                                    }
                                    g gVar2 = eVar22.d;
                                    if (gVar2 != null) {
                                        gVar2.b();
                                        eVar22.d = null;
                                    }
                                    j jVar = eVar22.h;
                                    if (((f) jVar.e) != null) {
                                        ((View) jVar.a).setBackground(null);
                                        jVar.e = null;
                                    }
                                    if (((f) jVar.d) == null && ((f) jVar.e) == null && (bitmap2 = (Bitmap) jVar.c) != null) {
                                        bitmap2.recycle();
                                        jVar.c = null;
                                    }
                                    eVar22.a = 0;
                                    Log.i("PIP_DEBUG", "[HANDLER] detach");
                                    if (eVar22.n) {
                                        eVar22.g();
                                        break;
                                    }
                                } else {
                                    FileLog.e("[PIP_DEBUG] wrong pip state STATE_PRE_DETACHED_2: " + eVar22.a);
                                    break;
                                }
                                break;
                            case 1:
                                e eVar3 = eVar2;
                                if (eVar3.a == 1) {
                                    Log.i("PIP_DEBUG", "[HANDLER] attach");
                                    eVar3.h.A();
                                    eVar3.j.g.e(new p(ApplicationLoader.applicationHandler, new b(eVar3, 2), 400L));
                                    eVar3.a = 2;
                                    if (!eVar3.n) {
                                        eVar3.h();
                                        break;
                                    }
                                } else {
                                    FileLog.e("[PIP_DEBUG] wrong pip state STATE_PRE_ATTACHED: " + eVar3.a);
                                    break;
                                }
                                break;
                            default:
                                e eVar4 = eVar2;
                                bf.f fVar = eVar4.j;
                                if (eVar4.a == 3) {
                                    fVar.g.a(new p(ApplicationLoader.applicationHandler, new b(eVar4, 3), 400L));
                                    eVar4.f.invalidate();
                                    eVar4.a = 4;
                                    AndroidUtilities.doOnPreDraw(fVar.j, new p(ApplicationLoader.applicationHandler, new b(eVar4, 4), 300L));
                                    Log.i("PIP_DEBUG", "[HANDLER] pre detach 2");
                                    break;
                                } else {
                                    FileLog.e("[PIP_DEBUG] wrong pip state STATE_PRE_DETACHED_1: " + eVar4.a);
                                    break;
                                }
                        }
                    }
                });
                break;
            case 2:
                j jVar = this.b.h;
                if (((f) jVar.e) != null) {
                    ((View) jVar.a).setBackground(null);
                    jVar.e = null;
                }
                if (((f) jVar.d) == null && ((f) jVar.e) == null && (bitmap = (Bitmap) jVar.c) != null) {
                    bitmap.recycle();
                    jVar.c = null;
                }
                Log.i("PIP_DEBUG", "[HANDLER] on new source render first frame " + z4);
                break;
            case 3:
                Log.i("PIP_DEBUG", "[HANDLER] on old source render first frame " + z4);
                j jVar2 = this.b.h;
                Objects.requireNonNull(jVar2);
                AndroidUtilities.runOnUIThread(new ag.d(jVar2, 21));
                break;
            default:
                final int i12 = 0;
                final e eVar3 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: df.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        Bitmap bitmap2;
                        switch (i12) {
                            case 0:
                                e eVar22 = eVar3;
                                if (eVar22.a == 4) {
                                    eVar22.j.a.b().removeView(eVar22.f);
                                    eVar22.i = null;
                                    eVar22.f = null;
                                    eVar22.g = null;
                                    g gVar = eVar22.e;
                                    if (gVar != null) {
                                        gVar.b();
                                        eVar22.e = null;
                                    }
                                    g gVar2 = eVar22.d;
                                    if (gVar2 != null) {
                                        gVar2.b();
                                        eVar22.d = null;
                                    }
                                    j jVar3 = eVar22.h;
                                    if (((f) jVar3.e) != null) {
                                        ((View) jVar3.a).setBackground(null);
                                        jVar3.e = null;
                                    }
                                    if (((f) jVar3.d) == null && ((f) jVar3.e) == null && (bitmap2 = (Bitmap) jVar3.c) != null) {
                                        bitmap2.recycle();
                                        jVar3.c = null;
                                    }
                                    eVar22.a = 0;
                                    Log.i("PIP_DEBUG", "[HANDLER] detach");
                                    if (eVar22.n) {
                                        eVar22.g();
                                        break;
                                    }
                                } else {
                                    FileLog.e("[PIP_DEBUG] wrong pip state STATE_PRE_DETACHED_2: " + eVar22.a);
                                    break;
                                }
                                break;
                            case 1:
                                e eVar32 = eVar3;
                                if (eVar32.a == 1) {
                                    Log.i("PIP_DEBUG", "[HANDLER] attach");
                                    eVar32.h.A();
                                    eVar32.j.g.e(new p(ApplicationLoader.applicationHandler, new b(eVar32, 2), 400L));
                                    eVar32.a = 2;
                                    if (!eVar32.n) {
                                        eVar32.h();
                                        break;
                                    }
                                } else {
                                    FileLog.e("[PIP_DEBUG] wrong pip state STATE_PRE_ATTACHED: " + eVar32.a);
                                    break;
                                }
                                break;
                            default:
                                e eVar4 = eVar3;
                                bf.f fVar = eVar4.j;
                                if (eVar4.a == 3) {
                                    fVar.g.a(new p(ApplicationLoader.applicationHandler, new b(eVar4, 3), 400L));
                                    eVar4.f.invalidate();
                                    eVar4.a = 4;
                                    AndroidUtilities.doOnPreDraw(fVar.j, new p(ApplicationLoader.applicationHandler, new b(eVar4, 4), 300L));
                                    Log.i("PIP_DEBUG", "[HANDLER] pre detach 2");
                                    break;
                                } else {
                                    FileLog.e("[PIP_DEBUG] wrong pip state STATE_PRE_DETACHED_1: " + eVar4.a);
                                    break;
                                }
                        }
                    }
                });
                break;
        }
    }
}
