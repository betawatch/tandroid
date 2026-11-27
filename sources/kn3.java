// default package

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLiteException;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Dictation.DictationLid;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class kn3 implements Runnable {
    public final /* synthetic */ byte a = 3;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ kn3(ln3 ln3Var, boolean z, float[] fArr, long j, int i) {
        this.e = ln3Var;
        this.d = z;
        this.f = fArr;
        this.c = j;
        this.b = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c2  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        TL_stories.StoryItem storyItem;
        SQLiteCursor queryFinalized;
        byte b = this.a;
        r4 = null;
        r4 = null;
        r4 = null;
        r4 = null;
        SQLitePreparedStatement sQLitePreparedStatement = null;
        l6b a = null;
        int i = this.b;
        long j = this.c;
        boolean z = this.d;
        Object obj = this.f;
        Object obj2 = this.e;
        switch (b) {
            case 0:
                ln3 ln3Var = (ln3) obj2;
                float[] fArr = (float[]) obj;
                ExecutorService executorService = DictationLid.a;
                ln3Var.a(z ? fArr : null, j, i);
                return;
            case 1:
                LaunchActivity launchActivity = (LaunchActivity) obj2;
                TLObject tLObject = (TLObject) obj;
                String str = LaunchActivity.C1;
                if (tLObject instanceof TL_stories.TL_stories_stories) {
                    TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) tLObject;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= tL_stories_stories.stories.size()) {
                            storyItem = null;
                        } else if (tL_stories_stories.stories.get(i2).id == i) {
                            storyItem = tL_stories_stories.stories.get(i2);
                        } else {
                            i2++;
                        }
                    }
                    if (storyItem != null) {
                        storyItem.dialogId = j;
                        e Q = LaunchActivity.Q();
                        if (Q != null) {
                            if (Q instanceof uj3) {
                                try {
                                    a = l6b.a(((uj3) Q).F0.h);
                                } catch (Exception unused) {
                                }
                            }
                            l6b l6bVar = a;
                            Q.getOrCreateStoryViewer().y();
                            ArrayList arrayList = new ArrayList();
                            arrayList.add(Long.valueOf(j));
                            if (z) {
                                Q.getOrCreateStoryViewer().w1 = true;
                            }
                            Q.getOrCreateStoryViewer().K(launchActivity, storyItem, arrayList, 0, null, null, l6bVar, false);
                            return;
                        }
                        return;
                    }
                }
                d31.Y().Q(R.raw.error, 36, ob6.M0(2131744260, null)).k(false);
                return;
            case 2:
                kf7 kf7Var = (kf7) obj2;
                String str2 = (String) obj;
                if (z) {
                    try {
                        SQLiteDatabase sQLiteDatabase = kf7Var.b;
                        StringBuilder sb = new StringBuilder();
                        Locale locale = Locale.US;
                        sb.append("SELECT " + str2 + " FROM dialogs WHERE did = ");
                        sb.append(j);
                        queryFinalized = sQLiteDatabase.queryFinalized(sb.toString(), new Object[0]);
                        try {
                            try {
                                r2 = queryFinalized.next() ? Math.max(0, queryFinalized.intValue(0)) : 0;
                                queryFinalized.dispose();
                            } catch (SQLiteException e) {
                                e = e;
                                e.printStackTrace();
                                if (sQLitePreparedStatement != null) {
                                    sQLitePreparedStatement.dispose();
                                }
                                if (queryFinalized == null) {
                                    queryFinalized.dispose();
                                    return;
                                }
                                return;
                            }
                        } catch (Throwable th) {
                            th = th;
                            if (sQLitePreparedStatement != null) {
                                sQLitePreparedStatement.dispose();
                            }
                            if (queryFinalized != null) {
                                queryFinalized.dispose();
                            }
                            throw th;
                        }
                    } catch (SQLiteException e2) {
                        e = e2;
                        queryFinalized = null;
                    } catch (Throwable th2) {
                        th = th2;
                        queryFinalized = null;
                        if (sQLitePreparedStatement != null) {
                        }
                        if (queryFinalized != null) {
                        }
                        throw th;
                    }
                }
                int i3 = r2 + i;
                SQLiteDatabase sQLiteDatabase2 = kf7Var.getMessagesStorage().b;
                Locale locale2 = Locale.US;
                SQLitePreparedStatement executeFast = sQLiteDatabase2.executeFast("UPDATE dialogs SET " + str2 + " = ? WHERE did = ?");
                try {
                    executeFast.bindInteger(1, i3);
                    executeFast.bindLong(2, j);
                    executeFast.step();
                    executeFast.dispose();
                    return;
                } catch (SQLiteException e3) {
                    e = e3;
                    queryFinalized = null;
                    sQLitePreparedStatement = executeFast;
                    e.printStackTrace();
                    if (sQLitePreparedStatement != null) {
                    }
                    if (queryFinalized == null) {
                    }
                } catch (Throwable th3) {
                    th = th3;
                    queryFinalized = null;
                    sQLitePreparedStatement = executeFast;
                    if (sQLitePreparedStatement != null) {
                    }
                    if (queryFinalized != null) {
                    }
                    throw th;
                }
            default:
                ((kf7) obj2).E1(this.c, (List) obj, this.d, true, this.b);
                return;
        }
    }

    public /* synthetic */ kn3(kf7 kf7Var, long j, List list, boolean z, int i) {
        this.e = kf7Var;
        this.c = j;
        this.f = list;
        this.d = z;
        this.b = i;
    }

    public /* synthetic */ kn3(kf7 kf7Var, boolean z, String str, long j, int i, String str2) {
        this.e = kf7Var;
        this.d = z;
        this.f = str;
        this.c = j;
        this.b = i;
    }

    public /* synthetic */ kn3(LaunchActivity launchActivity, TLObject tLObject, int i, long j, boolean z) {
        this.e = launchActivity;
        this.f = tLObject;
        this.b = i;
        this.c = j;
        this.d = z;
    }
}
