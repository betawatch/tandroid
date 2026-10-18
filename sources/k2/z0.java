package k2;

import android.media.AudioDescriptor;
import android.media.AudioDeviceInfo;
import android.media.AudioProfile;
import android.os.Build;
import e9.x1;
import j$.util.Comparator$-CC;
import j$.util.Comparator$-EL;
import j$.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
import v7.c9;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes.dex */
public abstract class z0 {
    public static final x1 a = e9.n0.y(12);

    public static e9.n0 a(AudioDeviceInfo audioDeviceInfo) {
        List<AudioProfile> audioProfiles = audioDeviceInfo.getAudioProfiles();
        TreeSet treeSet = new TreeSet(Comparator$-EL.reversed(Comparator$-CC.comparing(new f(0))));
        for (AudioProfile audioProfile : audioProfiles) {
            if (audioProfile.getEncapsulationType() != 1 && e2.m0.M(audioProfile.getFormat())) {
                for (int i10 : audioProfile.getChannelMasks()) {
                    treeSet.add(Integer.valueOf(i10));
                }
            }
        }
        return e9.n0.u(treeSet);
    }

    public static e9.n0 b(AudioDeviceInfo audioDeviceInfo) {
        int type;
        e9.n0 n0Var;
        int speakerLayoutChannelMask;
        boolean a2 = c9.a(audioDeviceInfo.getType());
        x1 x1Var = a;
        if (!a2) {
            if (audioDeviceInfo.getType() == 1) {
                return e9.n0.y(4);
            }
            if (audioDeviceInfo.getType() == 2) {
                if (Build.VERSION.SDK_INT >= 36 && (speakerLayoutChannelMask = audioDeviceInfo.getSpeakerLayoutChannelMask()) != 0 && speakerLayoutChannelMask != 1) {
                    return e9.n0.y(Integer.valueOf(speakerLayoutChannelMask));
                }
                e2.a.l("SpeakerLayoutUtil", "Built-in speaker's getSpeakerLayoutChannelMask not usable, defaulting to stereo.");
                return x1Var;
            }
            int i10 = Build.VERSION.SDK_INT;
            if (i10 < 31 || audioDeviceInfo.getType() != 10) {
                if (i10 >= 31) {
                    int type2 = audioDeviceInfo.getType();
                    if (i10 >= 31 && type2 == 29) {
                        e9.n0 a10 = a(audioDeviceInfo);
                        if (!a10.isEmpty()) {
                            return a10;
                        }
                        List<AudioDescriptor> audioDescriptors = audioDeviceInfo.getAudioDescriptors();
                        if (i10 >= 34) {
                            if (i10 < 34 || audioDescriptors == null) {
                                e9.l0 l0Var = e9.n0.b;
                                n0Var = x1.e;
                            } else {
                                ArrayList arrayList = new ArrayList();
                                Iterator<AudioDescriptor> it = audioDescriptors.iterator();
                                while (it.hasNext()) {
                                    AudioDescriptor b10 = j2.e.b(it.next());
                                    if (b10.getStandard() == 2) {
                                        byte[] descriptor = b10.getDescriptor();
                                        if (descriptor.length != 3) {
                                            e2.a.l("AudioDescriptorUtil", "Invalid SADB length: " + descriptor.length);
                                        } else {
                                            if (Build.VERSION.SDK_INT >= 34 && descriptor.length == 3) {
                                                byte b11 = descriptor[0];
                                                r10 = (b11 & 1) != 0 ? 12 : 0;
                                                if ((b11 & 2) != 0) {
                                                    r10 |= 32;
                                                }
                                                if ((b11 & 4) != 0) {
                                                    r10 |= 16;
                                                }
                                                if ((b11 & 8) != 0) {
                                                    r10 |= 192;
                                                }
                                                if ((b11 & 16) != 0) {
                                                    r10 |= 1024;
                                                }
                                                if ((b11 & 32) != 0) {
                                                    r10 |= 768;
                                                }
                                                if ((b11 & 128) != 0) {
                                                    r10 |= 201326592;
                                                }
                                                byte b12 = descriptor[1];
                                                if ((b12 & 1) != 0) {
                                                    r10 |= 81920;
                                                }
                                                if ((b12 & 2) != 0) {
                                                    r10 |= 8192;
                                                }
                                                if ((b12 & 4) != 0) {
                                                    r10 |= 32768;
                                                }
                                                if ((b12 & 8) != 0) {
                                                    r10 |= 6144;
                                                }
                                                if ((b12 & 16) != 0) {
                                                    r10 |= 33554432;
                                                }
                                                if ((b12 & 32) != 0) {
                                                    r10 |= 262144;
                                                }
                                                if ((b12 & 64) != 0) {
                                                    r10 |= 6144;
                                                }
                                                if ((b12 & 128) != 0) {
                                                    r10 |= 3145728;
                                                }
                                                byte b13 = descriptor[2];
                                                if ((b13 & 1) != 0) {
                                                    r10 |= 655360;
                                                }
                                                if ((b13 & 2) != 0) {
                                                    r10 = 8388608 | r10;
                                                }
                                                if ((b13 & 4) != 0) {
                                                    r10 |= 20971520;
                                                }
                                            }
                                            arrayList.add(Integer.valueOf(r10));
                                        }
                                    }
                                }
                                List.-EL.sort(arrayList, new a4.d(25));
                                n0Var = e9.n0.u(arrayList);
                            }
                            if (!n0Var.isEmpty()) {
                                return n0Var;
                            }
                        }
                        e9.n0 b14 = e0.e0.b(audioDescriptors);
                        if (!b14.isEmpty()) {
                            return b14;
                        }
                    }
                }
                if (i10 >= 31 && ((type = audioDeviceInfo.getType()) == 11 || type == 12 || (i10 >= 31 && type == 22))) {
                    e9.n0 a11 = a(audioDeviceInfo);
                    if (!a11.isEmpty()) {
                        return a11;
                    }
                }
            } else {
                e9.n0 a12 = a(audioDeviceInfo);
                if (!a12.isEmpty()) {
                    return a12;
                }
                e9.n0 b15 = e0.e0.b(audioDeviceInfo.getAudioDescriptors());
                if (!b15.isEmpty()) {
                    return b15;
                }
            }
        }
        return x1Var;
    }
}
