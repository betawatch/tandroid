package org.telegram.messenger.video;

import android.media.MediaCodec;
import android.media.MediaFormat;
import java.io.File;
import java.util.ArrayList;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes.dex */
public class Mp4Movie {
    private File cacheFile;
    private int height;
    private qc.d matrix = qc.d.j;
    private ArrayList<Track> tracks = new ArrayList<>();
    private int width;

    public void addSample(int i10, long j3, MediaCodec.BufferInfo bufferInfo) {
        if (i10 < 0 || i10 >= this.tracks.size()) {
            return;
        }
        this.tracks.get(i10).addSample(j3, bufferInfo);
    }

    public int addTrack(MediaFormat mediaFormat, boolean z10) {
        this.tracks.add(new Track(this.tracks.size(), mediaFormat, z10));
        return this.tracks.size() - 1;
    }

    public File getCacheFile() {
        return this.cacheFile;
    }

    public int getHeight() {
        return this.height;
    }

    public long getLastFrameTimestamp(int i10) {
        if (i10 < 0 || i10 >= this.tracks.size()) {
            return 0L;
        }
        return this.tracks.get(i10).getLastFrameTimestamp();
    }

    public qc.d getMatrix() {
        return this.matrix;
    }

    public ArrayList<Track> getTracks() {
        return this.tracks;
    }

    public int getWidth() {
        return this.width;
    }

    public void setCacheFile(File file) {
        this.cacheFile = file;
    }

    public void setRotation(int i10) {
        if (i10 == 0) {
            this.matrix = qc.d.j;
            return;
        }
        if (i10 == 90) {
            this.matrix = qc.d.k;
        } else if (i10 == 180) {
            this.matrix = qc.d.l;
        } else if (i10 == 270) {
            this.matrix = qc.d.m;
        }
    }

    public void setSize(int i10, int i11) {
        this.width = i10;
        this.height = i11;
    }
}
