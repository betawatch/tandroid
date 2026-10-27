package hi;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import fi.ua;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class f1 {
    public final SensorManager a;
    public Sensor b;
    public long c;
    public Sensor d;
    public long e;
    public Sensor f;
    public Sensor g;
    public long h;
    public Sensor i;
    public long j;
    public org.telegram.ui.web.x0 k;
    public boolean l;
    public ua m;
    public ua o;
    public ua q;
    public ua s;
    public final c1 n = new c1(this, 0);
    public final c1 p = new c1(this, 1);
    public final d1 r = new d1(this);
    public final e1 t = new e1(this);

    public f1(Context context) {
        this.a = (SensorManager) context.getSystemService("sensor");
    }

    public static int a(long j10) {
        if (j10 >= 160) {
            return 3;
        }
        return j10 >= 60 ? 2 : 1;
    }

    public final void b() {
        if (this.l) {
            return;
        }
        this.l = true;
        SensorManager sensorManager = this.a;
        if (sensorManager != null) {
            Sensor sensor = this.b;
            if (sensor != null) {
                sensorManager.unregisterListener(this.n, sensor);
            }
            ua uaVar = this.m;
            if (uaVar != null) {
                AndroidUtilities.cancelRunOnUIThread(uaVar);
                this.m = null;
            }
            Sensor sensor2 = this.d;
            if (sensor2 != null) {
                sensorManager.unregisterListener(this.p, sensor2);
            }
            ua uaVar2 = this.o;
            if (uaVar2 != null) {
                AndroidUtilities.cancelRunOnUIThread(uaVar2);
                this.o = null;
            }
            Sensor sensor3 = this.g;
            d1 d1Var = this.r;
            if (sensor3 != null) {
                sensorManager.unregisterListener(d1Var, sensor3);
            }
            Sensor sensor4 = this.f;
            if (sensor4 != null) {
                sensorManager.unregisterListener(d1Var, sensor4);
            }
            ua uaVar3 = this.q;
            if (uaVar3 != null) {
                AndroidUtilities.cancelRunOnUIThread(uaVar3);
                this.q = null;
            }
            Sensor sensor5 = this.i;
            if (sensor5 != null) {
                sensorManager.unregisterListener(this.t, sensor5);
            }
            ua uaVar4 = this.s;
            if (uaVar4 != null) {
                AndroidUtilities.cancelRunOnUIThread(uaVar4);
                this.s = null;
            }
        }
    }

    public final boolean c(long j10) {
        SensorManager sensorManager = this.a;
        if (sensorManager == null) {
            return false;
        }
        if (this.b == null) {
            Sensor defaultSensor = sensorManager.getDefaultSensor(1);
            this.b = defaultSensor;
            if (defaultSensor == null) {
                return false;
            }
            this.c = j10;
            if (!this.l) {
                sensorManager.registerListener(this.n, defaultSensor, a(j10));
            }
        }
        return true;
    }

    public final boolean d(long j10) {
        SensorManager sensorManager = this.a;
        if (sensorManager == null) {
            return false;
        }
        if (this.d == null) {
            Sensor defaultSensor = sensorManager.getDefaultSensor(4);
            this.d = defaultSensor;
            if (defaultSensor == null) {
                return false;
            }
            this.e = j10;
            if (!this.l) {
                sensorManager.registerListener(this.p, defaultSensor, a(j10));
            }
        }
        return true;
    }

    public final boolean e(long j10, boolean z10) {
        Sensor sensor;
        SensorManager sensorManager = this.a;
        if (sensorManager == null) {
            return false;
        }
        e1 e1Var = this.t;
        d1 d1Var = this.r;
        if (z10) {
            if (this.i != null) {
                ua uaVar = this.s;
                if (uaVar != null) {
                    AndroidUtilities.cancelRunOnUIThread(uaVar);
                    this.s = null;
                }
                if (!this.l && (sensor = this.i) != null) {
                    sensorManager.unregisterListener(e1Var, sensor);
                }
                this.i = null;
            }
            if (this.f == null || this.g == null) {
                this.g = sensorManager.getDefaultSensor(1);
                Sensor defaultSensor = sensorManager.getDefaultSensor(2);
                this.f = defaultSensor;
                Sensor sensor2 = this.g;
                if (sensor2 == null || defaultSensor == null) {
                    return false;
                }
                this.h = j10;
                if (!this.l) {
                    sensorManager.registerListener(d1Var, sensor2, a(j10));
                    sensorManager.registerListener(d1Var, this.f, a(j10));
                    return true;
                }
            }
        } else {
            if (this.f != null || this.g != null) {
                ua uaVar2 = this.q;
                if (uaVar2 != null) {
                    AndroidUtilities.cancelRunOnUIThread(uaVar2);
                    this.q = null;
                }
                if (!this.l) {
                    Sensor sensor3 = this.g;
                    if (sensor3 != null) {
                        sensorManager.unregisterListener(d1Var, sensor3);
                    }
                    Sensor sensor4 = this.f;
                    if (sensor4 != null) {
                        sensorManager.unregisterListener(d1Var, sensor4);
                    }
                }
                this.g = null;
                this.f = null;
            }
            if (this.i == null) {
                Sensor defaultSensor2 = sensorManager.getDefaultSensor(15);
                this.i = defaultSensor2;
                if (defaultSensor2 == null) {
                    return false;
                }
                this.j = j10;
                if (!this.l) {
                    sensorManager.registerListener(e1Var, defaultSensor2, a(j10));
                }
            }
        }
        return true;
    }

    public final boolean f() {
        SensorManager sensorManager = this.a;
        if (sensorManager == null) {
            return false;
        }
        Sensor sensor = this.b;
        if (sensor == null) {
            return true;
        }
        if (!this.l) {
            sensorManager.unregisterListener(this.n, sensor);
        }
        ua uaVar = this.m;
        if (uaVar != null) {
            AndroidUtilities.cancelRunOnUIThread(uaVar);
            this.m = null;
        }
        this.b = null;
        return true;
    }

    public final boolean g() {
        SensorManager sensorManager = this.a;
        if (sensorManager == null) {
            return false;
        }
        Sensor sensor = this.d;
        if (sensor == null) {
            return true;
        }
        if (!this.l) {
            sensorManager.unregisterListener(this.p, sensor);
        }
        ua uaVar = this.o;
        if (uaVar != null) {
            AndroidUtilities.cancelRunOnUIThread(uaVar);
            this.o = null;
        }
        this.d = null;
        return true;
    }

    public final boolean h() {
        SensorManager sensorManager = this.a;
        if (sensorManager == null) {
            return false;
        }
        Sensor sensor = this.g;
        if (sensor == null && this.f == null && this.i == null) {
            return true;
        }
        if (!this.l) {
            d1 d1Var = this.r;
            if (sensor != null) {
                sensorManager.unregisterListener(d1Var, sensor);
            }
            Sensor sensor2 = this.f;
            if (sensor2 != null) {
                sensorManager.unregisterListener(d1Var, sensor2);
            }
            Sensor sensor3 = this.i;
            if (sensor3 != null) {
                sensorManager.unregisterListener(this.t, sensor3);
            }
        }
        ua uaVar = this.q;
        if (uaVar != null) {
            AndroidUtilities.cancelRunOnUIThread(uaVar);
            this.q = null;
        }
        ua uaVar2 = this.s;
        if (uaVar2 != null) {
            AndroidUtilities.cancelRunOnUIThread(uaVar2);
            this.s = null;
        }
        this.g = null;
        this.f = null;
        this.i = null;
        return true;
    }
}
